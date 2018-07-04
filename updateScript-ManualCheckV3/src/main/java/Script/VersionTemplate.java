package Script;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;


class VersionTemplate extends VersionMaster {

    //DO NOT EDIT THIS ONE, COPY IT AND USE IT AS A TEMPLATE

    VersionTemplate(String dependency, String current, String URL){
        super(dependency, current, URL);
    }

    @Override
    public void checkVersion() {
        try {
            //gets the html doc and sets it as a variable
            Document doc = Jsoup.connect("DownloadPageURL").get();
            //gets the element that contains what you were looking for
            Element versionNumbers = doc.select("TagOfElement:contains(TextOfWhatYouNeedToFind)").first();
            //sets the VersionMaster latestVersion variable as the one found in the element
            latestVersion = versionNumbers.text();

        } catch( IOException e) {
            System.out.println("There was a problem connecting to the URL");
            latestVersion = "error";
        }

    }

}
