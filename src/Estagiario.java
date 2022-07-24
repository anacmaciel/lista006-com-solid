
public class Estagiario extends Profissional{
    private double bolsa;

    public Estagiario(String nome, String cpf, double bolsa) {
        super(nome, cpf);
        this.bolsa = bolsa;
    }

    @Override
    public void reembolsoDespesas() {
        System.out.println("Reembolso despesas Específico de estagiário");


    }


    @Override
    public void mostrarDados() {
        System.out.println("Estagiário");
        super.mostrarDados();
        System.out.println("A bolsa é de: R$ " + getBolsa());
        reembolsoDespesas();
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}