package com.soporte.controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TechnicianControler {

    public void listarSolicictudes() {
        String sql = "SELECT * FROM tecnico ( "
                    + "ORDER BY fecha_solicitud DESC)";
        
        try (Connection connection = DatabaseConnection.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql)) {
            ResultSet result = pstmt.executeQuery();
            System.out.println("Lista de solicictudes por fecha: ");
            while (result.next()) {
                System.out.println("ID_Solicitud: " + result.getInt("ID_Solcitud") +
                                    "Descripción: " + result.getString("Descripcion") +
                                    "Tema: " + result.getString("tema") +
                                    "Fecha de creacion: " + result.getDate("Fecha_Creacion") +
                                    "Fecha de completado: " + result.getDate("Fecha_Completado") +
                                    "Prioridad: " + result.getString("Prioridad"));
            }
        } catch (Exception e) {
            System.out.println("Upss, algo salió mal :(");
        }
    }
}