import java.util.Scanner;

public class Paciente {

    static String Nome;
    static double Altura;
    static double Peso;

    Scanner Lerinformacoes = new Scanner(System.in);

    protected Paciente(){
        this.Nome = setNome();
        this.Altura = Lerinformacoes.nextDouble();
        this.Peso = Lerinformacoes.nextDouble();

    }

    private String setNome() {
        return Lerinformacoes.nextLine();

    }

    @Override
    public String toString(){
        return " " + Nome + "Altura : " + Altura + "Peso : " + Peso;
    }
    

}
