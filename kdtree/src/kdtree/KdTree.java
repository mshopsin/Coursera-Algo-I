package kdtree;

public class KdTree {
	private static class Node {
		
		   private Point2D p;      // the point
		   private RectHV rect;    // the axis-aligned rectangle corresponding to this node
		   private Node lb;        // the left/bottom subtree
		   private Node rt;        // the right/top subtree
		   
		   public Node(){
				
			}
			public Node(Point2D p) {
				this.p = p;
			}
		}
	
		
	
		Node root = null;
		int size = 0;
	
	// construct an empty set of points 
	   public         KdTree()       {
		   
	   }
	// is the set empty? 
	   public           boolean isEmpty()                      {
		   return (root == null);
			   
		   
	   }
	// number of points in the set 
	   public               int size()                         {
		   return size;
	   }
	// add the point to the set (if it is not already in the set)
	   public              void insert(Point2D p)              {
		   if(root == null) {
			   root.p = p;
			   return;
		   }
		   int level = 1; //odd vert, even hor
		   Node pt = root;
		   while(true) {
			   if( goLeft(p, level, pt) ) {
				   if(pt.lb != null) {
					   pt = pt.lb;
				   } else {
					   pt.lb = new Node(p);
					   return;
				   }
			   } else if(  goRight(p, level, pt)) {
				   if(pt.rt != null) {
					   pt = pt.rt;
				   } else {
					   pt.rt = new Node(p);
					   return;
				   }
			   } else {
				   return;
			   }
			   level++;
		   }
		   
	   }
	// does the set contain point p? 
	   public           boolean contains(Point2D p)            {
		   int level = 1;
		   Node pt = root;
		   while(true) {
			   if( goLeft(p, level, pt) ) {
				   if(pt.lb != null) {
					   pt = pt.lb;
				   } else {
					   pt.lb = new Node(p);
					   return false;
				   }
			   } else if(  goRight(p, level, pt)) {
				   if(pt.rt != null) {
					   pt = pt.rt;
				   } else {
					   pt.rt = new Node(p);
					   return false;
				   }
			   } else if(pt.p.equals(p)){
				   return true;
			   }
			   level++;
		   }
		   
	   }
	private boolean goRight(Point2D p, int level, Node pt) {
		return (level % 2 == 1  && p.x() > pt.p.x())  || (level % 2 == 0 && p.y() > pt.p.y());
	}
	private boolean goLeft(Point2D p, int level, Node pt) {
		return (level % 2 == 1 && p.x() < pt.p.x() ) || (level % 2 == 0 && p.y() < pt.p.y());
	}
	// draw all points to standard draw 
	   public              void draw()                         {
		   
	   }
	// all points that are inside the rectangle
	   public Iterable<Point2D> range(RectHV rect)              {
		   
	   }
	// a nearest neighbor in the set to point p; null if the set is empty 

	   public           Point2D nearest(Point2D p)             {
		   
	   }
	// unit testing of the methods (optional) 
	   public static void main(String[] args) {
		   
	   }
}
