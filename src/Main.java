import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
    private static ArrayList<Aluno> alunoList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Sistema de gerenciamento de notas do Aluno!");

        while (true) {
            displayMenu();
            int escolha = -1; // Valor inicial inválido
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    escolha = sc.nextInt();
                    entradaValida = true; // Se chegou aqui, a entrada é um número
                } catch (java.util.InputMismatchException e) {
                    limparTela();
                    System.out.println(">>> Erro: Digite um número válido! <<<");
                    sc.nextLine(); // Limpar o buffer com a entrada inválida
                    System.out.print("Escolha uma opção: ");
                }
            }
            sc.nextLine();
            if (escolha == 7) break;
            mexerEscolha(escolha);
        }
        limparTela();
        System.out.println("Obrigado por utilizar nosso sistema!");
    }

    public static void displayMenu() {
        System.out.println("\n-------- Menu --------");
        System.out.println("1. Adicionar Aluno");
        System.out.println("2. Adicionar Nota");
        System.out.println("3. Mostrar Alunos");
        System.out.println("4. Salvar ao arquivo");
        System.out.println("5. Carregar do arquivo");
        System.out.println("6. Excluir Aluno");
        System.out.println("7. Sair");
        System.out.print("\n>> Escolha uma opção: ");
    }

    public static void mexerEscolha(int escolha) {

        switch (escolha) {
            case 1: addAluno(); break;
            case 2: addNota(); break;
            case 3: exibirAlunos(); break;
            case 4: salvarEmArquivo(); break;
            case 5: carregarDoArquivo(); break;
            case 6: excluirAluno(); break;
            default:
                limparTela();
                System.out.println(">>> Opção inválida. Tente novamente! <<<"); break;
        }

    }

    public static void addAluno() {

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite o ID do aluno: ");
        int id = sc.nextInt();
        sc.nextLine();


        if(buscarAluno(id) == null){

            alunoList.add(new Aluno(nome, id));
            limparTela();
            System.out.println(">>> Aluno cadastrado com sucesso! <<<");
        } else {
            limparTela();
            System.out.println(">>> Matrícula já cadastrada! <<<");
        }

    }

    public static Aluno buscarAluno(int id) {
        for (Aluno aluno : alunoList) {
            if (aluno.getId() == id) return aluno;
        }
        return null;
    }

    public static void addNota() {

        System.out.print("Digite o ID do aluno: ");
        int id = sc.nextInt();
        Aluno aluno = buscarAluno(id);
        if (aluno != null) {
            System.out.print("Digite a nota (0-100): ");
            double nota = sc.nextDouble();
            aluno.addNota(nota);
        } else{
            limparTela();
            System.out.println(">>> Aluno não encontrado! <<<");
        }
        sc.nextLine();

    }

    public static void exibirAlunos() {

        if (alunoList.isEmpty()) {
            limparTela();
            System.out.println(">>> Nenhum aluno para exibir. <<<");
        } else{
            limparTela();
            System.out.println("-------------------------");
            System.out.println("---- LISTA DE ALUNOS ----");
            System.out.println("-------------------------");
            for (Aluno aluno : alunoList) {
                System.out.printf("ID %d, Nome: %s, Média: %.2f%n", aluno.getId(), aluno.getNome(), aluno.getMedia());
            }
        }

    }

    private static void salvarEmArquivo() {

        try (PrintWriter escritor = new PrintWriter("alunos.txt")){
            for (Aluno aluno : alunoList) {
                escritor.print(aluno.getId() + ", " + aluno.getNome());
                for (double nota : aluno.getNotas()){
                    escritor.print(", " + nota);
                }
                escritor.println();
            }
            limparTela();
            System.out.println(">>> Dados salvos no arquivo! <<<");
        } catch (FileNotFoundException e) {
            limparTela();
            System.out.println(">>> Erro ao salvar arquivo: " + e.getMessage() + " <<<");
        }
    }

    public static void carregarDoArquivo() {

        alunoList.clear();

        try (Scanner leitorArquivo = new Scanner(new File("alunos.txt"))) {
            while (leitorArquivo.hasNextLine()) {
                String[] dados = leitorArquivo.nextLine().split(",");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                Aluno aluno = new Aluno(nome, id);
                for (int i = 2; i < dados.length; i++){
                    aluno.addNota(Double.parseDouble(dados[i]));
                }
                alunoList.add(aluno);
            }
            limparTela();
            System.out.println(">>> Arquivo carregado com sucesso! <<<");

        } catch(FileNotFoundException e) {
            limparTela();
            System.out.println(">>> Arquivo não encontrado! " + e.getMessage() + " <<<");
        }

    }

    public static void excluirAluno() {

        System.out.print("Digite o ID do aluno a ser excluido: ");
        int id = sc.nextInt();
        sc.nextLine();
        Aluno aluno = buscarAluno(id);
        if (aluno != null) {
            alunoList.remove(aluno);
            limparTela();
            System.out.println(">>> Aluno removido com sucesso! <<<");
        } else {
            limparTela();
            System.out.println(">>> Aluno não encontrado! <<<");
        }

    }

    public static void limparTela(){

        for (int i = 0; i < 3; i++) {
            System.out.println(".");
        }
    }

}
