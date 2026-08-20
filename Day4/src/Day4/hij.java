package Day4;

public class hij {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1000;
		int []students=new int[k];
		for(int i=0;i<k;i++) {
			students[i]=i+1;
		}
		int target=1000;
		boolean found =false;
		for(int i=0;i<k;i++) {
			for(int j=0;j<k;j++) {
				if(students[j]==target) {
					found=true;
					
				}
				
			}
		}
		if(found=true) {
			System.out.println("target is found");
		} 
	}

}
