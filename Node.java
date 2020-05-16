
public class Node {
	// 0 = start, 1 = finish, 2 = wall, 3 = empty, 
	//4 = checked, 5 = finalpath
	private int cellType = 0;
	private int hops;
	private int x;
	private int y;
	private int lastX;
	private int lastY;
	private double dToEnd = 0;

	public Node(int type, int x, int y) {	//CONSTRUCTOR
		cellType = type;
		this.x = x;
		this.y = y;
		hops = -1;
	}
	
	
}
