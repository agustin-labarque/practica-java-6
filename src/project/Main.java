package project;

import java.lang.System.*;

public class Main {

    public static void main(String[] args){
        Persona p1 = new Persona("agus", "23929913");
        Persona p2 = new Persona("paloli", "38292939");
        Persona p3 = new Persona("masi", "12392933");
        Persona p4 = new Persona("lalala", "32939459");

        Precedable<Persona>[] personas = new Precedable[] { p1, p2, p3, p4};

        SortUtil.ordenar(personas);

        Celular c1 = new Celular("agus", 9239213);
        Celular c2 = new Celular("paloli", 4373930);
        Celular c3 = new Celular("masi", 2924942);
        Celular c4 = new Celular("lalala", 89219);

        Precedable<Celular>[] celulares = new Precedable[] { c1, c2, c3, c4};

        SortUtil.ordenar(celulares);

        printf("Tu vieja me ama brian");
    }

    public static void printf(String lel){
        System.out.printf("%s", lel);
    }

}
