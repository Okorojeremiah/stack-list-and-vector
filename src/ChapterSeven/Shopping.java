package ChapterSeven;

public class Shopping {

       private  String customerName;
       private String product;
       private int quantity;
       private double price;
       private String cashierName;
       private double amountPaid;
       private double discount;
       private double total;

    public Shopping(String product, int quantity, double price, double total) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    public void setProduct (String product){
           this.product = product;
       }
       public String getProduct () {
           return product;
       }

       public String getCustomerName() {return customerName;
       }

       public void setCustomerName(String customerName) {
        this.customerName = customerName;
       }

       public int getQuantity() {
        return quantity;
       }

       public void setQuantity(int quantity) {
        this.quantity = quantity;
       }

       public double getPrice() {
        return price;
       }

       public void setPrice(double price) {
        this.price = price;
       }

       public String getCashierName() {
        return cashierName;
       }

       public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
       }

       public void setAmountPaid(double amountPaid){
           this.amountPaid = amountPaid;
       }

    public double getAmountPaid() {
        return amountPaid;
    }

    public double total() {
           double total = price * quantity;
           return total;
       }



    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }


    public void displayList() {
        System.out.printf("%24s%16d%16f%16f%n", product, quantity, price, total);
    }
}
