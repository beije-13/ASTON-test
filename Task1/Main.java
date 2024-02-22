import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        if (a == b){
            System.out.printf("%d = %d\n", a, b);
        }else if(a > b){
            System.out.printf("%d > %d\n", a, b);
        }else{
           System.out.printf("%d < %d\n", a, b); 
        }
        
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        if (a % b != 0){
            float division = (float) a / b;
            System.out.printf("%d / %d = %f\n", a, b, division);
        }else{
            System.out.printf("%d / %d = %d\n", a, b, a/b);
        }
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        in.close();
	}
}
