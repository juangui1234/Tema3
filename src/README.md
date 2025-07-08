# 🐾 Sistema de Ficha Clínica Veterinaria (Java)

Este proyecto en Java permite gestionar la ficha clínica de un propietario con sus mascotas y el historial de consultas veterinarias, siguiendo buenas prácticas como validaciones, encapsulamiento, delegación y generación automática de identificadores.

---

## 📌 Características principales

- Registro de un **propietario** con nombre, documento y teléfono.
- Registro de múltiples **mascotas** asociadas al propietario.
- Cada mascota puede tener varias **consultas** médicas, con fecha, código y veterinario asignado.
- Manejo de historial clínico por mascota.
- Validaciones robustas para entradas de usuario (fecha, nombre, edad, etc.).
- Generación automática de códigos para consultas y mascotas (`C1`, `M1`, etc.).
- Visualización final de la ficha clínica completa en consola.

---

## 🧱 Estructura del proyecto

El código está organizado en un solo paquete `Historia` con las siguientes clases:

| Clase         | Rol                                                                 |
|---------------|----------------------------------------------------------------------|
| `Main`        | Clase principal para ejecutar el flujo de registro y visualización. |
| `Propietario` | Representa al dueño de mascotas. Tiene lista de `Mascota`.          |
| `Mascota`     | Contiene información básica y su `Historial` de `Consulta`.         |
| `Historial`   | Agrupa todas las consultas de una mascota.                          |
| `Consulta`    | Representa una cita veterinaria, incluyendo `Veterinario`.          |
| `Veterinario` | Representa al médico veterinario a cargo de la consulta.            |
| `IDGenerator` | Genera identificadores únicos para consultas y mascotas.            |

---

## 🚀 Cómo ejecutar

1. **Abre el proyecto en NetBeans** o cualquier IDE compatible con Java.
2. Asegúrate de tener configurado JDK 11 o superior (por el uso de `LocalDate`).
3. Ejecuta la clase `Main.java`.
4. Ingresa los datos requeridos por consola para propietario, mascotas y consultas.
5. Al finalizar, se mostrará en consola la ficha clínica completa del propietario.

---

## 🧠 Buenas prácticas aplicadas

- ✅ **Encapsulamiento**: Todos los atributos son `private` y accedidos mediante getters/setters.
- ✅ **Validaciones**: Los setters validan la entrada antes de asignar los valores.
- ✅ **Refactorización responsable**:
    - Se reemplazó `String fecha` por `LocalDate` para mejor manejo de fechas.
    - Se creó la clase `Historial` para manejar el historial de una mascota, separando responsabilidades.
- ✅ **Delegación de responsabilidades**: `Mascota` delega el manejo de consultas a `Historial`.
- ✅ **Evita código duplicado**: uso de métodos reutilizables (`mostrarConsulta()`, `mostrarHistorial()`).

---

## 📅 Formato de fecha

El sistema espera que la fecha de la consulta se ingrese con el formato:

YYYY-MM-DD

yaml
Copiar
Editar

Por ejemplo: `2025-07-08`

Si se introduce un formato incorrecto, el programa mostrará un error indicando el formato esperado.

---

## ✍️ Autor

**Juan Guillermo Salazar**  
Sistema desarrollado como parte de aprendizaje en Java, orientado al uso de objetos, relaciones entre clases y mejora de la lógica de programación.

---

## 🧪 Ejemplo de salida (resumen)

===== FICHA CLÍNICA COMPLETA =====
👤 Propietario: Laura Torres
🆔 Documento: 123456789
📞 Teléfono: 3001234567

📋 Mascota: Rocky | Especie: Perro | Edad: 5 años
Historial de consultas:
Consulta Código: C1
Fecha: 2025-07-01
Veterinario: Dra. Marta | Especialidad: Cirugía
Consulta Código: C2
Fecha: 2025-07-05
Veterinario: Dr. José | Especialidad: Dermatología