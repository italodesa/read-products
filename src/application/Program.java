package application;

import entity.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){
        Path path = Path.of("sales.csv");
        List<Product> products = new ArrayList<>();

        try (
                Scanner sc = new Scanner(path);
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(Path.of("program_out","summary.csv").toFile()))
        ) {

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] split = line.split(",");
                String name = split[0];
                Double price = Double.parseDouble(split[1]);
                Integer quantity = Integer.parseInt(split[2]);
                Product product = new Product(name,price,quantity);
                products.add(product);
            }


            for(Product p : products){
                bw.write(p.toString());
                bw.newLine();
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
