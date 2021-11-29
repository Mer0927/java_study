package day04;

public class Movie {
	
	private String title, director;
	private int cost; //제작비
	
	//생성자 메서드
	public Movie(String title, String director, int cost){
		this.title = title;
		this.director = director;
		this.cost = cost;
	}
	
	//Getter, Setter 메서드 작성
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	//printInfo
	public void printInfo() {
		System.out.println("title:"+title+", director:"+director+", cost:"+cost);
		
	}

}
