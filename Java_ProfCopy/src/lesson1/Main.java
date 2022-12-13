package lesson1;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        CarCopy c = null;
        System.out.println(c);

        CarCopy car = new CarCopy("green", 55, true);

        CarCopy secondcar = new CarCopy("red", 34, false);

        car.color = "blue";
        secondcar.color = "green";

        car.number = 300;
        secondcar.number = 400;

        car.isSuperCar = true;
        secondcar.isSuperCar = false;

        System.out.println(car);
        System.out.println(secondcar);

        System.out.println(car.color);
        System.out.println(secondcar.color);

        System.out.println(car.number);
        System.out.println(secondcar.number);

        CarCopy thirdCar = new CarCopy("white",3, true);

        System.out.println(thirdCar);
        System.out.println(thirdCar.color);
        System.out.println(thirdCar.number);
        System.out.println(thirdCar.isSuperCar);

        car.go();
        secondcar.go();
        thirdCar.go();

        car.info();
        secondcar.info();
        thirdCar.info();

    }
}

