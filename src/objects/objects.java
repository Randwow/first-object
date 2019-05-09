package objects;

public class objects {
		String name; 
		
		int ram;
		
		int ssd;
		
		double weight;
	
	public void on() {
		System.out.println("Включение. Модель компьютера " + name);
	}
	public void off() {
		System.out.println("Выключение");
	}
	public void load() {
		System.out.println("Загрузка. Обьём памяти:= " + ssd + " Гб.");
	}

}
