public class Sample09_03_Person {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "丘 かすみ";
		p1.year = 2000;
		p1.money = 500;
		
		p1.earn(50);
		p1.show();
	}
}

class Person {
	String name;
	int year;
	int money;
	
	void earn(int income) {
		money += income;
	}
	
	void pay(int expense) {
		money -= expense;
	}
	
	String info() {
		return name + "(" + year + "年生) 所持金" + money + "円";
	}
	
	void show() {
		System.out.println(info());
	}
}