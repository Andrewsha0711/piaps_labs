package piaps_lab4;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JComponent;

public class RealImage extends JComponent implements Subject{
	private Integer imgX0;
	private Integer imgX1;
	private Integer imgY0;
	private Integer imgY1;
	
	Image image;
	
	@Override
	public Integer getX0() {
		// TODO Auto-generated method stub
		return this.imgX0;
	}

	@Override
	public Integer getX1() {
		// TODO Auto-generated method stub
		return this.imgX1;
	}

	@Override
	public Integer getY0() {
		// TODO Auto-generated method stub
		return this.imgY0;
	}

	@Override
	public Integer getY1() {
		// TODO Auto-generated method stub
		return this.imgY1;
	}

	@Override
	public void setX0(Integer value) {
		// TODO Auto-generated method stub
		this.imgX0 = value;
	}

	@Override
	public void setX1(Integer value) {
		// TODO Auto-generated method stub
		this.imgX1 = value;
	}

	@Override
	public void setY0(Integer value) {
		// TODO Auto-generated method stub
		this.imgY0 = value;
	}

	@Override
	public void setY1(Integer value) {
		// TODO Auto-generated method stub
		this.imgY1 = value;
	}
	
	@Override
	public Image getImage() {
		return this.image;
	}
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	public void paint(Graphics g) {
		//this.setSize(new Dimension(1280, 720));
		g = (Graphics2D) g;
		g.drawImage(this.image, 
				this.getX0(), 
				this.getY0(), 
				this.getX1() - this.getX0(), 
				this.getY1() - this.getY0(), 
				null);
	}

}
