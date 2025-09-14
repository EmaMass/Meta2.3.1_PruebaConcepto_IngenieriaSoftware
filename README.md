Prueba de Concepto de Ingenieria de Software
- Arquitectura del programa:
<img width="1619" height="473" alt="VistaLogica" src="https://github.com/user-attachments/assets/c44f9b2b-fca4-41ba-8662-4922683d32ec" />
- Requerimientos del programa:
Se requiere el JDK 24 para poder correr este programa, tambien revisar si tiene instalado las herramientas de JavaFX para poder correr el codigo.
El codigo fue corrido dentro de NetBeans 27, donde se realizara una guia de pasos para poder instalar JavaFX si no existe dentro del sistema, y como poder correr el programa.
- Pasos para correr el programa:
  Abrir NetBeans 27 (si no cuenta con NetBeans o JDK 24, puede instalarlos desde aqui: https://installers.friendsofapachenetbeans.org/ , contiene el IDE y el JDK).
  Al Abrir NetBeans 27 y tener cargado el proyecto, ve a Tools > Java Platforms, y dentro de la ventana de Java Platforms, seleccione "Add Platform..."
  Al abrir la nueva ventana para agregar una nueva plataforma, seleccione "Download OpenJDK (via Foojay.io Disco API)"
  Permite la ventana conectarse, y luego seleccione la version de Zulu 24.0.2 para JavaFX
  Permite la ventana descargar y instalar las herramientas para JavaFX.
  Al terminar, ahora puede abrir el proyecto y correrlo.
  (Si encuentra con un error de imports, es posible que necesite indicar al IDE que descarge las librerias necesarias)
  Si esto pasa, haga lo siguiente:
  - Seleccionar el mensaje de error, y busque por el repositorio de Maven para librerias disponibles
  - Cuando aparezca la ventana con las opciones de librerias para JavaFX, porfavor, seleccione la libreria de OpenFX para nuestro programa.
  - Permite que el IDE descarge las librerias seleccionadas y al terminar, ya deberia permitirle correr el codigo. 
