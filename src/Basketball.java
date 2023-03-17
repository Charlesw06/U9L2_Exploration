public class Basketball extends Sport {
    private double hoopHeight;

    public Basketball(boolean usesNet, double ballDiameter, double hoopHeight) {
        super(usesNet, ballDiameter);
        this.hoopHeight = hoopHeight;
    }

    public String shootBall() {
        return "The ball has been shot!";
    }
}
