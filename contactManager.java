public class contactManager {
    contact[] myFriends;
    int friendsCount;

    contactManager() {
        this.friendsCount = 0;
        this.myFriends = new contact[500];
    }

    void addContact(contact Co) {
        myFriends[friendsCount] = Co;
        friendsCount++;
    }

    contact searchContact(String searchName) {
        for (int i = 0; i <= friendsCount; i++)
        {
            if(myFriends[i].name.equals(searchName))
            {
                System.out.println("yes");
                System.out.println( myFriends[i]);
                return myFriends[i];
            }
        }
    return null;
    }
}