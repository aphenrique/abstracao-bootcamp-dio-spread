package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private LocalDate initDate = LocalDate.now();
    private LocalDate endDate = initDate.plusDays(45);
    private Set<Dev> registeredDevs = new HashSet<>();
    private Set<Program> programs = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitDate() {
        return initDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Dev> getRegisteredDevs() {
        return registeredDevs;
    }

    public void setRegisteredDevs(Set<Dev> registeredDevs) {
        this.registeredDevs = registeredDevs;
    }

    public Set<Program> getPrograms() {
        return programs;
    }

    public void addProgram(Program program) {
        this.getPrograms().add(program);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initDate, bootcamp.initDate) && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(registeredDevs, bootcamp.registeredDevs) && Objects.equals(programs, bootcamp.programs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, initDate, endDate, registeredDevs, programs);
    }
}
