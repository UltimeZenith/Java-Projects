public class Conditional2{
	public static void main(String[] args){
		int x = 5;
		int y = 4;
		if (x+y < 10){
			System.out.println("x + y es menor a 10");
		}else if (x+y >= 10 || x+y <= 20){
			System.out.println("x + y esta entre 10 y 20");
		}else{
			System.out.println("x + y es mayor a 20");
		}
	}
}