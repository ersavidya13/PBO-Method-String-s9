public class ReplaceString {
    public static void main(String[] args) {
        String String1="Hello How Ate You";
        String GantiKarakter = String1.replace(oldChar: 'H', newChar: 'T');
        String GantiKalimat = String1.replace(target: "Hello", replacement: "Good Morning");
        System.out.println("Untuk replace karakter : "+GantiKarakter);
        System.out.println("Untuk replace kalimat : "+GantiKalimat);
    }
}

// output :
// Untuk replace karakter : Tello Tow Are You
// Untuk replace kalimat : Good Morning How Are You