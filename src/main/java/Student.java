/**
 * This program collects the name, age, student numbers of a student and outputs the data as a String
 * This program also compares the student numbers given, returning true if two student numbers are the same
 * @author Cindy Pan
 * @version i forgor
 */

class Student{

    private String name;
    private int age;
    private String studentNumber;

    /**
     * This method is the constructor of the variables
     * it takes in 2 String for the name and Student number variable
     * and taking in an int data for the age 
     * @param name1 the given String value to be constructed into the name variable
     * @param age1 the given int value to be constructed into the age variable
     * @param studentNumber1 the given String value to be constructed into the studentNumber variable
     */

    public Student(String name1, int age1 , String studentNumber1){
        this.name=name1;
        this.age=age1;
        this.studentNumber=studentNumber1;
    }

    /**
     * this method returns/gets the constructed name variable
     * @return name variable
     */
    public String getName(){
        return this.name;
    }

    /**
     * this method returns/gets the constructed age variable
     * @return age variable
     */
    public int getAge(){
        return this.age;
    }

    /**
     * This method returns/gets teh constructed Student number variable
     * @return Student number variable
     */
    public String getStudentNumber(){
        return this.studentNumber;
    }

    /**
     * this method takes all the given variables and returns them as one String
     * @return A string in the format of name, age - student number
     */
    @Override
    public String toString(){
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    /**
     * this method checks if any two student numbers are the same
     * @return true if two numbers are the same
     * @return false if no numbers are the same
     */
    @Override
    public boolean equals(Object obj){
        if (obj==null){
            return false;
        }

        if (obj.getClass()!=(this.getClass())){
            return false;
        }

        Student Student = (Student)obj;
        if (Student.getStudentNumber().equals(this.studentNumber)){
            return true;
        }
        return false;
    }
}