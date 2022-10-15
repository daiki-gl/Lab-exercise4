public class Looping extends Calc {
    public void continueOrquit() {
        do {
            calc();
        } while (keep.equals("continue"));
        System.out.println("Bye");
    }
}
