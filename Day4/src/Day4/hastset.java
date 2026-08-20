package Day4;
import java.util.HashSet;
import java.util.Set;

public class hastset {
	public static void main(String[] args) {
		 Integer[] numbers = {10, 20, 30, 40, 50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
	        int target = 40;

	        Set<Integer> set = new HashSet<>(); 
	        for (int num : numbers) {
	        	set.add(num);
	        	} 
	        if(set.contains(target)) {
	        	System.out.println("element is found.");
	        }else {
	        	System.out.println("element is found.");  	
	        }
}
}
