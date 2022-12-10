package piaps_lab4;

import java.awt.Graphics;
import java.awt.Image;

public interface Subject {
	public Integer getX0();
	public Integer getX1();
	public Integer getY0();
	public Integer getY1();
	
	public Image getImage();
	
	public void setX0(Integer value);
	public void setX1(Integer value);
	public void setY0(Integer value);
	public void setY1(Integer value);
	
	public void setImage(Image image);
	
	public void paint(Graphics g);
	
}
