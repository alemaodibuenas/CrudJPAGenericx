package principal;

import java.util.Date;

import dominio.Categoria;
import dominio.Produto;
import dominio.SubCategoria;
import servico.CategoriaServico;
import servico.ProdutoServico;
import servico.SubCategoriaServico;

public class Teste {	
	
	//listar categoria
	public void listarCategoria() {
		CategoriaServico servico = new CategoriaServico("exemplo-jpa");
		for (Categoria item : servico.listar()) {
			System.out.println(item);			
		}
		servico.dispose();		
	}

	//lista categoriaID
	public void listarCategoriaPorID(int id) {
		CategoriaServico servico = new CategoriaServico("exemplo-jpa");
		System.out.println(servico.obter(id));
		servico.dispose();		
	}	

	//inserir categoria
	public void inserirCategoria() {
		CategoriaServico servico = new CategoriaServico("exemplo-jpa");
		servico.inserir(new Categoria(null,"teste", new Date()));
		servico.dispose();
	}
	
	//alterar Categoria
	public void alterarCategoria() {
		CategoriaServico servico = new CategoriaServico("exemplo-jpa");
		servico.alterar(new Categoria(30,"testeTeste", new Date()));
		servico.dispose();		
	}

	//remover categoria por ID
	public void removerCategoria(int id) {
		CategoriaServico servico = new CategoriaServico("exemplo-jpa");
		servico.excluir(id);
		servico.dispose();
	}
	
	//remover por instancia
	public void removerCategoriaInstance(int id) {
		CategoriaServico servico = new CategoriaServico("exemplo-jpa");
		Categoria cat = servico.obter(id);
		servico.excluir(cat);
		servico.dispose();		
	}
	
	public void listarSubCategoria() {
		SubCategoriaServico servico = new SubCategoriaServico("exemplo-jpa");
		for (SubCategoria item : servico.listar()) {
			System.out.println(item);			
		}
		servico.dispose();		
	}
	
	public void listarProduto() {		
		ProdutoServico servico = new ProdutoServico("exemplo-jpa");
		for (Produto item : servico.listar()) {
			System.out.println(item);			
		}
		servico.dispose();		
	}

}
