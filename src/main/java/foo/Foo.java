package foo;

/**
 * This is the Foo class.
 */
public class Foo {
    private final String foo = "foo";

    /**
     * JDK 18+ requires javadocs on default constructor even when it doesn't exist!
     */
    public Foo() {
    }

    /**
     * Gets the foo.
     *
     * @return foo
     */
    public String getFoo() {
        return foo;
    }

}
