// Aeriel Denmark
// Foundation in Application Development

// The following is a program written for an app development course taken towards Computer Science, B.S. degree
// This file is one of several files that links to one another

public class Monkey extends RescueAnimal {

    // Instance variable
    private String species, tail length, height, body length;

    // Constructor
    public Monkey(String name, String species, String tail length, String height,
    String body length, String gender, String age, String weight,
    String acquisitionDate, String acquisitionCountry, String trainingStatus,
    boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Method
    public String getSpecies() {
        return species;
    }

    public String getTailLength() {
      return tailLength;
    }

    public String getHeight() {
      return height;
    }

    public String getBodyLength() {
      return bodyLength;
    }

    // Mutator Method
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }

    public void setTailLength(String monkeyTailLength) {
      tailLength = monkeyTailLength;
    }

    public void setHeight(String monkeyHeight) {
      height = monkeyHeight;
    }

    public void setBodyLength(String monkeyBodyLength) {
      bodyLength = monkeyBodyLength;
    }

}
