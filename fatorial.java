public class fatorial {
	// versao iterativa do calculo fatorial, incluindo o teste de n igual a zero
	public int calcularFatorial(int n) throws IllegalArgumentException {
		if(n < 0)
			throw new IllegalArgumentException("Nao existe fatorial para numeros negativos.");

		int resultado = 1;

		if (n != 0) {

			for(int i = 2; i <= n; i++)
				resultado*= i;
		}
		return resultado;
	}
}