public class Turma {
    private int quantidadeDeAlunos;
    private int idDaTurma;

    public Turma(int quantidadeDeAlunos, int idDaTurma) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.idDaTurma = idDaTurma;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getIdDaTurma() {
        return idDaTurma;
    }

    public void setIdDaTurma(int idDaTurma) {
        this.idDaTurma = idDaTurma;
    }
}

