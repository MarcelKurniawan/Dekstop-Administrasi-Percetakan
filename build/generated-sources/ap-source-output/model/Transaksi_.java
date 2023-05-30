package model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Customer;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-01-13T02:42:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Transaksi.class)
public class Transaksi_ { 

    public static volatile SingularAttribute<Transaksi, String> idTransaksi;
    public static volatile SingularAttribute<Transaksi, Date> tanggalTransaksi;
    public static volatile SingularAttribute<Transaksi, Integer> totalHarga;
    public static volatile SingularAttribute<Transaksi, Customer> idCustomer;

}