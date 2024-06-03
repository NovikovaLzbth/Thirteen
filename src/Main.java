import javax.naming.Name;

interface Product{
    void ProductName();
    void ProductPrice();
    void ProductRating();
}
class Chocolate implements Product{
    String Name;
    int Price;
    double Rating;
    Chocolate(String Name, int Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void ProductName() {

        System.out.println(Name);
    }
    @Override
    public void ProductPrice() {

        System.out.println(Price);
    }
    @Override
    public void ProductRating() {

        System.out.println(Rating);
    }
}
class Milk implements Product{
    String Name;
    int Price;
    double Rating;
    Milk(String Name, int Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void ProductName() {

        System.out.println(Name);
    }
    @Override
    public void ProductPrice() {

        System.out.println(Price);
    }
    @Override
    public void ProductRating() {

        System.out.println(Rating);
    }
}
class Potato implements Product{
    String Name;
    int Price;
    double Rating;
    Potato(String Name, int Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void ProductName() {

        System.out.println(Name);
    }
    @Override
    public void ProductPrice() {

        System.out.println(Price);
    }
    @Override
    public void ProductRating() {

        System.out.println(Rating);
    }
}

interface User{
    void Login();
    void Password();
}
class Student implements User {
    String Login;
    String Password;
    Student(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login() {

        System.out.println(Login);
    }
    @Override
    public void Password() {

        System.out.println(Password);
    }
}
class Buyer implements User {
    String Login;
    String Password;
    Buyer(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login() {

        System.out.println(Login);
    }
    @Override
    public void Password() {

        System.out.println(Password);
    }
}
class Seller implements User {
    String Login;
    String Password;
    Seller(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login() {

        System.out.println(Login);
    }
    @Override
    public void Password() {

        System.out.println(Password);
    }
}

class Common implements User, Product {
    String UserName;
    String ProductName;
    int Price;
    double Rating;
    String Login;
    String Password;
    Common(String UserName, String ProductName, int Price, double Rating, String Login, String Password){
        this.UserName = UserName;
        this.ProductName = ProductName;
        this.Price = Price;
        this.Rating = Rating;
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void ProductName() {

        System.out.println(ProductName);
    }
    @Override
    public void ProductPrice() {

        System.out.println(Price);
    }
    @Override
    public void ProductRating() {

        System.out.println(Rating);
    }
    @Override
    public void Login() {

        System.out.println(Login);
    }
    @Override
    public void Password() {

        System.out.println(Password);
    }
    void display(){

        System.out.println(UserName + " купил " + ProductName );
    }
}

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller("Haker", "555");
        Common common = new Common("Евгений", "Круассан", 94, 100, "Perets", "pY111");
        common.display();
        seller.Login();
        seller.Password();
    }
}