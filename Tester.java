import java.util.Random;
import java.util.Queue;

public class Tester
{
    public static void main(String [] args)
    {
        Random myRandom = new Random();
        BinaryTreeNode head = new BinaryTreeNode(5);
        BinaryTreeNode last = head;
        for(int i = 0; i < 2; i++)
        {
            last.setLeft(new BinaryTreeNode(myRandom.nextInt()));
            last.setRight(new BinaryTreeNode(myRandom.nextInt()));
        }
        
        
        
        
    }
}