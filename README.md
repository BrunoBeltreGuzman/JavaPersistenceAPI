# JavaPersistenceAPI
Java Persistence API framework for managing relational data

En Java los datos se representan en objetos. Sin embargo, las bases de datos habituales, como SQL, MySQL, PostgreSQL, Oracle, guardan sus datos en forma relacional. Evidentemente existe una brecha entre los objetos y las relaciones, que, de alguna manera, debe evitarse.

La API de persistencia JPA es el estándar de Java para mapear (asignar) objetos Java a una base de datos relacional. El mapeo o asignación de objetos Java a tablas de bases de datos y viceversa se denomina mapeo relacional de objetos.

A través de JPA, el desarrollador se puede almacenar, eliminar, actualizar y recuperar datos de bases de datos relacionales a objetos Java y viceversa, el cual se puede utilizar en aplicaciones Java EE y Java SE.

JPA nos permite trabajar directamente con objetos en lugar de sentencias SQL por lo que no tendremos que escribir absolutamente ninguna en nuestros programas, esto equivale también a rapidez en el desarrollo de aplicaciones Java.

# Anotaciones:

@Entity Especifica que voy a crear una entidad. Se coloca al inicio de la definición de la clase.

@Id Primary key de la entidad.

@GeneratedValue  Indica que esa clave se auto genera por medio de auto increment.

@Colulmn Sirve para especificar que la clave está asociada a un atributo de la tabla. Aprovecharemos para indicar si  puede ser nulo, si existe un límite de caracteres, etc.


