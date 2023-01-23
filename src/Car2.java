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