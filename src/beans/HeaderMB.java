package beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.CloseEvent;
import org.primefaces.event.ToggleEvent;

public class HeaderMB {
	
	public void onFechar(CloseEvent event){
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed", "Closed panel id:'" 
					+ event.getComponent().getId() + "'");
        FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
    public void onMinimizar(ToggleEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, event.getComponent().getId() + " toggled", "Status:" 
        		+ event.getVisibility().name());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
