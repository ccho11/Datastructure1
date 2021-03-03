import java.util.Scanner;

public class FactRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*System.out.println("정수를 입력하시오.");
		Scanner s = new Scanner(System.in);*/
		int n, a = 1;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("정수를 입력하시오. ");
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
