package com.gsk.sivac.ws.sivacws;

import javax.jws.WebService;

import com.gsk.sivac.ws.Almacen;
import com.gsk.sivac.ws.Direccion;
import com.gsk.sivac.ws.ObtenerAlmacenesResponse.Almacenes;
import com.gsk.sivac.ws.SivacException_Exception;
import com.gsk.sivac.ws.SivacWebService;
import com.gsk.sivac.ws.ViaContacto;

@WebService(targetNamespace = "http://ws.sivac.gsk.com/",
portName="SivacWebServicePort",
serviceName="SivacWebService",
endpointInterface = "com.gsk.sivac.ws.SivacWebService")
public class SivacWebServiceImpl implements SivacWebService{

	@Override
	public Almacenes obtenerAlmacenes() throws SivacException_Exception {
		Almacenes almacenes = new Almacenes();
		
		ViaContacto via1 = new ViaContacto();
		via1.setTipoViaContacto(1L);
		via1.setViaContacto("647 873 064");
		
		Almacen.ViasContacto viasContacto1 = new Almacen.ViasContacto();
		viasContacto1.getViaContacto().add(via1);
		
		Direccion dir1 = new Direccion();
		dir1.setVia("GRAN CANARIA (DE)");
		dir1.setViaNumero("30");
		dir1.setViaComplementaria("");
		dir1.setCodigoPostal(35100L);
		dir1.setObservaciones("");
		dir1.setTipoVia(5L);
		dir1.setTipoDireccion(2L);
		dir1.setUnidadTerritorial("350192");
		dir1.setTipoUnidadTerritorial(2L);

		Almacen.Direcciones direcciones1 = new Almacen.Direcciones();
		direcciones1.getDireccion().add(dir1);
		
		Almacen almacen1 = new Almacen();
		almacen1.setCodigo("0535002943");
		almacen1.setTipoAlmacen(1L);
		almacen1.setEsPtoVac(true);
		almacen1.setCaracter(1L);
		almacen1.setTipoAlmacenPtoVacunacion(46L);
		almacen1.setNombre("CLINIKA BEACH");
		almacen1.setCif(null);
		almacen1.setObservaciones(null);
		almacen1.setActivo(true);
		almacen1.setViasContacto(viasContacto1);
		almacen1.setDirecciones(direcciones1);
		
		almacenes.getAlmacen().add(almacen1);
		
		return almacenes;
	}

}
