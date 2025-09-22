/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareahashmap;

import java.util.HashMap;

/**
 *
 * @author Franklin Parra
 */
public class TareaHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. crear el hashmap con datos iniciales: nombre, edad y ciudad
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("nombre", "Franklin Parra Zaruma");
        informacionPersonal.put("edad", 29);
        informacionPersonal.put("ciudad", "Riobamba");

        // 2. modificar el valor de la clave "ciudad" por otra ciudad
        informacionPersonal.put("ciudad", "Paute");

        // 3. agregar una nueva clave "profesion" con el valor correspondiente
        informacionPersonal.put("profesion", "Estudiante de Ingenieria en TICs");

        // 4. verificar si existe la clave "telefono"
        if (informacionPersonal.containsKey("telefono") == false) {
            // si no existe, agregar la clave "telefono" con un numero real
            informacionPersonal.put("telefono", "0989406777");
        }

        // 5. eliminar la clave "edad" del mapa
        informacionPersonal.remove("edad");

        // 6. mostrar el contenido final del hashmap de forma ordenada
        System.out.println("=== informacion personal final ===");
        System.out.println("nombre: " + informacionPersonal.get("nombre"));
        System.out.println("ciudad: " + informacionPersonal.get("ciudad"));
        System.out.println("profesion: " + informacionPersonal.get("profesion"));
        System.out.println("telefono: " + informacionPersonal.get("telefono"));
    }
}