package tech_world.dao;
// Generated 22/10/2018 02:49:58 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private Integer pedidoCod;
     private Cliente cliente;
     private Empleado empleado;
     private Sucursal sucursal;
     private Date pedidoFechacompra;
     private Float pedidoPreciototal;
     private Set detallePedidos = new HashSet(0);

    public Pedido() {
    }

	
    public Pedido(Cliente cliente, Empleado empleado, Sucursal sucursal) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.sucursal = sucursal;
    }
    public Pedido(Cliente cliente, Empleado empleado, Sucursal sucursal, Date pedidoFechacompra, Float pedidoPreciototal, Set detallePedidos) {
       this.cliente = cliente;
       this.empleado = empleado;
       this.sucursal = sucursal;
       this.pedidoFechacompra = pedidoFechacompra;
       this.pedidoPreciototal = pedidoPreciototal;
       this.detallePedidos = detallePedidos;
    }
   
    public Integer getPedidoCod() {
        return this.pedidoCod;
    }
    
    public void setPedidoCod(Integer pedidoCod) {
        this.pedidoCod = pedidoCod;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Sucursal getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public Date getPedidoFechacompra() {
        return this.pedidoFechacompra;
    }
    
    public void setPedidoFechacompra(Date pedidoFechacompra) {
        this.pedidoFechacompra = pedidoFechacompra;
    }
    public Float getPedidoPreciototal() {
        return this.pedidoPreciototal;
    }
    
    public void setPedidoPreciototal(Float pedidoPreciototal) {
        this.pedidoPreciototal = pedidoPreciototal;
    }
    public Set getDetallePedidos() {
        return this.detallePedidos;
    }
    
    public void setDetallePedidos(Set detallePedidos) {
        this.detallePedidos = detallePedidos;
    }




}


