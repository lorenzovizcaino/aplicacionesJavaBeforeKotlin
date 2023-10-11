package JavaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args) {
        funcionesComoArgumentos();

        composicionFunciones();

        recursion();

        usoStream();

        usoLambdas();

        usoOpsFuncionalesConColecciones();
    }

    //1.Uso de funciones como argumentos:
    // Función de orden superior que toma una función y un valor, y aplica la función al valor
    private static int aplicarFuncion(Function<Integer, Integer> funcion, int valor) {
        return funcion.apply(valor);
    }

    public static void funcionesComoArgumentos() {

        // Definición de una función de suma
        Function<Integer, Integer> suma = x -> x + 2;

// Función de orden superior que toma una función y un valor, y aplica la función al valor
        int resultado = aplicarFuncion(suma, 5);
        System.out.println(resultado); // Output: 7

    }

    //2.Uso de composición de funciones:
    public static void composicionFunciones() {
        // Definición de funciones
        Function<Integer, Integer> duplicar = x -> x * 2;
        Function<Integer, Integer> sumarUno = x -> x + 1;

// Composición de funciones
        Function<Integer, Integer> duplicarYSumarUno = duplicar.andThen(sumarUno);

        int resultado = duplicarYSumarUno.apply(5);
        System.out.println(resultado); // Output: 11
    }

    //3.Uso de recursión:
    // Función recursiva para calcular el factorial de un número
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void recursion() {

        int resultado = factorial(5);
        System.out.println(resultado); // Output: 120
    }

    //4.Uso Stream y Ops AltoNivel
    public static void usoStream(){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

// Filtrar los números pares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(pares); // Output: [2, 4]

// Calcular la suma de los números
        int suma = numeros.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(suma); // Output: 15
    }

    //5.Uso de lambdas Las funciones lambdas es un término adoptado de la programación funcional y corresponden con:
    // funciones de Java que normalmente son anónimas y se escriben en línea allí donde se usan.
    // Como cualquier función recibe cero o más argumentos y devuelven uno o ningún valor de retorno.
/*
    public List<T> filter(Function<T, Boolean> f) {
        List<T> result = new ArrayList<T>();
        for (T s : this.list) {
            if (f.apply(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public List<T> map(Function<T, T> f) {
        List<T> result = new ArrayList<T>();
        for (T s : this.list) {
            result.add(f.apply(s));
        }
        return result;
    }
*/
    public static void usoLambdas(){
        System.out.println("Filtrado longitud mayor que 4");
            // Uso una lambda para parsarle la función que necesita
        List<String> listaString = Arrays.asList("Juan", "María", "Pedro");

        var res3 = listaString.stream().filter(x -> x.length() > 4);
        System.out.println(res3);
        var res4 = listaString.stream().filter(x -> x.startsWith("a"));
        System.out.println(res4);

        System.out.println("Mapeado a mayúsculas");
            var res5 = listaString.stream().map(x -> x.toUpperCase());
        System.out.println(res5);

        // Podemos encadenarlas
        System.out.println("Encadenado");
            var res6 = listaString.stream()
                    .filter(x -> x.length() > 4)
                    .map(x -> x.toUpperCase())
                    .filter(x -> x.startsWith("A"));

        System.out.println(res6);
    }

    public static void usoOpsFuncionalesConColecciones(){
        //Aquí tienes ejemplos del uso de algunos de estos métodos:

        //filter: Permite filtrar elementos de una colección según una condición especificada.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numerosPares); // Output: [2, 4, 6, 8, 10]

        //En este ejemplo, se filtran los números pares de la lista original utilizando el método filter y una expresión lambda que verifica si el número es divisible por 2.

        //map: Permite transformar cada elemento de una colección en otro valor.
        List<String> nombres = Arrays.asList("Juan", "María", "Pedro");
        List<Integer> longitudes = nombres.stream()
                .map(nombre -> nombre.length())
                .collect(Collectors.toList());
        System.out.println(longitudes); // Output: [4, 5, 5]

        //En este ejemplo, se obtiene la longitud de cada nombre en la lista original utilizando el método map y una expresión lambda que aplica la función length() a cada elemento.

        //reduce: Permite combinar los elementos de una colección en un solo resultado.
        numeros = Arrays.asList(1, 2, 3, 4, 5);
        int suma = numeros.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(suma); // Output: 15

        //En este ejemplo, se realiza la suma de todos los elementos de la lista utilizando el método reduce y una expresión lambda que suma dos elementos.

        //forEach: Permite realizar una acción en cada elemento de la colección.
         nombres = Arrays.asList("Juan", "María", "Pedro");
        nombres.stream()
                .forEach(nombre -> System.out.println("Hola, " + nombre));
// Output:
// Hola, Juan
// Hola, María
// Hola, Pedro
       // En este ejemplo, se imprime un saludo para cada nombre en la lista utilizando el método forEach y una expresión lambda que realiza la acción de imprimir.

        //Uso del Comparator para ordenar una lista de objetos:
        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 25),
                new Persona("María", 30),
                new Persona("Pedro", 20)
        );

        List<Persona> personasOrdenadas = personas.stream()
                .sorted(Comparator.comparing(Persona::getEdad))
                .collect(Collectors.toList());

        System.out.println(personasOrdenadas);
// Output: [Pedro (20), Juan (25), María (30)]
        //En este ejemplo, la lista de personas se ordena en función de su edad utilizando el método sorted y el Comparator que compara las edades de las personas.

        //Cálculo de la media de una lista de números:
        numeros = Arrays.asList(1, 2, 3, 4, 5);

        double media = numeros.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);

        System.out.println(media);
// Output: 3.0
        //En este ejemplo, se convierten los números enteros en valores de tipo double utilizando el método mapToDouble, se calcula la media utilizando el método average y se utiliza orElse para proporcionar un valor predeterminado en caso de que la lista esté vacía.

        //Obtención del valor máximo y mínimo de una lista de números:
        numeros = Arrays.asList(5, 2, 8, 1, 4);

        Optional<Integer> maximo = numeros.stream()
                .max(Comparator.naturalOrder());

        Optional<Integer> minimo = numeros.stream()
                .min(Comparator.naturalOrder());

        System.out.println("Máximo: " + maximo.orElse(0));
        System.out.println("Mínimo: " + minimo.orElse(0));
// Output: Máximo: 8, Mínimo: 1
       // En este ejemplo, se utiliza el método max y min junto con Comparator.naturalOrder() para obtener el valor máximo y mínimo de la lista de números. Los resultados se envuelven en un Optional para manejar el caso de una lista vacía.

        //        Además, cabe mencionar el uso de parallelStream en la API Stream. parallelStream permite paralelizar el procesamiento de una secuencia de elementos, lo que puede mejorar el rendimiento en ciertos casos cuando se trabaja con grandes conjuntos de datos. Aquí tienes un ejemplo:

        numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double sumaX = numeros.parallelStream()
                .mapToDouble(Integer::doubleValue)
                .sum();

        System.out.println(sumaX);
// Output: 55.0
        //En este ejemplo, se utiliza parallelStream en lugar de stream para calcular la suma de los números de manera paralela. La API Stream se encarga de dividir el trabajo en múltiples hilos para aprovechar los recursos del sistema y acelerar el procesamiento. Sin embargo, es importante tener en cuenta que el paralelismo puede no ser beneficioso en todos los casos y se debe evaluar su uso en función de las características del problema y el hardware disponible.

        //Paso a paso
        /*
        List<Integer> transactionsIds =
                transactions.stream()
                        .filter(t -> t.getType() == Transaction.GROCERY)
                        .sorted(comparing(Transaction::getValue).reversed())
                        .map(Transaction::getId)
                        .collect(toList());*/

    }

}
