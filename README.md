<img  align="left" width="150" style="float: left;" src="https://www.upm.es/sfs/Rectorado/Gabinete%20del%20Rector/Logos/UPM/CEI/LOGOTIPO%20leyenda%20color%20JPG%20p.png">

<img  align="right" width="250" style="float: right;" src="logos/LogoMoodleOscuro.png">

<br/><br/>

# Práctica 1 - Clases y Objetos

## Contenido

- [Práctica 1 - Clases y Objetos](#práctica-1---clases-y-objetos)
  - [Contenido](#contenido)
  - [Introducción](#introducción)
  - [Objetivos](#objetivos)
  - [Requisitos Previos](#requisitos-previos)
  - [Temas relacionados con la práctica](#temas-relacionados-con-la-práctica)
  - [Actividades de la práctica](#actividades-de-la-práctica)
    - [Creación del proyecto](#creación-del-proyecto)
    - [Creación de la clase DispositivoMedico.java](#creación-de-la-clase-dispositivomedicojava)
    - [Extensión de la clase PruebaDispositivoMedico.java](#extensión-de-la-clase-pruebadispositivomedicojava)
    - [Entrega de la práctica](#entrega-de-la-práctica)
    - [Evaluación](#evaluación)

## Introducción

Durante este curso, se van a realizar una serie de prácticas para desarrollar un sistema para gestionar los dispositivos médicos en un hospital. Dentro de los sistemas de gestión de hospitales, encontraremos modelos similares al que se va a desarrollar en estas prácticas. No obstante, para ser coherentes con el temario desarrollado en las clases teóricas, se asumirán ciertas simplificaciones que en un sistema profesional del campo de la ingeniería no serían tolerables. Por ejemplo, como se verá más adelante, usaremos tipos de coma flotante para cantidades monetarias, cuando debería usarse un formato de coma fija. a Se menciona esto para que el alumno sea consciente de que esta práctica es un trabajo introductorio al mundo de la programación.

En esta primera práctica, vamos a desarrollar la capa del modelo de datos de nuestro sistema. Concretamente, vamos a diseñar un modelo que nos permita representar de forma simplificada los dispositivos médicos del hospital. Dicho modelo nos permitirá obtener y gestionar ciertos datos e información sobre cada dispositivo. 

A partir de este punto, se enuncian las diferentes actividades a desarrollar en esta práctica. Se recomienda leer y comprender el enunciado entero antes de comenzar a trabajar.

## Objetivos

- Uso de clases y tipos predefinidos
- Creación de objetos y referencia a objetos
- Uso del entorno de trabajo (IDE): compilación y ejecución.

## Requisitos Previos

Disponer de un entorno de desarrollo como Eclipse que permita desarrollar programas en el lenguaje de programación Java.

## Temas relacionados con la práctica

Temas 2 y 3 del temario del curso.

## Actividades de la práctica

### Creación del proyecto

Existen diferentes entornos de desarrollo (IDEs) para desarrollar código Java, pero tanto en esta práctica como en las siguientes, se darán indicaciones para [**Eclipse**](http://www.eclipse.org).

En Eclipse debe seguir los siguientes pasos:

- Descargue de Github pulsando sobre el botón _Code->Download ZIP_ el fichero zip que encontrará en la entrada _Práctica 1 - Main_.
- Importe el proyecto con _Import->Existing Projects into Workspace_ e indique la localización del fichero zip descargado usando la opción _Select archive file_.
- Dentro del proyecto, en la carpeta _src_, encontrará un paquete llamado **es.upm.dit.fprg24.p1**, siguiendo el convenio más extendido de nomenclatura de paquetes: Práctica 1 (**p1**) de la asignatura FPRG Curso 2024-2025 (**fprg24**) del Departamento de Ingeniería de Sistemas Telemáticos (**dit**) de la Universidad Politécnica de Madrid (**upm**) de España (**es**).
- También encontrará la clase ``PruebaDispositivoMedico.java``.
- Todas las clases que desarrolle deben de estar en el paquete _es.upm.dit.fprg24.p1_

En este punto, ya deberíamos poder ver la clase ``PruebaDispositivoMedico.java`` en nuestro espacio de trabajo y, si la abrimos, podremos ver su código, que se utilizará en la siguiente tarea.

### Creación de la clase DispositivoMedico.java

En esta tarea, se debe crear una clase en el paquete de la práctica que permita representar dispositivos médicos. Dicha clase deberá tener los siguientes atributos:

- **id**, tipo String: Identificador único del dispositivo médico.
- **nombre**, tipo String: Nombre del dispositivo médico.
- **descripcion**, tipo String: Descripción del dispositivo médico.
- **tipo**, tipo String: Tipo de dispositivo médico (ejemplo: monitor, respirador).
- **fabricacion**, tipo int: Año de fabricación del dispositivo médico.
- **garantia**, tipo int: Tiempo de garantía (en años) ofrecido para el dispositivo médico.
- **ocupado**, tipo boolean: Indica si el dispositivo está actualmente en uso.
- **operativo**, tipo boolean: Indica si el dispositivo está en condiciones de funcionamiento.
- **precio**, tipo double: Precio del dispositivo médico.
- **potencia**, tipo double: Consumo energético del dispositivo médico en vatios (W).


Además de dichos atributos, la clase deberá tener los siguientes métodos. Todos los métodos deberán ser públicos.

**Constructor** de la clase ``DispositivoMedico`` con los párametros mencionados:

```java
DispositivoMedico(String id, String nombre, String descripcion, String tipo, int fabricacion, int garantia, boolean ocupado, boolean operativo, double precio, double potencia)

```


**Getters y Setters de los atributos**. Es decir, métodos que devuelvan el valor de un atributo, por ejemplo, `getId()` y métodos que modifiquen el valor de ese atributo `setId (String id)`. Al tener 10 atributos, deberán desarrollarse 10 getters y 10 setters. Ejemplo:

- public String getId()
- public void setId(String id)
- public double getPrecio()
- public void setPrecio(double precio)
- public boolean isOperativo()
- public void setOperativo(boolean operativo)

**Método toString()**. Debe devolver un texto (String) con la descripción completa del dispositivo médico, en el siguiente formato:

```java
DispositivoMedico [id=DM123, nombre=Monitor de signos vitales, descripcion=Monitor que mide presión arterial y pulso, tipo=Monitor, fabricacion=2022, garantia=10, ocupado=false, operativo=true, precio=1500.5, potencia=75.5]
```

**Método enGarantia()**. Debe devolver un booleano indicando si actualmente (año 2024) el dispositivo se encuentra o no en garantía.

**Método calcularConsumoEnergetico(int horasUso)**. Debe calcular el consumo energético del dispositivo durante un determinado tiempo (en horas), y devolverlo. Para calcular el consumo energético, puede usar la siguiente fórmula:

$$Consumo = potencia (kW) * tiempo (h)$$

### Extensión de la clase PruebaDispositivoMedico.java

Para probar si la clase ``DispositivoMedico.java`` funciona, se ha proporcionado la clase ``PruebaDispositivoMedico.java``. El método ``main`` de esta clase contiene unas pruebas básicas. 

Esta tarea consiste en extender dicha clase para incluir pruebas que validen todas las funcionalidades de ``DispositivoMedico.java``. Debes probar:

- Creación de objetos de la clase ``DispositivoMedico``.
- Uso de getters y setters.
- Comprobación del método ``toString()``.
- Comprobación de los métodos ``enGarantia()`` y ``calcularConsumoEnergetico(int horasUso)``.

### Entrega de la práctica

La práctica debe entregarse mediante el enlace habilitado en Moodle antes de las 23:55 del día 23 de Octubre de 2024.

Se debe entregar el fichero .zip generado como resultado de exportar el proyecto. Dicho fichero debe contener todas las carpetas y ficheros asociados al proyecto. Para realizar la exportación, siga los siguientes pasos:

- Asegúrese de que tiene seleccionado el proyecto de la práctica en el explorador de paquetes de Eclipse.
- Pulse sobre el botón derecho del ratón (o «File» dentro de la barra de menú superior), y a continuación sobre «Export».
- Seleccione «Archive File» (dentro de la pestaña «General») en el menú que aparece, y pulse sobre el botón «Next».
- En la siguiente ventana, asegúrese de que el proyecto correspondiente a la práctica está seleccionado, junto con los ficheros alojados en su interior.
- Pulse el botón «Browse» para seleccionar el directorio donde quiere exportar el proyecto, y el nombre que le quiere dar.
- Suba a Moodle el fichero .zip que se ha generado como resultado de realizar los pasos anteriores, que se encontrará en la carpeta que haya seleccionado en el paso anterior.

### Evaluación

La evaluación consistirá en una prueba escrita en la que se deberá resolver de forma individual una serie de ejercicios relacionados con lo desarrollado en esta práctica.

