package src.tienphan.state;

public class Canvas {
    private Tool currentTool;

    public Canvas(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void onMouseUp() {
        currentTool.mouseUp();
    }

    public void onMouseDown() {
        currentTool.mouseDown();
    }

    public void setTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public Tool getTool() {
        return currentTool;
    }
}