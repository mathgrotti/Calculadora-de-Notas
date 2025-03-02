import java.util.ArrayList;

public class Aluno {
    private int id;
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();
    int qtdNotas;
    double somaNotas;

    public Aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void addNota(double nota){
        if (nota >= 0 && nota <= 100) {
            notas.add(nota);
        }
    }

    public double getMedia(){
        if (notas.isEmpty()) return 0;
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();

    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
}
