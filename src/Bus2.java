// Car2のサブクラスBus2
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
		System.out.println(super.getOwner() + " [" + line + "]");
	}
}