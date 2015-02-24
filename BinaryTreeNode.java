public class BinaryTreeNode
{
    public BinaryTreeNode()
    {
    }
    
    public BinaryTreeNode(int x, BinaryTreeNode newLeft, BinaryTreeNode newRight)
    {
        data = x;
        left = newLeft;
        right = newRight;
        
    }
    
    public BinaryTreeNode(int x)
    {
        data = x;
    }
    
    
    public BinaryTreeNode getLeft()
    {
        return left;
    }
    
    public BinaryTreeNode getRight()
    {
        return right;
    }
    
    public int getData()
    {
        return data;
    }
    
    public void setData(int x)
    {
        data = x;
    }
    
    public void setLeft(BinaryTreeNode newLeft)
    {
        left = newLeft;
    }
    
    public void setRight(BinaryTreeNode newRight)
    {
        right = newRight;
    }
    
    
    
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    
}