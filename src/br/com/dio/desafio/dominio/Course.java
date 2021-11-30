package br.com.dio.desafio.dominio;

public class Course extends Program {
    private int courseLoad;

    public Course() {
    }

    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public double calculateXP() {
        return XP_DEFAULT + getCourseLoad();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Título='" + getTitle() + '\'' +
                ", Descrição='" + getDescription() + '\'' +
                ", Carga Horária=" + getCourseLoad() +
                '}';
    }
}
