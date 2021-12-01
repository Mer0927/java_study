package dat_12_01_1;

public class TestTrans {

	public static void main(String[] args) {
		// 상속 연습
		Trans[] tarr = new Trans[1000];
		int count = 0;
		
		tarr[count++] = new Sonata("1가 1111", "소나타", 2000, 5);
		tarr[count++] = new Truck("2가 1111", "포터", 2000, 1000);
		tarr[count++] = new Sonata("1가 2222", "카니발", 2000, 7);
		tarr[count++] = new Truck("2가 2222", "포터", 2000, 5000);

		for(int i=0; i<count; i++){
			System.out.println(tarr[i].getInfo());
			}

	}

}


class Trans {
	
	private String no;
	private String model;
	private int ex;

	public Trans(String no, String model , int ex) {
		this.no = no;
		this.model = model;
		this.ex = ex;
		
	}
	
	public Trans() {
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getEx() {
		return ex;
	}

	public void setEx(int ex) {
		this.ex = ex;
	}	
	
	public String getInfo() {
		return no+", "+model+", "+ex;
	}

}

class Sonata extends Trans {

	private int passenger;

	public Sonata(String no, String model , int ex, int passenger) {
		super(no, model, ex);
		this.passenger = passenger;
	}
	
	public Sonata() {
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", "+passenger;
	}

}


class Truck extends Trans {

	private int carrying;

	public Truck(String no, String model , int ex, int carrying) {
		super(no, model, ex);
		this.carrying = carrying;
		
	}
	
	public Truck() {
	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", "+carrying;
	}

}