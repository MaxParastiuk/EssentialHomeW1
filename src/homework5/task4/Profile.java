package homework5.task4;

public class Profile {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String postalCode;
    private int userId;
    private int supportSpecialistId;

   void Profile(String firstName, String lastName, String email,String phoneNumber, String address, String postalCode,
                int userId, int supportSpecialistId){
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.address = address;
       this.postalCode = postalCode;
       this.userId = userId;
       this.supportSpecialistId = supportSpecialistId;
   }

}
