//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

  /*  Создать возвращаемый метод с названием “permission”, который будет принимать 2 входящих параметра - возраст человека и температуру на улице, и возвращать результат в виде строки.

2. Алгоритм метода должен работать следующим образом:

            - если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;

- если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;

- а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;

- в остальных случаях метод должен возвращать результат - “Оставайтесь дома”;

3. В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.

            4. Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}

5. При вызове метода “permission”, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста с помощью метода “generateRandomAge”

    НАПРИМЕР: Было - permission(23, 10); Меняете на - permission(generateRandomAge(), 10);*/
//Создать возвращаемый метод с названием “permission”, который будет принимать 2 входящих параметра - возраст человека и температуру на улице, и возвращать результат в виде строки.

public class Main {
    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    //Алгоритм метода должен работать следующим образом:


    // - если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;

//- если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;

//- а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;

//- в остальных случаях метод должен возвращать результат - “Оставайтесь дома”;

    // Method to generate a random age between 0 and 100
    public static int generateRandomAge() {
        return (int) (Math.random() * 101);
    }

    // Main method to test the permission method with different inputs
    public static void main(String[] args) {
        System.out.println(permission(23, 10));  // Example 1
        System.out.println(permission(15, 15));  // Example 2
        System.out.println(permission(50, 20));  // Example 3
        System.out.println(permission(30, -15)); // Example 4
        System.out.println(permission(60, -5));  // Example 5

        // Test with randomly generated ages
        System.out.println(permission(generateRandomAge(), 10));
        System.out.println(permission(generateRandomAge(), 20));
        System.out.println(permission(generateRandomAge(), 30));
        System.out.println(permission(generateRandomAge(), 5));
        System.out.println(permission(generateRandomAge(), -5));
    }
}
