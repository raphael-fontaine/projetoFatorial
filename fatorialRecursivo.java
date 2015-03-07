public class fatorialRecursivo {
	public static int calcularFatorialRecursivo(int n) throws IllegalArgumentException {
		if (n == 0)
			return 1;
		return n * calcularFatorialRecursivo(n-1);
	}

	public static void main(string[] args) {
		System.out.println(calcularFatorialRecursivo(5));
	}
}