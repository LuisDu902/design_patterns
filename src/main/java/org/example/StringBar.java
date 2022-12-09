package org.example;


import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {

    private boolean isHappyHour = false;

    public StringBar() {
        this(new ArrayList<>());
    }

    public StringBar(List<BarObserver> observers) {
        super(observers);
    }


    @Override
    public boolean isHappyHour() {
        return isHappyHour;
    }

    @Override
    public void startHappyHour() {
        isHappyHour = true;
    }

    @Override
    public void endHappyHour() {
        isHappyHour = false;
    }

}
