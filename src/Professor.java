
import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeturmas;
    private List<Turma> listaDeTurmas = new ArrayList<>();
    private List<Estagiario> listaDeEstagiarios = new ArrayList<>();

    public Professor(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeturmas = quantidadeDeTurmas;
        this.turmas = turmas;
    }

    public void adicionaTurma(Turma t) {
        listaDeTurmas.add(t);
    }

    public void adicionaEstagiario(Estagiario e) {
        if (listaDeEstagiarios.size() < 3){
            listaDeEstagiarios.add(e);
        }

    }


    @Override
    public void mostrarDados() {
        System.out.println("Professor");
        super.mostrarDados();
        System.out.println("Disciplina ministrada: "+ getDisciplinaMinistrada());
        System.out.println("nível de graduação: " + getNivelDeGraduacao());
        System.out.println("quantidade de alunos: " + getQuantidadeDeAlunos());
        System.out.println("Quantidade de turmas: " + getQuantidadeDeturmas());
        System.out.println("Seu salário após o reajuste será de: $ " + aumentoSalario());
        System.out.println("Professor é responsável pelas turmas: ");
        for (Turma t : listaDeTurmas) {
            System.out.println("identificação da turma: " + t.getIdDaTurma());
            System.out.println("Quantidade de alunos da turma: " + t.getQuantidadeDeAlunos());
            System.out.println("Estagiários tutorados: ");
            for (Estagiario e: listaDeEstagiarios) {
                System.out.println(e.getNome());
            }
        }
    }


    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {

        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {

        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeturmas() {
        return quantidadeDeturmas;
    }

    public void setQuantidadeDeturmas(int quantidadeDeturmas) {

        this.quantidadeDeturmas = quantidadeDeturmas;
    }

    public List<Turma> getListaDeTurmas() {
        return listaDeTurmas;
    }

    public void setListaDeTurmas(List<Turma> listaDeTurmas) {
        this.listaDeTurmas = listaDeTurmas;
    }

}
