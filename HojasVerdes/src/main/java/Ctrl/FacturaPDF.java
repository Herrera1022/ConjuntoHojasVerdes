/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ctrl;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FacturaPDF {

    public static void crearFactura(String nombreArchivo, String nombrePropietario, String propiedad, String deudaAdministracion) {
        
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));

            document.open();

            document.add(new Paragraph("Factura para el propietario: " + nombrePropietario));
            document.add(new Paragraph("Propiedad: " + propiedad));
            document.add(new Paragraph("Deuda de Administración: $" + deudaAdministracion));

            document.close();

            System.out.println("Factura PDF creada correctamente.");

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
