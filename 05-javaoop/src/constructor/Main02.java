package constructor;

public class Main02 {

	public static void main(String[] args) {
		Fruit fruit1 = new Fruit("바나나", 1600, "노란색");
		Fruit fruit2 = new Fruit("사과", 1200, "빨간색");

		
		fruit1.getInfo();
		fruit2.getInfo();
	}
}
