
public class test3 {

	public static void main(String[] args) {

		int x = 0;
		while (x > 0) {
			x = x +2;
			if (x < 1) { //
				System.out.print(" ");
			}
				
			
			if (x > 1) {//
				System.out.print("oyster");
				x = x-1;
				
			}
			if (x == 1) {
				System.out.print("a");
			}
			if (x > 1) {
				System.out.print("an");
			}
			System.out.println("");
			x = x+1;
		}
	}

}
