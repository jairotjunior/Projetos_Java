class Honda extends Carro {
  public Honda(String modelo, int ano) {
      super(modelo, ano);
  }
  
  @Override
  public void exibirInfo() {
      System.out.println("Honda: " + getModelo() + " - Ano: " + getAno());
  }
}