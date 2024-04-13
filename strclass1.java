package intro;

public class strclass1 {
    public static void main(String[] args) {

        String str = "Java is a powerful programming language";
        // Split the string based on space
        String[] words = str.split(" ");
        // Display the result
        System.out.println("Original String: " + str);
        System.out.println("Split String:");
        for (String word : words) {
            System.out.println(word);

        }
    }
}