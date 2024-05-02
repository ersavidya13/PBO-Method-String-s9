public class SubString {
    public static void main(String[] args) {
        String hello = "Welcome to mangcoding";
        System.out.println("Hasilnya adalah : " + hello.substring(1, 7));
        System.out.println("Hasilnya adalah : " + hello.substring(5, hello.length()));
    }
}
// Output 
// Hasilnya adalah : elcome
// Hasilnya adalah : me to mangcoding