package Script;

public class Namer {

    //takes away the spaces and anything after the : in the string, useful to get just the dependency name
    private String cleanUpString(String input){

        String output;
        for(int k= 0; k<input.length(); k++){
            if (input.substring(k, k+1).equals(":")){
                output = input.substring(0, k);
                return(output);

            }
        }
        return(input);
    }

    //takes in the current dependencies string[] that includes versions, and outputs a dependencies/names string[] with the cleaned names
    public String[] getDependencies(String[] current){
        String[] temp = new String[current.length];
        for(int k = 0; k<temp.length; k++){
            temp[k] = cleanUpString(current[k]);
        }

        return(temp);
    }
}
