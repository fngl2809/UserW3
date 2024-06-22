class User {
            String username;
            String password;
            String phoneNumber;
            String email;
            Boolean admin = false;
            final String country = "Indonesia";
        
        
            void userMe() throws Exception {
                System.out.println("My username is "+this.username+
                "password"+this.password+
                "phoneNumber "+ this.phoneNumber+
                "email "+ this.email+
                (admin? " is_admin ": "")+
                "country "+ this.country
                );
            }
        
            void login(String username, String password) {
                if (this.username == username && this.password == password) {
                    System.out.println("Succes login with username "+ username);
                }else {
                    System.out.println("Failed login with username "+ username);
                }
             }
        
        
            User(String username, String password, String phoneNumber, Boolean admin){
                this.username = username;
                this.password =password;
                this.phoneNumber = phoneNumber;
                this.admin = admin;
            }
        
            User(String username, String password, Boolean admin){
                this(username, password,null,admin);
            }

            User(String username, Boolean admin){
                this(username, null,false);
            }
            User(String username){
                this(username,null);
            }  
            User(){
                this(null);
            }
        }
             
        
    

