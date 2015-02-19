# JavaWithBitly
Recorta las url con el uso del servicio de Bitly

Simple proyecto para acortar una url son el servicio de Bitbly, para realizar esto solo es ncesario el API key de su cuenta Bitlyu
```Java
String urlLong="http://www.oracle.com/technetwork/es/java/javase/downloads/jdk7-downloads-1880260.html";
Url url = as("o_282u8mub6u", "R_33c226de39e7c87437a6e0a3079ccf51").call(shorten(urlLong));
System.out.println(url.getShortUrl());
```		
