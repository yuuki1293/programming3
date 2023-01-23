public class Sample11_06_Car {
	public static void main(String[] args) {
		Bus2 mybus = new Bus2();
		mybus.set("新日本バス", 5000.0, "74 中央駅東");
		mybus.showHead();

		System.out.println(mybus.info());
		mybus.addFuel(-3000.0);
		System.out.println(mybus.info());
		mybus.addFuel(-3000.0);
		System.out.println(mybus.info());
	}
}

// クラスCar2
class Car2 {
	private String owner; // 所有者の名前
	private double fuel; // 燃料の残量

	// インスタンスメソッドset
	void set(String owner, double fuel) {
		this.owner = owner;
		if (fuel > 0.0) {
			this.fuel = fuel;
		} else {
			this.fuel = 0.0;
		}
	}

	// インスタンスメソッドinfo
	String info() {
		return "所有者: " + owner + ", 燃料残り: " + fuel + " cc";
	}

	// インスタンスメソッドgetOwner
	String getOwner() {
		return owner;
	}

	// インスタンスメソッドgetFuel
	double getFuel() {
		return fuel;
	}

	// インスタンスメソッドaddFuel
	void addFuel(double amount) {
		if (fuel + amount > 0) {
			fuel += amount; // 引数amountが正なら補給、負なら消費
		} else {
			fuel = 0.0; // ただしマイナスにはしない
			System.out.println("... 燃料を使い切りました ...");
		}
	}
}

// Car2のさぶくらすBus2
class Bus2 extends Car2 {
	private String line; // 路線名

	// インスタンスメソッドset
	void set(String owner, double fuel, String line) {
		super.set(owner, fuel); // スーパークラスCar2のset呼び出し
		this.line = line;
	}

	// インスタンスメソッドinfo (Car2のinfoをオーバーライドする)
	String info() {
		// super.info() はスーパークラスCar2のinfoの呼び出し
		return super.info() + ", 路線名: " + line;
	}

	// インスタンスメソッドshowHead
	void showHead() {
		// バス所有会社名ownerと路線名lineを表示
		System.out.println(super.getOwner() +" ["+line+"]");
	}
}