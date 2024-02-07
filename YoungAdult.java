public class YoungAdult extends Person {
    public YoungAdult(String firstName,String lastName){
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
        System.out.println("you should stop smoking,anyways which cigarette do you want");
    }
}
