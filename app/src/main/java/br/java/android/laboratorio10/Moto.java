package br.java.android.laboratorio10;

import java.io.Serializable;

public class Moto implements Serializable {

    private int id;
    private String modelo;
    private int cilindradas;
    private int quilometragem;
    private int anoFabricacao;
    private float autonomia;
    private float capacidadeTanque;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;

    @Override
    public String toString() {
        return modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
