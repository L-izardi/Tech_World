package tech_world.dao;
// Generated 22/10/2018 02:49:58 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private Integer paisCod;
     private String paisNombre;
     private Set proveedors = new HashSet(0);
     private Set sucursals = new HashSet(0);
     private Set bodegas = new HashSet(0);

    public Pais() {
    }

    public Pais(String paisNombre, Set proveedors, Set sucursals, Set bodegas) {
       this.paisNombre = paisNombre;
       this.proveedors = proveedors;
       this.sucursals = sucursals;
       this.bodegas = bodegas;
    }
   
    public Integer getPaisCod() {
        return this.paisCod;
    }
    
    public void setPaisCod(Integer paisCod) {
        this.paisCod = paisCod;
    }
    public String getPaisNombre() {
        return this.paisNombre;
    }
    
    public void setPaisNombre(String paisNombre) {
        this.paisNombre = paisNombre;
    }
    public Set getProveedors() {
        return this.proveedors;
    }
    
    public void setProveedors(Set proveedors) {
        this.proveedors = proveedors;
    }
    public Set getSucursals() {
        return this.sucursals;
    }
    
    public void setSucursals(Set sucursals) {
        this.sucursals = sucursals;
    }
    public Set getBodegas() {
        return this.bodegas;
    }
    
    public void setBodegas(Set bodegas) {
        this.bodegas = bodegas;
    }




}


