class Citizen {
	City addr;
	String name;
}

class City{
	String name;
	int area;
}

class Sample08_04_Citizen {
	public static void main(String[] args) {
		City fukuoka = new City();
		fukuoka.name="福岡市";
		fukuoka.area=343;
		
		City yamato = new City();
		yamato.name = "大和市";
		yamato.area = 27;
		
		Citizen matsuka = new Citizen();
		matsuka.name = "松香 台介";
		matsuka.addr = fukuoka;
		showCitizen(matsuka);
		
		matsuka.addr = yamato;
		showCitizen(matsuka);
	}
	
	static void showCitizen(Citizen cz) {
		System.out.println(cz.name + ": " + cz.addr.name + "在住");
	}
}