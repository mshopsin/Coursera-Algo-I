import java.util.ArrayList;
import java.util.TreeSet;


public class PointSET {
	private TreeSet<Point2D> set = new TreeSet<Point2D>();
	// construct an empty set of points 
   public         PointSET()            {
	   
   }
// is the set empty? 
   public           boolean isEmpty()                      {
	   return (this.size() == 0);
	   
   }
// number of points in the set 
   public               int size()    {
	   return set.size();
	   
   }
// add the point to the set (if it is not already in the set)
   public              void insert(Point2D p)   {
	   set.add(p);
   }
// does the set contain point p?
   public           boolean contains(Point2D p)  {
	   return set.contains(p);
   }
// draw all points to standard draw 
   public              void draw()    {
	   StdDraw.clear();
	   for(Point2D p : set) {
		   StdDraw.point(p.x(), p.y());
	   }
	   
   }
// all points that are inside the rectangle
   public Iterable<Point2D> range(RectHV rect)       {
	   ArrayList<Point2D> contains = new ArrayList<Point2D>();
	   for(Point2D p : set) {
		   if(rect.contains(p)){
			   contains.add(p);
		   }
	   }
	   return contains;
   }
// a nearest neighbor in the set to point p; null if the set is empty 
   public           Point2D nearest(Point2D p)             {
	   if(this.isEmpty()) {
		   return null;
	   }
	   
	   
   }

   // unit testing of the methods (optional) 
   public static void main(String[] args)            {
	   
   }
}