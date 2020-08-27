public class AboutMe {

    public static void main(String[] args) {

        String firstName = "Robert";
        String lastName = "Ardeleanu";
        String birthday = "6th July";
        String[] hobbies = {"drawing,", "screenprinting,", "handcrafting", "web developement"};
        char gender = 'm';
        boolean isMarried = false;
        int averageGrade = 5;

        System.out.printf("My name is %s %s. My Birthday is on %s and my gender is %s. My hobbies are %s %s %s and %s. Am I married?: %s. My average grade is %d.", firstName, lastName, birthday, gender, hobbies[0], hobbies[1], hobbies[2], hobbies[3], isMarried, averageGrade);
    }

}
