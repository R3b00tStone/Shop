public class Main {
    public static void main(String[] args){
        Product first = new Product(70.5, "Чехол", true);
        Product second = new Product(3900, "Смартфон", false);
        System.out.println("Первый товар: " + first);
        System.out.println("Второй товар: " + second);
    }
}