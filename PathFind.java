import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class PathFind {
	
	int HI=650;
	int WID=800;
	JFrame frame;
	JPanel menu=new JPanel();
	
	Border bor=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);;
	
	
	public PathFind() {
		run();
	}
	
	
	

	private void run() {
		//initialize frame
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(WID,HI);
		frame.setTitle("Path Finding");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//menu border
		menu.setBorder(BorderFactory.createTitledBorder(bor, "Controls"));
		menu.setBounds(10, 10, 220, 600);
		
		
		
		//add menu to frame
		frame.getContentPane().add(menu);
		
	}




	public static void main(String[] args) {
		new PathFind();

	}

	
	
	
	
	
}
