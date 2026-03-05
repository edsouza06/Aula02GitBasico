public class Hello {
	public static void main(String[] args) {
		helloworld();
		Alemon.hello();
		Italiaano.hello();
	}
	
	public static void helloworld() {
		System.out.println("Hello World");
	}
}
class Alemon{
	public static void hello() {
		System.out.println("Hallo Welt!");
	}
}
class Italiaano{
	public static void hello() {
		System.out.println("Ciao Mondo!");
	}
}
