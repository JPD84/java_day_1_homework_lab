public class Printer {

    private int paper;

    public printer(int paper){
        this.paper = paper;
    }

    public void pages(){
        paper -= 20;
    }

    public void copies(){
        paper -= 20;
    }

}
