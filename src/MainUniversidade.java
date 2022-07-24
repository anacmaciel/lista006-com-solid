public class MainUniversidade {
    public static void main(String[] args) {
        FuncionarioAdministrativo funcionario = new FuncionarioAdministrativo("Socorro Santos", "111", "1213", " SEMEC", 10000, "Diretor(a)", "senior");
        funcionario.mostrarDados();

        Professor professor1 = new Professor("Ana Maciel", "061", "1214", "SEMEC", 7000, "Mestrado em educação" ,"fundamentos da literatura" );

        Professor professor2 = new Professor("Marcelo Aumeida", "062", "1215", "SEMEC", 6000, "Mestrado em educação", "Lingua Espanhola 1");
        Professor professor3 = new Professor("Carlos Andaluz", "061", "1214", "SEMEC", 9000, "Mestrado em educação","fundamentos da literatura");
        Coordenador coordenador1 = new Coordenador("Alan Campos", "00000", "1416", "SEMEC", 15000);
        coordenador1.adicionaProfessor(professor1);
        coordenador1.adicionaProfessor(professor2);
        coordenador1.adicionaProfessor(professor3);
        coordenador1.mostrarDados();
        Turma turma1 = new Turma(20, 4342);
        Turma turma2 = new Turma(40, 4640);
        Turma turma3 = new Turma(10, 4040);
        professor1.adicionaTurma(turma1);
        professor2.adicionaTurma(turma2);
        professor3.adicionaTurma(turma3);
        Estagiario estagiario1 = new Estagiario("Carolina Maciel", "04444444", 700);
professor1.adicionaEstagiario(estagiario1);

        professor1.mostrarDados();
        professor2.mostrarDados();
        professor3.mostrarDados();
        estagiario1.mostrarDados();
    }


}
