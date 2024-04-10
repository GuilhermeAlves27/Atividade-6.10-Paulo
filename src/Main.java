import javax.swing.*;
// Crie um projeto que implemente e demonstre o uso da classe da atividade anterior.
// A classe deve ter metódos para dizer se o triangulo é isóscele, eqüilátero ou escaleno.
public class Main {


    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo();

        String lado1 = JOptionPane.showInputDialog("Digite o valor do lado 1 : ");
        triangulo.setLado1(Double.valueOf(lado1));

        String lado2 = JOptionPane.showInputDialog("Digite o valor do lado 2 : ");
        triangulo.setLado2(Double.valueOf(lado2));

        String lado3 = JOptionPane.showInputDialog("Digite o valor do lado 3: ");
        triangulo.setLado3(Double.valueOf(lado3));

        triangulo.resultadoTriangulo(triangulo.getLado1(), triangulo.getLado2(), triangulo.getLado3());



    }

}
