<img  align="left" width="150" style="float: left;" src="https://www.upm.es/sfs/Rectorado/Gabinete%20del%20Rector/Logos/UPM/CEI/LOGOTIPO%20leyenda%20color%20JPG%20p.png">

<img  align="right" width="250" style="float: right;" src="logos/LogoFPROG.png">

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

En la presente práctica, vamos a desarrollar un modelo simplificado de un paciente que nos permita gestionar ciertos datos del mismo y obtener cierta información sobre el mismo. Dentro de los sistemas de gestión de hospitales, encontraremos modelos similares al que se realizará en esta práctica.

No obstante, al ser la primera práctica del curso y para ser coherentes con el temario desarrollado en las clases teóricas, se asumirán diferentes simplificaciones que en un sistema profesional del campo de la ingeniería no serán tolerables. Se menciona esto para que el alumno sea consciente de que esta práctica es un trabajo introductorio al mundo de la programación.

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
- Importe el proyecto con _Import-$>$Existing Projects into Workspace_ e indicar la localización del fichero zip descargado usando la opción _Select archive file_.
- Dentro del proyecto, en la carpeta _src_, encontrará un paquete llamado **es.upm.dit.fprg21.p1**, siguiendo el convenio más extendido de nomenclatura de paquetes: Práctica 1 (**p1**) de la asignatura FPRG Curso 2021-2022 (**fprg21**) del Departamento de Ingeniería de Sistemas Telemáticos (**dit**) de la Universidad Politécnica de Madrid (**upm**) de España (**es**).
- También encontrará la clase **PruebaPaciente.java** de Moodle.
- Todas las clases que desarrolle deben de estar en el paquete _es.upm.dit.fprg21.p1_.

En este punto, ya deberíamos poder ver la clase **PruebaPaciente.java** en nuestro espacio de trabajo y, si la abrimos, podremos ver su código, que se utilizará en la siguiente tarea.


### Creación de la clase Paciente.java

En esta tarea, se debe crear una clase en el paquete de la práctica. Dicha clase será un modelo de los datos de los pacientes. Para ello, la clase deberá tener los siguientes atributos:

- DNI, tipo String.
- Nombre, tipo String.
- Apellidos, tipo String.
- Edad, tipo int.
- Altura (en centímetros), tipo int.
- Peso (en kilogramos), tipo int.
- Grupo Sanguíneo, tipo String.
- Temperatura Corporal, tipo double.
- Presion sistólica, tipo int.
- Presion distólica, tipo int.


Nota: Se recuerda a los alumnos que se recomienda que los atributos no deberían contener tildes y que deberían usar la nomenclatura CamelCase en su opción [lowerCamelCase](https://es.wikipedia.org/wiki/CamelCase).

Además de dichos atributos, la clase deberá tener los siguientes métodos. Todos los métodos deberán ser “públicos”.

**Constructor** de la clase Paciente con los párametros antes mencionados:

```java
Paciente(String dni, String nombre, String apellidos, int edad, int altura, int peso, String grupoSanguineo, double temperatura, int presionSistolica, int presionDistolica)
```


**Getters y Setters de los atributos**. Es decir, métodos que devuelvan el valor de un atributo, por ejemplo, _getRegistro()_ y métodos que modifiquen el valor de ese atributo _setRegistro (String registro)_. Al tener 10 atributos, deberán desarrollarse 10 getters y 10 setters siguiendo la nomenclatura _lowerCamelCase_. Por ejemplo:

- public String getDni()
- public String getNombre()
- public int getEdad()
- public int getAltura()
- public int getPeso()
- public void setPeso(int peso)
- public int getPresionSistolica()
- public void setPresionSistolica(int presionSistolica)


**Método toString()**. Debe devolver un texto (String) con la descripción completa del paciente con el mismo formato que el siguiente ejemplo:

```java
Paciente[dni=23543212B;nombre=Pedro;apellidos=Jimenez;edad=47;altura=172;peso=94;grupoSanguineo=A+;temperatura=36.5;presionSistolica=175;presionDistolica=105]
```

### Extensión de la clase PruebaPaciente.java

Para poder probar si vuestra clase Paciente.java” funciona como se especifica en este enunciado, se proporciona una clase “PruebaPaciente.java”. Dicha clase está disponible en el proyecto descargado de Github, y contiene unas pruebas muy básicas en su método main que imprimen por pantalla algunos datos. La clase también se encuentra disponible directamente en el paquete _es.upm.dit.fprg21.p1_.

Por lo tanto, esta tarea consistirá en importar esa clase y extender las pruebas que se incluyen en dicho método main para comprobar todas las funcionalidades de la clase “Paciente.java”. Una vez que considere que su versión de “Paciente.java” cumple todos los requisitos de esta práctica, podrá proceder a su entrega a través de Moodle como se expone en el último apartado.


## Evaluación

La evaluación se basará en la corrección de la clase **Paciente**. A la clase desarrollada por el alumno se le pasarán una batería de pruebas para comprobar si cumplen las especificaciones de la práctica, pudiendo obtener una calificación máxima de **10 puntos**.


## Entrega de la práctica

La práctica se estar entregada en Moodle antes de las 23:55 del día viernes 22/10 a las 23:59.
\\

Cuando haya completado todas las clases pedidas y esté seguro de que funcionan correctamente, es decir, ha pasado con éxito las pruebas que se proporcionan en el proyecto, puede obtener una indicación aproximada de su nota en la práctica mediante unas pruebas automáticas parecidas a las que llevarán a cabo los profesores. Esta es una mera indicación, sin valor académico; la nota real será la que obtenga tras subir su práctica a Moodle en el período de entrega, los profesores corrijan todas las prácticas y revisen que no hay copias de código, un tiempo después de la fecha de entrega de la práctica.

Para obtener la nota aproximada debe seguir estos pasos:

- Seleccionar el lanzador _Practica1Entrega.launch_ en la carpeta del proyecto. Activar con el botón derecho del ratón el menú de contexto de eclipse, y aparecerá un menú con la entrada _Run As_, dentro de la cual se encuentra la entrada _Practica1Entrega_, que debe selecionar.

- Se ejecutan unas pruebas y se muestran los resultados en la consola: ficheros que componen la práctica, nota estimada, e indicaciones de las pruebas que pudieran haber fallado. Las indicaciones de fallos no permiten saber la causa de los fallos, sólo muestran situaciones en las que la práctica no funciona correctamente. Debe ser usted quien descubra y repare los errores.

- Después de realizar las pruebas y dar una nota estimada, _Practica1Entrega.launch_ construye un fichero .zip que queda en la carpeta del proyecto eclipse.

Cuando esté convencido de que puede subir su práctica (por supuesto, antes de que acabe el plazo de entrega), debe hacerlo como sigue:

- En el curso FPRG de Moodle, junto a la presentación de la práctica, hay un punto de entrega Moodle que se llama "Practica1Entrega". En ese punto de entrega se debe subir el fichero .zip que nos ha creado la entrega en el proyecto eclipse. En ese zip tenemos todo lo que hay que entregar.  El script de entrega puede detectar situaciones anómalas muy diversas en las que no se puede realizar la entrega, como por ejemplo: la práctica no compila, las clases o métodos no se ajustan al enunciado. En esos casos no se crea/actualiza el fichero .zip, ni se ejecutan las pruebas de evaluación. Para poder generar el zip hay que arreglar esos problemas. Solo se corregirá la última entrega subida a "Practica1Entrega".
