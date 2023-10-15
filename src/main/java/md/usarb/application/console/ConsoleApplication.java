package md.usarb.application.console;

import md.usarb.application.common.AbstractApplication;
import md.usarb.application.common.ui.HeaderHero;
import md.usarb.application.console.ui.ConsoleHeader;

public class ConsoleApplication extends AbstractApplication {
    //@TODO Factory method pattern
    @Override
    public HeaderHero getHeader() {
        return new ConsoleHeader(getMessageOfTheDay());
    }
}
