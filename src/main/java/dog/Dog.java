package dog;
//Here we have a class that represents a dog. Currently, the only instance variable (or field) is called breed. You can make a new Dog object by passing the breed to the constructor.
//
//Add an instance variable that is a String called name, which represents the dog’s name. Add the instance variable and also include it as the second parameter to the constructor.
//
//You should update the toString and the format should be: “[name] is a [breed]”
//For example:
//
//Bluey is an Australian Cattle Dog
//Test out your Dog class and the new toString method in DogTester.java




import javax.xml.namespace.QName;


public class Dog {
    private String breed;
    // Add an instance variable here for name.
    private String name;  //instance variable represents dogs name




    public Dog(String theBreed, String theName)
    {
        breed = theBreed;  //assigning theBreed parameter to an instance variable
        name = theName;  //assigning theName parameter to an instance variable
    }


    public String toString()
    {
        return name + " is an " + breed;
    }
}
