public class TestFiguras {
    public static void main(String[] args) {
        // Prueba para Cuadrado
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("Area del Cuadrado: " + cuadrado.calcularArea()); // Debería ser 25
        System.out.println("Perímetro del Cuadrado: " + cuadrado.calcularPerimetro()); // Debería ser 20

        // Prueba para Triangulo
        Triangulo triangulo = new Triangulo(10, 5, 6, 8, 10);
        System.out.println("Area del Triángulo: " + triangulo.calcularArea()); // Debería ser 25
        System.out.println("Perímetro del Triángulo: " + triangulo.calcularPerimetro()); // Debería ser 24

        // Prueba para Circulo
        Circulo circulo = new Circulo(7);
        System.out.println("Area del Círculo: " + circulo.calcularArea()); // Debería ser aproximadamente 153.94
        System.out.println("Perímetro del Círculo: " + circulo.calcularPerimetro()); // Debería ser aproximadamente 43.98
    }
}
