public abstract class Carros {
  public int forcaMotor;
  public String combustivel;
  public String cor;

  public Carros(int forcaMotor, String combustivel, String cor) {
    this.forcaMotor = forcaMotor;
    this.combustivel = combustivel;
    this.cor = cor;
  }

  public void ligarMotor() {
    System.out.println("Motor ligado");
  }

  public void condicao() {
    System.out.println("Carro limpo");
  }

  public void revisaoMecanica() {
    System.out.println("Revisão mecânica feita");
  }

  public void abastecer() {
    System.out.println("Carro abastecido");
  }
}
