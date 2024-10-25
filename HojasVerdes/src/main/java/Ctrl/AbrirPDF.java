/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ctrl;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class AbrirPDF {

    public static void abrirFactura(String rutaArchivo) {
        try {
            File archivo = new File(rutaArchivo);
            
            if (archivo.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    desktop.open(archivo);  
                } else {
                    System.out.println("El entorno gráfico no es compatible.");
                }
            } else {
                System.out.println("El archivo " + rutaArchivo + " no existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

