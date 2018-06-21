public class Client extends Person {

    static int counter = 0;
    boolean isRegular;
    int id;

    //default constructor
    public Client (){

    }

    public Client (int age, boolean _isRegular, String _email, String _name, String _surname, String _phone){
        this.age = age;
        isRegular = _isRegular;
        email = _email;
        name = _name;
        surname = _surname;
        phone = _phone;
        id = counter++;
    }

    public int getDiscount (){
        int result=0;
        if (age <18){
            result +=20;
        } else if (age>70){
            result +=15;
        }
        if (isRegular){
            result+=5;
        }
        return result;
    }
}
