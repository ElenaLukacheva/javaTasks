package example0;

import java.util.Scanner;

public class ExampleSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый возраст в числовом значении: ");
        int age1 = scanner.nextInt();
        boolean has18 = age1 >= 18 ? true : false;
        System.out.println(has18);
        String coolAge = age1 >= 18 ? "Больше чем 18" : "Меньше чем 18";
        System.out.println(coolAge);

        System.out.print("Введите второй возраст в числовом значении: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Введено не число.");
            return;
        }
        int age2 = scanner.nextInt();
        String car = "Lada Granta";
        if (age2 <= 18) {
            car = "Жигули";
            System.out.println("Вам нет 18 " + car);
        } else if (age2 > 19 && age2 <= 25) {
            car = "Nissan";
            System.out.println("Вы молод " + car);
        } else if (age2 > 26 && age2 <= 45) {
            car = "BMW";
            System.out.println("Вы взрослый " + car);
        } else if (age2 > 46 && age2 <= 80) {
            car = "Bentley";
            System.out.println("Вы мудрый " + car);
        }
        if (age2 > 81) {
            System.out.println("У вас личный водитель");
        }

        System.out.println("Введите третий возраст в числовом значении: ");
        int age3 = scanner.nextInt();
           switch (age3){
            case 18:
                car = "Жигули";
                    break;
            case 25:
                car = "Mercedez";
                    break;
            case 45:
                car = "Lexus";
                break;
            default:
                car = "Автобус или Машина с личным водителем";
                break;
            }
        System.out.println(car);
    }
}
