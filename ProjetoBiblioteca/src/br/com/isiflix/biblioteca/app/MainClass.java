package br.com.isiflix.biblioteca.app;

import br.com.isiflix.biblioteca.core.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String escolha;
        ArrayList<Livro> livros = new ArrayList<Livro>();

        livros.add(new Livro(
                "Clean Code",
                "Robert C. Martin",
                2008,
                "Programação",
                1,
                1,
                false
        ));

        livros.add(new Livro(
                "O Senhor dos Anéis",
                "J. R. R. Tolkien",
                1954,
                "Fantasia",
                2,
                3,
                true
        ));

        livros.add(new Livro(
                "Dom Casmurro",
                "Machado de Assis",
                1899,
                "Literatura Brasileira",
                3,
                2,
                false
        ));

        livros.add(new Livro(
                "1984",
                "George Orwell",
                1949,
                "Ficção Distópica",
                2,
                1,
                true
        ));

        livros.add(new Livro(
                "Algoritmos",
                "Thomas H. Cormen",
                2009,
                "Computação",
                1,
                4,
                false
        ));


        do {
            menu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(livros);
                    break;
                case 2:
                    System.out.println("Livros disponíveis: ");
                    ArrayList<String> livrosDisponiveis = new ArrayList<String>();
                    for (Livro l : livros) {
                        if (!l.isEmprestado()) {
                            livrosDisponiveis.add(l.getTitulo());
                        }
                    }

                    if (livrosDisponiveis.isEmpty()) {
                        System.out.println("No momento não temos livros disponiveis.");
                        break;
                    } else {
                        livrosDisponiveis.forEach(l -> System.out.println(l));
                        scanner.nextLine();
                        do {
                            System.out.println("Digite o nome do livro que quer pegar emprestado: ");

                            escolha = scanner.nextLine();
                        } while (!livrosDisponiveis.contains(escolha));

                        for (Livro l : livros) {
                            if (l.getTitulo().equals(escolha)) {
                                l.setEmprestado(true);
                            }
                        }

                        System.out.println("Livro emprestado com sucesso!");
                        break;
                    }
                case 3:
                    ArrayList<String> livrosEmprestados = new ArrayList<>();
                    for (Livro l : livros) {
                        if (l.isEmprestado()) {
                            livrosEmprestados.add(l.getTitulo());
                        }
                    }
                    if (livrosEmprestados.isEmpty()) {
                        System.out.println("Não existem livros para seres devolvidos.");
                        break;
                    } else {
                        scanner.nextLine();
                        do {
                            System.out.println("Digite o nome do livro que deseja devolver: ");
                            livrosEmprestados.forEach(l -> System.out.println(l));

                            escolha = scanner.nextLine();
                        } while (!livrosEmprestados.contains(escolha));

                        for (Livro l : livros) {
                            if (l.getTitulo().equals(escolha)) {
                                l.setEmprestado(false);
                            }
                        }
                        System.out.println("Devolução concluida");
                        break;
                    }
                case 4:
                    System.out.println("Sessão finalizada!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 4);
    }

    public static void menu() {
        System.out.println("Escolha uma opção: \n" +
                "1- Listar livros \n" +
                "2- Emprestar livro \n" +
                "3- Devolver livro \n" +
                "4- Sair");

    }


}
