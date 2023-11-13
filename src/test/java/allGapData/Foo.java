package allGapData;

public interface Foo {
int x=10;

public class Test { 
    public static void main(String[] args) { 
        //Foo.x = 20; %%%%%%%%%%%interface variable final thake, can't change 
        System.out.println(Foo.x); 
    }
}

}
