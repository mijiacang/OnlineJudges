
public class P19Sundays {

	public static void main(String[] args) {
	}
	
	private static boolean isLeapYear(int year){
		if(year%4 != 0){
			return false;
		}
		if(year%100 !=0){
			return true;
		}
		if(year %400 == 0){
			return true;
		}
		return false;
	}
}
