
/**
 * Drawing a Christmas Tree!!
 * 
 * @author (your name) 
 * @version (23-12-2016)
 */
public class Tree
{

    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
    }

    /**
     * Draws the trunk of a tree with specific height, width, offset and drawing character
     * 
     * @param  height the height of the trunk in lines
     * @param width the width of the trunk
     * @param offset the length of white space on the left of the trunk
     * @param c the character udes to fill in the trunk
     */
    public static void drawTrunk(int height, int width, int offset, char c)
    {
        for (int i=0; i<height; i++)
        {
            for(int j = 0; j<width; j++)
            {
                if (j==0){
                    for(int k=0; k<offset+1; k++)
                    { 
                        if(k==0&&j==0)
                            System.out.println(' ');
                        else
                            System.out.print(' ');
                        }
                }
                System.out.print(c);
            }
        }
    }
    
    /**
     * Draws an isosceles triangle with specific initial height, offset, trim and drawing character
     * 
     * @param height the original height of the triangle (number of lines)
     * @param offset the length of white space on the left of the triangle
     * @param trim the hidden height of the triangle (number of lines trimmed from the top)
     * @param c the character ussed to fill in the triangle
     */
    public static void drawTriangle(int height, int offset, int trim, char c)
    {
        for (int i=trim; i<height; i++)
        {
            for(int j = 0; j<i+i+1; j++)
            {
                if (j==0){
                    for(int k=0; k<offset+height-i; k++)
                    { 
                        if(k==0&&j==0)
                            System.out.println(' ');
                        else
                            System.out.print(' ');
                        }
                }
                System.out.print(c);
            }
        }
    }
        
    /**
     * Draws a christmas tree with a specific number of branches
     * 
     * @param branches the number of branches of the tree
     */
    public static void drawChristmasTree(int branches)
    {
        for (int i=1; i<branches+1; i++)
        {
            //endiaferon la8os: drawTriangle(branches+3+(i-1)*3,(branches-1)*3-(i-1)*3, (i-1)*3,(char)(i%10 + '0'));
            if(i==1){
                drawTriangle(branches+3+(i-1)*3,(branches-1)*3-(i-1)*3, 0,(char)(i%10 + '0'));
            }
            else{
                drawTriangle(branches+3+(i-1)*3,(branches-1)*3-(i-1)*3, branches,(char)(i%10 + '0'));
            }
            
        }
        drawTrunk(2*branches, 2*branches+1, branches*3-1, '0');
    }
}
