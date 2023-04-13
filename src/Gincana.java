public class Gincana {

    private String nomeGincana;
    private int totalEstudantes;
    private Estudante estudanteVencedor;
    private int pontuacaoMaxima;


    public String getNomeGincana(){

        return nomeGincana;
    }
    public void setNomeGincana(String nomeGincana){

        this.nomeGincana = nomeGincana;
    }

    public int getTotalEstudantes(){

        return totalEstudantes;
    }
    public void setTotalEstudantes(int totalEstudantes){

        this.totalEstudantes = totalEstudantes;
    }

    public Estudante getEstudanteVencedor(){

        return estudanteVencedor;
    }
    public void setEstudanteVencedor(Estudante estudanteVencedor){

        this.estudanteVencedor = estudanteVencedor;
    }

    public int getPontuacaoMaxima(){

        return pontuacaoMaxima;
    }
    public void setPontuacaoMaxima(int pontuacaoMaxima){

        this.pontuacaoMaxima = pontuacaoMaxima;
    }






    public void adicionarEstudante(Estudante newEstudante){

        setTotalEstudantes(getTotalEstudantes()+1);

        if(newEstudante.getNome().equals( "Frederick" ) ){

            System.out.println("Nosso primeiro participante é Frederick, o que o torna vencedor por W.O.");
            setEstudanteVencedor(newEstudante);
            setPontuacaoMaxima(newEstudante.getPontos());
        }

        System.out.println("Estudante "+newEstudante.getNome()+" adicionado com sucesso! "+totalEstudantes+" Estudantes");
        if(newEstudante.getPontos() > estudanteVencedor.getPontos() && newEstudante.getPontos() >= getPontuacaoMaxima()) {

            System.out.println("O(A) Estudante " + newEstudante.getNome() + " possui mais pontos que " + getEstudanteVencedor().getNome() + " tornando-o(a) o(a) novo(a) vencedor(a) da gincana " + getNomeGincana());
            setPontuacaoMaxima(newEstudante.getPontos());
            setEstudanteVencedor(newEstudante);
        }
    }

    public void exibirVencedor(){

        System.out.println("O(A) estudante "+estudanteVencedor.getNome()+" é o(a) vencedor(a) com "+getPontuacaoMaxima()+" pontos!");
    }
}
