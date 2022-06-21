public class Task02 {
	public static void main(String[] args) {
		int n = 548;
		int x = n / 100;
		int z = n % 10;
		int yDiv = n / 10;
		int y = yDiv % 10;
		int nSum = (x + y + z);
		System.out.println("Результат:"+" "+nSum);
	}
}
