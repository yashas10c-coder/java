package Day4;

public class target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1000;
		int []arr=new int[j];
		for(int i=0;i<j;i++) {
			arr[i]=i+1;
		}
		int g=1000;
		boolean o=false;
		for(int i=0;i<j;i++) {
			if(arr[i]==g) {
				o=true;
			}
		}
		if(o==true) {
			System.out.println("found the element:"+g);
		}
	}

}
