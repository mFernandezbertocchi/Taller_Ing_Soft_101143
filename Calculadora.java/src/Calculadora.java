
public class Calculadora {

	public static void main(String[] args) {
		if (args.length == 3) {
			try {
				int opt1 = Integer.parseInt(args[1]);
				int opt2 = Integer.parseInt(args[2]);

				System.out.println(opt1 + opt2);
			} catch (Exception e) {
				System.out.println("parametros incorrectos");
			}

		} else {
			System.out.println("Uso: Calculadora operador operando1 operando2");
		}

	}
}
