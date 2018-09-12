
public class Time {
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";
				
			}

			System.out.println(beerNum + " " + word + " of beer on the wall - 1번");
			System.out.println(beerNum + " " + word + " of beer - 2번");
			System.out.println("Take one down - 3번");
			System.out.println("Pass it around - 4번");
			beerNum = beerNum - 1;

			if (beerNum < 1) {
			//	System.out.println(beerNum + " " + word + " of beer on the wall -5번");
//			} else {
				System.out.println("No more bottles of beer on the wall");
			}

		}
	}
}
