/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.pruebadeconceptoerpconfx.produccion;

/**
 *
 * @author poppe
 */

import com.uabc.pruebadeconceptoerpconfx.busDeEventos.BusEventos;
import com.uabc.pruebadeconceptoerpconfx.compartido.eventos.EventUpdateProduccion;

public class ServicioProduccion {
    public void actualizarStatusOrden(String orderId, String status) {
        System.out.println("Produccion actualiza orden " + orderId + " a estado: " + status);
        BusEventos.manejarEvento(new EventUpdateProduccion(orderId, status));
    }
}
