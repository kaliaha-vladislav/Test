import java.util.Date;

public class Order {
    private String order;
    private Date date;

    public Order(String order, Date date) {
        this.order = order;
        this.date = date;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
