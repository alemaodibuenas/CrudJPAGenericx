package ancestral;

import java.util.List;

public interface IGenericService<T> {
	
	void inserir(T instance);
	
	void alterar(T instance);
	
	void excluir(int id);
	
	void excluir(T instance);
	
	List<T> listar();
	
	T obter(int id);
	
	void dispose();

}
