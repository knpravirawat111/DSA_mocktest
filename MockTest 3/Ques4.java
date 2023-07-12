// Drawable interface
interface Drawable {
    void draw();
}

// Circle class implementing Drawable
class Circle implements Drawable {
  
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class implementing Drawable
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}


public class Ques4 {
    public static void main(String[] args) {
   
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        
      
        circle.draw(); 
        rectangle.draw(); 
    }
}
