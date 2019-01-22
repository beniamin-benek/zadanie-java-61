import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj aktualną temperaturę w pomieszczeniu: ");
        int temperature = scanner.nextInt(); scanner.nextLine();
        System.out.print("Podaj minimalną temperaturę pomieszczenia: ");
        int minTemperature = scanner.nextInt(); scanner.nextLine();
        System.out.print("Czy w pokoju znajduje sie klimatyzator (true/false)? ");
        boolean hasConditioner = scanner.nextBoolean();
        scanner.close();

        if (temperature < minTemperature)
            System.out.println("Temperatura nie może być niższa od temperatury minimalnej.");

        else {
            Room room1 = new Room(temperature, minTemperature, hasConditioner);

            showInfo(room1);
            reducingProccess(room1);
            reducingProccess(room1);
            reducingProccess(room1); //trzy wywołania
        }

    }

    static void showInfo(Room room) {
        System.out.println("\nAktualna temperatura: " + room.getTemperature());
        System.out.println("Minimalna temperatura: " + room.getMinTemperature());
        System.out.println("Czy w pokoju jest klimatyzator? " + room.getConditioner() +"\n");
    }

    static void reducingProccess(Room room) {
        if (!room.getConditioner()) //tylko na potrzeby komunikatu, reduceTemperature zwróci false
            System.out.println("Brak klimatyztora.");
        else if(room.getTemperature() == room.getMinTemperature()) //tylko na potrzeby komunikatu, reduceTemperature zwróci false
            System.out.println("Schłodzono do temperatury minimalnej.");
        else {
            room.reduceTemperature();
            System.out.println("Temperatura została obniżona:");
            System.out.println("Nowa temperatura: " + room.getTemperature() + "\n");
        }
    }

}