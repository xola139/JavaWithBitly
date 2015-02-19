# JavaWithBitly
Recorta las url con el uso del servicio de Bitly

Simple proyecto para acortar una url con Java utilizando el servicio de Bitbly, para realizar esto solo es encesario el API key de su cuenta Bitlyu y bitlyj .jar( [bitlyj link](https://code.google.com/p/bitlyj/) ), y despues tal como se ve en el codigo siguiente:

```Java
String urlLong="http://www.oracle.com/technetwork/es/java/javase/downloads/jdk7-downloads-1880260.html";
Url url = as("usuariox", "SuApikey").call(shorten(urlLong));
System.out.println(url.getShortUrl());
```		
