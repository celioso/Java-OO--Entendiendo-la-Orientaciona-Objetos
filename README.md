### Creando las primeras clases

¡Vamos a comenzar a implementar nuestro proyecto!

1. Cree un nuevo proyecto, en el curso usamos el nombre **"bytebank"**.
2. Declare su primera clase de tipo de **Cuenta** y defina los atributos que considere necesarios.

```java
public class Cuenta{

    double saldo;
    int agencia;
    int numero;
    String titular;
}
```

3. Cree otra clase, en el curso usamos el nombre "CreaCuenta".

4. En la clase CreaCuenta, cree su método main e instancie una Cuenta.

```java
public class CreaCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
    }
}
```
5. Cambie el saldo de la primeraCuenta a 200 e imprima esta cantidad para confirmar que todo está bien.

```java
public class CreaCuenta {

    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta ();
        primeraCuenta.saldo = 200;
        System.out.println(primeraCuenta.saldo);
    }
}
```

6. Realice una operación y agregue `100` más al saldo de la primeraCuenta:

```java
public class CreaCuenta {

    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta ();
        primeraCuenta.saldo = 200;
        System.out.println(primeraCuenta.saldo);

        primeraCuenta.saldo += 100;
        System.out.println(primeraCuenta.saldo);
    }
}
```

Nuestra salida debe ser `200` y `300`.

7. Cree una referencia más para el objeto de la cuenta actual, en nuestro caso, la **segundaCuenta** y cambie el saldo a `50`. Nuestro código debería verse así:

```java
public class CreaCuenta {

    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;
        System.out.println(primeraCuenta.saldo);

        primeraCuenta.saldo += 100;
        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 50;

        System.out.println("primera cuenta tiene " + primeraCuenta.saldo);
        System.out.println("segunda cuenta tiene " + segundaCuenta.saldo);

    }
}
```

8. Como se menciona en los videos, **primeraCuenta** y **segundaCuenta** son referencias, cuando imprimimos, vemos un código algo extraño, para esto solo agregue:

`System.out.println(primeraCuenta);`

### Creando métodos

Vamos a comenzar a escribir nuestros métodos.

1. Escriba el método de **deposita**, que recibe un valor de tipo **double**. Recuerde que cuando nuestro método no devuelve ningún valor, debemos poner la palabra especial **void**, así:

````java
public void deposita(double valor){

}
```

2. Complete su método de **deposita**, agregue la cantidad recibida al saldo de su cuenta, no olvide usar **this**.

```java
// dentro de la clase Cuenta
public void deposita(double valor){

    this.saldo += valor;
}
```

3. Ahora cree el método **saca**, que también recibe un valor de tipo **double**, en este caso, nuestro método debe retornar un valor **boolean**, así que no olvide el **return**.

```java
public boolean saca(double valor){

    if(this.saldo >= valor){
        this.saldo -= valor;
        return true;
    } else {
        return false;
    }
}
```

4. Ahora escriba el método de transfiere, también debe retornar un booleano, pero ahora recibirá una **Cuenta** que será el destino y la cantidad que se transferirá.

```java
public boolean transfiere(double valor, Cuenta destino){

    if(this.saldo >= valor){
        this.saldo -= valor;
        destino.deposita(valor);    
        return true;
    }
    return false;
}
```

5. No olvide probar sus métodos, para eso, cree una clase (usamos el nombre T**estMetodos**) y escriba el **main**, ¡vea si todo funciona!

6. Queda como desafío cambiar el método **transfiere** para reutilizar nuestro código implementado en **saca** para simplificar el código.

###Opinión del instructor

Hasta ahora, nuestro código de clase Cuenta se ve así:
```java
public class Cuenta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
```

### Lo que aprendimos

En esta clase hablamos sobre el comportamiento que son los métodos.

Vimos:

cómo definir métodos con parámetros y retorno cómo devolver algo usando la palabra clave `return` cómo usar la referencia `this` para acceder a un atributo que podemos pasar una referencia como parámetro de método los métodos se invocan desde la referencia utilizando el operador .

Si aún tiene dudas sobre las referencias, `this` y el uso de métodos, tenga la seguridad de que en las próximas clases (y cursos) revisaremos los conceptos y practicaremos mucho más. ¿Continuamos?

### Haga lo que hicimos en el aula: Referencias

### Referencias

Continuando con nuestro código.

1. Si lo desea, cree un nuevo proyecto y copie la clase **Cuenta**, o simplemente cree una nueva clase **Cliente** para componer nuestro **byteban**k, nuestra clase **Cliente** debería tener este aspecto:

```java
public class Cliente {

    String nombre;
    String numeroIdentidad;
    String profesion;
}
```

2. Defina los atributos de la clase Cliente como prefiera, en el curso, usamos nombre, numeroIdentidad y profesion.

3. Modifique la clase Cuenta agregando un atributo de tipo Cliente.

```java
public class Cuenta {

    double saldo;
    int agencia;
    int numero;
    Cliente titular;
}
```

4. ¡Crea una clase de prueba e instancia un cliente y una cuenta! Recuerde que un atributo del **titular** de la cuenta tiene un **Cliente**

5. Tenga en cuenta que podemos hacerlo más directamente!

`Cuenta cuentaDeMarcela = new Cuenta();`
`cuentaDeMarcela.titular = new Cliente();` 
Podemos definir el nombre de un cliente haciendo:

`cuentaDeMarcela.titular.nombre = "Marcela";`

### Lo que aprendimos

Aprendimos en este capítulo:

- Darse cuenta de la relación entre clases a través de la composición;

- Ventajas de aislar información repetida en otra clase;

- Detalles de la composición;

- `NullPointerException` para atributos no inicializados y su cuidado.

casa 23



