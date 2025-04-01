package br.com.rpires.service;

import br.com.rpires.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private final IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Contrato salvo com sucesso!";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Contrato buscado com sucesso!";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Contrato excluído com sucesso!";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Contrato atualizado com sucesso!";
    }
}
