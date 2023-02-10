/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.adaptadorDao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controlador.listas.ListaEnlazada;
import controlador.utiles.Utilidades;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import controlador.listas.ListaEnlazada;
import controlador.listas.NodoLista;

/**
 *
 * @author lettc
 * @param <T>
 */
public class AdaptadorDao <T> implements InterfazDao<T> {

    private String URL = "data/JSON" + File.separatorChar;
    private Class<T> clazz;

    public AdaptadorDao(Class<T> clazz) {
        this.clazz = clazz;
        URL += this.clazz.getSimpleName() + ".json";
    }

    @Override
    public void guardar(T dato) throws FileNotFoundException, JAXBException {
        listar().imprimir();
        ListaEnlazada<T> lista = listar();
//        lista.insertar(dato);
        FileOutputStream file = new FileOutputStream(URL);
        JAXBContext jabxc = JAXBContext.newInstance(new Class[]{ListaEnlazada.class, this.clazz});
        Marshaller marshaller = jabxc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(lista, file);
//        ObjectMapper JSON_MAPPER = new ObjectMapper();
//        try {
//            JSON_MAPPER.writeValue(new File(URL2), lista);
//        } catch (Exception e) {
//        }
        try ( PrintWriter out = new PrintWriter(new FileWriter(URL))) {
            Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
            String jsonString = prettyGson.toJson(lista);
            out.write(jsonString);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Override
    public void modificar(T dato, Integer pos) throws FileNotFoundException, JAXBException {
        ListaEnlazada<T> lista = listar();
        lista.modificarPoscicion(dato, pos-1);
        FileOutputStream file = new FileOutputStream(URL);
        JAXBContext jabxc = JAXBContext.newInstance(new Class[]{ListaEnlazada.class, this.clazz});
        Marshaller marshaller = jabxc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(lista, file);
        try ( PrintWriter out = new PrintWriter(new FileWriter(URL))) {
            Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
            String jsonString = prettyGson.toJson(lista);
            out.write(jsonString);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public ListaEnlazada<T> listar() {
        ListaEnlazada<T> lista = new ListaEnlazada<>();
        
        try {
            
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
//            String result = new String(Files.readAllBytes(Paths.get(URL2)));  
//            String xml = Utilidades.convertToXML(result, "root"); 
//            FileWriter file = new FileWriter(xml);
            Document doc = db.parse(URL);
            NodeList datos = doc.getElementsByTagName(this.clazz.getSimpleName().toLowerCase());
            for (int i = 0; i < datos.getLength(); i++) {
                Node n1 = datos.item(i);
                NodeList nodo1 = n1.getChildNodes();
                
                T obj = this.clazz.newInstance();

                for (int j = 0; j < nodo1.getLength(); j++) {
                    Node dato = nodo1.item(j);
                    if (dato.getNodeName() != null && !dato.getNodeName().equalsIgnoreCase("") && dato.getTextContent() != null
                            && !dato.getTextContent().equalsIgnoreCase("") && !dato.getNodeName().equalsIgnoreCase("#text")) {
                        Method metodo = null;
                        for (Method met : this.clazz.getMethods()) {
                            if (met.getName().equalsIgnoreCase(("set" + Utilidades.capitalizar(dato.getNodeName())))) {
                                metodo = met;
                                break;
                            }
                        }
//                        metodo.invoke(obj, Utilidades.transformarDato(Utilidades.obtenerAtributos(clazz, dato.getNodeName()), dato.getTextContent()));
                    }
                }
                lista.insertar(obj, i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    @Override
    public T obtener(Integer id) {
        ListaEnlazada<T> lista = listar();
        try {
            T dato = lista.obtenerDato(id-1);
            return dato;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
