package br.com.rpires.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Método buscar não implementado");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Método excluir não implementado");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Método atualizar não implementado");
    }
}
