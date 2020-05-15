import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class PathFind {
	//set-up frame and panel
	int HI=650;
	int WID=800;
	JFrame frame;
	JPanel menu=new JPanel();
	
	//buttons
	JButton searchB=new JButton("Search");
	JButton resetB=new JButton("Reset");
	JButton generateB=new JButton("Generate Map");
	JButton clearB=new JButton("Clear Map");
	
	//algorithms and tools
	String[] algos= {"A*","Dijkstra's"};
	String[] tools= {"Start","End","Wall","Eraser"};
	
	//Drop Downs
	JComboBox algoBox = new JComboBox(algos);
	JComboBox toolBox = new JComboBox(tools);
	
	
	//Labels
	JLabel algoL = new JLabel("Algorithms");
	JLabel toolL = new JLabel("Toolbox");
	
	
	
	
	
	
	
	
	
	
	
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

		//menu set-up
		menu.setLayout(null);
		menu.setBorder(BorderFactory.createTitledBorder(bor, "Controls"));
		menu.setBounds(10, 10, 220, 610);
		int space=25;
		int fromEdge=40;
		int buff=45;
		
		
		//BUTTONS
		searchB.setBounds(fromEdge, space, 120, 25);
		menu.add(searchB);
		space+=buff;
		
		resetB.setBounds(fromEdge, space, 120, 25);
		menu.add(resetB);
		space+=buff;
		
		generateB.setBounds(fromEdge, space, 120, 25);
		menu.add(generateB);
		space+=buff;
		
		clearB.setBounds(fromEdge, space, 120, 25);
		menu.add(clearB);
		space+=40;
		
		//DROPDOWNS
		algoL.setBounds(fromEdge, space, 120, 25);
		menu.add(algoL);
		space+=25;
		algoBox.setBounds(fromEdge, space, 120, 25);
		menu.add(algoBox);
		space+=40;
		
		toolL.setBounds(fromEdge, space, 120, 25);
		menu.add(toolL);
		space+=25;
		toolBox.setBounds(fromEdge, space, 120, 25);
		menu.add(toolBox);
		space+=40;
		
		
		
		//add menu to frame
		frame.getContentPane().add(menu);
		
	}




	public static void main(String[] args) {
		new PathFind();

	}

	
	
	
	
	
}
