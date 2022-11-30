class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car car = new Car("123", new Account("Andres Herrera", "123456789"));
        car.passengenger = 4;
        System.out.println("Car License: " + car.licence);

        Car car2 = new Car("123", new Account("Andrea Herrera", "987654321"));
        car2.passengenger = 3;
        System.out.println("Car License: " + car2.licence);

    }
}