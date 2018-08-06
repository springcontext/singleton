public class Ball {

    private static Ball INSTANCE = null;

    private Ball() {

    }

    public static Ball getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Ball();
        }

        return INSTANCE;
    }

    public void roll() {

        double random = Math.random() * 100 + 5;

        System.out.println("The ball rolled on " + random + " meters");
    }
}