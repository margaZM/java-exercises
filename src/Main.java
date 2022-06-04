/*
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.

Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
 */

public class Main {
    public static void main(String[] args) {
        int result;
        result = addition(4, 2, 8);

        Car myCar = new Car();
        myCar.incrementDoors();

        System.out.println(result);
        System.out.println(myCar.numberCardDoors);
    }
    public static int addition(int a, int b, int c) {
        return a + b +c;
    }
}
class Car{
    public int numberCardDoors = 4;

    public void incrementDoors() {
        this.numberCardDoors++;
    }

}

