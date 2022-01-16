import java.util.Scanner;

public class tast5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit");
		
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("종료합니다.");
		scanner.close();
	}
}
