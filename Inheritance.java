class Animal{
    public void eat(){
        System.out.println("I can eat!");
    }
    public void sleep(){
        System.out.println("I can sleep!");
    }
}

class cat extends Animal{
    public void kitty(){
        System.out.println("cat meow!");
    }
}
class dog extends Animal{
    public void puppy(){
        System.out.println("dog bark!");
    }
}

class kitten extends cat{
    public void kit(){
        System.out.println("i'm kit!");
    }
}

class allAmimals {
    public static void main(String[] args){
        kitten c = new kitten();
        c.kit();
        c.kitty();
        c.eat();
        c.sleep();
    }
}
