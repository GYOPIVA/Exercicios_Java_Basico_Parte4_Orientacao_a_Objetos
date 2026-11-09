package guiaDidaticoPT4;

public class Exercicio10 {

    enum Turno{
        Manha,Tarde,Noite
    }

    static void main(String[] args) {
        System.out.println("Turnos Disponíveis:");
        for (Turno turno : Turno.values()) {
            System.out.println(turno);
        }
    }
}
