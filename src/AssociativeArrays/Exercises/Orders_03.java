package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        LinkedHashMap<String, Product>productsPrice = new LinkedHashMap<>();

        String dataInput = kbInput.nextLine();

        while (!"buy".equalsIgnoreCase(dataInput)){

            String[]data = dataInput.split(" ");
            String productName = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);


            if (productsPrice.containsKey(productName)){

                Product existingProduct = productsPrice.get(productName);
                existingProduct.setProductQuantity(existingProduct.getProductQuantity() + quantity);
                existingProduct.setProductPrice(price);

                productsPrice.put(productName, existingProduct);

            }else {
                Product newProduct = new Product(price,quantity);
                productsPrice.put(productName,newProduct);

            }

            dataInput = kbInput.nextLine();

        }

        for (Map.Entry<String, Product>entry: productsPrice.entrySet()) {

            Product product = entry.getValue();

            double total = product.getProductPrice() * product.getProductQuantity();

            System.out.printf("%s -> %.2f%n",entry.getKey(),total);
            
        }


    }

    static class Product{
        private double productPrice;
        private int productQuantity;

        public Product(double productPrice, int productQuantity){
            
            this.productPrice = productPrice;
            this.productQuantity = productQuantity;

        }
        
        public double getProductPrice(){
            return this.productPrice;
        }
        public int getProductQuantity(){
            return this.productQuantity;
        }
        
        public void setProductPrice(double productPrice){
            this.productPrice = productPrice;
        }
        public  void setProductQuantity(int productQuantity){
            this.productQuantity = productQuantity;
        }
    }
}
