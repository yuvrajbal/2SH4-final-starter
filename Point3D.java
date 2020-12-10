
/*
Question 3
[Java Programming]
[25 Marks]

You have been asked to extend a preexisting class Point that represents 2-D (x, y) coordinates. 
The Point class is in the Point.java file.


You are required to define a new class called Point3D that extends this class through inheritance. 
It should behave like a Point except that it should be a 3-dimensional point that keeps track of a z-coordinate. 
You should provide the same methods as the superclass, as well as the following new behavior.

[3 marks] public Point3D(): Description constructs the point (0, 0,0)

[3 marks] public Point3D(int x, int y, int z): constructs a point with the given x/y/z coordinates

[3 marks] public void setLocation(int x, int y, int z): sets the coordinates to the given values 

[3 marks] public int getZ(): returns the z-coordinate


Some of the existing behaviors from Point should behave differently on Point3D objects:
[4 marks] • When the original 2-parameter version of the setLocation is called, the 3-D point’s x/y coordinates should be set as specified, and the z-coordinate should be set to 0.
[4 marks] • When a 3-D point is printed with toString, it should be returned in an ”(x, y, z)” format that shows all three coordinates.
[5 marks] • A 3-D point’s distance from the origin is computed using all three coordinates; it is equal to the square root of (x^2 + y^2 + z^2) (where x^2 is x square (i.e. x*x)).

Write your class below:

*/
public Point3D extends Point{
  
  protected int z;
  
  
  public Point3D(){
      super(0,0);
      this.z=0;
  }

  public Point3D( int x ,int y, int z){
      super(x,y);
      this.z=z;    
  }

  public void setLocation(int x ,int y, int z){
        super.SetPoint(x,y);
        this.z=z;
  }
  
  // Return the z coordinate
  public int getZ(){
    return z;
  }
 
  public double distanceTo( Point3D that){
    double dis=Math.pow (getX(),2) + Math.pow(getY(),2)+ Math.pow(getZ(),2);
    
    return Math.sqrt(dis);
  }
  
  public String toString(){
    return "(" + getX() + "," + getY() + "," + this.z + ")";
  }
}
