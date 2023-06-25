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



