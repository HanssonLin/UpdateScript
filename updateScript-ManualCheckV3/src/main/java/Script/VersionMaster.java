package Script;

public class VersionMaster {

    //variables of the VersionMasterClass
    private String dependency;
    private String currentVersion;
    protected String latestVersion;
    private String URL;

    //constructor parameters, the variables are set to the arguements
    public VersionMaster(String dependency, String currentVersion, String URL){
        this.dependency = dependency;
        this.currentVersion = currentVersion;
        this.URL = URL;
    }
    //so that output() can be run in this class
    public void checkVersion(){ }
    //prints out the info of the dependency.
    public void output(){
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Dependency: " + this.dependency);
        System.out.println("Current Version: " + this.currentVersion);
        System.out.println("Latest Version: " + this.latestVersion);
        System.out.println("If current version is outdated, here is the download URL for the newest version: " + "\n");
        System.out.println(this.URL);
    }












}
