/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.inicio3;

/**
 *
 * @author juanz
 */
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import java.io.FileNotFoundException;
import com.itextpdf.layout.element.Paragraph;
import java.net.MalformedURLException;

public class Inicio3 {

    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        String imgSrc = "C:\\Users\\juanz\\OneDrive\\Escritorio\\inicio3\\inicio3\\src\\main\\java\\images\\logopdf2.jpg";
        ImageData data = ImageDataFactory.create(imgSrc);
        Image image1 = new Image(data);

        image1.scaleToFit(100, 100);

        String path = "C:\\Users\\juanz\\OneDrive\\Escritorio\\inicio3\\inicio3\\src\\main\\java\\resources\\first.pdf";
        String paraText = """
                          STRATTON OAKMONT INC.
                          6R9C+R4, Guatape, Guatap\u00e9, Antioquia
                          Tel: 696969690
                          E-MAIL: strattoncorporation@oakmont.com
                          
                          
                          
                          
                          
                          Cliente: nameSpace 
                          Id cliente : idSpace
                          Telefono : telSpace
                          correo : emailSpace""";// cambiar los espacios por referencias a datos que vamos a obtener en otro form.

        String paraText2 = """
                           N\u00b0 Factura 7896521478962
                           Fecha: 08/04/2024""";

        String paraText3 ="""
                         \u201cEL UNIVERSO TE ESPERA\u201d
                         facebook: STRATTON OAKMONT INC
                         Instagram: @STRATTONOAKMONTINC
                         X: @STRATTONOAKMONT""";
        
        
        Paragraph paragraph1 = new Paragraph(paraText);
        Paragraph paragraph2 = new Paragraph(paraText2);
        Paragraph paragraph3 = new Paragraph(paraText3);
        
        
        PdfWriter pdfWriter = new PdfWriter(path);    // indicamos la ruta al escritor
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage(); // añadimos una nueva pagina

        Document document = new Document(pdfDocument);

        document.setMargins(50, 20, 20, 120);// definimos unas margenes

        
        // modificamos los elementos antes de añadirlos
        
        paragraph2.setFixedPosition(1, 400, 730, 140);// ojo el numero de pagina no empieza en 0 como los vectores xd
        image1.setFixedPosition(20, 700); // melo
        paragraph3.setFixedPosition(120, 60, 300);//melo
        
        // añadimos los elementos
        document.add(paragraph1);
        
        document.add(paragraph2);
        
        document.add(paragraph3);
        
        document.add(image1);

        document.close();

        System.out.println("pdf creado");

        System.out.println("hola mundo");
    }

}
