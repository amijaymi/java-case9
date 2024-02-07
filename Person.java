public class Person {
    private final String firstName;
    private String lastName;
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getName(){
        return this.firstName;
    }
    public void buyCandy(){
        System.out.println("contents of these methods differ for each age group");
    }
    public void buyCigarette(){
        System.out.println("contents of these methods differ for each age group");
    }
    
}
