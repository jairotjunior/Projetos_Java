package TestJUnit;


import java.util.*;
import java.util.stream.Collectors;

class Pessoa {
    private String nome;
    private String sexo;
    private Integer idade;

    public Pessoa(String nome, String sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo.toUpperCase();
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " (" + sexo + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite os dados no formato Nome,Sexo (ex: João,M). Digite 'sair' para finalizar.");

        while (true) {
            System.out.print("Entrada: ");
            String entrada = scanner.nextLine().trim();
            if (entrada.equalsIgnoreCase("sair")) break;

            if (!entrada.contains(",")) {
                System.out.println("Formato inválido. Use Nome,Sexo (ex: Maria,F).");
                continue;
            }

            String[] partes = entrada.split(",", 3);

            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();
            Integer idade = partes.length > 2 ? Integer.parseInt(partes[2].trim()) : null;

            if (nome.isEmpty() || (!sexo.equals("M") && !sexo.equals("F"))) {
                System.out.println("Entrada inválida. Certifique-se de usar Nome,Sexo (ex: Maria,F) e que o sexo seja M ou F.");
                continue;
            }

            if (idade != null && idade < 0) {
                System.out.println("Idade inválida. A idade não pode ser negativa.");
                continue;
            }

            pessoas.add(new Pessoa(nome, sexo, idade));
        }

        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa foi cadastrada.");
            scanner.close();
            return;
        }

        System.out.println("\nPessoas cadastradas:");
        pessoas.forEach(System.out::println);

        System.out.println("\nDigite o sexo para buscar (M/F): ");
        String filtroSexo = scanner.nextLine().trim().toUpperCase();

        if (!filtroSexo.equals("M") && !filtroSexo.equals("F")) {
            System.out.println("Sexo inválido. Use M ou F.");
        } else {
            List<String> nomesFiltrados = pessoas.stream()
                .filter(p -> p.getSexo().equals(filtroSexo))
                .map(p -> p.getNome() + " (" + p.getIdade() + " anos)")
                .collect(Collectors.toList());

            if (nomesFiltrados.isEmpty()) {
                System.out.println("Nenhuma pessoa encontrada com o sexo " + filtroSexo + ".");
            } else {
                System.out.println("Nomes filtrados: " + nomesFiltrados);
            }
        }

        scanner.close();
    }
}
