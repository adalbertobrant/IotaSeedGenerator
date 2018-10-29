import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IotaSeedFileGenerator {

    private IotaSeedGenerator generator = new IotaSeedGenerator();;

    public static void main(String[] args) throws IOException {
        IotaSeedFileGenerator fileGenerator = new IotaSeedFileGenerator();
        fileGenerator.generateToken(Integer.parseInt(args[0]), args[1]);
    }

    public void generateToken(Integer keySize, String fileName) throws IOException {
        String token = this.generator.generateToken(keySize);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt"));
        writer.write(token);
        writer.close();
    }
}
