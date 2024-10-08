package com.soporte.modelview;

public class Request {
<<<<<<< HEAD
    private int id;
=======
    private int id_solicitud;
>>>>>>> 0bf684c5f5bc68556674f55213b98071317385cf
    private String name;
    private String password;

    // Constructor with parameters
<<<<<<< HEAD
    public Request (int id, String name, String password) {
        this.id = id;
=======
    public Request (int id_solicitud, String name, String password) {
        this.id_solicitud = id_solicitud;
>>>>>>> 0bf684c5f5bc68556674f55213b98071317385cf
        this.name = name;
        this.password = password;
    }

    // Getters and Setters
    public int getId() {
<<<<<<< HEAD
        return id;
    }

    public void setId(int id) {
        this.id = id;
=======
        return id_solicitud;
    }

    public void setId(int id) {
        this.id_solicitud = id_solicitud;
>>>>>>> 0bf684c5f5bc68556674f55213b98071317385cf
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
<<<<<<< HEAD
                "id=" + id +
=======
                "id=" + id_solicitud +
>>>>>>> 0bf684c5f5bc68556674f55213b98071317385cf
                ", name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}

