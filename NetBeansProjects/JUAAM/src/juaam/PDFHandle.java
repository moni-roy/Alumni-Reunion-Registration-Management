/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juaam;

/**
 *
 * @author Krishna
 */
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class PDFHandle {

//    private static String FILE = "E:/FirstPdf3.pdf";
//    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.BOLD);
//
//    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL, BaseColor.RED);
//    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 6, Font.BOLD);
//    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);

    private JTable tab;

    public PDFHandle(JTable table,File file) {
        try {
            this.tab = table;
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();
//            addMetaData(document);
//            addTitlePage(document);
//            addContent(document);
            createTable(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private  void addContent(Document document) throws DocumentException {
//        Anchor anchor = new Anchor("First Chapter", catFont);
//        anchor.setName("First Chapter");
//
//        // Second parameter is the number of the chapter
//        Chapter catPart = new Chapter(new Paragraph(anchor), 1);
//
//        Paragraph subPara = new Paragraph("Subcategory 1", subFont);
//        Section subCatPart = catPart.addSection(subPara);
//        subCatPart.add(new Paragraph("Hello"));
//        subPara = new Paragraph("Subcategory 2", subFont);
//        subCatPart = catPart.addSection(subPara);
//        subCatPart.add(new Paragraph("Paragraph 1"));
//        subCatPart.add(new Paragraph("Paragraph 2"));
//        subCatPart.add(new Paragraph("Paragraph 3"));
    // add a list
    // createList(subCatPart);
//        Paragraph paragraph = new Paragraph();
    //addEmptyLine(paragraph, 5);
//        subCatPart.add(paragraph);
    // add a table
    //createTable(subCatPart);
//createTable();
    // now add all this to the document
//        document.add(catPart);
    // Next section
//        anchor = new Anchor("Second Chapter", catFont);
//        anchor.setName("Second Chapter");
//
//        // Second parameter is the number of the chapter
//        catPart = new Chapter(new Paragraph(anchor), 1);
//
//        subPara = new Paragraph("Subcategory", subFont);
//        subCatPart = catPart.addSection(subPara);
//        subCatPart.add(new Paragraph("This is a very important message"));
    // now add all this to the document
//        document.add(catPart);
//
//    }
    private void createTable(Document document)
            throws BadElementException {
        TableModel model = tab.getModel();

        PdfPTable table = new PdfPTable(model.getColumnCount());

        for (int i = 0; i < model.getColumnCount(); i++) {
            String st = model.getColumnName(i);
            PdfPCell c1 = new PdfPCell(new Phrase(st));
            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(c1);
        }

        // t.setBorderColor(BaseColor.GRAY);
        // t.setPadding(4);
        // t.setSpacing(4);
        // t.setBorderWidth(1);
//        PdfPCell c1 = new PdfPCell(new Phrase("Serial"));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);
//
//        c1 = new PdfPCell(new Phrase("Registration No"));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);
//
//        c1 = new PdfPCell(new Phrase("Name"));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);
//
//        c1 = new PdfPCell(new Phrase("Batch"));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);
//
//        c1 = new PdfPCell(new Phrase("Contact"));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);
//
//        c1 = new PdfPCell(new Phrase("Registration Mode"));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);
//
//        c1 = new PdfPCell(new Phrase("Reciept No."));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);
//
//        c1 = new PdfPCell(new Phrase("Amount"));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);
//
//        c1 = new PdfPCell(new Phrase("No of Participants"));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);
//
//        c1 = new PdfPCell(new Phrase("Date"));
//        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
//        table.addCell(c1);

//        table.setHeaderRows(1);
//        table.addCell("1.0");
//        table.addCell("1.1");
//        table.addCell("1.2");
//        table.addCell("2.1");
//        table.addCell("2.2");
//        table.addCell("2.3");
//        table.addCell("2.3");
//        table.addCell("2.32");
//        table.addCell("2.33");
//        table.addCell("2.34");
        //FileWriter excel = new FileWriter(file);
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                String value = (model.getValueAt(i, j).toString());
                table.addCell(value);
            }

        }
        try {
            document.add(table);
//        subCatPart.add(table);
        } catch (DocumentException ex) {
            Logger.getLogger(PDFHandle.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    public static void main(String[] args) {
//        PDFHandle pdf=new PDFHandle();
//        
//    }
}
