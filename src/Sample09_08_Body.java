public class Sample09_08_Body {
	public static void main(String[] args) {
		Body2.warn(); // クラスBody2のクラスメソッドwarnの呼び出し

		Body2 mybody = new Body2();
		mybody.set("立花マヤ", 164.5, 57);
		System.out.println(mybody.info());
	}
}

class Body2 {
	// クラスフィールド
	static final double BMI_LOW = 18.5;
	static final double BMI_HIGH = 22;

	// クラスメソッドwarn
	static void warn() {
		System.out.println("BMI≦" + BMI_LOW + "なら低体重");
		System.out.println("BMI≧" + BMI_HIGH + "なら要注意");
	}

	// インスタンスフィールド
	private String name; // 指名のフィールド( クラス外には非公開)
	private double height; // 身長のフィールド( クラス外には非公開)
	private double weight; // 体重のフィールド( クラス外には非公開)

	// インスタンスメソッドset
	void set(String name, double height, double weight) {
		this.name = name;
		this.height = height / 100.0; // メートルに換算
		this.weight = weight;
	}

	// インスタンスメソッドgetBMI
	double getBMI() {
		return weight / (height * height); // ボディます指数(BMI)
	}

	// インスタンスメソッドinfo
	String info() {
		double bmi = getBMI();
		if (bmi <= BMI_LOW) {
			return name + "さんは低体重です。";
		} else if (bmi < BMI_HIGH) {
			return name + "さんは普通です。";
		} else {
			return name + "さんは要注意です。";
		}
	}
}