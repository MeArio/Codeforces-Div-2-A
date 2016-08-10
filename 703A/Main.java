import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rounds = sc.nextInt() - 1;

		int m = 0;
		int c = 0;

		for(int i = 0;i <= rounds;i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int bigger = Math.max(x, y);

			if(bigger == x){
				m++;
			}
			if(bigger == y){
				c++;
			}
		}
		if(m > c){
			System.out.print("Mishka");
		}else if(m < c){
			System.out.print("Chris");
		}else{
			System.out.print("Friendship is magic!^^");
		}
	}
}