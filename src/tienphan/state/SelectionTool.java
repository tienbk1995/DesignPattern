package src.tienphan.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Selection released");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw dashed rectangle");
    }
}
