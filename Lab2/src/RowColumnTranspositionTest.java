public class RowColumnTranspositionTest {
    public static void main(String[] args) {
        String message = "Just give me a reason just a litle bit is enough";
        String answer = RowColumnTransposition.encrypt(message, 5);

        System.out.print(answer);
    }

}
