package tire;

public class KumhoTire extends Tire {

		public KumhoTire(String location, int maxRotation) {
			super(location, maxRotation);
		}
		public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRotation) {
				System.out.println(location + "'KumhoTire 수명: "+(maxRotation-accumulatedRotation)+ "회");
				return true;
				
			}else {
				System.out.println("*** " + location + "KumhoTire 펑크 ***");
				return false;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
