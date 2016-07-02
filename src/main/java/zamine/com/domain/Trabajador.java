package zamine.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the trabajador database table.
 * 
 */
@Entity
@NamedQuery(name="Trabajador.findAll", query="SELECT t FROM Trabajador t")
public class Trabajador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTrabajador;

	private byte activo;

	private String apellidoMaterno;

	private String apellidoPaterno;

	private String archivoAntecedentesPersonales;

	private String archivoCurriculum;

	private String archivoDNI;

	private String archivoExamenPreocupacional;

	private String archivoFichaDeEmpleo;

	private String archivoFoto;

	private String archivoRequerimientoPersonal;

	private String celular1;

	private String celular2;

	private String codigo;

	private String comentarioExamenPreocupacional;

	private String correoCorporativo;

	private String correoPersonal;

	private String direccionNacimiento;

	private String estadoCivil;

	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;

	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	private String fotocheck;

	private String grupoSanguineo;

	private int idUsuario;

	private String nombres;

	private String numeroDocIdentidad;

	private String numeroLicenciaConducir;

	private String observacionesExamenPreocupacional;

	private String sexo;

	private String telefono;

	private String tipoLicenciaConducir;

	//bi-directional many-to-one association to Experiencialaboral
	@OneToMany(mappedBy="trabajador")
	private List<Experiencialaboral> experiencialaborals;

	//bi-directional many-to-one association to Informacionacademica
	@OneToMany(mappedBy="trabajador")
	private List<Informacionacademica> informacionacademicas;

	//bi-directional many-to-one association to Distrito
	@ManyToOne
	@JoinColumn(name="IdDistritoNacimiento")
	private Distrito distrito;

	//bi-directional many-to-one association to Documentoidentidad
	@ManyToOne
	@JoinColumn(name="idTipoDocIdentidad")
	private Documentoidentidad documentoidentidad;

	//bi-directional many-to-one association to Tipovia
	@ManyToOne
	@JoinColumn(name="IdTipoViaNacimiento")
	private Tipovia tipovia;

	//bi-directional many-to-one association to Tipozona
	@ManyToOne
	@JoinColumn(name="IdTipoZonaNacimiento")
	private Tipozona tipozona;

	public Trabajador() {
	}

	public int getIdTrabajador() {
		return this.idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public byte getActivo() {
		return this.activo;
	}

	public void setActivo(byte activo) {
		this.activo = activo;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getArchivoAntecedentesPersonales() {
		return this.archivoAntecedentesPersonales;
	}

	public void setArchivoAntecedentesPersonales(String archivoAntecedentesPersonales) {
		this.archivoAntecedentesPersonales = archivoAntecedentesPersonales;
	}

	public String getArchivoCurriculum() {
		return this.archivoCurriculum;
	}

	public void setArchivoCurriculum(String archivoCurriculum) {
		this.archivoCurriculum = archivoCurriculum;
	}

	public String getArchivoDNI() {
		return this.archivoDNI;
	}

	public void setArchivoDNI(String archivoDNI) {
		this.archivoDNI = archivoDNI;
	}

	public String getArchivoExamenPreocupacional() {
		return this.archivoExamenPreocupacional;
	}

	public void setArchivoExamenPreocupacional(String archivoExamenPreocupacional) {
		this.archivoExamenPreocupacional = archivoExamenPreocupacional;
	}

	public String getArchivoFichaDeEmpleo() {
		return this.archivoFichaDeEmpleo;
	}

	public void setArchivoFichaDeEmpleo(String archivoFichaDeEmpleo) {
		this.archivoFichaDeEmpleo = archivoFichaDeEmpleo;
	}

	public String getArchivoFoto() {
		return this.archivoFoto;
	}

	public void setArchivoFoto(String archivoFoto) {
		this.archivoFoto = archivoFoto;
	}

	public String getArchivoRequerimientoPersonal() {
		return this.archivoRequerimientoPersonal;
	}

	public void setArchivoRequerimientoPersonal(String archivoRequerimientoPersonal) {
		this.archivoRequerimientoPersonal = archivoRequerimientoPersonal;
	}

	public String getCelular1() {
		return this.celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getCelular2() {
		return this.celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getComentarioExamenPreocupacional() {
		return this.comentarioExamenPreocupacional;
	}

	public void setComentarioExamenPreocupacional(String comentarioExamenPreocupacional) {
		this.comentarioExamenPreocupacional = comentarioExamenPreocupacional;
	}

	public String getCorreoCorporativo() {
		return this.correoCorporativo;
	}

	public void setCorreoCorporativo(String correoCorporativo) {
		this.correoCorporativo = correoCorporativo;
	}

	public String getCorreoPersonal() {
		return this.correoPersonal;
	}

	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}

	public String getDireccionNacimiento() {
		return this.direccionNacimiento;
	}

	public void setDireccionNacimiento(String direccionNacimiento) {
		this.direccionNacimiento = direccionNacimiento;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFotocheck() {
		return this.fotocheck;
	}

	public void setFotocheck(String fotocheck) {
		this.fotocheck = fotocheck;
	}

	public String getGrupoSanguineo() {
		return this.grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getNumeroDocIdentidad() {
		return this.numeroDocIdentidad;
	}

	public void setNumeroDocIdentidad(String numeroDocIdentidad) {
		this.numeroDocIdentidad = numeroDocIdentidad;
	}

	public String getNumeroLicenciaConducir() {
		return this.numeroLicenciaConducir;
	}

	public void setNumeroLicenciaConducir(String numeroLicenciaConducir) {
		this.numeroLicenciaConducir = numeroLicenciaConducir;
	}

	public String getObservacionesExamenPreocupacional() {
		return this.observacionesExamenPreocupacional;
	}

	public void setObservacionesExamenPreocupacional(String observacionesExamenPreocupacional) {
		this.observacionesExamenPreocupacional = observacionesExamenPreocupacional;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoLicenciaConducir() {
		return this.tipoLicenciaConducir;
	}

	public void setTipoLicenciaConducir(String tipoLicenciaConducir) {
		this.tipoLicenciaConducir = tipoLicenciaConducir;
	}

	public List<Experiencialaboral> getExperiencialaborals() {
		return this.experiencialaborals;
	}

	public void setExperiencialaborals(List<Experiencialaboral> experiencialaborals) {
		this.experiencialaborals = experiencialaborals;
	}

	public Experiencialaboral addExperiencialaboral(Experiencialaboral experiencialaboral) {
		getExperiencialaborals().add(experiencialaboral);
		experiencialaboral.setTrabajador(this);

		return experiencialaboral;
	}

	public Experiencialaboral removeExperiencialaboral(Experiencialaboral experiencialaboral) {
		getExperiencialaborals().remove(experiencialaboral);
		experiencialaboral.setTrabajador(null);

		return experiencialaboral;
	}

	public List<Informacionacademica> getInformacionacademicas() {
		return this.informacionacademicas;
	}

	public void setInformacionacademicas(List<Informacionacademica> informacionacademicas) {
		this.informacionacademicas = informacionacademicas;
	}

	public Informacionacademica addInformacionacademica(Informacionacademica informacionacademica) {
		getInformacionacademicas().add(informacionacademica);
		informacionacademica.setTrabajador(this);

		return informacionacademica;
	}

	public Informacionacademica removeInformacionacademica(Informacionacademica informacionacademica) {
		getInformacionacademicas().remove(informacionacademica);
		informacionacademica.setTrabajador(null);

		return informacionacademica;
	}

	public Distrito getDistrito() {
		return this.distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Documentoidentidad getDocumentoidentidad() {
		return this.documentoidentidad;
	}

	public void setDocumentoidentidad(Documentoidentidad documentoidentidad) {
		this.documentoidentidad = documentoidentidad;
	}

	public Tipovia getTipovia() {
		return this.tipovia;
	}

	public void setTipovia(Tipovia tipovia) {
		this.tipovia = tipovia;
	}

	public Tipozona getTipozona() {
		return this.tipozona;
	}

	public void setTipozona(Tipozona tipozona) {
		this.tipozona = tipozona;
	}

}