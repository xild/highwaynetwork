package br.com.highwaynetwork.model;

import javax.validation.constraints.NotNull;

public class Vertice {
    
    @NotNull(message = "error.validation.grafo.vertice.destino")
    private String origem;
    @NotNull(message = "error.validation.grafo.vertice.destino")
    private String destino;
    @NotNull(message = "error.validation.grafo.vertice.distancia")
    private Double distancia;
    
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public Double getDistancia() {
        return distancia;
    }
    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

}
