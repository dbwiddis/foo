package foo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FooTest {

    @Test
    public void fooTest() {
        assertEquals("foo", new Foo().getFoo());
    }
}
