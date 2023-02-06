
public class TestSimpleNode {
    public static void main(String[] args) {
        SimpleNode<Integer> x = new SimpleNode<Integer>(1);
        x.next = new SimpleNode<Integer>(2);
        x.next.next = new SimpleNode<>(3);
        x.next.next.next = new SimpleNode<>(4);    

        System.out.println(x);   
    }
}