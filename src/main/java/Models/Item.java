package Models;

import java.util.Date;

public class Item {
    String name;
    String image;
    double price;
    double discount;
    Date date = new Date();

    public Item(String name, String image, double price, double discount) {
        super();
        this.name = name;
        this.image = image;
        this.price = price;
        this.discount = discount;
    }

    public String getName() { return name; }
    public String getImage() { return image; }
    public double getPrice() { return price; }
    public double getDiscount() { return discount; }
    public Date getDate() { return date; }

    public void setName(String name) { this.name = name; }
    public void setImage(String image) { this.image = image; }
    public void setPrice(double price) { this.price = price; }
    public void setDiscount(double discount) { this.discount = discount; }
    public void setDate(Date date) { this.date = date; }
}
