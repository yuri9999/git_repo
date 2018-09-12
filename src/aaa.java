class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp(){ ++channel;}
	void channelDown(){ --channel;}
	
	
}



public class aaa {
	public static void main(String[] args) {
		Tv[] tv = new Tv[3];
		
		for (int i = 0; i < tv.length; i++) {
			tv[i] = new Tv();
			tv[i].channel = i+10;
		}
		
		for (int i = 0; i < tv.length; i++) {
			tv[i].channelUp();
			System.out.printf("tv[%d].channel=%d%n",i,tv[i].channel);
		}
		
		
		
	}
	
	
}
