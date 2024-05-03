package pecas_bd;

import java.util.Scanner;

public class Main {
	public static void main(String []args) throws Exception{
		Scanner scann = new Scanner(System.in);
		
		PecasDAO pecasDAO = new PecasDAO();
		Pecas pecas = new Pecas();
		Insert insert =  new Insert();
		
		int op = 1;
		try {
			while (op!=0) {
				System.out.println("1: Inserir \n2: Remover \n3: Imprimir \n0: Sair");
				op = scann.nextInt();
				
				switch (op) {
				case 1:
					
					
					insert.insertSQL(op, null);
					
					/*System.out.println("Id -> ");
					op = scann.nextInt();
					Insert.insertSQL(pecas.setCod(pecas));
					
					System.out.println("Descricao-> ");
					op = scann.nextInt();
					Insert.insertSQL(pecas.setNome(pecas));*/
					
					
					
					//pecas.setDesc(desc); // armazena na classe Pecas
					
					//estoque.adicionar(pecas); //adicionar o valores para classe Estoque
					// pecas = new Pecas();
					break;
				case 2:	
					/*estoque.listaPecas();
					System.out.println("ID -> ");
					id = scann.nextInt();
					
					estoque.remover(id);*/					
					break;
				case 3:
					SelectFrom.select(pecas);
					break;				
				}	
			}
		
	} catch (Exception e) {
		
	}
	}
}
