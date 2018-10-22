package tech_world.dao;
// Generated 22/10/2018 02:49:58 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sucursal generated by hbm2java
 */
public class Sucursal  implements java.io.Serializable {


     private Integer sucursalCod;
     private Pais pais;
     private String sucursalNombre;
     private String sucursalDireccion;
     private Set pedidos = new HashSet(0);
     private Set sucursalBodegas = new HashSet(0);

    public Sucursal() {
    }

	
    public Sucursal(Pais pais) {
        this.pais = pais;
    }
    public Sucursal(Pais pais, String sucursalNombre, String sucursalDireccion, Set pedidos, Set sucursalBodegas) {
       this.pais = pais;
       this.sucursalNombre = sucursalNombre;
       this.sucursalDireccion = sucursalDireccion;
       this.pedidos = pedidos;
       this.sucursalBodegas = sucursalBodegas;
    }
   
    public Integer getSucursalCod() {
        return this.sucursalCod;
    }
    
    public void setSucursalCod(Integer sucursalCod) {
        this.sucursalCod = sucursalCod;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getSucursalNombre() {
        return this.sucursalNombre;
    }
    
    public void setSucursalNombre(String sucursalNombre) {
        this.sucursalNombre = sucursalNombre;
    }
    public String getSucursalDireccion() {
        return this.sucursalDireccion;
    }
    
    public void setSucursalDireccion(String sucursalDireccion) {
        this.sucursalDireccion = sucursalDireccion;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }
    public Set getSucursalBodegas() {
        return this.sucursalBodegas;
    }
    
    public void setSucursalBodegas(Set sucursalBodegas) {
        this.sucursalBodegas = sucursalBodegas;
    }




}


