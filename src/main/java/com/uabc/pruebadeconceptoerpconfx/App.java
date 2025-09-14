package com.uabc.pruebadeconceptoerpconfx;


import com.uabc.pruebadeconceptoerpconfx.produccion.ServicioProduccion;
import com.uabc.pruebadeconceptoerpconfx.ventas.ServicioVentas;
import com.uabc.pruebadeconceptoerpconfx.admin.ServicioAdmin;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Inicializar servicios
        new ServicioVentas();
        new ServicioAdmin();
        ServicioProduccion servicioProduccion = new ServicioProduccion();

        // UI con botones
        Button btnStart = new Button("Marcar Orden #1001 en Produccion");
        btnStart.setOnAction(e -> servicioProduccion.actualizarStatusOrden("1001", "En Produccion"));

        Button btnFinish = new Button("Marcar Orden #1001 Finalizada");
        btnFinish.setOnAction(e -> servicioProduccion.actualizarStatusOrden("1001", "Finalizada"));

        VBox root = new VBox(10, btnStart, btnFinish);
        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("ERP - Prueba de Concepto");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}