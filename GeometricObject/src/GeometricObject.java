/**
 * Created by akuma on 3/13/17.
 */
public class GeometricObject {

    // The color of the object (default: white).
    private String color = "white"; //Is this a bad practice?
    // Indicates whether the object is filled with a color (default: false).
    private boolean filled;
    // The date when the object was created.
    private java.util.Date dateCreated;

    // Creates a GeometricObject.
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    // Creates a GeometricObject with the specified color and filled
    // values.
    public GeometricObject(String color, boolean filled){
       this.color = color;
       this.filled = filled;
    }

    // Returns the color.
    public String getColor(){
        return color;
    }

    // Sets a new color.
    public void setColor(String color){
        this.color = color;
    }

    //Returns the filled property
    public boolean isFilled(){
        return filled;
    }

    // Sets a new filled property
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    // Returns the dateCreated
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    // Returns a string representation of this object.
    public String toString(){
        return "created on " + dateCreated + "\nclolor: " + color +
                " and filled: " + filled;
    }

}
