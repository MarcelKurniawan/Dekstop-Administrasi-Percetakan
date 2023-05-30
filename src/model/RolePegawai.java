/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author MSI
 */
@Entity
@Table(name = "role_pegawai")
@NamedQueries({
    @NamedQuery(name = "RolePegawai.findAll", query = "SELECT r FROM RolePegawai r"),
    @NamedQuery(name = "RolePegawai.findByIdPegawai", query = "SELECT r FROM RolePegawai r WHERE r.idPegawai = :idPegawai"),
    @NamedQuery(name = "RolePegawai.findByRoleId", query = "SELECT r FROM RolePegawai r WHERE r.roleId = :roleId"),
    @NamedQuery(name = "RolePegawai.findByNamaPegawai", query = "SELECT r FROM RolePegawai r WHERE r.namaPegawai = :namaPegawai"),
    @NamedQuery(name = "RolePegawai.findByTglLahir", query = "SELECT r FROM RolePegawai r WHERE r.tglLahir = :tglLahir"),
    @NamedQuery(name = "RolePegawai.findByTempatLahir", query = "SELECT r FROM RolePegawai r WHERE r.tempatLahir = :tempatLahir"),
    @NamedQuery(name = "RolePegawai.findByTelpPegawai", query = "SELECT r FROM RolePegawai r WHERE r.telpPegawai = :telpPegawai"),
    @NamedQuery(name = "RolePegawai.findByAlamatPegawai", query = "SELECT r FROM RolePegawai r WHERE r.alamatPegawai = :alamatPegawai"),
    @NamedQuery(name = "RolePegawai.findByTanggalMasuk", query = "SELECT r FROM RolePegawai r WHERE r.tanggalMasuk = :tanggalMasuk"),
    @NamedQuery(name = "RolePegawai.findByStatusPegawai", query = "SELECT r FROM RolePegawai r WHERE r.statusPegawai = :statusPegawai"),
    @NamedQuery(name = "RolePegawai.findByAgama", query = "SELECT r FROM RolePegawai r WHERE r.agama = :agama"),
    @NamedQuery(name = "RolePegawai.findByDataJenisKelamin", query = "SELECT r FROM RolePegawai r WHERE r.dataJenisKelamin = :dataJenisKelamin")})
public class RolePegawai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id_pegawai")
    private String idPegawai;
    @Column(name = "role_id")
    private String roleId;
    @Column(name = "nama_pegawai")
    private String namaPegawai;
    @Column(name = "tgl_lahir")
    @Temporal(TemporalType.DATE)
    private Date tglLahir;
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    @Column(name = "telp_pegawai")
    private String telpPegawai;
    @Column(name = "alamat_pegawai")
    private String alamatPegawai;
    @Column(name = "tanggal_masuk")
    @Temporal(TemporalType.DATE)
    private Date tanggalMasuk;
    @Column(name = "status_pegawai")
    private String statusPegawai;
    @Column(name = "agama")
    private String agama;
    @Column(name = "data_jenis_kelamin")
    private String dataJenisKelamin;

    public RolePegawai() {
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTelpPegawai() {
        return telpPegawai;
    }

    public void setTelpPegawai(String telpPegawai) {
        this.telpPegawai = telpPegawai;
    }

    public String getAlamatPegawai() {
        return alamatPegawai;
    }

    public void setAlamatPegawai(String alamatPegawai) {
        this.alamatPegawai = alamatPegawai;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getStatusPegawai() {
        return statusPegawai;
    }

    public void setStatusPegawai(String statusPegawai) {
        this.statusPegawai = statusPegawai;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getDataJenisKelamin() {
        return dataJenisKelamin;
    }

    public void setDataJenisKelamin(String dataJenisKelamin) {
        this.dataJenisKelamin = dataJenisKelamin;
    }
    
}
