public class Task11 {
	public static void main(String[] args) {
		int time = 485630; //время на часах деда мороза
		int day = time / 86400;
		int hour = (time % 86400) / 3600;
		int min = (time - (day * 86400)- (hour * 3600)) / 60;
		int sec = (time - (day * 86400)- (hour * 3600) - (min * 60));
		System.out.println(day + " дней " + hour + " часов " + min + " " +
				" минут " + sec + " секунд");
	}
}
