/*
 *Implemente un algoritmo que le le permita:
1).Desplegar el nombre del proyecto de su paper.
2).Que es una red neuronal.
3).Cuáles son los elementos que conforman una red neuronal.
4).Cómo utilizaron la red neuronal en el proyecto que usted ha seleccionado.
5).Cómo utilizaria usted la red neuronal como mejoramiento al proyecto propuesto.
6).En que consistio el entrenamiento utilizando una red neuronal, indique el
algoritmo utilizado.
 */
package redneuronal1;

/**
 *
 * @author Israel Enríquez
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner objeto=new Scanner(System.in);//reserva espacio de memoria
    System.out.println("Aplicacion de redes neuronales artificiales en la p"
            + "redicción de la curva de destilación ASTMD 86 en gasolinas automotrices: ");

    System.out.println("Responda en base al paper científico elegido");

    System.out.println("1. Que es una red neuronal?");
    String redneuronal=objeto.nextLine();

    System.out.println("2.Cuales son los elementos que conforman una red neuronal? ");
    String elementosred=objeto.nextLine();
    System.out.println("3.Cómo utilizaron la red neuronal en el proyecto que usted ha seleccionado?");
    String utilizacion=objeto.nextLine();
    System.out.println("4.Cómo utilizaria usted la red neuronal como mejoramiento al proyecto propuesto?");
    String utilizacion2=objeto.nextLine();
    System.out.println("5.En que consistio el entrenamiento utilizando una red neuronal?, indique el \n" +
    "algoritmo utilizado");
    String entrenamiento=objeto.nextLine();
    }

}
