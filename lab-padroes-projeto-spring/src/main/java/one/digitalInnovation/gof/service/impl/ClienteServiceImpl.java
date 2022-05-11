package one.digitalInnovation.gof.service.impl;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowire;

import one.digitalInnovation.gof.model.Cliente;
import one.digitalInnovation.gof.service.ClienteService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowire}). Com isso essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author supor
 *
 */

@org.springframework.stereotype.Service
public class ClienteServiceImpl implements ClienteService{

	@Override
	public Iterable<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
