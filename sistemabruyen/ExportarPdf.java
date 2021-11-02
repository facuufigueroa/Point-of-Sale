/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabruyen;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;


/**
 *
 * @author Facundo
 */
public class ExportarPdf {
    
    
    public void generetePdf(JTable tabla) throws DocumentException {
        
        
        String path = " ";
        JFileChooser j= new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(j);
        if (x==JFileChooser.APPROVE_OPTION){
            path=j.getSelectedFile().getPath();
            
        }
        
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "TablaProducto.pdf" ));
            doc.open();
            PdfPTable table = new PdfPTable(3);
            table.addCell("CODIGO");
            table.addCell("NOMBRE");
            table.addCell("PRECIO");
            
            for(int i = 0; i<tabla.getRowCount();i++){
                String codigo = tabla.getValueAt(i, 0).toString();
                String nombre = tabla.getValueAt(i, 1).toString();
                String precio = tabla.getValueAt(i, 2).toString();
                table.addCell(codigo);
                table.addCell(nombre);
                table.addCell(precio);
        }
            doc.add(table);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExportarPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
        
        
    }
}
