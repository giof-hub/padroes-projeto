/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giovanni.antipadrao.factorymethod;

/**
 *
 * @author giovanni.5160
 */
public class Logistica {

    private Caminhao caminhao;
    private Trem trem;

    public Logistica() {
        this.caminhao = new Caminhao();
        this.trem = new Trem();
    }

    public void planejarEntrega(String tipo) {
        System.out.println("Planejando entrega...");

        if (tipo.equals("caminhao")) {
            caminhao.entregar();
        } else if (tipo.equals("trem")) {
            trem.entregar();
        } else {
            System.out.println("Tipo de transporte desconhecido");
        }
    }
}
