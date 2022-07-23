public class FuncionarioAdministrativo extends Funcionario {

    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionarioAdministrativo(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Senioridade: " + getSenioridade());
        System.out.println("função administrativa: " + getFuncaoAdministrativa());
        System.out.println("seu salário, após o aumento será de: R$" + aumentoSalario());

    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }



}
