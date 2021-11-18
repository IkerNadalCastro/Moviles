package com.example.practica2_hipotenochas;

public class Hipotenocha {

    private boolean esHipotenocha = false;
    private String tag;

    public Hipotenocha(boolean esHipotenocha, String tag) {
        this.esHipotenocha = esHipotenocha;
        this.tag = tag;
    }

    public boolean isEsHipotenocha() {
        return esHipotenocha;
    }

    public void setEsHipotenocha(boolean esHipotenocha) {
        this.esHipotenocha = esHipotenocha;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
