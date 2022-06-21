public class Task12 {
	public static void main(String[] args) {
		int n = 110; // количество всех учеников
		double package_of_milk = 0.9; //объем пакета молока
		double cup_of_milk = 0.2; //объем стакана молока
		
		//1-е условие
		int x1 = 2 * n; //кол-во пирожков для 100% учеников с весом < 30кг
		double y1 = Math.ceil(n * cup_of_milk / package_of_milk); // кол-во
		// пакетов молока для 100% учеников с весом < 30кг
		
		//2-е условие
		double x2 = (n - Math.floor(0.6 * n)) + 2 * n * 0.6; //кол-во пирожков, если
		// 60%
		// учеников с весом < 30кг
		double y2 = Math.ceil(Math.floor(0.6 * n) * cup_of_milk / package_of_milk); //
		// кол. пакетов молока, если 60% учеников с весом < 30кг
		
		//3-е условие
		double x3 = (n - Math.floor(0.01 * n)) + 2 * Math.floor(0.01 * n); //кол-во пирожков,
		// если 1%
		// учеников с весом < 30кг
		double y3 = Math.ceil(Math.floor(0.01 * n) * cup_of_milk / package_of_milk); //
		// кол.
		// пакетов молока, если 1% учеников с весом < 30кг
		
		System.out.println("1) " + "Количество пирожков: " + x1 + ", " +
				"Пакетов молока: " + y1);
		System.out.println("2) " + "Количество пирожков: " + x2 + ", " +
				"Пакетов молока: " + y2);
		System.out.println("3) " + "Количество пирожков: " + x3 + ", " +
				"Пакетов молока: " + y3);
	}
}
