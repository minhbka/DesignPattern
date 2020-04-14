package creational.prototype.computerclone;

public class ITApp {
    public static void main(String[] args) {
        Computer computer1 = new Computer("window 10", "word 365", "Kaspersky Anti Virus", "Google Chrome", "Skype");
        Computer computer2 = computer1.clone();
        System.out.println(computer2);

        computer2.setOthers("Skype, Filezilla Client, Android Studio");

        System.out.println(computer2);
    }
}
