package interface1;

public interface DefaultInterface {

    public void nonDefaultMethod(); // added in 2016

    public default void newMethod() { // added in 2021, so all the classes implementing this interface will break

    }

}