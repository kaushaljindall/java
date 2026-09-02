package chatper10;


public class m2_genericClass {
    public static void main(String[] args) {
        dog<Integer , String> ob = new dog<>(12 , "leo");
        System.out.print(ob.id);
    }
}

class dog<E , V>{

    E id;
    V name;

    dog(E id  , V name){
        this.id = id;
        this.name = name;
    }
} 
