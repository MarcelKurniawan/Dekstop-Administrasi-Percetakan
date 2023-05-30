package model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.DetailPemesanan;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-01-13T02:42:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Produksi.class)
public class Produksi_ { 

    public static volatile SingularAttribute<Produksi, Date> tanggalProduksi;
    public static volatile SingularAttribute<Produksi, DetailPemesanan> idProdukPesanan;
    public static volatile SingularAttribute<Produksi, String> idProduksi;

}