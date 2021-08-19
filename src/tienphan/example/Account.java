package src.tienphan.example;

import src.tienphan.momento.Editor;
import src.tienphan.momento.History;
import src.tienphan.state.BrushTool;
import src.tienphan.state.Canvas;
import src.tienphan.state.Eraser;
import src.tienphan.state.Tool;

public class Account {
    private float balance;

    public void deposit(float amount) {
        if (balance > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (balance > 0)
            balance -= amount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        TaxCalculator newCalculator = Main.getTaxCalculator();
        newCalculator.calculateTax();
        var account = new Account();
        account.setBalance(20);
        account.deposit(10);
        account.withdraw(5);
        Main.drawBox(new TextBox());
        Main.drawBox(new CheckBox());
        // Undo mechanism of Editor
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        history.push(editor.createState());
        editor.restoreState(history.pop()); // c
        editor.restoreState(history.pop()); // b
        editor.restoreState(history.pop()); // a

        System.out.println(editor.getContent());

        Canvas newCanvas = new Canvas(new Eraser());
        newCanvas.onMouseDown();
        Tool newBrusher = new BrushTool();
        newCanvas.setTool(newBrusher);
        newCanvas.onMouseDown();
        System.out.println(newCanvas.getTool());

    }
}
