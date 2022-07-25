
import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {
    private int limiteSupervisionados = 5;
    private List<Professor> listaDeProfessores = new ArrayList<>();

    public Coordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }


    @Override
    public double aumentoSalario() {
        return getSalario() * 1.5;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Coordenador");
        super.mostrarDados();
        System.out.println("Após reajustado seu salário será de: R$ " + aumentoSalario());
        System.out.println("Professores supervisionados:");
    for (Professor professor: listaDeProfessores) {
        System.out.println(professor.getNome());
    }
    }


    public String adicionaProfessor(Professor p) {

        if (listaDeProfessores.size() <= limiteSupervisionados) {
            listaDeProfessores.add(p);
            return "Professor adicionado com sucesso";
        } else {

            return "A lista já atingiu o limite máximo";
        }




    }

    public List<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

}