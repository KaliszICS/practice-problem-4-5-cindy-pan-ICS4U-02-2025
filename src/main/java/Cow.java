/**
 * This program collects the name, age and weight of a cow
 * Returning all variables as a String 
 * Also returns true if the name, age and weight of a cow is the same to another cow
 * @author Cindy Pan
 * @version i forgor
 */

class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * constructor
     * @param name1 String data
     * @param age1 int data
     * @param weight1 weight data
     */
    public Cow(String name1, int age1, double weight1){
        this.name=name1;
        this.age=age1;
        this.weight=weight1;
    }

    /**
     * gets the name of the cow
     * @return the name of the cow
     */
    public String getName(){
        return this.name;
    }

    /**
     * gets the age of the cow
     * @return the age of the cow
     */
    public int getAge(){
        return this.age;
    }

    /**
     * gets the weight of the cow
     * @return the weight of the cow
     */
    public double getWeight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.name+", "+this.age+" - "+this.weight;
    }

    @Override
    public boolean equals(Object obj){

        if(obj==null){
            return false;
        }

        if(obj.getClass() != this.getClass()){
            return false;
        }
        
        Cow cow = (Cow)obj;

        if(cow.getName().equals(this.name) && cow.getAge()==this.age && cow.getWeight() == this.weight){
            return true;
        }
        return false;
    }
}
