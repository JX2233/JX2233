package practise;

public class Family {
    TV homeTV;
    void buyTV(TV tv) {
        homeTV = tv;
    }
    void remoteControl(int m) {
        homeTV.setChanne1(m);
    }
    void seeTV(){
        homeTV.showProgram();
    }
}
