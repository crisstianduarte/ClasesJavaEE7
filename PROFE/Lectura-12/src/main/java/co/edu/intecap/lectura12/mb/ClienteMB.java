/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura12.mb;

import co.edu.intecap.lectura12.ejb.UsuarioEJBLocal;
import co.edu.intecap.lectura12.jpa.Cliente;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;

/**
 *
 * @author Cesar
 */
@Named(value = "clienteMB")
@RequestScoped
public class ClienteMB {

    @EJB
    private UsuarioEJBLocal usuarioEJB;

    private Cliente cliente;

    private List<Cliente> clientes;
    
    @Resource
    private DataSource dataSource;

    /**
     * Creates a new instance of ClienteMB
     */
    public ClienteMB() {
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        clientes = usuarioEJB.listarClientes();
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void crearCliente(ActionEvent evt) {
        usuarioEJB.nuevoCliente(cliente);
        cliente = new Cliente();
    }

    public void pdf(ActionEvent evt){
        ServletOutputStream servletOutputStream = null;
        System.out.println("pdf");
        try {
            Connection conn = dataSource.getConnection();
            JasperPrint jasperPrint = (JasperPrint) JasperFillManager.fillReport("clientes.jasper", new HashMap(), conn);
            HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            httpServletResponse.addHeader("Content-disposition", "attachment; filename=clientes.pdf");
            servletOutputStream = httpServletResponse.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);
            FacesContext.getCurrentInstance().responseComplete();
        } catch (IOException ex) {
            Logger.getLogger(ClienteMB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(ClienteMB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                servletOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(ClienteMB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
