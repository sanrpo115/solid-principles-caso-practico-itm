# DSI_Grupo_4 Principios S.O.L.I.D Caso Practico


Este repositorio contiene el código fuente de un caso practico utilizando los principios S.O.L.I.D 

Entre los objetivos de tener en cuenta estos 5 principios a la hora de escribir código encontramos:

- Crear un software eficaz: que cumpla con su cometido y que sea robusto y estable.
- Escribir un código limpio y flexible ante los cambios: que se pueda modificar fácilmente según necesidad, que sea reutilizable y mantenible.
- Permitir escalabilidad: que acepte ser ampliado con nuevas funcionalidades de manera ágil.

## Acronimo

- S : Single Responsibility Principle ([SRP](https://github.com/sanrpo115/solid-principles-caso-practico-itm/tree/main/src/main/java/FatntPro/app/SingleResponsibilityPrinciple))
- O : Open Closed Principle ([OCP](https://github.com/sanrpo115/solid-principles-caso-practico-itm/tree/main/src/main/java/FatntPro/app/OpenClosedPrinciple))
- L : Liskov Substitution Principle ([LSP](https://github.com/sanrpo115/solid-principles-caso-practico-itm/tree/main/src/main/java/FatntPro/app/LiskovSubstitutionPrinciple))
- I : Interface Segregation Principle: ([ISP](https://github.com/sanrpo115/solid-principles-caso-practico-itm/tree/main/src/main/java/FatntPro/app/InterfaceSegregationPrinciple))
- D : Dependency Inversion Principle: ([DIP](https://github.com/sanrpo115/solid-principles-caso-practico-itm/tree/main/src/main/java/FatntPro/app/DependencyInversionPrinciple))


### Single Responsibility Principle:

##### 1. [Robert C. Martin](https://en.wikipedia.org/wiki/Robert_C._Martin) expresa el principio como: "Una clase debe tener sólo una razón para cambiar".
##### 2. Cada módulo o clase debe tener responsabilidad sobre una sola parte de la funcionalidad proporcionada por el software, y esa responsabilidad debe estar completamente encapsulada por la clase.

### Open/Closed Principle:
##### 1. Las entidades de software deben estar abiertas a la extensión, pero cerradas a la modificación.
##### 2. El diseño y la escritura del código deben realizarse de manera que se agreguen nuevas funciones con cambios mínimos en el código existente.
##### 3. El diseño debe realizarse de manera que permita agregar nuevas funcionalidades como nuevas clases, manteniendo lo más posible el código existente sin cambios.

### Liskov Substitution Principle
##### 1. Introducido por [Barbara Liskov](https://en.wikipedia.org/wiki/Barbara_Liskov), establece que "los objetos de un programa deben ser reemplazables con instancias de sus subtipos sin alterar la corrección de ese programa".
##### 2. Si un módulo de programa utiliza una clase base, entonces la referencia a la clase base se puede reemplazar con una clase derivada sin afectar la funcionalidad del módulo de programa.
##### 3. También podemos afirmar que los tipos derivados deben ser sustituibles por sus tipos base.

### Interface Segregation Principle:
##### 1. Muchas interfaces específicas del cliente son mejores que una interfaz de propósito general.
##### 2. No debemos obligar a los clientes a implementar interfaces que no utilizan. En lugar de crear una interfaz grande, podemos dividirla en interfaces más pequeñas.

### Dependency Inversion Principle:
##### 1. Uno debería depender de abstracciones, no de concreciones.
##### 2. Las abstracciones no deberían depender de los detalles mientras que los detalles deberían depender de las abstracciones.
##### 3. Los módulos de alto nivel no deben depender de módulos de bajo nivel.
