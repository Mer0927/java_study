package day04;

public class 객체배열 {

	public static void main(String[] args) {
		
		Movie[] movies = new Movie[10000]; //Movie의 배열객체 1개 만듦. Movie 객체를 100개 저장할수 있는 공간 1개를 만들었다는 뜻.
		int count = 0;
		movies[count++] = new Movie("지옥", "연상호", 300);
		System.out.println("count="+count);
		movies[count++] = new Movie("오징어게임", "황동혁", 200);
		System.out.println("count="+count);
		movies[count++] = new Movie("유체이탈자", "윤제근", 100);
		System.out.println("count="+count);
		/// 전체정보 출력
		System.out.println("*** 전체정보출력 ***");
		for(int i=0; i<count; i++) {
			movies[i].printInfo();
		}
		
		// 검색 > 영화제목: 오징어게임
		for(int i=0; i<count; i++) {
			if(movies[i].getTitle() == "오징어게임") {
				System.out.println("오징어게임 찾았다! 번호:"+i);
			}//end if
		}//end for
		
		// 수정 > 유체이탈자의 제작비를 150으로 수정
		String movieTitle = "유체이탈자";
		int findIndex = -1; //검색후에도 -1 그대로이면 검색실패
		for(int i=0; i<count; i++) {
			if(movies[i].getTitle() == movieTitle) {
				findIndex = i; //찾았음
				break; //검색중지
			}//end if
		}//end for
		// 검색 성공여부 판정
		if(findIndex == -1) {
			System.out.println(movieTitle+" 검색실패!");
		} else {
			System.out.println(movieTitle+" 찾았음! 번호:"+findIndex);
			movies[findIndex].setCost(150);
		}
		
		//삭제
		movieTitle = "오징어게임"; //재사용
		findIndex = -1; //검색후에도 -1 그대로이면 검색실패
		for(int i=0; i<count; i++) {
			if(movies[i].getTitle() == movieTitle) {
				findIndex = i; //찾았음
				break; //검색중지
			}//end if
		}//end for

		// 검색 성공여부 판정
		if(findIndex == -1) {
			System.out.println(movieTitle+" 검색실패!");
		} else {
			System.out.println(movieTitle+" 찾았음! 번호:"+findIndex);
			//해당 번호 삭제
			//순서유지하지 않고 빠르게 삭제
			movies[findIndex] = movies[count-1]; //마지막데이터를 덮어씌우기
			movies[count-1] = null; //마지막 데이터 지우기
			count--; //갯수 1 차감
		}

		//전체출력
		System.out.println("*** 전체정보출력 ***");
		for(int i=0; i<count; i++) {
			movies[i].printInfo();
		}
		
		
	}//end main

}//end class
