package menjadi.programmer.data;

public class Product {
    protected String name;
    protected int price;

    // private String name;
    // private int price;

    // public String name;
    // public int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product name: " + name + ", price:"+price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    

    // public boolean equals(Object o) {
    //     if(this == o) return true;
    //     if(!(o instanceof Product)) return false;

    //     Product product = (Product) o;
    //     if(price != product.price) return false;
    //     return name != null ? name.equals(product.name) : product.name == null;
    // }

    
    
}
