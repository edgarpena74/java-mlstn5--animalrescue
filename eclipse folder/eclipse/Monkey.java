public class Monkey extends RescueAnimal {

    // Instance variables
    private String tailLength;
    private String height;
    private String bodyLength;

    // Constructor
    public Monkey(String tailLength, String height, String bodyLength, String name, String animalType, String gender,
            String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus,
            boolean reserved, String inServiceCountry) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);

    }

    // Getter Setter for tail length
    public String getTailLength() {
        return this.tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }
    //

    // Getter Setter for height
    public String getHeight() {
        return this.height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    //

    // Getter Setter for body length
    public String getBodyLength() {
        return this.bodyLength;
    }

    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }

}
