public class Adult extends Person {
    public Adult(String firstName,String lastName){
        super(firstName,lastName);
    }
    @Override
    public void buyCandy(){
        super.buyCandy();
        System.out.println("which candy do yu want");
    }
    @Override
    public void buyCigarette(){
        super.buyCigarette();
        System.out.println(" which cigarette do you want");
    }
}
