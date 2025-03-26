
public class CarrosBasicos extends Fabrica{

  @Override
  Carros retrieveCar(String requestedGrade) {
    if (requestedGrade.equals("A")){
      return new Volkswagem(100, "Gazolina", "Azul");
    }else if (requestedGrade.equals("B")){
      return new Toyota(903, "Gazolina", "Azul");
    }else{
      System.out.println("Classe requerida não permitida");
      return null;
    }
  }
}
