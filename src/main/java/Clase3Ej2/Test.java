package Clase3Ej2;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class Test {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("Matias", 8);
        Alumno a2 = new Alumno("Brianna", 5);

        try {
            if (a1.getNota() >= 4) {
                throw new AprobadoException(a1.getNombre() + " ha aprobado!");
            } else {
                throw new ReprobadoException(a1.getNombre() + " fue reprobado!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        if (a2.getNota() >= 4) {
            try {
                a2.sonreir();
            } catch (Exception ex) {
                System.out.println("Sonrie " + a2.getNombre() + "!");
            }
        } else {
            try {
                a2.llorar();
            } catch (Exception ex) {
                System.out.println("Llora " + a2.getNombre() + "!");
            }
        }
    }
}
