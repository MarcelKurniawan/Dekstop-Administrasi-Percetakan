package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pemesanan;
import model.Transaksi;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-01-13T02:42:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile ListAttribute<Customer, Transaksi> transaksiList;
    public static volatile ListAttribute<Customer, Pemesanan> pemesananList;
    public static volatile SingularAttribute<Customer, String> jenisKelamin;
    public static volatile SingularAttribute<Customer, String> namaCustomer;
    public static volatile SingularAttribute<Customer, String> noTelp;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, String> idCustomer;
    public static volatile SingularAttribute<Customer, String> alamat;

}