package guiaDidaticoPT4;

public class Exercicio08 {

    static class Curso {
        String nomeCurso;
        String cargaHorariaCurso;
        boolean disponivelCurso;

        Curso(String nome, String cargaHoraria, boolean disponivel) {
            this.nomeCurso = nome;
            this.cargaHorariaCurso = cargaHoraria;
            this.disponivelCurso = disponivel;
        }

        void statusCurso() {
            System.out.printf(
                    "Curso: %s%nCarga Horária: %s%nDisponível: %s%n",
                    nomeCurso, cargaHorariaCurso, disponivelCurso
            );
        }
    }

    public static void main(String[] args) {
        Curso curso01 = new Curso("ADS", "40hs", true);
        curso01.statusCurso();
    }
}
