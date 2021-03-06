package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartCategory;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class SunburstChart {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SunburstChart.class);

        //ExStart:SunburstChart
        // Creating empty presentation
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Sunburst, 50, 50, 500, 400);
            chart.getChartData().getCategories().clear();
            chart.getChartData().getSeries().clear();

            IChartDataWorkbook wb = chart.getChartData().getChartDataWorkbook();
            wb.clear(0);

            //branch 1
            IChartCategory leaf = chart.getChartData().getCategories().add(wb.getCell(0, "C1", "Leaf1"));
            leaf.getGroupingLevels().setGroupingItem(1, "Stem1");
            leaf.getGroupingLevels().setGroupingItem(2, "Branch1");

            chart.getChartData().getCategories().add(wb.getCell(0, "C2", "Leaf2"));

            leaf = chart.getChartData().getCategories().add(wb.getCell(0, "C3", "Leaf3"));
            leaf.getGroupingLevels().setGroupingItem(1, "Stem2");

            chart.getChartData().getCategories().add(wb.getCell(0, "C4", "Leaf4"));

            //branch 2
            leaf = chart.getChartData().getCategories().add(wb.getCell(0, "C5", "Leaf5"));
            leaf.getGroupingLevels().setGroupingItem(1, "Stem3");
            leaf.getGroupingLevels().setGroupingItem(2, "Branch2");

            chart.getChartData().getCategories().add(wb.getCell(0, "C6", "Leaf6"));

            leaf = chart.getChartData().getCategories().add(wb.getCell(0, "C7", "Leaf7"));
            leaf.getGroupingLevels().setGroupingItem(1, "Stem4");

            chart.getChartData().getCategories().add(wb.getCell(0, "C8", "Leaf8"));

            IChartSeries series = chart.getChartData().getSeries().add(ChartType.Sunburst);
            series.getLabels().getDefaultDataLabelFormat().setShowCategoryName(true);
            series.getDataPoints().addDataPointForSunburstSeries(wb.getCell(0, "D1", 4));
            series.getDataPoints().addDataPointForSunburstSeries(wb.getCell(0, "D2", 5));
            series.getDataPoints().addDataPointForSunburstSeries(wb.getCell(0, "D3", 3));
            series.getDataPoints().addDataPointForSunburstSeries(wb.getCell(0, "D4", 6));
            series.getDataPoints().addDataPointForSunburstSeries(wb.getCell(0, "D5", 9));
            series.getDataPoints().addDataPointForSunburstSeries(wb.getCell(0, "D6", 9));
            series.getDataPoints().addDataPointForSunburstSeries(wb.getCell(0, "D7", 4));
            series.getDataPoints().addDataPointForSunburstSeries(wb.getCell(0, "D8", 3));

            pres.save(dataDir + "Sunburst.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SunburstChart
    }
}