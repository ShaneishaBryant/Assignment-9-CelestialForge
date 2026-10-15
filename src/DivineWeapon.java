public class DivineWeapon extends Artifact{
    private String essenceType;

    //constructor
    public DivineWeapon(String essenceType){
        super("Celestial Bronze"); //calling artifact superclass
        this.essenceType = essenceType;
        System.out.println("It's essence is now glowing with " + essenceType + " energy.");
    }

    public String getEssenceType(){
        return essenceType;
    }

}
