/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;
    int energy = 100;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("exercising_2");
        face.setMessage("Let's have a great workout!");
    }
    
    public void mediumSpeed(){
        energy = energy - 15;
        face.setImage("exercising");
        face.setMessage("This is fun! Let's go super fast now!");
    }
    
    public void fastSpeed(){
        if(energy > 0){
            energy = energy - 25;
            face.setImage("exercising");
            face.setMessage("This is fun!");
            if(energy < 50){
                energy = energy - 25;
                face.setImage("gettingtired");
                face.setMessage("This is really fast, I'm getting tired.");
            }
        } else {
            face.setImage("finalexercise");
            face.setMessage("I need to stop now.");
        }
    }
    
    public void sick() {
        face.setImage("sick");
    }

    public void dead() {
        face.setImage("dead");
    }

    public void asleep(){
        face.setImage("asleep");
    }

    public void tired(){
        face.setImage("tired");
    }
    
    public void choke(){
        face.setImage("choke");
    }

    public void skeleton(){
        face.setImage("skeleton");
    }
    
    public void daisy(){
        face.setImage("pushingdaisies");
    }

    public void happyAngel(){
        face.setImage("happyangel");
    }

    public void angryAngel(){
        face.setImage("angryangel");
    }
    
} // end Virtual Pet
