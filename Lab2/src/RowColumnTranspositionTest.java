public class RowColumnTranspositionTest {
    public static void main(String[] args) {
        String message = "This is not a secret message";
        String answer = RowColumnTransposition.encrypt(message, 5);

        System.out.print(answer);
    }

}
