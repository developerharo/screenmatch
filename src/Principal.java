public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encantada";
        miPelicula.fechaDeLanzamiento = 2001;
        miPelicula.duracionEnMinutos = 90;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Piratas del Caribe";
        otraPelicula.fechaDeLanzamiento = 2007;
        otraPelicula.duracionEnMinutos = 110;

        //otraPelicula.muestraFichaTecnica();

    }
}
