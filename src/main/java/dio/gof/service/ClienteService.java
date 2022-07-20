package dio.gof.service;

import dio.gof.model.Cliente;

public interface ClienteService {

		static Iterable<Cliente> buscarTodos() {
	
			return null;
		}
		
		Cliente buscarPorId(Long id);
		
		void inserir(Cliente cliente);
		
		void atualizar(Long id, Cliente cliente);
		
		void deletar(Long id);
}
