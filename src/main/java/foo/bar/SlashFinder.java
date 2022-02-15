package foo.bar;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SlashFinder {

    public static void main(String[] args) throws IOException {
        Path packageInfo = Paths.get("target/classes/foo/bar/package-info.class");
        byte[] binaryObject = Files.readAllBytes(packageInfo);
        String s = new String(binaryObject, StandardCharsets.US_ASCII);
        System.out.println("Bad class format: " + s.contains("foo\\bar\\package-info"));
        System.out.println("Look at the evil backslashes: " + s);
    }
}
