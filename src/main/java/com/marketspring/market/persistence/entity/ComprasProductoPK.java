package com.marketspring.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ComprasProductoPK implements  java.io.Serializable {
    @Column(name = "id_compra")
    private int idCompra;
    @Column(name = "id_producto")
    private int idProducto;

    //getters and setters
    public int getIdCompra() {
        return idCompra;
    }
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }



}

