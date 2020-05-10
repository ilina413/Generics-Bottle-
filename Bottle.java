public class Bottle<T extends Drink> {
    // TODO: Implement the Bottle class as shown in the UML model

    private T content; //content T of the bottle


    //The methods fill(…) and empty() of the class Bottle must throw an IllegalStateException
    // if called at a point where the Bottle object is in an invalid state to perform the respective operation.

    public boolean isEmpty() {
        return content == null;
    }

    public void fill(T drink) {

        if (content != null) {
            throw new IllegalStateException();
        }
        content = drink;
    }

    public T empty() {
        if (content == null )
            throw new IllegalStateException();

            T test = content;
            content = null;
            return  test;

    }

}
