public class Task08 {
	public static void main(String[] args) {
		final int v = 343; //скорость звука в м/сек при t = 20°C
		final int t = 10; //время между вспышкой и раскатом грома в секундах
		int s = v * t;
		System.out.println("Расстояние до места удара молнии:"+" "+s+" "+"метров");
	}
}
