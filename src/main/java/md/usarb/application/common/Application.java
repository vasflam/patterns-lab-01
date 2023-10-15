package md.usarb.application.common;

import md.usarb.application.common.ui.HeaderHero;

public interface Application {
    public HeaderHero getHeader();
    public String getMessageOfTheDay();
    public void setMessageOfTheDay(String message);
    public ServiceContainer getContainer();
    void setContainer(ServiceContainer container);
}
