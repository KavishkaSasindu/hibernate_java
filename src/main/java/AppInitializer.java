import org.hibernate.Session;
import org.hibernate.Transaction;

class AppInitializer {
    public static void main(String[] args) {
        CustomerEntity customerEntity = new CustomerEntity("c-205","Kavishka","user@gmail.com","backer-street",25000);
        saveCustomer(customerEntity);
    }

//    save customer
    private static boolean saveCustomer(CustomerEntity c){

        try{
            Session session = HibernateUtil.getSession();
            Transaction tx = session.beginTransaction();
            session.save(c);
            tx.commit();
        }catch(Exception e){
            System.out.println(e.getMessage() );
        }

        return true;
    }
}