public class App {
  public static void main(String[] args) {
    Cliente primeiroCliente = new Cliente("B", true);
    Fabrica factory = getCarFactory(primeiroCliente);
    Carros primeiroCarro = factory.create(primeiroCliente.getGradeRequest());
    primeiroCarro.ligarMotor();
  }

  private static Fabrica getCarFactory(Cliente cliente) {
    if (cliente.hasCompanyContract()){
      return new CarrosPremium();
    }else{
      return new CarrosBasicos();
    }
  }
}