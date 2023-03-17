public class Volleyball extends Sport {
    private String teamServing;

    public Volleyball(boolean usesNet, double ballDiameter, String teamServing) {
        super(usesNet, ballDiameter);
        this.teamServing = teamServing;
    }

    public String serveBall() {
        return "The ball has been served.";
    }
}
