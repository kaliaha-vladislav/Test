import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Test {
    private static ArrayList<Product> productList;

    public static void main(String[] arg) throws IOException {
        String path = "products.csv";
        getProductList(path);
        print();
    }

    public static void print(){
        for(Product product : productList){
            System.out.println(product.toString());
        }
    }

    public static void getProductList(String path) throws FileNotFoundException {
        ArrayList<String> arrayList = getItems(path);
        productList = new ArrayList<Product>();
        for(String line : arrayList){
            Product product = getProduct(getArray(line));
            if(product != null){
                productList.add(product);
            }
        }
    }

    public static ArrayList<String> getItems(String pathFile) throws FileNotFoundException {
        FileReader fr = new FileReader("products.csv");
        Scanner scanner = new Scanner(fr);
        ArrayList<String> arrayList = new ArrayList<String>();

        while(scanner.hasNext()){
            arrayList.add(scanner.next());
        }
        return arrayList;
    }

    public static Product getProduct(String[] lines){
        if(lines.length != 3){
            return null;
        }
        if(isValue(lines[2])){
            return new Product(lines[0], lines[1], Integer.valueOf(lines[2]));
        }
        return null;
    }

    public static String[] getArray(String line)  {
        String[] result;
        result = line.split(",");
        return result;
    }

    public static boolean isValue(String num){
        for(int i = 0; i < num.length(); i++){
            if(!Character.isDigit(num.charAt(i))){
                return false;
            }
        }
        return true;
    }
}