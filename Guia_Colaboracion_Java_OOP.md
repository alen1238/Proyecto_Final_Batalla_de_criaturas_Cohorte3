
# Guía de Colaboración - Proyecto Java OOP con Patrón Strategy

Este documento describe las posibles líneas de trabajo para que cada estudiante-colaborador pueda contribuir de forma estructurada al proyecto colaborativo. El objetivo es seguir desarrollando el proyecto centrado en Programación Orientada a Objetos (POO) y el patrón de diseño Strategy, integrando también el principio de inyección de dependencias.

## Estructura General del Proyecto

Actualmente el proyecto tiene:

- Una clase `Criatura`, que representa a un personaje en batalla.
- Una interfaz `EstrategiaBatalla`, con diferentes implementaciones que definen comportamientos.
- Comportamientos actuales: `ComportamientoAgresivo` y `ComportamientoDefensivo`.
- Clase principal `App.java` que lanza una batalla entre dos criaturas.

Cada colaborador puede elegir una de las siguientes líneas de trabajo.

## 1. Nuevos Comportamientos (Strategy)

**Objetivo:** Implementar nuevas estrategias que extiendan el comportamiento de una criatura en batalla.

- **Clase base:** `EstrategiaBatalla` (interfaz)
- **Ejemplos de comportamientos a implementar:**

  - `ComportamientoCurativo`: La criatura recupera entre 10 y 20 puntos de vida al usar su turno.
  - `ComportamientoEvasivo`: La criatura evita el siguiente ataque recibido. La evasión se resetea tras esquivar.
  - `ComportamientoEnvenenador`: El enemigo pierde entre 5 y 10 puntos de vida por turno durante los próximos 3 turnos.
  - `ComportamientoAletargador`: Reduce el ataque del enemigo en una cantidad fija o porcentual durante 2 turnos.

Cada colaborador debe crear una clase que implemente la interfaz `EstrategiaBatalla` y definir claramente la acción ejecutada.

## 2. Nuevos Tipos de Criaturas

**Objetivo:** Introducir subtipos de criaturas con características o habilidades especiales.

- **Clase base:** `Criatura`
- **Posibles extensiones:**

  - `CriaturaMagica`: Usa maná para potenciar estrategias.
  - `CriaturaTanque`: Defensa alta, reduce daño si está con suficiente vida.
  - `CriaturaVeloz`: Puede realizar una acción adicional por turno.
  - `CriaturaCamaleon`: Copia la estrategia del enemigo y la usa en su siguiente turno.

Estas clases pueden heredar de `Criatura` o estar compuestas por ella.

## 3. Sistema de Menú Interactivo (Entrada de Usuario)

**Objetivo:** Desarrollar una interfaz de usuario en consola para gestionar criaturas y batallas.

- **Módulo propuesto:** `MenuConsola`
- **Funciones esperadas:**

  - Crear criaturas personalizadas.
  - Listar criaturas disponibles.
  - Elegir dos criaturas para batalla.
  - Mostrar estrategias disponibles.
  - Ejecutar batalla y mostrar resultado.

- **Estructura aproximada:**

  - Un bucle principal con un `switch` que presente opciones.
  - Métodos auxiliares para leer datos del usuario.
  - Uso de `Scanner` y listas para gestionar datos.

## 4. Módulo de Batalla (Lógica de turnos)

**Objetivo:** Administrar los turnos de batalla, controlar el flujo del combate, mostrar resultados.

- **Clase propuesta:** `ArenaDeBatalla`
- **Estructura aproximada:**

  - Atributos para las dos criaturas.
  - Un método para iniciar la batalla.
  - Bucle de turnos alternos hasta que una criatura quede sin vida.
  - Métodos auxiliares para mostrar estado y aplicar estrategias.

- **Requisitos funcionales:**

  - Controlar turnos alternos.
  - Terminar cuando una criatura quede sin vida.
  - Mostrar resultados de cada acción.
  - Permitir cambio de estrategia (opcional).

## 5. Registro de Batalla (Avanzado)

**Objetivo:** Guardar en un archivo de texto los resultados de cada batalla.

- **Clase propuesta:** `RegistroBatalla`
- **Responsabilidades:**

  - Escribir en `registro.txt` cada acción de la batalla.
  - Guardar nombre de combatientes, estrategias usadas y resultado final.
  - Crear el archivo si no existe.

- **Estructura aproximada:**

  - Un atributo `FileWriter` o `BufferedWriter`.
  - Métodos para abrir, escribir y cerrar el archivo.


## 6. Diagrama de clases

![Diagrama de clases del proyecto](diagrama_de_clase.png)
