import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Course dataStructureCourse = new Course();

        dataStructureCourse.setTitle("Estrutura de dados");
        dataStructureCourse.setDescription("Curso de Estrutura de dados para o bootcamp Spread-Dio");
        dataStructureCourse.setCourseLoad(8);

        Course dartCourse = new Course();

        dartCourse.setTitle("Dart básico");
        dartCourse.setDescription("Curso inicial da linguagem dart");
        dartCourse.setCourseLoad(8);


        Mentoring mentoring = new Mentoring();

        mentoring.setTitle("Mentoria em estrutura de dados");
        mentoring.setDescription("Mentoria para as atividades do curso de estrutura de dados");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java developer");
        bootcamp.setDescription("Bootcamp Spread-Dio Java Developer");
        bootcamp.addProgram(dataStructureCourse);
        bootcamp.addProgram(dartCourse);
        bootcamp.addProgram(mentoring);

        Dev devHenrique = new Dev();
        devHenrique.setName("Henrique");

        devHenrique.registerBootcamp(bootcamp);

        System.out.println("Programas nos quais " + devHenrique.getName() + " está inscrito: ");
        devHenrique.showRegisteredPrograms();

        devHenrique.progressing();

        System.out.println("Programas nos quais " + devHenrique.getName() + " está inscrito: ");
        devHenrique.showRegisteredPrograms();

        System.out.println("Programas aos quais " + devHenrique.getName() + " concluiu: ");
        devHenrique.showConcludedPrograms();

        devHenrique.showDevResume();

//        Dev devLevi = new Dev();
//        devLevi.setName("Levi");
//
//        devLevi.registerBootcamp(bootcamp);
//
//        System.out.println("Programas nos quais " + devLevi.getName() + " está inscrito: " + devLevi.getRegisteredProgram());
//        System.out.println("Programas aos quais " + devLevi.getName() + " concluiu: " + devLevi.getConcludedProgram());
    }


}
