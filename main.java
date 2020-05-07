public class main {
    public static void main(String[]args){

      //  System.out.println("hello world *-*");
    contactManager contactmanager =new contactManager();
    // ana 3amlt wa7ed we sameto james
    contact james = new contact();
    //a7t ma3lomat james
    james.name="james";
    james.email="james@emaill.com";
    james.phoneNO="0123456";
    //7ankrr akter men wa7ed
    contact lele = new contact();
     lele.name="lele";
     lele.email="lele@emaill.com";
     lele.phoneNO="0333456";
     //we can make it take from the user
     //no7et fe el data
     contactmanager.addContact(james);
     contactmanager.addContact(lele);
   // contact result =
            contactmanager.searchContact("james");
    // System.out.println("hi "+result);

    }
}
