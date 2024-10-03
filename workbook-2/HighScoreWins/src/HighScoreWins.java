import java.util.Scanner;
import java.util.regex.Pattern;

public class HighscoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter game score: Home:Visitor|21:9");
        String gameScore = scanner.nextLine();


        String[] game = gameScore.split(Pattern.quote("|"));
        String[] team = game[0].split(Pattern.quote(":"));
        String[] score = game[1].split(Pattern.quote(":"));

        int homeTeam = Integer.parseInt(score[0]);
        int visitorTeam = Integer.parseInt(score[1]);

        if (homeTeam > visitorTeam) {
            System.out.println("Winner " + team[0]);
        } else {
            System.out.println("Winner" + team[1]);
        }

        scanner.close();
    }
}
