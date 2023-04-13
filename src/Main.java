public class Main {
    public static void main(String[] args) {

        Gincana gincana = new Gincana();

        Estudante est1 = new Estudante();
        Estudante est2 = new Estudante();
        Estudante est3 = new Estudante();
        Estudante est4 = new Estudante();
        Estudante est5 = new Estudante();

        print("Boas vindas ao sistema da gincana");
        print("Insira o nome da gincana:");
        gincana.setNomeGincana("Super Gincana Vôlei 2k23");
        print("Insira os estudantes e distribua seus pontos para ver se ganhou a gincana");

        est1.setNome("Frederick");  est1.setIdade(17);  est1.setPontos(48);
        est2.setNome("Millia");    est2.setIdade(16);  est2.setPontos(36);
        est3.setNome("Axl");  est3.setIdade(15);  est3.setPontos(50);
        est4.setNome("Jack");    est4.setIdade(17);  est4.setPontos(25);
        est5.setNome("Fausto");    est5.setIdade(19);  est5.setPontos(52);

        gincana.adicionarEstudante(est1);
        gincana.adicionarEstudante(est2);
        gincana.adicionarEstudante(est3);
        gincana.adicionarEstudante(est4);
        gincana.exibirVencedor();

        gincana.adicionarEstudante(est5);
        gincana.exibirVencedor();
    }



























    public static void print(String msg){

        System.out.println(msg);
    }
}