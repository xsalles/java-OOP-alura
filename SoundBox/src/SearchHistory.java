import java.util.ArrayList;
import java.util.List;

public class SearchHistory extends Audio{
    private List<Audio> history;

    public SearchHistory(){
        history = new ArrayList<>();
    }

    public void addSearch(Audio audio){
      history.add(audio);
    }

    public void showHistory(){
        if (history.isEmpty()){
            System.out.println("\nNenhuma pesquisa foi realizada\n");
        } else {
            for (Audio audio : history){
                audio.showInformations();
            }
        }
    }
}
