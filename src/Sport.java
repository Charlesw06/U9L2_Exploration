public class Sport {
    private boolean usesNet;
    private double ballDiameter;

    public Sport(boolean usesNet, double ballDiameter) {
        this.usesNet = usesNet;
        this.ballDiameter = ballDiameter;
    }

    public String startGame() {
        return "The game has started!";
    }
}
