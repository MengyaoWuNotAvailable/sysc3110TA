public class BuddyInfo {

    public String getName() {
        return this.name;
    }

    public BuddyInfo(String name, String address, String phone_num) {
        this.address = address;
        this.name = name;
        this.phone_num = phone_num;
    }

    private String name;
    private String address;
    private String phone_num;
/*
    public static void main(String[] args) {
        String homer = "Homer";
        BuddyInfo buddyinfo = new BuddyInfo(homer);
        String name = buddyinfo.getName();
        System.out.println("Hello " + name +"!");
    }

*/
}
