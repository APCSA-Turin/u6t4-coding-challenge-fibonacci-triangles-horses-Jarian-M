package com.example.project;

public class Point {
  private int x;
  private int y;
 
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }


  public void setX() {
      this.x = x;
  }


  public void setY() {
      this.y = y;
  }
 
  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
    /* IMPLEMENT ME */
    double distance = Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    return distance;
  }

  // Returns a string in the format: (x, y)
  public String pointInfo() {
   /* IMPLEMENT ME */
      String pt = "(" + x + "," + y + ")";
      return pt;
  }
}
