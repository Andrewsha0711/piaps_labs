package piaps_lab4;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JComponent;

public class Box extends JComponent implements Subject {
	private Integer boxX0;
	private Integer boxX1;
	private Integer boxY0;
	private Integer boxY1;

	RealImage image;

	public Box() {
		this.boxX0 = 0;
		this.boxX1 = 0;
		this.boxY0 = 0;
		this.boxY1 = 0;
	}

	public Integer getX0() {
		return boxX0;
	}

	public void setX0(Integer boxX0) {
		this.boxX0 = boxX0;
	}

	public Integer getX1() {
		return boxX1;
	}

	public void setX1(Integer boxX1) {
		this.boxX1 = boxX1;
	}

	public Integer getY0() {
		return boxY0;
	}

	public void setY0(Integer boxY0) {
		this.boxY0 = boxY0;
	}

	public Integer getY1() {
		return boxY1;
	}

	public void setY1(Integer boxY1) {
		this.boxY1 = boxY1;
	}

	// Optional
	public RealImage getRealImage() {
		return this.image;
	}

	public void setRealImage(RealImage img) {
		this.image = img;
	}

	public void paint(Graphics g) {
		// this.setSize(new Dimension(1280, 720));
		g = (Graphics2D) g;
		int x0 = this.boxX0, x1 = this.boxX1;
		int y0 = this.boxY0, y1 = this.boxY1;
		if (this.boxX0 > this.boxX1) {
			x0 = this.boxX1;
			x1 = this.boxX0;
		}
		if (this.boxY0 > this.boxY1) {
			y0 = this.boxY1;
			y1 = this.boxY0;
		}
		g.drawRect(x0, y0, x1 - x0, y1 - y0);
	}
	
	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		if (this.getRealImage() != null) {
			return this.getRealImage().getImage();
		}
		return null;
	}

	@Override
	public void setImage(Image image) {
		// TODO Auto-generated method stub
		// Если есть ссылка на реальный объект
		if (this.getRealImage() != null) {
			this.image.image = image;
		}
	}
}
