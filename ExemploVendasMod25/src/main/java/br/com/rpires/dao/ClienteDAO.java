package br.com.rpires.dao;

import br.com.rpires.dao.generic.GenericDAO;
import br.com.rpires.domain.Cliente;
import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
	}

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'excluir'");
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'alterar'");
	}

	@Override
	public Cliente consultar(Long valor) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'consultar'");
	}
}
