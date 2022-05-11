package one.digitalInnovation.gof.service;

import one.digitalInnovation.gof.model.Cliente;

/**
 * 
 * Interface que define o padrão <b>Strategy</b> no dominio de Cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma 
 * interface. 
 * 
 * @author Rogerio
 *
 */

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	Cliente buscarPorId(Long id);
	void inserir(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);

}
