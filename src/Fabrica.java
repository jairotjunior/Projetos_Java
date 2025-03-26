
public abstract class Fabrica {
  public Carros create(String requestedGrade) {
    Carros carros = retrieveCar(requestedGrade) ;
    carros = prepareCar(carros);
    return carros;
  }

  private Carros prepareCar(Carros carros){
    carros.condicao();
    carros.revisaoMecanica();
    carros.abastecer();
    return carros;
  }
  abstract Carros retrieveCar(String requestedGrade);
}
