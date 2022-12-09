package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> lista;
    public StringTransformerGroup( List<StringTransformer> lista){
        this.lista = lista;
    }
    public void execute(StringDrink o){
        for (StringTransformer method: lista){
            method.execute(o);
        }
    }
    public void undo(StringDrink o){
        for (StringTransformer method: lista){
            method.execute(o);
        }
    }
}