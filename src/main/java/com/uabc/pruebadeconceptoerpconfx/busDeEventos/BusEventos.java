/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.pruebadeconceptoerpconfx.busDeEventos;

/**
 *
 * @author poppe
 */

import java.util.*;
import java.util.function.Consumer;

public class BusEventos {
    private static final Map<Class<?>, List<Consumer<?>>> listeners = new HashMap<>();

    public static <T> void crearEvento(Class<T> eventType, Consumer<T> handler) {
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(handler);
    }

    public static <T> void manejarEvento(T event) {
        List<Consumer<?>> subs = listeners.getOrDefault(event.getClass(), List.of());
        for (Consumer<?> sub : subs) {
            @SuppressWarnings("unchecked")
            Consumer<T> handler = (Consumer<T>) sub;
            handler.accept(event);
        }
    }
}
