import java.util.Scanner;



public class BasicList {


			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String[] a = new String[5];
		int size = a.length;
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<size; i++) {
			System.out.println("�迭�� �Է��ϼ���. ");
			a[i] = s.next();
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(a[i]);
		}
	}

}
