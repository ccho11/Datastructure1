import java.util.Scanner;

public class FactRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*System.out.println("������ �Է��Ͻÿ�.");
		Scanner s = new Scanner(System.in);*/
		int n, a = 1;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("������ �Է��Ͻÿ�. ");
        n = input.nextInt();
        i = n;
        
        while (n > 0) {
            a = a * n;
            n = n - 1;
        }
        System.out.println(a);
        
        input.close();
        
    }




		
		

	




		
	

}
