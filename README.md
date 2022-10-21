# app-suma-andorid-studio 
### Aplicación de suma realizada en android estudio
#### _Distribución de los elementos_
  En primera instancia se creó el diseño de una app para realizar la operación de suma. Los elementos usados fueron, TextView, 
  Edittext de tipo Number y Button para la confirmación de la operación:
  
![Screenshot 2022-10-21 150332](https://user-images.githubusercontent.com/81268917/197279751-e29c42d7-8050-438d-9d8d-33fe0e313118.jpg)

  Para estos elementos se creó esta disposición de entrada, con un color de fondo oscuro y dos campos de texto para el ingreso de los datos “A” y “B”:
  
![Screenshot 2022-10-21 150416](https://user-images.githubusercontent.com/81268917/197279852-d532c395-69a9-414b-a0b9-3b925b473584.jpg)

#### _Método de operación_

En la Clase principal, la MainActivity es la encargada de establecer la conexión lógica del programa, en este caso de declarar las variables por referencia hacia los elementos de la activity, y de esta forma establecer la operación a realizar.

  Por medio de este método se realizará la suma de entre a A y B y su resultado se visualizará en el TextView con el id txtV.
Una vez finalizado el código, se le establece el atributo para el evento de onclick en el botón para realizar el llamado el método _“sumar”_.

#[**APK del proyecto**]:https://github.com/IAN63k/app-suma-andorid-studio/blob/main/app-debug.apk
