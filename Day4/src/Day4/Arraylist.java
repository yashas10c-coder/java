package Day4;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		System.out.println("intiial the size:"+list.size());
		System.out.println("intiial the adding element:"+list.isEmpty());
		System.out.println("containing of Array:"+list);
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("A");
		list.add(null);
		System.out.println("intiial the adding element:"+list.size());
		System.out.println("intiial the adding element:"+list.isEmpty());
		System.out.println("intiial the adding element:"+list);
		boolean b1=list.contains("E");
		boolean b2=list.contains("R");
		list.remove("B");;
		System.out.println("size after deleting"+list.size());
		System.out.println("contents of array"+list);
		list.clear();
		System.out.println("size after clearing"+list.size());
		System.out.println("contents of array"+list);
	}

}
