

public class Main {
    public static void main(String[] args) {
        ListaCarros<Carro> listaCarros = new ListaCarros<>();
        
        Honda hondaFit = new Honda("Fit", 2020);
        Civic civic2022 = new Civic(2022);
        
        listaCarros.adicionarCarro(hondaFit);
        listaCarros.adicionarCarro(civic2022);
        
        listaCarros.exibirCarros();
    }
}
