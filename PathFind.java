import java.awt.Color;
import java.awt.Graphics;

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
	int WID=850;
	int cells=20;
	int MSIZE=600;
	int CSIZE=MSIZE/cells;
	JFrame frame;
	JPanel menu=new JPanel();
	//JPanel main=new JPanel();
	
	Node[][] map;
	Map canvas;
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
	
	
	
	public void paintComponent() { //drawing nodes
		
		
	}
	
	
	
	
	
	
	
	
	
	Border bor=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);;
	
	
	public PathFind() {
		clearMap();
		run();
		
	}
	
	
	

	private void clearMap() {
		// TODO Auto-generated method stub
		map=new Node[cells][cells];
		for(int x=0;x<cells;x++) {
			for(int y=0;y<cells;y++) {
				map[x][y]= new Node(3,0,0);
			}
		}
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
		
		//main setup
	//	main.setLayout(null);
	//	main.setBorder(BorderFactory.createTitledBorder(bor, "Map"));
	//	main.setBounds(235, 10, 555, 610);
	//
		
		
		
		
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
		//frame.getContentPane().add(main);
		
		
		canvas=new Map();
		canvas.setBounds(230, 10, MSIZE+1, MSIZE+1);
		//canvas.setBorder(bor);
		frame.getContentPane().add(canvas);
		
	}




	public static void main(String[] args) {
		new PathFind();

	}

	
	
	public class Map extends JPanel{

		public void paintComponent(Graphics g) {
			/*g.setColor(Color.black);
			g.fillRect(235, 10, 550, 605);
			g.setColor(Color.white);*/
			for(int x=0;x<cells;x++) {
				for(int y=0;y<cells;y++) {
					g.setColor(Color.black);
					g.drawRect(x*CSIZE,y*CSIZE,CSIZE,CSIZE);
					g.setColor(Color.white);
				}
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
}
