package Script;

import java.util.ArrayList;

public class ScriptRunner {


    public static void main(String args[]){

        //declare variables as String[]
        String[] currentVersions;
        String[] URLS;
        String[] dependencies;

        //creates 2 objects, a reader and a namer
        ReaderAndSaver reader = new ReaderAndSaver();
        Namer namer = new Namer();
        //defines 3 of our declared String arrays
        currentVersions = reader.readAndReturnArray("file/CurrentVersions.txt");
        dependencies = namer.getDependencies(currentVersions);
        URLS = reader.readAndReturnArray("file/URLS.txt");

        //makes a arraylist of VersionMasters, contains currentversions, urls, newest versions, names
        ArrayList<VersionMaster> checks = new ArrayList<VersionMaster>();

        //adds each versionDependency needed to the arraylist
        //skipped Insight and WinPcap because we dont care about those
        checks.add(new VersionTomcat7(dependencies[1], currentVersions[1], URLS[1]));
        //add more checks/Version_ here

        //For loop to print out all the info from VersionMaster list)
        for (VersionMaster check:checks) {
            check.checkVersion();
            check.output();
        }
    }
}
