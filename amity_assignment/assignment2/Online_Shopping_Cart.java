import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Online_Shopping_Cart {
    public static void main(String[] args) {
        List <Product> products= new ArrayList<>();
        int item_number;
        String orderId,item;
        System.out.print("Enter the order ID:");
        Scanner sc=new Scanner(System.in);
        orderId= sc.nextLine();
        System.out.print("Enter Number of item:");
        item_number= sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=item_number;i++)
        {
            item= sc.nextLine();
            String [] spliter=item.split(",");
            products.add(new Product(spliter[0],Integer.parseInt(spliter[1]),Integer.parseInt(spliter[2])));
        }
        Order obj=new Order(orderId,products);
        System.out.print(obj);
    }
}

class Product {
    private String productName;
    private int price, quantit;

    public Product(String productName, int price, int quantit) {
        this.productName = productName;
        this.price = price*quantit;
        this.quantit = quantit;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantit() {
        return quantit;
    }

    public void setQuantit(int quantit) {
        this.quantit = quantit;
    }
    @Override
    public String toString() {
        return
                productName +"x"+quantit +
                " =" +price+"\n";
    }
}
class Order{
    private String orderId;
    private List <Product> products= new ArrayList<>();

    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public int calculate()
    {
        int sum=0;
        for(int i=0;i<products.size();i++)
        {
            sum+=products.get(i).getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\nProducts:\n");

        for (int i=0;i<products.size();i++) {
            sb.append(products.get(i).toString());
        }
        sb.append("Total: ").append(calculate());
        return sb.toString();
    }
}
