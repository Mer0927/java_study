package day_12_01_2;

public class 승용차 extends Trans {


		private int 승차인원;

		public 승용차(String 번호판, String 차종, int 배기량, int 승차인원) {
			super(번호판, 차종, 배기량);
			this.승차인원 = 승차인원;
		}
		
		public 승용차() {
		}

		public int get승차인원() {
			return 승차인원;
		}

		public void set승차인원(int 승차인원) {
			this.승차인원 = 승차인원;
		}

		public String getInfo() {
		return super.getInfo()+", "+승차인원;
		}
		
}
