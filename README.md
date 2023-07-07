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

### Cuidado con el modelo anémico

Durante el aprendizaje de Getters y Setters es normal pensar siempre en su necesidad de cambiar algún estado de nuestros objetos.

Pero el uso de esta práctica no siempre es el más adecuado y expresa la realidad.

Tenga en cuenta la clase `Cuenta` representada a continuación que usa solo getter y setters como métodos:

```java
class Cuenta{
    private String titular;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

}
```
Continuamos usando atributos privados y nuestro modelo parece seguir perfectamente la propuesta de encapsulación donde la clase misma administra sus estados (atributos). Un uso clásico de esa cuenta nos llevaría al siguiente escenario:

```java
Cuenta cuenta = new Cuenta();
cuenta.setTitular("Fábio")
cuenta.setSaldo(100.0);
```

Todo parece perfecto, ahora imagina que necesitas retirar 50.0 de esa cuenta. Esta operación requerirá que el saldo sea suficiente. Una simple verificación de la siguiente manera aseguraría que el saldo no haya sido negativo. En nuestro ejemplo no hay límite más allá del saldo :)

```java
Cuenta cuenta = new Cuenta ();
cuenta.setTitular("Fábio")
cuenta.setSaldo(100.0);

double valorSaque = 50.0

if(cuenta.getSaldo() >= valorSaque){
    double nuevoSaldo = cuenta.getSaldo() - valorSaque;
    cuenta.setSaldo(nuevoSaldo)
}

//¡Funcionó! Pero un problema es que esta lógica de restringir el retiro al monto del saldo deberá rehacerse cada vez que se necesite una operación de retiro en nuestra cuenta. Además del problema de duplicación de esta sección, un problema para la encapsulación es que quien realmente controla las reglas de saldo de la cuenta es quién está usando la cuenta. En otras palabras, nada impide que alguien implemente un límite adicional para esto y tenga una regla completamente diferente de otros objetos de tipo Cuenta:

Cuenta conta = new Cuenta ();
cuenta.setTitular("Fábio");
cuenta.setSaldo(100.0);

double valorSaque = 50.0;

if(cuenta.getSaldo() + 1000.0 >= valorSaque){
    double nuevoSaldo = conta.getSaldo() - valorSaque;
    cuenta.setSaldo(nuevoSaldo)
}


//Cuando creamos clases que se limitan a tener atributos privados con setters y getters, generalmente decimos que son clases que solo cargan valor, por lo que comúnmente se llaman clases de títeres o `Value Objects`.

//¡Una clase de títeres es una que no tiene responsabilidad, aparte de llevar un puñado de atributos! ¡Esto definitivamente no está orientado a objetos! Este modelo, aunque a veces se usa, no debería ser una práctica común al desarrollar el dominio de nuestro proyecto con el riesgo de caer en el `modelo anémico`, que es exactamente lo que la `Cuenta` es hoy. Una clase donde los datos y los comportamientos / lógica no están juntos.

//Volviendo a nuestro ejemplo de la Cuenta, está claro que en el mundo real las operaciones podrían representarse con métodos como `saca()` y `deposita()` en lugar de simplemente establecer `SetSaldo()`:
```

class Cuenta{ private String titular; private double saldo;

```java
public void setTitular(String titular){
    this.titular = titular;
}

public String getTitular(){
    return titular;
}

public void saca(double valor){
    if(valor > 0 && saldo >= valor){
        saldo -= valor;
    }
}

public void deposita(double valor){
    if(valor>0){
        saldo += valor;
    }
}

public double getSaldo(){
    return saldo;
}
```
}


Tenga en cuenta que la lógica de saque y depósito está representada dentro de la clase y, además, nuestro `setSaldo()` ya no tiene sentido para el usuario de la Cuenta. La forma de interactuar con el saldo es siempre a través de una de las operaciones anteriores:

Cuenta cuenta = new Cuenta(); cuenta.setTitular("Fábio"); cuenta.deposita(100.0);

double valorSaque = 50.0; cuenta.saca(valorSaque);

**`**

¿Mucho mejor no es así? No hay duplicaciones de código, y mucho menos otras clases que controlan el estado de nuestra cuenta como lo hicimos anteriormente.

**Conclusión** Los setters y getters deben usarse con precaución y no todos los atributos privados necesitan exponer estos dos métodos en riesgo de caer en un `modelo anémico` que tiene sus comportamientos controlados por otras clases.

### Creando Getters y Setters

Aumentaremos nuestro código, modificándolo según las clases.

1. Protegeremos los atributos de la clase **Cuenta**, para esto agregue la palabra reservada **private:**

```java
private double saldo;
private int agencia;
private int numero;
private Cliente titular;
```
Tenga en cuenta que cuando hagamos esto, ya no podremos acceder a los valores. 

2. Necesitamos crear métodos que nos permitan recibir los valores de los atributos, o incluso cambiarlos. ¡Para eso crearemos los Getters y Setters, seguiremos los siguientes modelos y los modificaremos para que devuelva / cambie el atributo correcto!

¡No olvides cambiar el tipo de retorno del método! En este caso es **double**.

```java
// Getter

public double getSaldo(){
    return this.saldo;
}

//Setter
public void setNumero(int numero){
    this.numero = numero;
}
```
En el curso creamos **getSaldo**, **getNumero**, **setNumero**, **getAgencia**, **setAgencia**, **setTitular**, **getTitular**.

3. En la clase **Cliente**, escriba los métodos getters y setters y modifique los atributos agregando **private**.

¡Haga una clase test y vea las posibilidades, para que el conocimiento se consolide!

Nuestro código está debajo, solo haga clic para ver la revisión, ¡pero le recomendamos que lo pruebe antes de ver el código completo!

### Opinión del instructor

Nuestra clase **Cuenta** esta de la siguiente forma:

```java
public class Cuenta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

}
```

Nuestra clase **Cliente**:
```java
public class Cliente {

    private String nombre;
    private String numeroIdentidad;
    private String profesion;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumeroIdentidad () {
        return numeroIdentidad;
    }
    public void setNumeroIdentidad (String numeroIdentidad) {
        this. numeroIdentidad = numeroIdentidad;
    }
    public String getProfesion () {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this. profesion = profesion;
    }

}
```

### Lo que aprendimos

Aprendimos en esta clase:

Atributos privados, restringiendo el acceso a los atributos. Encapsulación de código Métodos de lectura de atributos, los **getters** Métodos para modificar atributos, los **setters** Getters y Setters de referencia.





