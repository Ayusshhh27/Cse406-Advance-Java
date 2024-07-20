public class Patient {
    private String name;
    private int age;
    private String gender;

    // Private constructor to be called by the builder
    private Patient(yo builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    // Static inner Builder class
    public static class yo {
        private final String name;
        private int age;
        private String gender;

        // Constructor with required parameter
        public yo(String name) {
            this.name = name;
        }

        // Methods to set optional parameters
        public yo age(int age) {
            this.age = age;
            return this;
        }

        public yo gender(String gender) {
            this.gender = gender;
            return this;
        }

        // Method to build the final Patient object
        public Patient build() {
            return new Patient(this);
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Main method to test the Builder Pattern
    public static void main(String[] args) {
        // Creating a Patient object using the builder pattern
        Patient patient = new Patient.yo("John")
                .age(30)
                .gender("Male")
                .build();

        // Printing the details of the created Patient
        System.out.println("Patient created: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Gender: " + patient.getGender());
    }
}
