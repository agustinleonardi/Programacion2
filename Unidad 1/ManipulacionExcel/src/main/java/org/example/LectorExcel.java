package org.example;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

public class LectorExcel {
    public void leerArchivoExcel(String nombreArchivo) {
        try (FileInputStream archivo = new FileInputStream(new File(nombreArchivo));
             Workbook libro = WorkbookFactory.create(archivo)) {

            Sheet hoja = libro.getSheetAt(0);

            for (Row fila : hoja) {
                for (Cell celda : fila) {
                    System.out.print(celda.getStringCellValue() + "\t");
                }
                System.out.println();
            }
        } catch (IOException | EncryptedDocumentException ex) {
            ex.printStackTrace();
        }
    }
}
