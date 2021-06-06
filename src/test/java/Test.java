import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    public void testNormalFour() {
        int[] in = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] out = {1, 7};
        Assertions.assertArrayEquals(out, ForTests.afterFour(in));
    }

    @org.junit.jupiter.api.Test
    public void testLastFour() {
        int[] in = {1, 2, 4, 4, 2, 3, 4};
        int[] out = {};
        Assertions.assertArrayEquals(out, ForTests.afterFour(in));
    }

    @org.junit.jupiter.api.Test
    public void noFour() {
        int[] in = {1, 2, 44, 2, 34, 1, 2};
        Assertions.assertThrows(RuntimeException.class, () -> ForTests.afterFour(in));
    }

    @org.junit.jupiter.api.Test
    public void noFour2TestFail() {
        int[] in = {1, 2, 44, 4, 34, 1, 2};
        Assertions.assertThrows(RuntimeException.class, () -> ForTests.afterFour(in));
    }

    @org.junit.jupiter.api.Test
    public void noFour3() {
        int[] in = {1, 2, 1, 7};
        Assertions.assertThrows(RuntimeException.class, () -> ForTests.afterFour(in));
    }

    @org.junit.jupiter.api.Test
    public void  bothOneFour() {
        int[] in = {1, 1, 1, 4, 4, 1, 4, 4};
        Assertions.assertTrue(ForTests.checkOneFor(in));
    }
    @org.junit.jupiter.api.Test
    public void  onlyOne() {
        int[] in = {1, 1, 1, 1, 1, 1};
        Assertions.assertFalse(ForTests.checkOneFor(in));
    }
@org.junit.jupiter.api.Test
    public void  onlyFour() {
        int[] in = {4, 4, 4, 4};
        Assertions.assertFalse(ForTests.checkOneFor(in));
    }
    @org.junit.jupiter.api.Test
    public void  another() {
        int[] in = {1, 4, 4, 1, 1, 4, 3};
        Assertions.assertFalse(ForTests.checkOneFor(in));
    }


}
