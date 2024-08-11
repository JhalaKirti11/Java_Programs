// Customer class with parameterized constructor:

import java.io.Serializable;

class Customer implements Serializable{
    private String name;
    private int id;
    private int phoneNo;
    String address;

    public Customer(String name, int id, int phoneNo, String address){
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.address = address;
    }
  
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
  
        public void setId(int id){
            this.id = id;
        }
        public int getId(){
            return this.id;
        }
  
        public void setPhoneNo(int phoneNo){
            this.phoneNo = phoneNo;
        }
        public int getPhoneNo(){
            return this.phoneNo;
        }
  
        public void setAddress(String address){
            this.address = address;
        }
        public String getAddress(){
            return this.address;
        }
    }
