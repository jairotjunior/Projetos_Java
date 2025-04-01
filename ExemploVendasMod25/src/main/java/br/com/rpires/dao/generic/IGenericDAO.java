package br.com.rpires.dao.generic;

import br.com.rpires.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO <T extends Persistente> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(Long valor) throws TipoChaveNaoEncontradaException;

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(Long valor);
}
