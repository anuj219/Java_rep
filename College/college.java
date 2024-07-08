
class college{
    // int i = 7;
    // static int j = 5;
    public static void main(String[] args) {
        //int k = 5;
        college a = new college();
        // college b = new college();
        a.display();
    }
    void display(){
        //int m = 4;
        System.out.println("Hello World. ");
    }
}
/*
The class college is loaded into the JVM, and memory for the static variable j is allocated in the method area.
The main method is called, creating a stack frame for it on the stack with the local variable k.
Two instances of college, a and b, are created on the heap, each with its own copy of the instance variable i.
The method a.display() is called, creating another stack frame for the display method on top of the main method’s stack frame.
 This new frame contains the local variable m.
The string "Hello World. " is printed to the console.
After a.display() completes execution, its stack frame is popped off the stack, and control returns to the main method.
When the program ends, the stack frames are cleared, and the heap objects are eventually cleaned up by garbage collection 
if there are no more references to them.
 */