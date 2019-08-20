package com.tcc.rogerio.projetofinal;

import java.io.Serializable;

class Eventos implements Serializable{

    public String nome_evento, cidade_inicial, bairro_inicial, endereco_inicial, cidade_final, bairro_final, endereco_final, data_evento, horario_evento, nivel_evento;
    public int cod_evento, qtd_pessoas;


    public Eventos(int cod, String nome, String cidadeinicial, String bairroinicial, String enderecoinicial,String cidadefinal,String bairrofinal,String enderecofinal, String data, String hora, String nivel, int qtdpessoas){
        cod_evento=cod;
        nome_evento=nome;
        cidade_inicial = cidadeinicial;
        bairro_inicial = bairroinicial;
        endereco_inicial = enderecoinicial;
        cidade_final = cidadefinal;
        bairro_final = bairrofinal;
        endereco_final = enderecofinal;
        data_evento = data;
        horario_evento = hora;
        nivel_evento = nivel;
        qtd_pessoas = qtdpessoas;

    }


    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
    }

    public void setBairro_inicial(String bairro_inicial) {
        this.bairro_inicial = bairro_inicial;
    }

    public void setCidade_inicial(String cidade_inicial) {
        this.cidade_inicial = cidade_inicial;
    }

    public void setEndereco_inicial(String endereco_inicial) {
        this.endereco_inicial = endereco_inicial;
    }

    public void setCidade_final(String cidade_final) {
        this.cidade_final = cidade_final;
    }

    public void setBairro_final(String bairro_final) {
        this.bairro_final = bairro_final;
    }

    public void setEndereco_final(String endereco_final) {
        this.endereco_final = endereco_final;
    }

    public void setData_evento(String data_evento) {
        this.data_evento = data_evento;
    }

    public void setNivel_evento(String nivel_evento) {
        this.nivel_evento = nivel_evento;
    }

    public void setCod_evento(int cod_evento) {
        this.cod_evento = cod_evento;
    }

    public void setQtd_pessoas(int qtd_pessoas) {
        this.qtd_pessoas = qtd_pessoas;
    }

    public void setHorario_evento(String horario_evento) {
        this.horario_evento = horario_evento;
    }

    public String getNome_evento() {

        return nome_evento;
    }

    public String getCidade_inicial() {
        return cidade_inicial;
    }

    public String getBairro_inicial() {
        return bairro_inicial;
    }

    public String getEndereco_inicial() {
        return endereco_inicial;
    }

    public String getCidade_final() {
        return cidade_final;
    }

    public String getBairro_final() {
        return bairro_final;
    }

    public String getEndereco_final() {
        return endereco_final;
    }

    public String getData_evento() {
        return data_evento;
    }

    public String getHorario_evento() {
        return horario_evento;
    }

    public String getNivel_evento() {
        return nivel_evento;
    }

    public int getCod_evento() {
        return cod_evento;
    }

    public int getQtd_pessoas() {
        return qtd_pessoas;
    }

    @Override

    public String toString() {
        return "Descrição: " + nome_evento +
                " \nCidade de partida:" + cidade_inicial +
                " \nPonto de chegada: " +endereco_final+", "+bairro_final+", "+ cidade_final +
                " \ndata: " + data_evento +" Horário:" + horario_evento +
                " \nCidade de partida: " + cidade_inicial +
                " \n" + qtd_pessoas+" pessoas confirmadas " +
                " \nNível de dificuldade: " + nivel_evento;
    }
}