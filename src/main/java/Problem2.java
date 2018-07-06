import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem2 {
    static ArrayList<Customer> customers;
    static ArrayList<Transaction> transactions = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.println("id;email;phone;card");
        while ((input = in.readLine()) != null){
            String[] data = input.split(";");
            transactions.add(new Transaction(Integer.parseInt(data[0]), data[1], data[2], data[3]));

            findCustomer();

            for(int i =0; i<customers.size(); i++){
                System.out.println("Customer : "+(i+1));
                System.out.println("transaction id :"+ customers.get(i).idTransaction);
                System.out.println("emails :"+ customers.get(i).emails);
                System.out.println("phones :"+ customers.get(i).phones);
                System.out.println("cards :"+ customers.get(i).cards);
            }
        }
    }

    public static void findCustomer(){
        customers = new ArrayList<>();

        for(Transaction trans : transactions){
            if(customers.isEmpty()){
                customers.add(new Customer(trans.id , trans.email, trans.phones, trans.cards));
            }
            else{
                for(Customer cust : customers){
                    if(cust.emails.contains(trans.email)){
                        cust.idTransaction.add(trans.id);
                        cust.emails.add(trans.email);
                        cust.phones.add(trans.phones);
                        cust.cards.add(trans.cards);
                    }
                    else{
                        customers.add(new Customer(trans.id , trans.email, trans.phones, trans.cards));
                    }
                }
            }
        }
    }
}

class Customer{
    ArrayList<Integer> idTransaction;
    ArrayList<String> emails;
    ArrayList<String> phones;
    ArrayList<String> cards;

    public Customer(int idTransaction, String emails, String phones, String cards) {
        this.idTransaction = new ArrayList<>();
        this.emails = new ArrayList<>();
        this.phones = new ArrayList<>();
        this.cards = new ArrayList<>();

        this.idTransaction.add(idTransaction);
        this.emails.add(emails);
        this.phones.add(phones);
        this.cards.add(cards);
    }
}

class Transaction{
    int id;
    String email;
    String phones;
    String cards;

    public Transaction(int id, String email, String phones, String cards) {
        this.id = id;
        this.email = email;
        this.phones = phones;
        this.cards = cards;
    }
}
