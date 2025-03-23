public class Pet {
    private String petName;
    private String ownerName;

    public Pet(String petName, String ownerName) {
        this.petName = petName;
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
