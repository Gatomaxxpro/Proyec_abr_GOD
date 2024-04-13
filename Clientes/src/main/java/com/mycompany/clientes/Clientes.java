/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP AiO
 */
public class Clientes {

    public static void main(String[] args) {
        // Crear objeto de la clase GestionarClientes
        GestionarClientes gestionarClientes = new GestionarClientes();

        // Registrar un nuevo cliente
        gestionarClientes.registrarNuevoCliente();

        // Mostrar todos los clientes
        gestionarClientes.mostrarClientes();
    }
}

// Clase para manejar los clientes
class GestionarClientes {
    // Método para registrar un nuevo cliente
    public void registrarNuevoCliente() {
        try {
            // Establecer conexión a la base de datos
            Connection conn = DriverManager.getConnection("jdbc:sqlite:ventas.db");

            // Obtener datos del nuevo cliente
            // Aquí puedes usar un método para obtener los datos del usuario desde la consola
            // Por simplicidad, los datos se definen directamente aquí
            int idCliente = 1; // Aquí puedes generar un id automáticamente o preguntar al usuario
            String nombre = "Juan";
            String apellido = "Perez";
            String cedula = "123456789";
            String telefono = "123456789";
            String direccion = "Calle 123";
            String estado = "Activo";

            // Insertar nuevo cliente en la base de datos
            String sql = "INSERT INTO clientes(idCliente, nombre, apellido, cedula, telefono, direccion, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idCliente);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellido);
            pstmt.setString(4, cedula);
            pstmt.setString(5, telefono);
            pstmt.setString(6, direccion);
            pstmt.setString(7, estado);
            pstmt.executeUpdate();

            System.out.println("Nuevo cliente registrado exitosamente.");

            // Cerrar la conexión
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para mostrar todos los clientes
    public void mostrarClientes() {
        try {
            // Establecer conexión a la base de datos
            Connection conn = DriverManager.getConnection("jdbc:sqlite:ventas.db");

            // Consultar todos los clientes
            String sql = "SELECT * FROM clientes";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Mostrar clientes
            while (rs.next()) {
                System.out.println("ID Cliente: " + rs.getInt("idCliente"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellido: " + rs.getString("apellido"));
                System.out.println("Cédula: " + rs.getString("cedula"));
                System.out.println("Teléfono: " + rs.getString("telefono"));
                System.out.println("Dirección: " + rs.getString("direccion"));
                System.out.println("Estado: " + rs.getString("estado"));
                System.out.println("-----------------------------------");
            }

            // Cerrar la conexión
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
