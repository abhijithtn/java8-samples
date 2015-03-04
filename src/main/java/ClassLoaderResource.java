import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarFile;

/**
 * Created by abhijith.nagarajan on 2/17/15.
 */
public class ClassLoaderResource {

    public static void main(String[] args) throws Exception {

        Enumeration<URL> urlEnumeration = Thread.currentThread().getContextClassLoader().getResources("META-INF/MANIFEST.MF");

        while (urlEnumeration.hasMoreElements()) {
            URL url = urlEnumeration.nextElement();

            if(url.getPath().contains("common-lang"))
                System.out.println("This is the required file");

            System.out.println(url.getPath());
        }
    }
}
