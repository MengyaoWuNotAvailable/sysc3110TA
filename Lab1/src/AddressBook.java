import java.util.HashMap;

public class AddressBook {

    private HashMap<String, BuddyInfo> addressBook;

    public AddressBook()
    {
        addressBook = new HashMap<>();
    }

    public void addBuddy(String name, BuddyInfo buddy_info)
    {
        this.addressBook.put(name, buddy_info);
    }

    public void remove(String name)
    {
        this.addressBook.remove(name);
    }


    public static void main(String[] args)
    {
        BuddyInfo buddy = new BuddyInfo("Mengyao", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy.getName(), buddy);
        addressBook.remove(buddy.getName());

    }


}
