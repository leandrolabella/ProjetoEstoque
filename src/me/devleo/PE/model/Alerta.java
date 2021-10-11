package me.devleo.PE.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alerta {

    private int id;
    private Date data;
    private int idItem;
    private String descAlerta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public String getDataString() {
        SimpleDateFormat fd = new SimpleDateFormat("dd-MM-yyyy");
        return fd.format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getDescAlerta() {
        return descAlerta;
    }

    public void setDescAlerta(String descAlerta) {
        this.descAlerta = descAlerta;
    }
}
