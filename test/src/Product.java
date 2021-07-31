public class Product {
    private String id;
    private String name;
    private int price_per_unit;


    public Product(String id, String name, int price_per_unit) {
        this.id = id;
        this.name = name;
        this.price_per_unit = price_per_unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice_per_unit() {
        return price_per_unit;
    }

    public void setPrice_per_unit(int price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price_per_unit=" + price_per_unit +
                '}';
    }
}
