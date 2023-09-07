import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close)
    { openDel = open; closeDel = close; }

    public ArrayList<String> getDelimitersList(String[] token)
    {
        ArrayList<String> delimiters  = new ArrayList<>();
        for (int i = 0; i < token.length; i++){
            if(token[i].equals(openDel)||token[i].equals(closeDel)){
                delimiters.add(token[i]);
            }
        }
        // To be implemented.
        return delimiters;
    }
    public boolean isBalanced(ArrayList<String> delimiters) {
        int openNum = 0, closeNum = 0;
        for (String i : delimiters){
            if(i.equals(openDel)){
                openNum++;
            }
            if(i.equals(closeDel)){
                closeNum++;
            }
            if(closeNum>openNum){
                return false;
            }
        }
        if(openNum!=closeNum){
            return false;
        }
        return true;
// To be implemented.
    }

    public String getOpenDel() {
        return this.openDel;
    }

    public String getCloseDel() {
        return this.closeDel;
    }
}
