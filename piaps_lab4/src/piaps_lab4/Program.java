package piaps_lab4;
import javax.swing.JFrame;

public class Program {

	public static void run() throws Exception{
        Frame frame = new Frame();
        frame.setTitle("piaps_lab4");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
	
	
	public static void main(String[] args) throws Exception, java.io.IOException{
		System.out.println("--running");
		run();
	}
}