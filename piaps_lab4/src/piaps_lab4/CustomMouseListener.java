package piaps_lab4;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class CustomMouseListener implements MouseListener {

	int stepX = 0;
	int stepY = 0;

	Thread mouseT;

	boolean doubleClick = false;

	Subject box;

	public CustomMouseListener(Model model) {
		this.box = model.subject;
	}

	public void mouseClicked(MouseEvent e) {
		WorkingSpaceComponent comp = (WorkingSpaceComponent) e.getSource();
	}

	public void mousePressed(MouseEvent e) {
		WorkingSpaceComponent comp = (WorkingSpaceComponent) e.getSource();
		comp.option = 0;
		Point location = MouseInfo.getPointerInfo().getLocation();
		if(comp.model.findSubject((int)location.getX() - this.stepX, 
				(int)location.getY() - this.stepY) != null) {
			int paddingX = (int) location.getX() - this.stepX - box.getX0();
			int paddingY = (int) location.getY() - this.stepY - box.getY0();
			int paddingXright = box.getX1() - ((int) location.getX() - this.stepX);
			int paddingYbottom = box.getY1() - ((int) location.getY() - this.stepY);
			int[] args = {0,paddingX,paddingY,paddingXright,paddingYbottom};
			this.mouseT = new MouseThread(box, comp, stepX, stepY, args);
			mouseT.start();
		}
		else {
			box.setX0((int) location.getX() - this.stepX);
			box.setY0((int) location.getY() - this.stepY);
			int[] args = {1};
			this.mouseT = new MouseThread(box, comp, stepX, stepY, args);
			mouseT.start();
		}
		System.out.println("Mouse pressed");
		System.out.println(box.getX0());
	}

	public void mouseReleased(MouseEvent e) {
		WorkingSpaceComponent comp = (WorkingSpaceComponent) e.getSource();
		comp.option = 1;
		if (this.mouseT != null) {
			if (this.mouseT.isAlive())
				this.mouseT.interrupt();
		}
		comp.repaint();
		System.out.println("Mouse released");
	}

	public class MouseThread extends Thread {

		private volatile boolean canRun = true;
		Subject element;
		WorkingSpaceComponent comp;
		int dx, dy;
		int[] args;

		MouseThread(Subject value, WorkingSpaceComponent compValue, int dx, int dy, int[] args) {
			this.element = value;
			this.comp = compValue;
			this.dx = dx;
			this.dy = dy;
			this.args = args;
		}

		public void changeAction() {
			canRun = !canRun;
		}

		public void run() {
			System.out.println("mouse thread running");
			if (!Thread.interrupted()) {
				while (true) {
					try {
						Point location = MouseInfo.getPointerInfo().getLocation();
						if (this.element instanceof Box) {
							Box box = (Box)element;
							if(this.args[0] == 0) {
								box.setX0((int) location.getX() - this.dx - args[1]);
								box.setY0((int) location.getY() - this.dy - args[2]);
								box.setX1((int) location.getX() - this.dx + args[3]);
								box.setY1((int) location.getY() - this.dy + args[4]);
							}
							else {
								box.setX1((int) location.getX() - this.dx);
								box.setY1((int) location.getY() - this.dy);
							}
							System.out.println(((Box) element).getX1());
						}
						comp.repaint();
						sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						return;
						// e.printStackTrace();
					}
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		Point location = MouseInfo.getPointerInfo().getLocation();
		// ���������� �� ������
		double x = location.getX();
		double y = location.getY(); // ������� ����� ������������ ��
		this.stepX = (int) x - e.getX();
		this.stepY = (int) y - e.getY();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
