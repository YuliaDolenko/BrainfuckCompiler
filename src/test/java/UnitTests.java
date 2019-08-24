import brainfuck.Memory;
import org.junit.Assert;
import org.junit.Test;

public class UnitTests {
    Memory memory = new Memory();

    @Test
    public void testMemorySkeleton() {
        Assert.assertNotNull(memory.getMemorySkeleton());
    }

    @Test
    public void pointerIncrement() {
        int pointer = 5;
        pointer++;

        Assert.assertEquals(6, pointer);
    }

    @Test
    public void pointerDecrement() {
        int pointer = 5;
        pointer--;

        Assert.assertEquals(4, pointer);
    }

    @Test
    public void moveIncrement() {
        byte[] memory = new byte[1000];
        int pointer = 5;
        memory[pointer] = 5;
        memory[pointer]++;

        Assert.assertEquals(6, memory[pointer]);
    }

    @Test
    public void moveDecrement() {
        byte[] memory = new byte[1000];
        int pointer = 5;
        memory[pointer] = 5;
        memory[pointer]--;

        Assert.assertEquals(4, memory[pointer]);
    }
}
