package principal;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teste teste = new Teste();

		// teste.listarSubCategoria();

		// teste.inserirCategoria();

		// teste.listarCategoria();

		// teste.listarCategoriaPorID(3);

//		try {
//			teste.listarSubCategoria();
//		} catch (Exception e) {
//			System.out.println("erro ao listar");
//		}		

//		try {
//			teste.alterarCategoria();			
//		} catch (Exception e) {
//			System.out.println("erro ao alterar");
//		}
		
//		try {
//			teste.removerCategoria(1);			
//		} catch (Exception e) {
//			System.out.println("erro ao excluir Categoria");
//		}
//
//		try {
//			teste.listarSubCategoria();
//		} catch (Exception e) {
//			System.out.println("erro ao listar");
//		}
		
//		try {
//			teste.inserirCategoria();
//		} catch (Exception e) {
//			System.out.println("erro ao listar");
//		}
		
		try {
			teste.removerCategoriaInstance(25);;
		} catch (Exception e) {
			System.out.println("erro ao excluir Categoria");
		}
		
		try {
			teste.listarCategoria();
		} catch (Exception e) {
			System.out.println("erro ao listar");
		}

	}

}
