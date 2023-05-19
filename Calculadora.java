
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
	
	public int Divide () {
		//Control de division entre 0. Metodo de Silvia
		if (y==0){
			System.out.println("Error...");
			System.out.println("No se puede dividir entre 0");
			return 0;
		}else
			return x / y;
		}
	}

	@Override
	public String toString() {
		return "Calculadora [x=" + x + ", y=" + y + ", Suma =" + Suma() + ", Resta =" + Resta() + "]";
	}
	
	public static double media(double[] nums) {
		
		if (nums==null || nums.length==0) {
			return 0;
		}
		
		double media=0;
		
		for (int i=0; i<nums.length; i++) {
			media+=nums[i];
		}
		
		media=media/nums.length;
		
		return media;
	}
	
	public static double media(int[] nums) {
		
		if (nums==null || nums.length==0) {
			return 0;
		}
		
		double media=0;
		
		for (int i=0; i<nums.length; i++) {
			media+=nums[i];
		}
		
		media=media/nums.length;
		
		return media;
	}
	
	// Modificacion Alvaro G
	
	public int Potencia() {
        int result ;
        for (int i = 2; i <= y; i++) {
            result *= x;
        }
        return result;
    }
	//Modificacion Jesus
	
	 public double sacarPorcentaje() {
        return (x * y) / 100.0;
    }
	
}
