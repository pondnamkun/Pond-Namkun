package Recipefoot;
import java.io.Serializable;

public class Maincourse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String file;
    private String Name;
    private String Foot;
    private String Recipe;

    public Maincourse() {}
    public Maincourse (String Name, String Foot,String Recipe,String file) {
        this.Name = Name;
        this.Foot = Foot;
        this.Recipe = Recipe;
        this.file = file;
    }
    public String getNames(){return Name;}
    public String getFoot(){return Foot;}
    public String getRecipe(){return Recipe;}
    public String getfilename(){return file;}

    public void setNames(String Name){this.Name = Name;}
    public void setFoot(String Foot){this.Foot = Foot;}
    public void setRecipe(String Recipe){this.Recipe = Recipe;}
    public void setfilename(String file){this.file = file;}
}