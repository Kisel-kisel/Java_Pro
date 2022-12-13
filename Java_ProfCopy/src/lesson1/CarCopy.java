package lesson1;

public class CarCopy {

        String color;

        int number;

        boolean isSuperCar;

        public CarCopy(String color, int number, boolean isSuperCar){
                this.color = color;
                this.number = number;
                this.isSuperCar = isSuperCar;
        }

        public void go() {
                startEngine();
                if (isSuperCar) {
                        System.out.println(color + "Car with number " + number + "go too fast");
                } else {
                        System.out.println(color + "Car with number" + number + "go");
                }
        }

        public void go(int a){
                System.out.println("Car going");
        }
        public void info() {
                System.out.println("Это машина имеет цвет: " + color);
                if (isSuperCar) {
                        System.out.println("Эта машина быстрая");
                }
                System.out.println("Номер этой машины равен: " + number);
        }

        public void startEngine(){
                System.out.println("Двигатель запущен");
        }

}