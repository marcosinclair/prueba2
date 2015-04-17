
/**
 * Clase libro
 * 
 * @author (Marcos Blázquez) 
 * @version (23/10/2104)
 */
public class Libro
{
    // instance variables - replace the example below with your own
    private String titulo;
    private String autor;
    private boolean prestado;
    private int paginas;

    /**
     * Constructor de objetos de la clase Libro con el título, nombre del autor y número de páginas.
     */
    public Libro(String elTitulo, String elAutor, int lasPaginas)
    {
        titulo = elTitulo; //Indica el título del libro
        autor = elAutor; // Indica el autor del libro
        prestado = false; // Indica si está prestado o no el libro
        paginas = lasPaginas; // Indica el número de páginas del libro
    }   

    /**
     * Constructor de objetos de la clase Libro con el título y el número de páginas.
     */
    public Libro (String elTitulo, int lasPaginas)
    {
        titulo = elTitulo; //Indica el tirulo del libro
        autor = "Sin autor"; //Indica el autor del libro
        prestado = false; //Indica si está prestado o no el libro
        paginas = lasPaginas; //Indica el número de páginas del libro
    }

    /**
     * Método que devuelve el nombre del Libro.
     */
    public String getTitulo()
    {
        return titulo;
    }

    /**
     * Método que devuelve el nombre del autor del Libro
     */
    public String getAutor()
    {
        return autor;
    }

    /**
     * Método que indica si el libro está prestado
     */
    public String getPrestado()
    {
        if (prestado == true) {
            return "Sí";        
        }
        else {
            return "No";
        }
    }

    /**
     * Método que devuelve el número de páginas que tiene el libro
     */
    public int getPaginas()
    {
        return paginas;
    }

    /**
     * Método que presta el libro, si ya estaba prestado devuelve un mensaje de error.
     */
    public void prestarLibro()
    {
        if (prestado){
            System.out.println("Libro ya prestado");
        }
        else {
            prestado = true;
        }
    }

    /**
     * Método que devuelve un libro prestado
     */
    public void devolverLibro()
    {
        if (prestado) {
            prestado = false;
        }
        else {
            System.out.println("Libro no prestado");
        }
    }

    /**
     * Método que cambia cambia a mayusculas el titulo si el número de páginas es par y si es impar lo pasa a minúsculas.
     */
    public void parImpar()
    {
        if (paginas % 2 == 0){
            titulo = titulo.toUpperCase();
        }
        else {
            titulo = titulo.toLowerCase();
        }
    }

    /**
     * Método que permite cambiar las páginas del Libro siempre y cuendo sean mas que las que tenía.
     */
    public void setPaginasMas (int nuevasPaginas)
    {
        if (nuevasPaginas > paginas){
            paginas = nuevasPaginas;
        }
    }

    /**
     * Método que permite cambiar las páginas sumando 1 sola página más.
     */
    public void setPaginasMas()
    {
        paginas ++;
    }

    /**
     * Método que permite cambiar las páginas del Libro siempre y cuando sean menos que las que tenía.
     */
    public void setPaginasMenos (int nuevasPaginas)
    {
        if (paginas < nuevasPaginas){
            paginas = nuevasPaginas;
        }   
    }

    /**
     * Metodo que permite cambiar las páginas restando 1 sola página menos.
     */
    public void setPaginasMenos()
    {
        paginas --;
    }
}