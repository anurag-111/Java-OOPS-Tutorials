package com.oopsDemo.tutorial04.accessDemo;

public class ObjectMethods extends ObjectClass {
    int id;
    float marks;

    public ObjectMethods(int id, float marks) {
        this.id = id;
        this.marks = marks;
    }

    @Override
    // Returns a hash code value for the object.
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    // For any non-null reference values x and y, this method returns true
    // if and only if x and y refer to the same object (x == y has the value true).
    public boolean equals(Object obj) {
        // Check if the objects are the same instance in memory
        if (this == obj) {
            return true;
        }

        // Check if the specified object is null or belongs to a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the specified object to the same class
        ObjectMethods other = (ObjectMethods) obj;

        // Compare the 'id' field of the current object with the 'id' field of the other object
        return this.id == other.id;
    }


    @Override
    // Returns a string representation of the object. In general, the toString method
    // returns a string that "textually represents" this object.
    // The toString method for class Object returns a string consisting of the name of the
    // class of which the object is an instance, the at-sign character `@', and the unsigned
    // hexadecimal representation of the hash code of the object.
    // In other words, this method returns a string equal to the value of:
    // getClass().getName() + '@' + Integer.toHexString(hashCode())
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectMethods object = new ObjectMethods(101,99.5f);
        System.out.println(object.hashCode());
        ObjectMethods object2 = new ObjectMethods(101,95.5f);
        System.out.println(object2.hashCode());

        // Checks if the object and object2 references are pointing to the same memory
        // location (i.e., they refer to the exact same object). The == operator in Java
        // compares the references themselves, not the content of the objects. If the references
        // are the same, the code block inside the if statement will be executed.
        if(object == object2) {
            System.out.println("==");
        }

        // if statement uses the equals() method to check for object equality.
        // The equals() method is a method inherited from the Object class,
        // and it is intended to be overridden by classes to provide custom equality logic.
        if(object.equals(object2)) {
            System.out.println("equals()");
        }

        // getClass() in Java is a method of the Object class present in java.lang package.
        // getClass() returns the runtime class of the object. This returned class object
        // is locked by static synchronized method of the represented class.
        System.out.println(object.getClass());

        // getName() returns the name of the entity (class, interface, arrayList class, primitive type, or void)
        // represented by this Class object, as a String.
        System.out.println(object.getClass().getName());

        /*
         instanceof  :
         The java instanceof operator is used to test whether the object
         is an instance of the specified type (class or subclass or interface).
         Condition 'object2 instanceof ObjectClass' is always 'true'
         System.out.println(object2 instanceof ObjectClass);
        */

    }
}

