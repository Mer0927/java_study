package day03;

public class Book {
	
	private String name;
	private int price;
	private String writer;
	private String publisher;
	
		
	Book(String name, int price, String writer, String publisher){
		this.name = name;
		this.price = price;
		this.publisher = publisher;
		this.writer = writer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void printInfo() {
		System.out.println("������:"+name+", ����:"+price);
		
	}
	

}


//�������� ���α׷� ����
//å������ �����ϴ� �⺻ �ڵ带 �ۼ��ϼ���
//å: ������, ����, ���ڸ�, ���ǻ�
//����: ������ private���� ����, �������� get/set �޼��带 ����
//       printInfo()�� ���� ��� ������ ����Ѵ�
//
//å�׽�Ʈ Ŭ������ �ۼ�
//1. 2���� å ��ü�� ����
//2. �� ��ü�� ��ü������ ����Ͻÿ�( printInfo() ȣ�� )
//3. �� ��ü�� ������� ������ ����Ͻÿ�.(
//      System.out.println(�����������Լ�  ���������Լ�)
