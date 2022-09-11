// Recursion means function calling itself until specified condition is met.
// base case is used to stop the recursion call.
// stack overflow error occurs when many functions are waiting inside the stack.

public class recursion
{
    int count=0;
    void function(int n)
    {  if(n==4)
    {
        return;
    }
        System.out.println(count);
        count++;
        function(n+1);
    }
    public static void main(String[] args) {
       recursion r=new recursion();
       r.function(1);
    }
}
