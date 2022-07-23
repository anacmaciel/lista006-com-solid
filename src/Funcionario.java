
public abstract class Funcionario  extends  Profissional{
    private String numeroDeRegistro;
    private String orgaoDeLotacao;
    private double salario;

    public Funcionario(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf);
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }

    public double aumentoSalario() {

        return getSalario() * 1.10;

    }


    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("número de registro: Orgão de lotação: ");
        System.out.println(getNumeroDeRegistro() + " " + getOrgaoDeLotacao());
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

