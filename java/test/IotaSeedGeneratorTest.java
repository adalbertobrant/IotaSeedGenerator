import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;

public class IotaSeedGeneratorTest {

    @Test
    public void shouldReturnNullIfKeySizeIsInvalid() {
        IotaSeedGenerator generator = new IotaSeedGenerator();
        assertNull(generator.generateToken(5));
    }
}
