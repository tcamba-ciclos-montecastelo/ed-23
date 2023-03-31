public abstract class Comida {
    public String color;

    public Comida(String color) {
        this.color = color;
    }

    public abstract void display();
}

public class Ingredientes {
    private int noDeIngredientes;

    public Ingredientes(int noDeIngredientes) {
        this.noDeIngredientes = noDeIngredientes;
    }

    public void display() {
        System.out.println("No de ingredientes: " + noDeIngredientes);
    }
}

public class Curry extends Comida implements Precio {
    Ingredientes ing;
    public String tipoCurry, tamañoPlato;

    public Curry(String color, Ingredientes ing, String tipoCurry, String
            tamañoPlato) {
        super(color);
        this.ing = ing;
        this.tipoCurry = tipoCurry;
        this.tamañoPlato = tamañoPlato;
    }

    public void display() {
        System.out.println("Color:" + color);
        ing.display();
        System.out.println("Tipo de Curry:" + tipoCurry);
        System.out.println("Tamaño del plato:" + tamañoPlato);
    }

    public void precioCaro() {
        System.out.println("Precio alto !");
    }

    public void precioBarato() {
        System.out.println("Precio barato !");
    }

    public static void main(String[] args) {
        Ingredientes i = new Ingredientes(5);
        Curry k = new Curry("Rojo", i, "Thai", "Grande");
        k.display();
        k.precioCaro();
        k.precioBarato();
    }
}

public interface Precio {
    public void precioCaro();

    public void precioBarato();
}
