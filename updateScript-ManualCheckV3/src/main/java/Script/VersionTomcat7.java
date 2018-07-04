package Script;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;


public class VersionTomcat7 extends VersionMaster {

    public VersionTomcat7(String dependency, String current, String URL){
        super(dependency, current, URL);
    }

    @Override
    public void checkVersion() {

        try {
            Document doc = Jsoup.connect("http://tomcat.apache.org/download-70.cgi").get();

            Element versionNumbers = doc.select("h3:contains(7.0.)").first();

            latestVersion = versionNumbers.text();

        } catch( IOException e) {
            System.out.println("There was a problem connecting to the URL");
            latestVersion = "error";
        }

    }

}
