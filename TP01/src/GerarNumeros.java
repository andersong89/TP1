import java.util.Random;

public class GerarNumeros {

	public static void main() {

		int[] v = new int[31]; // vetor de 31 posições
		Random gerador = new Random(); // nosso gerador de números
		boolean b = false; // um controlador

		for (int i = 0; i < v.length;) {
			if (i == 0) {
				v[i] = gerador.nextInt(42) + 1;
				i++;
			} else {
				v[i] = gerador.nextInt(42) + 1;
				b = false;
				for (int j = 0; j < i; j++) {
					if (v[i] == v[j]) {
						b = false;
						break;
					} else {
						b = true;
					}
				}
				if (b) {
					i++;
				}
			}
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print("\n"+ v[i]);
		}
		int maior = Integer.MIN_VALUE;
		int menor = 99999;
		int diamenor=0;
		int diamaior = -1;
		for (int i = 0; i < v.length; i++) {
		    if (v[i] > maior) {
		        maior = v[i];
		        diamaior = i;
		    }
		}
		
		for (int i = 0; i < v.length; i++) {
		    if (v[i] < menor) {
		        menor = v[i];
		        diamenor = i;
		    }
		}
		System.out.printf("\n\nMaior Temperatura do mes é %d graus no dia %d/01 , e a menor temperatura é %d graus no dia %d/01", maior, diamaior+1,menor,diamenor+1);
	}
}