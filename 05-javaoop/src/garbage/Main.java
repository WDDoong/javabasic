package garbage;

public class Main {
	
	public static void main(String[] args) {

				Item i1= new Item(1);
				i1 = null;
				Item i2= new Item(2);
				i2 = null;
				Item i3= new Item(3);
				System.gc();
				Item i4= new Item(4);
				i4 = null;
				Item i5= new Item(5);
				System.gc();
				Item i6= new Item(6);
	}

}
//메모리 회수 명령 System.gc(); 컴퓨터가 자동으로 쓰기도 함. main과 연결되어 있으면 (쓸모가 있으면) garbage가 아님