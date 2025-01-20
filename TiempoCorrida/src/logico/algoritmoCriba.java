	package logico;
	
	import java.util.ArrayList;
import java.util.Scanner;
	
	public class algoritmoCriba {
	
		public static void main(String[] args) {
			
			ArrayList<Integer> arreglo = new ArrayList<>();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese numero n: ");
			
			int n = scanner.nextInt();
			
			System.out.println(System.nanoTime());
			
			llenarArreglo(n + 1, arreglo);
			
			System.out.println(arreglo);
			
			primo(arreglo);
			
			System.out.println(arreglo);
			
			System.out.println(System.nanoTime());
	
		}
		
		public static void llenarArreglo(int n, ArrayList<Integer> arreglo) {
			
			for(int i = 2; i < n; i++) {
				arreglo.add(i);
			}
		}
		
		public static void primo(ArrayList<Integer> arreglo) {
			
			int i = 0;
			
			while(i < arreglo.size()) {
				int primo = arreglo.get(i);
				
				for (int j = arreglo.size() - 1; j > i; j--) {
	                if (arreglo.get(j) % primo == 0){
	                    arreglo.remove(j);
	                }
	            }
				
				if (primo * primo > arreglo.get(arreglo.size() - 1)) {
	                break;
	            }
				
				i++;
			}
			 
		}
	
	}
	
	// Cuando N = 40 
	// Tiempo de corrida: 179909652045700 - 179909651221000 = 824700 equivale a 0.0008247
	
	// Cuando N = 20
	// Tiempo de corrida: 178292959110500 - 178292958504500 = 606,000 equivale a 0.00606 segundos.
	
	// Cuando N = 10
	// Tiempo de corrida: 178475898415400 - 178475897734700 = 680,700 equivale a 0.00606 segundos.
	
	// Cuando N = 5
	// Tiempo de corrida: 179763503025000 - 179763502450900 = 574100 equivale a 0.0005741 segundos.
	
	// Cuando N = 10^4
	// Tiempo de corrida" 180348363312400 - 180348330133900 = 33178500 equivale a 0.0331785 segundos.
	
	
	
	
	
	
	
	
	
	
