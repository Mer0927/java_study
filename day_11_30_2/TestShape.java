package day_11_30_2;

/** 도형정보 관리 예제 */
public class TestShape {

	public static void main(String[] args) {
		Line l1 = new Line("black", 3, 3, 9, 9); //x1, y1, x2, y2 좌표값
		System.out.println(l1.getInfo());
		
		Circle c1 = new Circle("blue", 3, 4, 12); //x1, y1, 반지름
		System.out.println(c1.getInfo());
		
		Shape s1 = l1;
		System.out.println("s1.getInfo() "+s1.getInfo());
		
		
		// 사각형 객체를 만들어 배열에 저장, 호출
		// draw()에서는 Rect 그리기를 출력
		Rect r1 = new Rect("blue", 30, 40, 20, 20);
		System.out.println("r1.getInfo() "+r1.getInfo());
		//color, x1, y1, width, height

//		Shape ss1 = new Shape("black", 3, 3); //오류. 불가.

		Shape[] sarr = new Shape[1000];
		sarr[0] = l1;
		sarr[1] = c1;
		sarr[2] = r1;
		
		System.out.println("*** 전체출력 ***");
		for(int i=0; i<3; i++) {
			sarr[i].draw();
		}//end for
		
		
	}//end main

}//end class
