import java.util.Scanner;

public class GameDiceRoll {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        Scanner x = new Scanner(System.in);
        System.out.println("Угадай число от 1 до 100");
        a = (int)(Math.random()*100+1);
        while (true){
            System.out.println("Введи число");
            b = x.nextInt();
            if (a>b){
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            }else if (a<b){
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");

            }else{
                System.out.println("Ты угадал");
                break;

            }

        }

    }
}

