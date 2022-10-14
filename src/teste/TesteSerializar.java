package teste;

import exceptions.SerializadorException;
import model.Cachorro;
import model.Curso;
import model.Gato;
import serializador.Serializador;

public class TesteSerializar {

    public static void main(String[] args) throws SerializadorException {
        Serializador serializador = new Serializador();

        Gato gato = new Gato("Gatin", "Persa", 10);
        serializador.serializar(gato, "ClasseGatos");

        Cachorro cao = new Cachorro("Caramelo", "vira-lata", 5);
        serializador.serializar(cao, "ClasseCachorros.dat");

        Curso curso = new Curso("TADS", 3, "Rogerio", 1500.0f);
        serializador.serializar(curso, "Cursos.xml");

    }
}
