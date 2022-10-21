package com.example.proyectologin;

public class Usuario {
    private String usuario;
    private String nombres;
    private String apellidos;
    private String contrasenia;
    private String edad;
    private String correo;
    private String rango;
    private String fotoPerfil;

    public Usuario(String usuario, String nombres, String apellidos, String contrasenia, String edad, String correo, String rango, String fotoPerfil) {
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contrasenia = contrasenia;
        this.edad = edad;
        this.correo = correo;
        this.rango = rango;
        this.fotoPerfil = fotoPerfil;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombre) {
        this.nombres = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellido) {
        this.apellidos = apellido;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

}
