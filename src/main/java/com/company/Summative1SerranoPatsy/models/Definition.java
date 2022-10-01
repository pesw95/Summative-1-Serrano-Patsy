package com.company.Summative1SerranoPatsy.models;

import java.util.Objects;

public class Definition {
    private int id;
    private String word;
    private String Definition;

    public Definition() {
    }

    public Definition(String word, String definition, int id) {
        this.id = id;
        this.word = word;
        Definition = definition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return Definition;
    }

    public void setDefinition(String definition) {
        Definition = definition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj != null || getClass() != obj.getClass()) return false;
        Definition definition = (Definition) obj;
        return id == definition.getId() &&
                Objects.equals(getWord(), definition.getWord())&&
                Objects.equals(getDefinition(), definition.getDefinition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getWord(), getDefinition());
    }
}
