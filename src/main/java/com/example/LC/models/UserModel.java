package com.example.LC.models;
import javax.persistence.*;


//clase que controlara nuestros datos de entra y salida (puente)


@Entity
@Table(name = "usuarios")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long ID;

    private String Nombre;
    private Float Saldo;
    private String Estado;

    public void setEstado(String Estado){
        this.Estado = Estado;
    }

    public String getEstado(){
        return Estado;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Float getSaldo() {
        return Saldo;
    }

    public void setSaldo(Float Saldo) {
        this.Saldo = Saldo;
    }
    
}
