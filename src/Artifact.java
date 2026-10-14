public class Artifact {
    private String material;

    //constructor
    public Artifact(String material){
        this.material = material;
        System.out.println("A relic of " + material + " is being forged.");
    }
    //getter
    public String getMaterial(){
        return material;
    }

}
