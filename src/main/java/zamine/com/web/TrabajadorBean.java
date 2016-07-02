package zamine.com.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;

import org.primefaces.component.tabview.TabView;
import org.primefaces.event.CaptureEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.UploadedFile;

import zamine.com.domain.Trabajador;
import zamine.com.domain.Usuario;
import zamine.com.servicio.TrabajadorService;

@ManagedBean
@ViewScoped
public class TrabajadorBean {

	@EJB
	private TrabajadorService trabajadorService;
	List<Trabajador> trabajadores;

	@ManagedProperty(value = "#{trabajador}")
	private Trabajador trabajador;

	Trabajador SeleccionTrabajador;

	private UploadedFile file;
	
	boolean flagTab2 = false;

	public TrabajadorBean() {

	}

	@PostConstruct
	public void inicializar() {
		trabajadores = trabajadorService.listarTrabajador();

		trabajador = new Trabajador();

		SeleccionTrabajador = new Trabajador();

	}

	private String filename;
	private boolean flag = false;

	public void eliminarTrabajador(Trabajador trabajador) {

		trabajadorService.eliminarTrabajador(trabajador);

	}

	private String getRandomImageName() {
		int i = (int) (Math.random() * 10000000);

		return String.valueOf(i);
	}

	public String getFilename() {
		return filename;
	}

	public void habilitarCamara() {

		this.flag = !flag;

		System.out.println("habilitarCamara " + flag);

	}

	public void editListener(RowEditEvent event) {
		Trabajador trabajador = (Trabajador) event.getObject();
		trabajadorService.modificarTrabajador(trabajador);
	}

	public void oncapture(CaptureEvent captureEvent) {
		filename = getRandomImageName();
		byte[] data = captureEvent.getData();

		filename = filename + ".jpg";

		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		String newFileName = externalContext.getRealPath("") + File.separator + "resources" + File.separator + "images"
				+ File.separator + "photocam" + File.separator + filename;
		
		System.out.println("1.- newFileName > "+newFileName);

		FileImageOutputStream imageOutput;
		try {
			imageOutput = new FileImageOutputStream(new File(newFileName));
			imageOutput.write(data, 0, data.length);
			imageOutput.close();
		} catch (IOException e) {
			throw new FacesException("Error in writing captured image.", e);
		}
	}

	public void upload(FileUploadEvent event) throws IOException {
		FacesMessage message = new FacesMessage("Exito!", event.getFile().getFileName() + " fue cargado.");
		FacesContext.getCurrentInstance().addMessage(null, message);

		if (message != null) {

			String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
			/*
			 * SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
			 * String name = fmt.format(new Date()) +
			 * event.getFile().getFileName().substring(
			 * event.getFile().getFileName().lastIndexOf('.'));
			 * 
			 */

			filename = event.getFile().getFileName();

			File fie = new File(path + "resources/images/photocam/" + filename);

			InputStream is = event.getFile().getInputstream();
			OutputStream out = new FileOutputStream(fie);
			byte buf[] = new byte[1024];
			int len;
			while ((len = is.read(buf)) > 0)
				out.write(buf, 0, len);
			is.close();
			out.close();

			//String newFileName = path + "resources/images/photocam/" + filename;
			
			System.out.println("2.- newFileName > "+filename);
			
			/*InputStream is = event.getFile().getInputstream();
			byte buf[] = new byte[1024];
			int len = is.read(buf);

			FileImageOutputStream imageOutput;
			try {
				imageOutput = new FileImageOutputStream(new File(newFileName));
				imageOutput.write(buf, 0, len);
				imageOutput.close();
			} catch (IOException e) {
				throw new FacesException("Error in writing captured image.", e);
			}*/
		}

	}

	public final void onTabChange(TabChangeEvent event) {
	    //TabView tv = (TabView) event.getComponent();
		
		if(!flagTab2)
			flagTab2=true;
		
		
	    System.out.println("Index tab > " + event.getTab().getId());
	    
	    
	}
	
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public List<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public Trabajador getSeleccionTrabajador() {
		return SeleccionTrabajador;
	}

	public void setSeleccionTrabajador(Trabajador seleccionTrabajador) {
		SeleccionTrabajador = seleccionTrabajador;
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public boolean isFlagTab2() {
		return flagTab2;
	}

	public void setFlagTab2(boolean flagTab2) {
		this.flagTab2 = flagTab2;
	}

	
	
}