package com.ciclosmontecastelo.pasteleria;

public class Main {
    public static void main(String[] args) {

        // Pastel de chocolate
        Pastel pastel1 = new PastelChocolate();

        // Pastel de vainilla con la frase "¡básico!"
        Pastel pastel2 = new PastelVainilla();
        Pastel pastel2_1 = new FraseDecorator(pastel2, "¡básico!");

        // Pastel de vainilla con fideos de azúcar con la frase "¡sofisticado!"
        Pastel pastel3 = new PastelVainilla();
        Pastel pastel3_1 = new FideosAzucarDecorator(pastel3);
        Pastel pastel3_2 = new FraseDecorator(pastel3_1, "¡sofisticado!");

        // Pastel de fresa multicapa con doble de fideos de azúcar y dos frases
        // - "el doble de"
        // - "todo"
        Pastel pastel4 = new PastelFresa();
        Pastel pastel4_1 = new MulticapaDecorator(pastel4);
        Pastel pastel4_2 = new FideosAzucarDecorator(pastel4_1);
        Pastel pastel4_3 = new FideosAzucarDecorator(pastel4_2);
        Pastel pastel4_4 = new FraseDecorator(pastel4_3, "el doble de");
        Pastel pastel4_5 = new FraseDecorator(pastel4_4, "todo");

        // Añadimos todos los pasteles al pedido
        Pedido pedido = new Pedido();
        pedido.addPastel(pastel1);
        pedido.addPastel(pastel2_1);
        pedido.addPastel(pastel3_2);
        pedido.addPastel(pastel4_5);

        pedido.printPedido();
    }
}
