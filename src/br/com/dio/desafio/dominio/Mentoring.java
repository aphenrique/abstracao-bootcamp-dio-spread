package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Program {

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculateXP() {
        return XP_DEFAULT + 20.0;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Título='" + getTitle() + '\'' +
                ", Descrição='" + getDescription() + '\'' +
                ", Data=" + getDate() +
                '}';
    }
}
