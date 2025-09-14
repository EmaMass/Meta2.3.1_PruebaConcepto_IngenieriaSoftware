/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.pruebadeconceptoerpconfx.admin;

/**
 *
 * @author poppe
 */

import com.uabc.pruebadeconceptoerpconfx.busDeEventos.BusEventos;
import com.uabc.pruebadeconceptoerpconfx.compartido.eventos.EventUpdateProduccion;

public class ServicioAdmin {
    public ServicioAdmin() {
        BusEventos.crearEvento(EventUpdateProduccion.class, this::updateProduccion);
    }

    private void updateProduccion(EventUpdateProduccion event) {
        System.out.println("Administracion registra costos de orden " + event.getOrderId() +
                           " en estado: " + event.getStatus());
    }
}
