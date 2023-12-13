import java.util.HashMap;
import java.util.Map;


public class AddressBook {
      // UC3: used HashMap for efficient searching by name
    HashMap<String, Contact> addressbook;
  public AddressBook() {
        this.addressbook = new HashMap<String, Contact>();
    }
    // UC1: add new contact function
    public void addContact(String first_name, String last_name, String address, String city, String state, int zip,
            String phone_number, String email) {
        addressbook.add(new Contact(first_name, last_name, address, city, state, zip, phone_number, email));
    }

    public static void printAddressBook(AddressBook book) {
        System.out.println("Contacts in this address book are: ");
        for (int i = 0; i < book.addressbook.size(); i++) {
            System.out.println("(" + (i + 1) + ")");
            book.addressbook.get(i).printContact();
            System.out.println();
        }
    }
}
