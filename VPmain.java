import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();

    public VPMain() {
        this.waitABeat(3000); // slows everything down
        String ans = askForInput("What speed should I run: Medium or Fast?"); // .waitABeat and .askForInput are 2 things needed to make it going
        if (ans.equals("medium"))
            vp.mediumSpeed();
        else
            vp.fastSpeed();
        this.waitABeat(3000);
        vp.fastSpeed();
        this.waitABeat(3000);
        vp.fastSpeed();
        this.waitABeat(3000);
        vp.fastSpeed();
        this.waitABeat(3000);
        vp.fastSpeed();
        this.waitABeat(3000);

        String ans2 = askForInput("Can I stop now?");
        if(ans2.equals("yes")){
            vp.sick();
            this.waitABeat(3000);
            String ans3 = askForInput("Can I sleep now?");
            if(ans3.equals("yes")){
                vp.asleep();
                this.waitABeat(3000);
                vp.choke();
                this.waitABeat(3000);
                vp.dead();
            }else{
                vp.tired();
                this.waitABeat(3000);
                vp.dead();
            }
        }else{
            this.waitABeat(3000);
            vp.dead();
        }
        this.waitABeat(3000);

        vp.skeleton();
        this.waitABeat(3000);
        String ans3 = askForInput("Should we dig Mr. Pet a hole?");
        if(ans3.equals("yes")){
            this.waitABeat(3000);
            vp.daisy();
            this.waitABeat(3000);
            vp.happyAngel();
        }else{
            this.waitABeat(3000);
            vp.skeleton();
            this.waitABeat(3000);
            vp.angryAngel();
        }
    }


    public void waitABeat(int ms) {
        try {
            Thread.sleep(ms); // milliseconds
        } catch (Exception e) {

        }
    }

    public String askForInput(String q) {
        String s = (String) JOptionPane.showInputDialog(
                new JFrame(),
                q,
                "Input Dialog",
                JOptionPane.PLAIN_MESSAGE);
        return s;
    }

    public static void main(String[] args) {
        new VPMain();
    }
}
