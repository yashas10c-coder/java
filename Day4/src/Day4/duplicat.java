package Day4;
import java.util.*;
public class duplicat {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30,40,40,50, 50};
		HashSet<Integer> set = new HashSet<>();
		for (int num : numbers) {
			if (set.contains(num)) {
				System.out.println("Duplicate : "+num);
			}
			else{
				set.add(num);
			}
		}
	}
}
