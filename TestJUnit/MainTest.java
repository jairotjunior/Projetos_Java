package TestJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MainTest {

    @Test
    void testFilterBySexoNoResults() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", "M", 25));
        pessoas.add(new Pessoa("Maria", "F", 30));

        String filtroSexo = "M";
        List<String> nomesFiltrados = pessoas.stream()
            .filter(p -> p.getSexo().equals(filtroSexo))
            .map(p -> p.getNome() + " (" + p.getIdade() + " anos)")
            .collect(Collectors.toList());

        assertTrue(nomesFiltrados.isEmpty());
    }
}
