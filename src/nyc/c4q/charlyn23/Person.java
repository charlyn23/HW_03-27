package nyc.c4q.charlyn23;

/**
 * Created by charlynbuchanan on 3/25/15.
 */
public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //    Write a function called checkSameCity which accepts as
    // input two Person instances and checks if they live in the
    // same city. The function should return a boolean value

    public static boolean checkSameCity(Person p1, Person p2){
        boolean sameCity = true;
        //Set parameters one at a time, bc the Person class is set up that way


        if (p1.getCity().equals(p2.getCity())){
            return true;
        } else {
            return false;
        }
    }


    //    A Person has recently had a child, whose name is 'Abc'.
    // Write a function called registerChild which accepts as input a
    // Person instance(Parent) and returns a new Person instance for the
    // child, which has the same phoneNumber and city as the parent.
    public static Person registerChild(Person parent){
        Person baby = new Person("Abc");
        baby.setCity(parent.getCity());
        baby.setPhoneNumber(parent.getPhoneNumber());
        String num = parent.getPhoneNumber();

        return baby;

    }

    public String toString(){
        return "Person with name: " + this.name + ". They are from " + this.getCity()+ " The phone number \n" +
                "is  " + this.getPhoneNumber() + ".";
    }

    public static void main (String [] args) {
        Person parent;
        parent = new Person();
        parent.setName("dad");
        parent.setCity("Brooklyn");
        parent.setPhoneNumber("7181234567");
        Person baby = registerChild(parent);

        System.out.println(baby);


        Person joe = new Person();
        joe.setName("Joe");
        joe.setCity("Brooklyn");
        joe.setPhoneNumber("7181234567");

        Person mary = new Person();
        mary.setName("Mary");
        mary.setCity("New York");
        mary.setPhoneNumber("2121234567");
        System.out.println(joe);
        System.out.println(mary);

        //Person.checkSameCity("joe", "mary");
        System.out.println(Person.checkSameCity(joe, mary));

    }

}
