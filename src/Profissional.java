
public abstract  class  Profissional implements Despesas{
    private String nome;
    private String cpf;

    public Profissional(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public void reembolsoDespesas() {

        System.out.println("Reembolso sem regra de negócio definida");
    }

    public void mostrarDados() {
        System.out.println("Profissional");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
    reembolsoDespesas();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
