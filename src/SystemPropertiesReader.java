/**
 * @author tomekk
 * @since 2010-09-09, 16:31:20
 */
public class SystemPropertiesReader {

    public static void printSelectedSystemProperties() {

        String s;
        System.out.println("About to get os.name property value");

        s = System.getProperty("os.name", "not specified");
        System.out.println("  The name of your operating system is: " + s);

        System.out.println("About to get java.version property value");

        s = System.getProperty("java.version", "not specified");
        System.out.println("  The version of the JVM you are running is: " + s);

        System.out.println("About to get user.home property value");

        s = System.getProperty("user.home", "not specified");
        System.out.println("  Your user home directory is: " + s);

        System.out.println("About to get java.home property value");

        s = System.getProperty("java.home", "not specified");
        System.out.println("  Your JRE installation directory is: " + s);

    }
}
