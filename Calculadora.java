
public class Calculadora {

	private int x;
	private int y;
	
	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int Suma () {
		return x + y;
	}
	
	public int Resta () {
		return x - y;
	}
<<<<<<< HEAD
	
	public int Multiplica () {
		return x * y;
	}
	
	public int Divide () 
		//Excepcion Dividir entre Cero. Silvia Peguero Palafox
			if (y==0) {
				System.out.println("Error...");
				System.out.println("No se puede dividir entre 0");
				return 0;
			}else {
				return x / y;
			}
	}

	@Override
	public String toString() {
		return "Calculadora [x=" + x + ", y=" + y + ", Suma =" + Suma() + ", Resta =" + Resta() + "]";
	}
	
	
	
}
