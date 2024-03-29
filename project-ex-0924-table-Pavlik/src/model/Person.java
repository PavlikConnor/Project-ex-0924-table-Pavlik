package model;

public class Person {
   private String firstName;
   private String lastName;
   private String phone;
   private String email;

   public Person() {
   }

   public Person(String firstName, String lastName, String phone, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.phone = phone;
      this.email = email;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getPhone() {
      return phone;
   }

   public String getLastName() {
      return lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return firstName + " " + lastName;
   }
}
