package com.soporte.modelview;

public class Request {
    private int id_solicitud;
    private String name;
    private String password;

    // Constructor with parameters
    public Request (int id_solicitud, String name, String password) {
        this.id_solicitud = id_solicitud;
        this.name = name;
        this.password = password;
    }

    // Getters and Setters
    public int getId() {
        return id_solicitud;
    }

    public void setId(int id) {
        this.id_solicitud = id_solicitud;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id_solicitud +
                ", name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}

