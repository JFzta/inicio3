/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inicio3;

/**
 *
 * @author juanz
 */
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import java.io.FileNotFoundException;
import com.itextpdf.layout.element.Paragraph;


public class Inicio3 {

  public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\juanz\\OneDrive\\Escritorio\\inicio3\\inicio3\\src\\main\\java\\resources\\first.pdf";
        String paraText = """
                          STRATTON OAKMONT INC.
                          6R9C+R4, Guatape, Guatap\u00e9, Antioquia
                          Tel: 696969690
                          E-MAIL: strattoncorporation@oakmont.com""";
        
        Paragraph paragraph1 = new Paragraph(paraText);

        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

      try (Document document = new Document(pdfDocument)) {
          document.add(paragraph1);
      }

        System.out.println("hola mundo");
    }

}
