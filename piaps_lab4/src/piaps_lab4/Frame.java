package piaps_lab4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {
	public static final int DEF_Width = 1280;
	public static final int DEF_Height = 720;

	WorkingSpaceComponent mainField;

	public Frame() throws Exception{
    	this.mainField = new WorkingSpaceComponent();
    	
    	 JMenuBar menuBar = new JMenuBar();
    	 JMenu file = new JMenu("Menu");
         JMenuItem open = new JMenuItem("Open");
         JMenuItem save = new JMenuItem("Save");
         file.add(open);
         file.addSeparator();
         file.add(save);
         menuBar.add(file);
         setJMenuBar(menuBar);
         setVisible(true);
    	
    	open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("");
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int result = fileChooser.showOpenDialog(Frame.this);   
                if (result == JFileChooser.APPROVE_OPTION) {
                	System.out.println(fileChooser.getSelectedFile());
                	Model model = new Model();
                	try {
						if(model.readImage(fileChooser.getSelectedFile().getAbsolutePath()) == true) {
							mainField.model.subject.setImage(model.image);
							mainField.repaint();
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                }
            }
        });
    	
    	this.getContentPane().add(BorderLayout.WEST, this.mainField);
    	pack();
    }
}
