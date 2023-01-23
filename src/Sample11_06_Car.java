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