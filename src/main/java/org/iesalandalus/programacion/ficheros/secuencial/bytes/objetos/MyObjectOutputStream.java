package org.iesalandalus.programacion.ficheros.secuencial.bytes.objetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {

	public MyObjectOutputStream () throws IOException{
        super();
    }

	public MyObjectOutputStream(OutputStream out) throws IOException {
		super(out);
    }

    protected void writeStreamHeader() throws IOException {
        // No hago nada
    }
}
