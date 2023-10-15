package md.usarb.application.web.ui;

import md.usarb.application.common.ui.HeaderHero;

public class WebHeader implements HeaderHero {
    private final String message;

    public WebHeader(String message) {
        this.message = message;
    }

    @Override
    public void show() {
        System.out.println("<hr/>" + message + "<hr/>");
    }
}
