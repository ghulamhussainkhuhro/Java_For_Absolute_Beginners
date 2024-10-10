package Question3b;

public class RandomGeneratorDemo {
	
public static int generateRandom() {
	return (int)(Math.random()*100);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=9; i++) {
			System.out.println(generateRandom());
		}
		

	}

}
