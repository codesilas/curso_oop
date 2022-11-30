from car import car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = car("AM123", Account("Andres", "123456789"))
    print(vars(car))
    print(vars(car.driver))