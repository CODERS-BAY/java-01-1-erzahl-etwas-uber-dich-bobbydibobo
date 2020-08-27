public class AboutMe {

    public static void main(String[] args) {

        String firstName = "Robert";
        String lastName = "Ardeleanu";
        String birthday = "6th July";
        String[] hobbies = {"drawing,", "screenprinting,", "handcrafting", "web developement"};
        char gender = 'm';
        boolean isMarried = false;
        int averageGrade = 5;

        System.out.printf("%s %s %s. %s %s %s %s. %s %s %s %s %s %s. %s %s. %s %d. ", "My name is", firstName, lastName, "My Birthday is on", birthday, "and my gender is", gender, "My hobbies are", hobbies[0], hobbies[1], hobbies[2], "and", hobbies[3], "Am i married?:", isMarried, "My average grade is", averageGrade);
    }

}
