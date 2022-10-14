package teste;

import exceptions.SerializadorException;
import model.Cachorro;
import model.Curso;
import model.Gato;
import serializador.Serializador;

public class TestDesserializar {

    public static void main(String[] args) throws SerializadorException {
        Serializador serializador = new Serializador();

        Gato gato = new Gato();
        //printa o objeto retornado no metodo
        System.out.println(serializador.desserializar(gato, "ClasseGatos.dat"));

        Cachorro cao = new Cachorro();
        //printa o objeto retornado no metodo
        System.out.println(serializador.desserializar(cao, "ClasseCachorros"));

        Curso curso = new Curso();
        //printa o objeto retornado no metodo
        System.out.println(serializador.desserializar(curso, "Cursos.xml"));

    }
}
