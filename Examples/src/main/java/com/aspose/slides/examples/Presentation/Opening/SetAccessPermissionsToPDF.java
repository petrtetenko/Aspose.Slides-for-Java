package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.PdfAccessPermissions;
import com.aspose.slides.PdfOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class SetAccessPermissionsToPDF {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetAccessPermissionsToPDF.class);

        //ExStart:SetAccessPermissionsToPDF
        PdfOptions pdfOptions = new PdfOptions();
        pdfOptions.setPassword("my_password");
        pdfOptions.setAccessPermissions(PdfAccessPermissions.PrintDocument | PdfAccessPermissions.HighQualityPrint);

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "Presentation.pptx");
        try {
            presentation.save(dataDir + "PDFWithPermissions.pdf", SaveFormat.Pdf, pdfOptions);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetAccessPermissionsToPDF
    }

}
