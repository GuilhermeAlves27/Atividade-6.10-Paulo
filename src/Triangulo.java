import javax.swing.*;

public class Triangulo {

    private Double lado1;
    private Double lado2;
    private Double lado3;

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    public Double getPerimetro(Double lado1, Double lado2, Double lado3) {
        return lado1 + lado2 + lado3;
    }

    public Double getArea(Double lado1, Double lado2, Double lado3) {
        // Calcula o semiperímetro
        double semiperimetro = getPerimetro(lado1, lado2, lado3) / 2;
        // Calcula a área usando a fórmula de Herão
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }


    public void resultadoTriangulo(Double lado1, Double lado2, Double lado3) {
        if (lado1.equals(lado2) && lado2.equals(lado3)){
            JOptionPane.showMessageDialog(null, "Triangulo: Equilátero" + "\nPerímetro: " + getPerimetro(lado1, lado2, lado3) + "\nÁrea: " + getArea(lado1, lado2, lado3));
        } else if (lado1.equals(lado2) || lado1.equals(lado3) || lado2.equals(lado3)){
            JOptionPane.showMessageDialog(null, "Triangulo: Isosceles" + "\nPerímetro: " + getPerimetro(lado1, lado2, lado3) + "\nÁrea: " + getArea(lado1, lado2, lado3));
        } else{
            JOptionPane.showMessageDialog(null, "Triangulo: Escaleno" + "\nPerímetro: " + getPerimetro(lado1, lado2, lado3) + "\nÁrea: " + getArea(lado1, lado2, lado3));
        }

    }
}
