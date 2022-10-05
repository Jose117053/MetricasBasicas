/**
 *  Programa que muestra el uso de las clases
 *  Punto2D y OperacionesConPuntos2D
 *
 *  Actividad a realizar:
 *  1.- Pedir los datos en enorno gráfico
 *  2.- Probar los métodos de OperacionesConPuntos2D
 *
 *   @version 22/Sep/22
 */

package Metricas1;

import javax.swing.JOptionPane;

public class UsaOperacionesConPuntos2D {

    public static void main(String... something){
        double x1, y1, x2, y2;

        x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa x1 "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa y1 "));
        Punto2D a = new Punto2D(x1, y1);

        x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa x2 "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa y2 "));
        Punto2D b = new Punto2D(x2, y2);

        double metrica=OperacionesConPuntos2D.metricaEuclidiana(a, b);
        String mostrarMetrica= "La distancia del punto " + a + " al punto " + b + " es: "+metrica+"\n";

        double normaA = OperacionesConPuntos2D.norma(a);
        String mostrarNormaA = "La norma de " + a + " es : " + normaA + "\n";

        double normaB = OperacionesConPuntos2D.norma(b);
        String mostrarNormaB = "La norma de " + b + " es : " + normaB + "\n";

        double taxista= OperacionesConPuntos2D.metricaTaxista(a, b);
        String mostrarTaxista = "La metrica Taxista de " + a + " con " + b + " es: " + taxista + "\n";

        double producto= OperacionesConPuntos2D.dotProduct(a, b);
        String mostrarProducto = "El producto punto de " + a + " con " + b + " es: "+producto + "\n";

        double area = OperacionesConPuntos2D.area(a, b);
        String mostrarArea = "El area del triangulo generado del punto " + a + " con " + b + " es de: " + area + "\n";

        JOptionPane.showMessageDialog(null, mostrarMetrica + mostrarNormaA + mostrarNormaB + mostrarTaxista + mostrarProducto + mostrarArea);


    }
}
