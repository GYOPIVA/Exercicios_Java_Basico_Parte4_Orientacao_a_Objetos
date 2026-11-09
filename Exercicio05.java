package guiaDidaticoPT4;

public class Exercicio05 {
    static class Lampada{
        boolean ligado;

        boolean ligar(){
            return ligado = true;
        };
        boolean desligar(){
            return ligado = false;
        }

        void mostrarLampada(){
            System.out.println("Lampada ligada: " + ligado);
        }

    }

    static void main(String[] args) {
        Lampada lampada01 = new Lampada();
        lampada01.ligar();
        lampada01.mostrarLampada();
        lampada01.desligar();
        lampada01.mostrarLampada();
    }
}
