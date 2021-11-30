package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Program> registeredProgram = new LinkedHashSet<>();
    private Set<Program> concludedProgram = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp) {
        this.registeredProgram.addAll(bootcamp.getPrograms());
        bootcamp.getRegisteredDevs().add(this);
    }

    public void progressing() {
        Optional<Program> program = this.registeredProgram.stream().findFirst();

        if (program.isPresent()) {
            this.concludedProgram.add(program.get());
            this.registeredProgram.remove(program.get());
        } else {
            System.out.println(this.name + " não está matriculado em nenhum conteúdo!");
        }
    }

    public double totalXP(){
        return this.concludedProgram.stream()
                .mapToDouble(Program::calculateXP).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Program> getRegisteredProgram() {
        return registeredProgram;
    }

    public Set<Program> getConcludedProgram() {
        return concludedProgram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(registeredProgram, dev.registeredProgram) && Objects.equals(concludedProgram, dev.concludedProgram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registeredProgram, concludedProgram);
    }
}
