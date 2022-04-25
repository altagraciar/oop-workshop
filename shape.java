abstract class abstractShape{
    private String color;
//    private boolean trueOrFalse;
    private boolean filled;
    private int area;
    private int perimeter;
    private String circle;
    private String rectangle;
    private String square;



    public abstractShape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
//        this.trueOrFalse = trueOrFalse;
    }
public int getArea(){
        return getArea();
}

public int getPerimeter(){
        return getPerimeter();

}

public String getColor(){
        return this.color;
}
    public  String ToString(){
        return "A shape with color of " + color + filled();
    }

    protected abstract String filled();




    public String Circle(){
        String round;


     return circle;

    }
    public String Rectangle(){
        return this.rectangle;
    }
    public String Square(){
        return this.square;
    }
}