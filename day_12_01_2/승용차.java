package day_12_01_2;

public class �¿��� extends Trans {


		private int �����ο�;

		public �¿���(String ��ȣ��, String ����, int ��ⷮ, int �����ο�) {
			super(��ȣ��, ����, ��ⷮ);
			this.�����ο� = �����ο�;
		}
		
		public �¿���() {
		}

		public int get�����ο�() {
			return �����ο�;
		}

		public void set�����ο�(int �����ο�) {
			this.�����ο� = �����ο�;
		}

		public String getInfo() {
		return super.getInfo()+", "+�����ο�;
		}
		
}
