package hotel;

/**
 * Created by deniz on 24.02.2018.
 */
public class Person {
    /**
     * Person name
     */
    private String name = new String();
    /**
     * Person Surname
     */
    private String surname = new String();
    /**
     * Person ID
     */
    private String ID = new String();

    /**
     * Person default Constructor
     */
    public Person(){}

    /**
     * Person Three Constructor
     * @param name
     * @param surname
     * @param ID
     */
    public Person(String name, String surname, String ID){
        setName(name);
        setSurname(surname);
        setID(ID);
    }


    /**
     * Get ID
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     * Set ID
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set Name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Surname
     * @return
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Set surname
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Person equals
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        Person person = (Guest) obj;

        if (person.getName().equals(this.getName()) &&
                person.getSurname().equals(this.getSurname()) &&
                person.getID().equals(this.getID()))
        {
            return  true;
        }
        return false;
    }

    /**
     * Person toString
     * @return
     */
    @Override
    public String toString() {
        return "\nID: "+getID() +"\nName: "+name+"\nSurname"+surname+"\n";
    }
}
