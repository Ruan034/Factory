package org.example;

public class Test {
    public static void main(String[] args) {
        Polygon triangulo = PolygonFactory.createPolygon(3);
        System.out.println(String.format("%s - %s", 3, triangulo.getDescription()));

        Polygon quadrado = PolygonFactory.createPolygon(4);
        System.out.println(String.format("%s - %s", 4, quadrado.getDescription()));

        Polygon pentagono = PolygonFactory.createPolygon(5);
        System.out.println(String.format("%s - %s", 5, pentagono.getDescription()));

    }
}
