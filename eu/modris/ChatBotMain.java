package eu.modris;


import java.util.Scanner;

public class ChatBotMain {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Labdien!");
        System.out.println("Kā es varu Jums palīdzēt?");

        while (true) {

            String text = scanner.nextLine();
            if ("Paldies.Uz redzēšanos.".equals(text)) {
                System.out.println("Uz redzēšanos!");
                break;

            } else if ("Kādus programmēšanas kursus Jūs pasniedzat?".equalsIgnoreCase(text)){
                System.out.println("Mēs piedāvājam Java, Python un JavaScript kursus. " + "Kādi jūs interesētu?");

            } else if ("Man interesē Java kursi.".equalsIgnoreCase(text)) {
                System.out.println("Mēs piedāvajam kursu 8.februārī.");

            } else if ("Vai es varētu pieteikties uz šo kursu?".equalsIgnoreCase(text)){
                System.out.println("Jā, Protams");

            } else if ("Sakiet, kursi notiek klātienē vai attālināti?".equalsIgnoreCase(text)) {
                System.out.println("Kursi šobrīd notiek attālināti.");

            } else {
                System.out.println("Atvainojiet, es nevaru atbildēt uz šo jautājumu!");
            }

        }





    }
}
