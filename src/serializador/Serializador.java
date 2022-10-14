package serializador;

import exceptions.SerializadorException;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class Serializador {

    // se a extensao do arquivo for especificada ira executar o bloco correspondente da extensao
    public void serializar(Object object, String fileName) throws SerializadorException {
        if (fileName.contains(".dat")) {

            try (// e o objeto de saida
                 FileOutputStream saida =
                         new FileOutputStream(fileName);

                 // nosso serializador que vai binarizar o dado
                 ObjectOutputStream serializador = new ObjectOutputStream(saida)) {

                // serializando objeto
                serializador.writeObject(object);

            } catch (Exception se) {
                throw new SerializadorException("Ocorreu um problema no processo de serialização. " +
                        "Erro: " + se.getMessage());
            }

        } else if (fileName.contains(".xml")) {

            try (// e o objeto de saida
                 FileOutputStream saida =
                         new FileOutputStream(fileName);
                 // nosso serializador que vai binarizar o dado
                 XMLEncoder serializador = new XMLEncoder(saida)) {

                // serializando objeto
                serializador.writeObject(object);

            } catch (Exception se) {
                throw new SerializadorException("Ocorreu um problema no processo de serialização. " +
                        "Erro: " + se.getMessage());
            }

        } else {

            try (// e o objeto de saida
                 FileOutputStream saida =
                         new FileOutputStream(fileName + ".dat");

                 // nosso serializador que vai binarizar o dado
                 ObjectOutputStream serializador = new ObjectOutputStream(saida)) {

                // serializando objeto
                serializador.writeObject(object);

            } catch (Exception se) {
                throw new SerializadorException("Ocorreu um problema no processo de serialização. " +
                        "Erro: " + se.getMessage());
            }

        }

    }

    public Object desserializar(Object object, String fileName) throws SerializadorException {
        if (fileName.contains(".dat")) {

            try (FileInputStream entrada =
                         new FileInputStream(fileName);
                 ObjectInputStream desserializador =
                         new ObjectInputStream(entrada);) {

                object = desserializador.readObject();

            } catch (IOException | ClassNotFoundException e) {
                throw new SerializadorException("Ocorreu um problema ao desserializar " +
                        "o objeto. Erro: " + e.getMessage());
            }

        } else if (fileName.contains(".xml")) {

            try (FileInputStream entrada =
                         new FileInputStream(fileName);
                 XMLDecoder desserializador =
                         new XMLDecoder(entrada);) {

                object = desserializador.readObject();

            } catch (IOException e) {
                throw new SerializadorException("Ocorreu um problema ao desserializar " +
                        "o objeto. Erro: " + e.getMessage());
            }

        } else {

            try (FileInputStream entrada =
                         new FileInputStream(fileName + ".dat");
                 ObjectInputStream desserializador =
                         new ObjectInputStream(entrada);) {

                object = desserializador.readObject();

            } catch (IOException | ClassNotFoundException e) {
                throw new SerializadorException("Ocorreu um problema ao desserializar " +
                        "o objeto. Erro: " + e.getMessage());
            }

        }

        // retornar object
        return object;
    }
}
