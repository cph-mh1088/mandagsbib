package Entitet;

public class Author {

    private int idAuthor;
    private String firstName;
    private String lastName;

    public Author(int idAuthor, String firstName, String lastName) {
        this.idAuthor = idAuthor;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Forfatter{" +
                "idAuthor=" + idAuthor +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
