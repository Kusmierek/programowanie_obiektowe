import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning){
            System.out.println("Podaj opcje: \n 1 - aby obliczyć silnie dla danej liczby \n 2 - aby zamknac program \n 3 - aby podniesc dana liczby do potegi ^2");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Podaj liczbę, dla której chcesz obliczyć silnie");
                    long numberFactorial = sc.nextLong();
                    System.out.println("Wynik silni to:"+factorial(numberFactorial));
                    break;
                case 2:
                    isRunning = false;
                    System.out.println("Zamykam program");
                    break;
                case 3:
                    System.out.println("Podaj liczbę, dla której chcesz obliczyć 2^n");
                    long numberToN = sc.nextLong();
                    System.out.println("Wynik potegi to:"+toN(numberToN));
                    break;

            }
        }

    }

    static long factorial(long n) {
        long result = 1;
        if(n>=1){
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
        }
        else{
            System.out.println("Zła liczba musi byc wieksza badz rowna 1");
        }

        return result;
    }

    static long toN(long n) {
        long result = 1;
        for (int i = 1 ; i <= n; i++) {
            result = result * 2;
        }
        return result;
    }
}
