package org.example;

public class HumanClient implements Client{



    @Override
    public void happyHourStarted(Bar bar) {
        happyHourStarted(bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {

        happyHourStarted(bar);

    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {

        wants(drink, recipe, bar);
    }

}
