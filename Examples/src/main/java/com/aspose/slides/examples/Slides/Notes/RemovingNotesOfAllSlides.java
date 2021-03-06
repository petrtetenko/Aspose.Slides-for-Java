package com.aspose.slides.examples.Slides.Notes;

import com.aspose.slides.INotesSlideManager;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RemovingNotesOfAllSlides {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RemovingNotesOfAllSlides.class);

        //ExStart:RemovingNotesOfAllSlides
        // Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir + "presWithNotes.pptx");
        try {
            // Removing notes of all slides
            INotesSlideManager mgr = null;
            for (int i = 0; i < pres.getSlides().size(); i++) {
                mgr = pres.getSlides().get_Item(i).getNotesSlideManager();
                mgr.removeNotesSlide();
            }

            // Saving presentation to disk
            pres.save(dataDir + "test.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RemovingNotesOfAllSlides
    }

}
