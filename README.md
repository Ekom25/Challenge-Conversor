
# Challenge - Conversor de monedas.

## Descripción
Se realiza el desafío del programa Alura y Oracle del programa ONE de la formación Java Orientado a Objetos G6 - ONE.

Donde se aprende a realziar un conversor de divisa utilizando una API, JSON, filtrado y conversión de la moneda a solicitar.


### Funciones

- Convertir de Dólar estadounidense (USD) a otras monedas: Peso argentino (ARS), Peso colombiano (COP) y Real brasileño (BRL).
- Convertir de Peso argentino (ARS), Peso colombiano (COP) y Real brasileño (BRL) a Dólar estadounidense (USD).
- Obtener tasas de cambio actualizadas desde una API externa.
- Manejar entradas inválidas del usuario y opciones de menú no válidas con excepciones personalizadas.

### Requisitos

- Java JDK 17
- Biblioteca Gson 2.10.1
- IDE (Entorno de Desarrollo Integrado) IntelliJ IDEA

### Link API
Se usa la siguiente API: https://www.exchangerate-api.com/

### Temas

- Utilizar HttpClient
- Utilizar HttpRequest
- Utilizar HttpResponse
- Analizando la respuesta en formato JSON
- Utilizar las clases proporcionadas por Gson, como JsonParser y JsonObject, para acceder a las distintas propiedades de la respuesta JSON

## Ejemplo de funcionamiento

```java
*********************************************************************
Menú, bienvenido al conversor de moneda (Divisas):
1 - Dolar a Peso argentino
2 - Dolar a Peso colombiano
3 - Dolar a Real brasileño
4 - Peso argentino a Dolar
5 - Peso colombiano a Dolar
6 - Real brasileño a Dolar
7 - Salir
Elija una opción:
*********************************************************************
1
Ingrese la cantidad: 100
La cantidad convertida es: 90600.00 ARS
*********************************************************************
Menú, bienvenido al conversor de moneda (Divisas):
1 - Dolar a Peso argentino
2 - Dolar a Peso colombiano
3 - Dolar a Real brasileño
4 - Peso argentino a Dolar
5 - Peso colombiano a Dolar
6 - Real brasileño a Dolar
7 - Salir
Elija una opción:
*********************************************************************
4
Ingrese la cantidad: 90600
La cantidad convertida es: 100.00 USD
*********************************************************************
Menú, bienvenido al conversor de moneda (Divisas):
1 - Dolar a Peso argentino
2 - Dolar a Peso colombiano
3 - Dolar a Real brasileño
4 - Peso argentino a Dolar
5 - Peso colombiano a Dolar
6 - Real brasileño a Dolar
7 - Salir
Elija una opción:
*********************************************************************
661
Entrada no válida. Por favor, intente de nuevo.
*********************************************************************
Menú, bienvenido al conversor de moneda (Divisas):
1 - Dolar a Peso argentino
2 - Dolar a Peso colombiano
3 - Dolar a Real brasileño
4 - Peso argentino a Dolar
5 - Peso colombiano a Dolar
6 - Real brasileño a Dolar
7 - Salir
Elija una opción:
*********************************************************************
efvbev
Entrada no válida. Por favor, intente de nuevo.
*********************************************************************
Menú, bienvenido al conversor de moneda (Divisas):
1 - Dolar a Peso argentino
2 - Dolar a Peso colombiano
3 - Dolar a Real brasileño
4 - Peso argentino a Dolar
5 - Peso colombiano a Dolar
6 - Real brasileño a Dolar
7 - Salir
Elija una opción:
*********************************************************************
```




