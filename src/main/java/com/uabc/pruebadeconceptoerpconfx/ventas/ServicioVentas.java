/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.pruebadeconceptoerpconfx.ventas;

/**
 *
 * @author poppe
 */

import com.uabc.pruebadeconceptoerpconfx.busDeEventos.BusEventos;
import com.uabc.pruebadeconceptoerpconfx.compartido.eventos.EventUpdateProduccion;

public class ServicioVentas {
    public ServicioVentas() {
        BusEventos.crearEvento(EventUpdateProduccion.class, this::updateProduccion);
    }

    private void updateProduccion(EventUpdateProduccion event) {
        System.out.println("Ventas informa cliente: Orden " + event.getOrderId() +
                           " esta ahora en estado: " + event.getStatus());
    }
}
