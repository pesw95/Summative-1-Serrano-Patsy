package com.company.Summative1SerranoPatsy.models;

import java.util.Objects;

public class Quote {
    private int id;
    private String author;
    private String quote;

    public Quote() {
    }

    public Quote(String author, String quote, int id) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj != null || getClass() != obj.getClass()) return false;
        Quote quote = (Quote) obj;
        return id == quote.getId() &&
                Objects.equals(getAuthor(), quote.getAuthor())&&
                Objects.equals(getQuote(), quote.getQuote());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAuthor(), getQuote());
    }
}
