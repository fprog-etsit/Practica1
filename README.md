<img  align="left" width="150" style="float: left;" src="https://www.upm.es/sfs/Rectorado/Gabinete%20del%20Rector/Logos/UPM/CEI/LOGOTIPO%20leyenda%20color%20JPG%20p.png">

<img  align="right" width="250" style="float: right;" src="logos/LogoMoodleOscuro.png">

<br/><br/>


# Práctica 1 - Clases y Objetos


## Contenido

-   [Introducción](#introducción)
-   [Objetivos](#objetivos)
-   [Requisitos Previos](#requisitos-previos)
-   [Temas relacionados con la práctica](#temas-relacionados-con-la-práctica)
-   [Actividades de la práctica](#actividades-de-la-práctica)
    -   [Creación del proyecto](#creación-del-proyecto)
    -   [Creación de la clase Paciente.java](#creación-de-la-clase-paciente.java)
    -   [Extensión de la clase PruebaPaciente.java](#extensión-de-la-clase-pruebapaciente.java)
-   [Evaluación](#evaluación)
-   [Entrega de la práctica](#entrega-de-la-práctica)



## Introducción

Durante este curso, se van a realizar una serie de prácticas para modelar el registro de pacientes en un hospital. Dentro de los sistemas de gestión de hospitales, encontraremos modelos similares al que se va a desarrollar en estas prácticas.

No obstante, para ser coherentes con el temario desarrollado en las clases teóricas, se asumirán ciertas simplificaciones que en un sistema profesional del campo de la ingeniería no serían tolerables. Se menciona esto para que el alumno sea consciente de que esta práctica es un trabajo introductorio al mundo de la programación.

En esta primera práctica, vamos a desarrollar la capa del modelo de datos de nuestro sistema. Concretamente, vamos a diseñar un modelo que nos permita representar de forma simplificada los pacientes del hospital. Dicho modelo nos permitirá obtener y gestionar ciertos datos e información sobre cada paciente. 

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
[comment]: <> (Creo que la siguiente línea está repetida)
En Eclipse debe seguir los siguientes pasos:

En Eclipse debe seguir los siguientes pasos:

- Descargue de Github pulsando sobre el botón _Code->Download ZIP_ el fichero zip que encontrará en la entrada _Práctica 1 - Main_.
- Importe el proyecto con _Import->Existing Projects into Workspace_ e indique la localización del fichero zip descargado usando la opción _Select archive file_.
- Dentro del proyecto, en la carpeta _src_, encontrará un paquete llamado **es.upm.dit.fprg23.p1**, siguiendo el convenio más extendido de nomenclatura de paquetes: Práctica 1 (**p1**) de la asignatura FPRG Curso 2023-2024 (**fprg23**) del Departamento de Ingeniería de Sistemas Telemáticos (**dit**) de la Universidad Politécnica de Madrid (**upm**) de España (**es**).
- También encontrará la clase ``PruebaPaciente.java``.
- Todas las clases que desarrolle deben de estar en el paquete _es.upm.dit.fprg23.p1_.

En este punto, ya deberíamos poder ver la clase ``PruebaPaciente.java`` en nuestro espacio de trabajo y, si la abrimos, podremos ver su código, que se utilizará en la siguiente tarea.


### Creación de la clase Paciente.java

En esta tarea, se debe crear una clase en el paquete de la práctica. Dicha clase será un modelo que permita representar los pacientes. Para ello, la clase deberá tener los siguientes atributos:

- DNI, tipo String.
- Nombre, tipo String.
- Apellidos, tipo String.
- Fecha nacimiento (año), tipo int.
- Altura (en centímetros), tipo int.
- Peso (en kilogramos), tipo double.
- Grupo sanguíneo, tipo String.


Nota: Se recuerda a los alumnos que los atributos no deben contener tildes y que deben usar la nomenclatura CamelCase en su opción [lowerCamelCase](https://es.wikipedia.org/wiki/CamelCase).

Además de dichos atributos, la clase deberá tener los siguientes métodos. Todos los métodos deberán ser públicos.

**Constructor** de la clase ``Paciente`` con los párametros antes mencionados:

```java
Paciente(String dni, String nombre, String apellidos, int fechaNacimiento, int altura, double peso, String grupoSanguineo)
```


**Getters y Setters de los atributos**. Es decir, métodos que devuelvan el valor de un atributo, por ejemplo, `getDni()` y métodos que modifiquen el valor de ese atributo `setDni (String dni)`. Al tener 7 atributos, deberán desarrollarse 7 getters y 7 setters siguiendo la nomenclatura _lowerCamelCase_. Por ejemplo:

- public String getDni()
- public void setDni()
- public int getFechaNacimiento()
- public int getAltura()
- public double getPeso()
- public void setPeso(double peso)


**Método toString()**. Debe devolver un texto (String) con la descripción completa del paciente con el mismo formato que el siguiente ejemplo:

```java
Paciente[dni=23543212B;nombre=Pedro;apellidos=Jimenez;fechaNacimiento=1953;altura=179;peso=94.0;grupoSanguineo=A]
```

**Método mayorDeEdad()**. Debe devolver un booleano indicando si el paciente es o no mayor de edad. Por simplificar, se considerará que el paciente es mayor de edad si el año de su nacimiento fue hace 18 años o más desde 2023.

**Método calcularIMC()**. Debe calcular el IMC (double) del paciente, y devolverlo. Para calcular el IMC, se puede usar la fórmula:

$$IMC = {peso \over altura²}$$

donde el peso se mide en kilogramos, y la altura en metros.

### Extensión de la clase PruebaPaciente.java

Para poder probar si la clase Paciente.java funciona como se especifica en este enunciado, se proporciona una clase ``PruebaPaciente.java``. Dicha clase contiene unas pruebas muy básicas en su método main que imprimen por pantalla algunos datos.

Esta tarea consiste en extender dicha clase para que las pruebas que se incluyen en el método main permitan comprobar todas las funcionalidades de la clase ``Paciente.java``. Una vez que considere que su versión de ``Paciente.java`` cumple todos los requisitos de esta práctica, podrá proceder a su entrega a través de Moodle como se expone en el siguiente apartado.

## Entrega de la práctica

La práctica debe entregarse mediante el enlace habilitado en Moodle antes de las 23:55 del día **Por definir**.

Se debe entregar el fichero .zip generado como resultado de exportar el proyecto. Dicho fichero debe contener todas las carpetas y ficheros asociados al proyecto. Para realizar la exportación, siga los siguientes pasos:

- Asegúrese de que tiene seleccionado el proyecto de la práctica en el explorador de paquetes de Eclipse.
- Pulse sobre el botón derecho del ratón (o «File» dentro de la barra de menú superior), y a continuación sobre «Export».
- Seleccione «Archive File» (dentro de la pestaña «General») en el menú que aparece, y pulse sobre el botón «Next».
- En la siguiente ventana, asegúrese de que el proyecto correspondiente a la práctica está seleccionado, junto con los ficheros alojados en su interior.
- Pulse el botón «Browse» para seleccionar el directorio donde quiere exportar el proyecto, y el nombre que le quiere dar.
- Suba a Moodle el fichero .zip que se ha generado como resultado de realizar los pasos anteriores, que se encontrará en la carpeta que haya seleccionado en el paso anterior.

## Evaluación

La evaluación consistirá en una prueba escrita en la que se deberá resolver de forma individual una serie de ejercicios relacionados con lo desarrollado en esta práctica.
