import java.util.ArrayList;
import java.util.List;

class ListaCarros<T extends Carro> {
  private List<T> lista = new ArrayList<>();
  
  public void adicionarCarro(T carro) {
      lista.add(carro);
  }
  
  public void exibirCarros() {
      for (T carro : lista) {
          carro.exibirInfo();
      }
  }
}