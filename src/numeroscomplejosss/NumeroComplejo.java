/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroscomplejosss;

/**
 *
 * @author labctr
 */
public class NumeroComplejo {
        private int parteReal;
    private int parteImaginaria;

    public void cargar(String numeroComplejo) {
        // Eliminamos espacios y caracteres innecesarios
        numeroComplejo = numeroComplejo.replaceAll("\\s", "");

        // Manejamos el caso especial de un número complejo sin parte real (ej. "i")
        if (!numeroComplejo.contains("+") && !numeroComplejo.contains("-")) {
            this.parteReal = 0;
            this.parteImaginaria = (numeroComplejo.endsWith("i") || numeroComplejo.endsWith("-i")) ? -1 : 1;
            return;
        }

        // Se manejan las partes real e imaginaria utilizando expresiones regulares
        String[] partes = numeroComplejo.split("(?=[+-])");
        this.parteReal = Integer.parseInt(partes[0]);
        this.parteImaginaria = Integer.parseInt(partes[1].replace("i", ""));
    }

    public String suma(NumeroComplejo otroNumero) {
        int nuevaParteReal = this.parteReal + otroNumero.parteReal;
        int nuevaParteImaginaria = this.parteImaginaria + otroNumero.parteImaginaria;
        String signo = (nuevaParteImaginaria < 0) ? "" : "+";
        return nuevaParteReal + signo + nuevaParteImaginaria + "i";
    }

    public String mostrar() {
        String signo = (this.parteImaginaria < 0) ? "" : "+";
        return this.parteReal + signo + this.parteImaginaria + "i";
    }
}

}
