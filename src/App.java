import dao.ClienteMapDAO;
import dao.IClienteDAO;
import domain.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO IClienteDAO;
    public static void main(String[] args) {
        IClienteDAO = new ClienteMapDAO();
            String opcao = JOptionPane.showInputDialog(null, 
            "Digite 1 cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair ", 
            "Green dinner", JOptionPane.QUESTION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
              sair();
            }
            opcao = JOptionPane.showInputDialog(null, 
                "Opção inválida! Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair ", 
                "Green dinner", JOptionPane.QUESTION_MESSAGE);

        }

        while (isOpcaoValida(opcao)){
            if (!isOpcaoValida(opcao)) {
              sair();
            } else if (isCadastro(opcao)) {
              String dados = JOptionPane.showInputDialog(null, 
                "Digite os dados do cliente separados por virgula, conforme exemplo: nome,cpf,tel,end,num,cidade,estado", 
                "Cadastro", JOptionPane.QUESTION_MESSAGE);
                cadastrar(dados);
            } else if (isConsulta(opcao)) {
              String dados = JOptionPane.showInputDialog(null, 
                "Digite o CPF do cliente", 
                "Consulta cliente", JOptionPane.QUESTION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
              String dados = JOptionPane.showInputDialog(null, 
                "Digite o CPF do cliente", 
                "Consulta cliente", JOptionPane.QUESTION_MESSAGE);
                excluir(dados);
            } else {
              String dados = JOptionPane.showInputDialog(null, 
                "Digite os dados do cliente separados por virgula, conforme exemplo: nome,cpf,tel,end,num,cidade,estado", 
                "Atualização", JOptionPane.QUESTION_MESSAGE);
                atualizar(dados);
            }

            opcao = JOptionPane.showInputDialog(null, 
              "Digite 1 cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair ", 
              "Green dinner", JOptionPane.QUESTION_MESSAGE);
    }
  }
                
  private static void atualizar(String dados) {
    String[] dadosSeparados = dados.split(",");
    Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
    IClienteDAO.alterar(cliente);
  }

  private static void excluir(String dados) {
    IClienteDAO.excluir(Long.parseLong(dados));
    JOptionPane.showMessageDialog(null, 
        "Cliente excluído com sucesso", 
        "Exclusão", JOptionPane.INFORMATION_MESSAGE);
  }

  private static void consultar(String dados) {
    Cliente cliente = IClienteDAO.consultar(Long.parseLong(dados));
    if (cliente != null) {
      JOptionPane.showMessageDialog(null, 
          "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + "\nTelefone: " + cliente.getTel() + "\nEndereço: " + cliente.getEnd() + "\nNúmero: " + cliente.getNumero() + "\nCidade: " + cliente.getCidade() + "\nEstado: " + cliente.getEstado(), 
          "Consulta", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(null, 
          "Cliente não encontrado", 
          "ERRO", JOptionPane.INFORMATION_MESSAGE);
    }
  }

  private static void cadastrar(String dados) {
    String[] dadosSeparados = dados.split(",");
    Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
    Boolean isCdastrado = IClienteDAO.cadastrar(cliente);
    if (isCdastrado) {
      JOptionPane.showMessageDialog(null, 
          "Cliente cadastrado com sucesso", 
          "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(null, 
          "Cliente já cadastrado", 
          "ERRO", JOptionPane.INFORMATION_MESSAGE);
    }
  }

  private static void sair() {
    String clientesCadastrados = "";
    for (Cliente cliente : IClienteDAO.buscarTodos()) {
      clientesCadastrados += cliente.toString() + "\n";
    }
    JOptionPane.showMessageDialog(null, 
        "Clientes Cadastrados", 
        "Sair", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }

  private static boolean isCadastro(String opcao) {
    if ("1".equals(opcao)) {
      return true;
    }
    return false;
  }

  private static boolean isConsulta(String opcao) {
    if ("2".equals(opcao)) {
      return true;
    }
    return false;
  }

  private static boolean isExclusao(String opcao) {
    if ("3".equals(opcao)) {
      return true;
    }
    return false;
  }

  private static boolean isOpcaoSair(String opcao) {
    if ("5".equals(opcao)) {
      return true;
    }
    return false;
  }

  private static boolean isOpcaoValida(String opcao) {
    if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
      return true;
    }
    return false;
  }
}
