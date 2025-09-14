/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.pruebadeconceptoerpconfx.compartido.eventos;

/**
 *
 * @author poppe
 */
public class EventUpdateProduccion {
    private final String orderId;
    private final String status;

    public EventUpdateProduccion(String orderId, String status) {
        this.orderId = orderId;
        this.status = status;
    }

    public String getOrderId() { return orderId; }
    public String getStatus() { return status; }
}
