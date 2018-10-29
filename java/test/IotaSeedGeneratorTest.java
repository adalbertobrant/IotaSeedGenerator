import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class IotaSeedGeneratorTest {

    @Test
    public void shouldReturnNullIfKeySizeIsInvalid() {
        IotaSeedGenerator generator = new IotaSeedGenerator();
        assertNull(generator.generateToken(5));
    }

    @Test
    public void shouldReturnAStringIfKeySizeIsValid() {
        IotaSeedGenerator generator = new IotaSeedGenerator();
        String token = generator.generateToken(50);
        assertEquals(String.class, token.getClass());
    }

    @Test
    public void shouldReturnStringWithGivenKeySize() {
        IotaSeedGenerator generator = new IotaSeedGenerator();
        String token = generator.generateToken(50);
        assertEquals(50, token.length());
    }
}
