import java.util.Random;
import java.util.stream.IntStream;

public class IotaSeedGenerator {

    private String tokenLibrary = "ABCDEFGHIJKLMNOPQRSTUVXYWZ9";

    public IotaSeedGenerator() {
    }

    public String generateToken(Integer keySize) {
        return keySize < 31 || keySize > 81 ? null : this.createSeed(keySize);
    }

    private String createSeed(Integer keySize) {
        Integer libraryLength = this.tokenLibrary.length();
        Random rand = new Random();
        StringBuilder token = new StringBuilder();

        IntStream.range(0, keySize).forEach(character -> {
            int randomIndex = rand.nextInt(libraryLength);
            token.append(this.tokenLibrary.charAt(randomIndex));
        });
        return token.toString();
    }

}
