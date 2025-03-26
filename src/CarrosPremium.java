
public class CarrosPremium extends Fabrica {

  @Override
  Carros retrieveCar(String requestedGrade) {
    if (requestedGrade.equals("A")){
      return new Tesla(1000, "Gazolina", "Azul");
    }else if (requestedGrade.equals("B")){
      return new Audi(800, "Gazolina", "Vermelho");
    }else{
      System.out.println("Classe requerida não permitida");
      return null;
    }
  }
}
