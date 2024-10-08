package com.soporte.modelview;

<<<<<<< HEAD
public class user {
=======
public class User {
>>>>>>> 0bf684c5f5bc68556674f55213b98071317385cf
    private int id_usuario;
    private String username;
    private String password;

    // Constructor with parameters
<<<<<<< HEAD
    public user (int id_usuario, String username, String password) {
        this.id = id_usuario;
        this.name = username;
=======
    public User (int id_usuario, String username, String password) {
        this.id_usuario = id_usuario;
        this.username = username;
>>>>>>> 0bf684c5f5bc68556674f55213b98071317385cf
        this.password = password;
    }

    // Getters and Setters
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario= id_usuario;
    }

    public String getUserame() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
                "id=" + id_usuario +
                ", name='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}


