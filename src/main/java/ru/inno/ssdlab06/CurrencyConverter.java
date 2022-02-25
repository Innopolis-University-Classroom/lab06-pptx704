package ru.inno.ssdlab06;

import java.util.HashMap;

public class CurrencyConverter {
    HashMap<String, Float> values;

    public CurrencyConverter(){
        this.values = new HashMap<>();
        this.values.put("usd", 1.f);
        this.values.put("rouble", 84.f);
        this.values.put("chf", 1.1f);
        this.values.put("cad", 0.79f);
        this.values.put("euro", 1.18f);
        this.values.put("kyd", 1.22f);
        this.values.put("gbp", 1.38f);
        this.values.put("jod", 1.4f);
        this.values.put("omr", 2.6f);
        this.values.put("kwd", 3.32f);
    }

    public float convert(float value, String from, String to){
        return (this.values.get(from) / value) * this.values.get(to);
    }
}