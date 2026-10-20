interface Pizza {
    double getPrice();
    String getDescription();
}

class PlainPizza implements Pizza {
    public double getPrice() {
        return 5.0;
    }

    public String getDescription() {
        return "Plain Dough & Sauce";
    }
}

abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public double getPrice() {
        return pizza.getPrice() + 2.0;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
}

class Olives extends ToppingDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    public double getPrice() {
        return pizza.getPrice() + 1.0;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }
}

class Pineapple extends ToppingDecorator {
    public Pineapple(Pizza pizza) {
        super(pizza);
    }

    public double getPrice() {
        return pizza.getPrice() + 1.5;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pineapple";
    }
}

public class CustomPizzaBuilder {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        pizza = new Olives(pizza);
        pizza = new Pineapple(pizza);

        System.out.println("Description: " + pizza.getDescription());
        System.out.printf("Total cost: $%.2f%n", pizza.getPrice());
    }
}
