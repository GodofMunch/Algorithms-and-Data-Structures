import com.sun.org.apache.xpath.internal.SourceTree;

public class TestEthelsEncryption {
    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println("IFMMP XPSME //Expected");
        System.out.println(EthelsEncryption.encrypt(message, 1));

        System.out.println("\nGT OTBKYZOMGZOUT UL ZNK RGCY UL ZNUAMNZ //Expected");
        String secondMessage = "An Investigation of The laws of thought";
        System.out.println(EthelsEncryption.encrypt(secondMessage, 6));
    }
}
