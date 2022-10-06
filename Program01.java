public class Program01 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i==5||j==1||j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				if(i==1||i==5||j==1||j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println( );	
		}
	}
}
