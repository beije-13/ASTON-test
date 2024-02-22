import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите строку 1: ");
        String a = in.nextLine();
        System.out.print("Введите строку 2: ");
        String b = in.nextLine();
        if (a.equals(b)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
        in.close();
	}
}
