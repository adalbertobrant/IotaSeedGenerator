import java.util.Random;
import java.util.stream.IntStream;

public class IotaSeedGenerator {

    private String tokenLibrary = "ABCDEFGHIJKLMNOPQRSTUVXYWZ9";
    private Random random;
    private StringBuilder token;

    IotaSeedGenerator() {
        this.random = new Random();
        this.token = new StringBuilder();
    }

    public String generateToken(Integer keySize) {
        return keySize < 31 || keySize > 81 ? null : this.createSeed(keySize);
    }

    private String createSeed(Integer keySize) {
        Integer libraryLength = this.tokenLibrary.length();

        IntStream.range(0, keySize).forEach(character -> {
            int randomIndex = random.nextInt(libraryLength);
            token.append(this.tokenLibrary.charAt(randomIndex));
        });

        return token.toString();
    }
}
