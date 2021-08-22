package exercicio01;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner lers = new Scanner(System.in);
		Scanner lern = new Scanner(System.in);

		
		Set<String> nomes = new HashSet<String>();
		
		int teste=0;
		String remover = new String();
		do {
			System.out.println("1. Adicionar um nome");
			System.out.println("2. Remover um nome");
			System.out.println("3. Buscar um nome");
			System.out.println("4. Excluir todos os nomes");
			System.out.println("5. Sair");
			teste = lern.nextInt();
			
			if(teste == 1) {
				System.out.println("Digite o nome:");
				nomes.add( lers.nextLine() );
			}
			else if(teste == 2) {
				System.out.println("Qual nome vai ser removido?");
				remover = lers.nextLine();
				
					for (int i = 0; i < nomes.size(); i++) {
						if(nomes.contains(remover) == true) {
							nomes.remove(remover);
							System.out.println("NOME REMOVIDO!");
						}
					}
			}
			else if(teste == 3) {
				boolean encontrado=false;
				System.out.println("Qual nome vai ser buscado?");
				remover = lers.nextLine();
				
					for (int i = 0; i < nomes.size(); i++) {
						if(nomes.contains(remover) == true) {
							encontrado = true;
						}
					}
				if(encontrado == false) {
					System.out.println("O nome nao foi encontrado");
				}
				else 
					System.out.println("O nome foi encontrado");

			}
			else if(teste == 4) {
				nomes.clear();
			}
			
			System.out.println("Lista de nomes: ");
			System.out.println(nomes);
			
		}while(teste !=5);
	
	}
	 
	
}
