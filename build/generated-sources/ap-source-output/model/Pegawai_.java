package model;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pemesanan;
import model.Role;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-01-13T02:42:40", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Pegawai.class)
public class Pegawai_ { 

    public static volatile SingularAttribute<Pegawai, Date> tanggalMasuk;
    public static volatile SingularAttribute<Pegawai, Date> tglLahir;
    public static volatile SingularAttribute<Pegawai, String> statusPegawai;
    public static volatile ListAttribute<Pegawai, Pemesanan> pemesananList;
    public static volatile SingularAttribute<Pegawai, Role> roleId;
    public static volatile SingularAttribute<Pegawai, String> agama;
    public static volatile SingularAttribute<Pegawai, String> idPegawai;
    public static volatile SingularAttribute<Pegawai, String> tempatLahir;
    public static volatile SingularAttribute<Pegawai, String> telpPegawai;
    public static volatile SingularAttribute<Pegawai, String> alamatPegawai;
    public static volatile SingularAttribute<Pegawai, String> namaPegawai;
    public static volatile SingularAttribute<Pegawai, String> dataJenisKelamin;

}