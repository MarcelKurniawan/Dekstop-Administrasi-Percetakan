package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pemesanan;
import model.Produksi;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-01-13T02:42:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(DetailPemesanan.class)
public class DetailPemesanan_ { 

    public static volatile ListAttribute<DetailPemesanan, Produksi> produksiList;
    public static volatile SingularAttribute<DetailPemesanan, Integer> jumlahPemesananProduk;
    public static volatile SingularAttribute<DetailPemesanan, String> idProdukPesanan;
    public static volatile SingularAttribute<DetailPemesanan, Pemesanan> idPemesanan;

}