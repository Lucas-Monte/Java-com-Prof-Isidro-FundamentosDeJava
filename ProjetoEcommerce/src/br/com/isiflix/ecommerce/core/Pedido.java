package br.com.isiflix.ecommerce.core;

public class Pedido {
    private int numPedido;
    private String data;
    private double total;
    private String cliente;
    private Status status;

    public String exibir() {
        return this.numPedido + " - " + this.data + " R$ " + this.total + " ("+this.cliente+") STATUS = " + this.status;
    }

    public Pedido(int numPedido, String data, double total, String cliente, Status status) {
        this.numPedido = numPedido;
        this.data = data;
        this.total = total;
        this.cliente = cliente;
        this.status = status;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
