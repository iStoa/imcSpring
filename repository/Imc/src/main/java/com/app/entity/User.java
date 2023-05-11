package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="userregister")
public class User {
	
	@Id
	private String username;
	private String nombre;
	private String apellido;
	private String edad;
	private String sexo;
	private String estatura;
	private String peso;
	private String imc;
	private String password;
	private String cpassword;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstatura() {
		return estatura;
	}
	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getImc() {
		return imc;
	}
	public void setImc(String imc) {
		this.imc = imc;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
	
	public User() {
		super();
	}
	public User(String username, String nombre, String apellido, String edad, String sexo, String estatura, String peso,
			String imc, String password, String cpassword) {
		super();
		this.username = username;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.estatura = estatura;
		this.peso = peso;
		this.imc = imc;
		this.password = password;
		this.cpassword = cpassword;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", sexo=" + sexo + ", estatura=" + estatura + ", peso=" + peso + ", imc=" + imc + ", password="
				+ password + ", cpassword=" + cpassword + "]";
	}
	
	
	
	
	
}
