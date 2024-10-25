/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ctrl;

import Model.Persona;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanh
 */
public class ConsultarMulta {

    public static String buscarMultaPorNombre(String cedula) {

        try {
            FileReader reader = new FileReader("propietarios.json");

            Type personaListType = new TypeToken<ArrayList<Persona>>() {
            }.getType();

            List<Persona> personas = new Gson().fromJson(reader, personaListType);

            for (Persona persona : personas) {
                if (persona.getCedula().equalsIgnoreCase(cedula)) {
                    return "Multa: " + persona.getMulta() + ", Descripción: " + persona.getDescripción();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "No se encontraron multas para " + cedula;
    }
}

