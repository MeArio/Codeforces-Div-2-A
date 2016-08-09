import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		for(int i = 1;i <= n;i++){
			if(i % 2 == 0){
				System.out.print("I love ");
			} else {
				System.out.print("I hate ");
			}
			if(i < n){
				System.out.print("that ");
			}else{
				System.out.print("it ");
			}
		}
	}
}
