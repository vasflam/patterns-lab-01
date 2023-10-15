package md.usarb.application.common;

import md.usarb.application.common.ui.HeaderHero;

public abstract class AbstractApplication implements Application {
    private String messageOfTheDay;
    private ServiceContainer container;

    @Override
    abstract public HeaderHero getHeader();

    @Override
    public String getMessageOfTheDay() {
        return messageOfTheDay;
    }

    @Override
    public void setMessageOfTheDay(String messageOfTheDay) {
        this.messageOfTheDay = messageOfTheDay;
    }

    @Override
    public ServiceContainer getContainer() {
        return container;
    }

    @Override
    public void setContainer(ServiceContainer container) {
        this.container = container;
    }
}
