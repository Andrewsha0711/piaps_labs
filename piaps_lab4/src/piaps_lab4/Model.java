package piaps_lab4;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Model {

	Image image;
	Subject subject;

	Model() {
		// По умолчанию инициализируется Proxy
		this.subject = new Box();
		((Box)this.subject).setRealImage(new RealImage());
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	//Считывание картинки из файловой системы в модель данных
	public boolean readImage(String fileName){
		try {
			this.image = ImageIO.read(new File(fileName));
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public Subject findSubject(int x, int y) {
		if(x <= this.subject.getX1() && 
				x >= this.subject.getX0() &&
				y <= this.subject.getY1() &&
				x >= this.subject.getY0()) {
			return this.subject;
		}
		return null;
	}
}
