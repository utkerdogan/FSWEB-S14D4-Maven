package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Bread("Çavdar Ekmeği", 15, "Organik çavdar unu ile yapılmış, sağlıklı ve lezzetli ekmek.");
        products[1] = new Chocolate("Bitter Çikolata", 20, "Yüksek kakao oranına sahip, yoğun aromalı bitter çikolata.");
        products[2] = new Coke("Gazoz", 10, "Serinletici ve ferahlatıcı gazoz.");
        
        listProducts(products);
        
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}