public class ContainString {
    public static void main(String[] args) {
        String name="Welcome to Mangcoding";
        System.out.println("Hasilnya : "+name.contains("Mangcoding"));
        System.out.println("Hasilnya : "+name.contains("to"));
        System.out.println("Hasilnya : "+name.contains("Hello"));
    }
}
// Output :
// Hasilnya : true
// Hasilnya : true 
// Hasilnya : false