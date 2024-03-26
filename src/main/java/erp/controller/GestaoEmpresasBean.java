package erp.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import erp.model.Empresa;
import erp.model.TipoEmpresa;

@ManagedBean
public class GestaoEmpresasBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Empresa empresa = new Empresa();
	
	public void salvar() {
		System.out.println(empresa.getRazaoSocial());
	}
	
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public TipoEmpresa[] getTiposEmpresa() {
		return TipoEmpresa.values();
	}
	
	
}
