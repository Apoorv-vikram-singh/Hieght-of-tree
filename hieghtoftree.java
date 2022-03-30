package tree;
import java.util.*;
public class Solution
{
    static Scanner sc=null;
    public static void main(String args[])
    {
        sc=new Scanner(System.in);
        node root=createTree();
        System.out.println("height of the tree is this");
        System.out.println(height(root));
    }
    static node createTree()
    {
        node root=null;
        System.out.println("enter the data");
        int data=sc.nextInt();
        if(data==-1)return null;
        root=new node(data);
        System.out.println("entert the left value");
        root.left=createTree();
        System.out.println("entert the right value");
        root.right=createTree();
        return root;

    }
    static int height(node root)
    {
        if(root==null)return 0;
        return Math.max(height(root.left), height(root.right)+1);
    }
}
class node
{
    int data;
    node right,left;
    node(int data)
    {
        this.data=data;
    }   
}