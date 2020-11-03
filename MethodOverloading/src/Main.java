public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Cam", 500);
        System.out.println("New score is " + newScore);
        int newPlayerScore = calculateScore(75);
        System.out.println("New player score is " + newPlayerScore);
        String noScore = calculateScore();
        System.out.println(noScore);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static String calculateScore() {
        System.out.println("No player, no score.");
        return "No player, no score.";
    }
}
