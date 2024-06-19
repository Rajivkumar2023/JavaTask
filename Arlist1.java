import java.util.ArrayList;
import java.util.Iterator;
 
 
class Arlist1
{
	public static void main(String args[])
	{
		ArrayList animals = new ArrayList();
		// Add elements
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		// Get the iterator
		Iterator it = animals.iterator();
		System.out.println(it.next());
		//System.out.println("ArrayList: " + animals);
	}
}