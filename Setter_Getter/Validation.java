package Setter_Getter;

public class Validation {
    
    public static void main(String[] args) {
        Voting voter = new Voting();

        voter.setName("Namrata");
        voter.setAge(19);
        voter.setNationality("Indian"); 

        System.out.println("Name: " + voter.getName());
        System.out.println("Age: " + voter.getAge());
        System.out.println("Nationality: " + voter.getNationality());

        // Check eligibility
        voter.checkEligibility();
    }
}

class AgeValidation {
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    public int getAge() {
        return age;
    }
}

// ------------------ Child Class ------------------
class Voting extends AgeValidation {
    private String name;
    private String nationality;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    // Eligibility check 
    public void checkEligibility() {
        
        if (getAge() >= 18 && nationality != null && nationality.toLowerCase().equals("indian")) {
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting.");
        }
    }
}

