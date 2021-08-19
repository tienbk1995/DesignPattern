package src.tienphan.state;

public class Eraser implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Eraser released");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erasing...");
    }
}
