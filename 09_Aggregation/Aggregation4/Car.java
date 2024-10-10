package Aggregation4;

public class Car {
	private String Cname;
	private Engine MyEnigne=new Engine("V12");
//	private Engine MyEnigne;
	Car(String n){
		Cname=n;
//		MyEnigne=e;
	}
	void setEngineModify(String n) {
		MyEnigne.setName(n);
	}
	void getCar() {
		System.out.println(Cname);
	}
	void getEngine() {
		MyEnigne.getName();
	}
}
