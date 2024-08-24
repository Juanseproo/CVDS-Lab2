# CVDS-Lab2

## Integrantes
- Juan Sebastian Buitrago Piñeros - owner
- Juan Esteban Medina Rivas - collaborator

## Laboratorio 2 - Patterns

### Introducción a Maven

**Maven** es una herramienta de gestión y comprensión de proyectos. Su principal objetivo es proporcionar una visión completa del estado del proyecto en el menor tiempo posible. Para lograrlo, Maven se enfoca en varias áreas clave:

- **Facilitar el proceso de compilación.**
- **Proporcionar un sistema de compilación uniforme.**
- **Ofrecer información de calidad sobre el proyecto.**
- **Fomentar mejores prácticas de desarrollo.**

### Fases del Ciclo de Vida de Maven

Maven organiza el proceso de construcción del proyecto en **fases**, cada una representando una etapa en el ciclo de vida. Las principales fases son:

1. **`validate`**: Verifica que toda la información y dependencias necesarias estén disponibles.
2. **`compile`**: Compila el código fuente del proyecto.
3. **`test-compile`**: Compila los casos de prueba.
4. **`test`**: Ejecuta las pruebas.
5. **`package`**: Empaqueta el proyecto en un formato distribuible.
6. **`verify`**: Verifica la calidad del proyecto.
7. **`install`**: Instala el paquete en el repositorio local.
8. **`deploy`**: Implementa el paquete en el repositorio remoto.

### Ciclo de Vida de la Construcción

El **ciclo de vida de la construcción** en Maven describe el proceso completo desde la validación inicial hasta la implementación del paquete final. Cada fase se ejecuta en un orden específico para asegurar que todas las etapas del proceso de construcción se completen de manera eficiente y efectiva.

### Plugins en Maven

Los **plugins** en Maven son herramientas que realizan tareas específicas durante el ciclo de vida de la construcción, los cuales permiten realizar tareas como la compilación del código, la ejecución de pruebas, la creación de documentación, y más.

### Repositorio Central de Maven

El **repositorio central de Maven** es un repositorio remoto que contiene una amplia colección de bibliotecas y herramientas que los proyectos pueden utilizar. Es el centro para que los desarrolladores encuentren y compartan dependencias, facilitando la integración y el uso de bibliotecas en diferentes proyectos.


## Ejercicio de las figuras

Creando un proyecto maven con ayuda de los arquetipos (archetypes).

![creatingProject](img/creatingProject.png)

Comprobando que se haya creado correctamente el conjunto de directorios con un conjunto de archivos básicos.

`$ cd Patterns` \
`$ tree`

![directoryTree](img/directoryTree.png)


## Compilar y ejecutar

Para compilar, utilizar el siguiente comando, y en caso de que no actualice dependencias correctamente, utilizar la opción -U

 `$ mvn package` \
 `$ mvn -U package`

### Objetivo del parámetro **package**

