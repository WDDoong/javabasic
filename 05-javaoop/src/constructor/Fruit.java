package constructor;

public class Fruit {
	
	public String name;
	public int price;
	public String color;
	
	public Fruit(String n, int p, String c) {
	name = n;
	price = p;
	color = c;

	}

	
	public void getInfo() {
		System.out.println("과일이름 :" + name);
		System.out.println("과일가격 :" +price);
		System.out.println("과일 색깔 :" + color);
	}
}
