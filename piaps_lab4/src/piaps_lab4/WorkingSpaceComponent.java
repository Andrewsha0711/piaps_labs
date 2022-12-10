package piaps_lab4;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class WorkingSpaceComponent extends JComponent{
	    private static final int DEF_WIDTH = 1280;
	    private static final int DEF_HEIGHT = 720;
	    
	    Model model;
	    int option;

	    public Dimension getPreferredSize() {
	        return new Dimension(DEF_WIDTH, DEF_HEIGHT);
	    }
		
		public WorkingSpaceComponent() {	
			this.model = new Model();
			this.option = 0;		
			this.addMouseListener(new CustomMouseListener(this.model));
		}
		
		public void paint(Graphics g) {
			this.setSize(new Dimension(1280, 720));
			g = (Graphics2D) g;
			this.model.subject.paint(g);
			if(this.option == 1) {
				if(this.model.subject.getImage() != null) {
					g.drawImage(this.model.subject.getImage(), 
							this.model.subject.getX0(), 
							this.model.subject.getY0(), 
							this.model.subject.getX1() - this.model.subject.getX0(), 
							this.model.subject.getY1() - this.model.subject.getY0(), 
							null);
				}
			}
		}
		
		
		public Subject findElement(int xValue, int yValue) {
			if(this.model.findSubject(xValue, yValue) != null)
				return this.model.subject;
			return null;
		}
}
