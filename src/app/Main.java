package app;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Coffee Maker", "Appliances", 80.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Blender", "Appliances", 50.0),
                new Product("Smartphone", "Electronics", 900.0),
                new Product("Oven", "Appliances", 300.0)
        );

        Map<String, Double> averagePricesByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

        System.out.println("Середня ціна по категоріях: " + averagePricesByCategory);


        Optional<Map.Entry<String, Double>> maxAverageCategory = averagePricesByCategory.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        maxAverageCategory.ifPresent(entry ->
                System.out.println("Категорія з найвищою середньою ціною: " + entry.getKey() + " (" + entry.getValue() + ")"));
    }
}
