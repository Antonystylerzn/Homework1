public class Task10 {
	public static void main(String[] args) {
		final double height = 180.5;
		final double weight = 86.5;
		double ideal = height - 110;
		if (weight > ideal) {
			System.out.println("Для идеального веса необходимо сбросить"+" "+(weight - ideal)+" "+"кг");
		}
		else if (weight < ideal) {
			System.out.println("Для идеального веса необходимо набрать"+" "+(ideal - weight)+" "+"кг");
		}
		else {
			System.out.println("У вас идеальный вес");
		}
	}
}
