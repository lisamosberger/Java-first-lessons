package com.example.java26.oop2;

public class Circle extends Object {
    double radius;
    String text;

    public Circle(double radius) {
        this.radius = radius;
    }

    //generate -> equals hashcode

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Circle circle)) return false;

        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    //@Override //man överridar en method från superclass, vi ska ersättar den code från supperklassen
    //public int hashCode() {
    //    return 13; //alla objekt skapad av circle har 13 som hashcode efter det
    //}


    //De måsta alltid skapas tillsammans!!
//    @Override
//    public int hashCode () {
//        return Objects.hash(radius);
//    }
//    @Override
//    public boolean equals (Object obj) {
////        if (obj == null)
////            return false;
////        if (obj == this)
////            return true;
////        if(obj.getClass() != Circle.class)
////            return false;
////        Circle other = (Circle) obj;
////        return Objects.equals(this.radius, other.radius);
//
//        if( obj instanceof Circle other){
//            return Objects.equals(this.radius, other.radius);
//        }
//        return false;
//    }
}
