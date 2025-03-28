package reflections;

public class App {
  public static void main(String[] args) {
      Class<Usuario> clazz = Usuario.class;

      // Verifica se a classe possui a annotation Tabela
      if (clazz.isAnnotationPresent(Tabela.class)) {
          Tabela tabela = clazz.getAnnotation(Tabela.class);
          System.out.println("Nome da tabela: " + tabela.value());
      } else {
          System.out.println("A classe não possui a annotation @Tabela.");
      }
  }
}