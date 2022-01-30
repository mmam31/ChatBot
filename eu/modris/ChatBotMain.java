package eu.modris;


import java.util.Scanner;

public class ChatBotMain {

    public static void main(String[] args) {

        String hello = "Labdien! Jūs uzrakstījāt RigaCodingSchool!";
        String welcomeQuestion = "Kā es varu Jums palīdzēt?";

        String question1 = "Kādus programmēšanas kursus Jūs pasniedzat?";
        String answer1 = "Mēs piedāvājam Java, Python un JavaScript kursus. Kādi jūs interesētu?";

        String question2 = "Man interesē Java kursi.";
        String answer2 = "Mēs piedāvajam tuvāko Java kursu 8.februārī.";

        String question3 = "Vai es varētu pieteikties uz šo kursu?";
        String answer3 = "Jā, Protams";

        String question4 = "Sakiet, kursi notiek klātienē vai attālināti?";
        String answer4 = "Visi kursi šobrīd notiek attālināti.";

        String question5 = "Cik ilgi kursi ies?";
        String answer5 = "Kursi ies 2 mēnešus";

        final Scanner scanner = new Scanner(System.in);

        System.out.println(hello);
        System.out.println(welcomeQuestion);

        while (true) {

            String text = scanner.nextLine();
            if ("Paldies.Uz redzēšanos.".equals(text)) {
                System.out.println("Uz redzēšanos!");
                break;

            } else if (question1.equalsIgnoreCase(text)){
                System.out.println(answer1);

            } else if (question2.equalsIgnoreCase(text)) {
                System.out.println(answer2);

            } else if (question3.equalsIgnoreCase(text)){
                System.out.println(answer3);

            } else if (question4.equalsIgnoreCase(text)) {
                System.out.println(answer4);

            } else if (question5.equalsIgnoreCase(text)){
                System.out.println(answer5);


            } else {
                System.out.println("Atvainojiet, es nevaru atbildēt uz šo jautājumu!");
            }

        }





    }
}
