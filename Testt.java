public class Testt {
    public static void main(String[] args){
        Kid boy=new Kid("efe","ece");
        YoungAdult teenager=new YoungAdult("efe","ece");
        Adult adult=new Adult("efe","ece");

    
        boy.buyCigarette();

        teenager.buyCandy();
        teenager.buyCigarette();

        adult.buyCandy();
        adult.buyCigarette();
    }
}  
    