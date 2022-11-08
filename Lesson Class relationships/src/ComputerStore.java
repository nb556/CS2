public class ComputerStore
{
    public static void main (String[] args)
    {
        System.out.println ("Got to get business started.");
    }
}

class Order
{
    Order ()
    {
        products = new Product[5];
    }
}

class Warehouse
{
    public Laptop[] laptops;
    public Router[] routers;
}

class Product
{
    public Product (String model, int price)
    {
        this.model = model;
        this.price = price;
    }

    public String model;
    public int price;
}

class Laptop extends Product
{
    public Laptop ()
    {
        super (model, price);
    }

    public String model;
    public int price;
}

class Router extends Product
{
    public Router ()
    {
        super (model, price);
    }

    public String model;
    public int price;
}
