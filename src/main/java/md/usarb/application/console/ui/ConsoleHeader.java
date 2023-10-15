package md.usarb.application.console.ui;

import md.usarb.application.common.ui.HeaderHero;

public class ConsoleHeader implements HeaderHero {
    private final String message;

    public ConsoleHeader(String message) {
        this.message = message;
    }

    @Override
    public void show() {
        printLine();
        System.out.println(message);
        printLine();
    }

    private void printLine() {
        System.out.println("+====" + "=".repeat(message.length()) + "====+");
    }
}
