class Civic extends Carro {
  public Civic(int ano) {
      super("Civic", ano);
  }
  
  @Override
  public void exibirInfo() {
      System.out.println("Civic: Ano " + getAno());
  }
}