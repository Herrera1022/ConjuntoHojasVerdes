/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ctrl;
import Model.Persona;
import View.EmpleadoMulta;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author estudiantelis
 */
public class ManejoJson {
    public List<Persona> leerJSON(String rutaArchivo) {
        
        List<Persona> propietarios = new ArrayList<>();
        
        try (FileReader reader = new FileReader("propietarios.json")) {
            // Instanciar Gson y definir el tipo de la lista
            Gson gson = new Gson();
            Type propietariosListType = new TypeToken<ArrayList<EmpleadoMulta>>() {}.getType();
            
            // Deserializar el JSON al tipo esperado
            propietarios = gson.fromJson(reader, propietariosListType);
            
            // Confirmación para verificar que se leyeron los datos
            System.out.println("Datos leídos: " + propietarios);//debug
        } catch (IOException e) {
            System.err.println("Error al leer el archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
        return propietarios;
    }
        
    // Método para cargar personas al archivo JSON
    private List<Persona> cargarPersonas() {
        List<Persona> personas = new ArrayList<>();
        try {
            // Verificar si el archivo existe y cargar los datos
            FileReader reader = new FileReader("propietarios.json");
            Type personaListType = new TypeToken<ArrayList<Persona>>() {}.getType();
            Gson gson = new Gson();
            personas = gson.fromJson(reader, personaListType);
            reader.close();
        } catch (IOException e) {
            // Si el archivo no existe, creamos una nueva lista
            System.out.println("No se encontró el archivo. Se creará uno nuevo.");
        }
        return personas;
    }
        
    // Método para guardar la lista de personas en el archivo JSON
    public void guardarJson(String nombre, String tipoDocumento, String propiedad, String multa, String descripción, String cedula) {
        // Cargar las personas existentes
        List<Persona> personas = cargarPersonas();

        // Crear el nuevo objeto Persona
        Persona nuevaPersona = new Persona(nombre, tipoDocumento, propiedad, multa, descripción, cedula);
        
        // Agregar la nueva persona a la lista
        personas.add(nuevaPersona);

        // Convertir la lista de personas a JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(personas);

        // Guardar el JSON en un archivo
        try (FileWriter file = new FileWriter("propietarios.json")) {
            file.write(json);
            file.flush();
            System.out.println("Archivo JSON actualizado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
