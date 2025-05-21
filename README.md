# Weather engine
Es un ejemplo con propósitos didácticos que busca enseñar algunos temas relacionados con programación cocurrente usando Java.

Los datos provienen de: [Weather Dataset](https://www.kaggle.com/datasets/muthuj7/weather-dataset?resource=download).

## Actividad 1.
Ejecute el programa y compare el resultado obtenido. ¿El programa funciona como se espera?

**Respuesta**: no el programa únicamente presenta como salida *null*, debido a que el hilo *main* termina antes que el hilo que realiza los cálculos.

Para solucionar el problema, es necesario invocar el método *join* luego de llamar al método *start* revisar la clase [App.java](src/main/java/ec/edu/utpl/carreras/computacion/s7/App.java#L14).

## Actividad 2.
Hasta el momento la única forma de obtener un resultado de la ejecución de un hilo es creando un atributo y un método get (revisar las líneas [17](src/main/java/ec/edu/utpl/carreras/computacion/s7/tasks/TaskSummarize.java#L17) y [66](src/main/java/ec/edu/utpl/carreras/computacion/s7/tasks/TaskSummarize.java#L66) de la clase [TaskSummarize.java](src/main/java/ec/edu/utpl/carreras/computacion/s7/tasks/TaskSummarize.java)). Si bien esto funciona, es posible preguntar: ¿existe alguna otra alternativa?