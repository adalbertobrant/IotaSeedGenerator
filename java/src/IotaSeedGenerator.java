
public class IotaSeedGenerator {

    private String tokenLibrary = "ABCDEFGHIJKLMNOPQRSTUVXYWZ9";

    public IotaSeedGenerator() {
    }

    public String generateToken(Integer keySize) {
        return keySize < 31 || keySize > 81 ? null : this.createSeed(keySize);
    }

    private String createSeed(Integer keySize) {
        return "";
    }

}



