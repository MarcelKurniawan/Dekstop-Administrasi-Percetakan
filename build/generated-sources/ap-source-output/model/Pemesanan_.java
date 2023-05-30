package model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Customer;
import model.DetailPemesanan;
import model.Pegawai;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-01-13T02:42:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Pemesanan.class)
public class Pemesanan_ { 

    public static volatile SingularAttribute<Pemesanan, Pegawai> idPegawai;
    public static volatile SingularAttribute<Pemesanan, String> statusPemesanan;
    public static volatile SingularAttribute<Pemesanan, String> idPemesanan;
    public static volatile ListAttribute<Pemesanan, DetailPemesanan> detailPemesananList;
    public static volatile SingularAttribute<Pemesanan, Date> tanggalPemesanan;
    public static volatile SingularAttribute<Pemesanan, Customer> idCustomer;

}