public class Car {
    Integer id;
    String licence;
    Account driver;
    Integer passengenger;

    // creación metodo constructor
    // indicar los argumentos necesarios para que
    // cobre vida el objeto

    public Car(String licence, Account driver){
        this.licence = licence;
        this.driver = driver;
    }

    void printDataCar(){
        System.out.println(("Licence: " + licence + "Name driver :" + driver.name));
    }

}
