
public class Pair <T extends Comparable> {
    private T left;
    private T right;

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
    
    public void setleft(T leftParam) {        
        left = leftParam;
    }
    
    public void setright(T rightParam) {        
        right = rightParam;
    }
    
    public Pair(T left, T right) {
        this.left = left;
        this.right = right;
    }
    
    public void swap() {
    	T help;
    	
    	help = left;
    	left = right;
    	right =  help;
    }
    
    public String toString() {
    	 return "[" + left + ";" + right + "]";
    	 }

    public void max() {
    	 if (left.compareTo(right) > 0){
    		System.out.println(left);
    	 }else {
    		 System.out.println(right); 
    	 }
    	
    }

    
    
}
