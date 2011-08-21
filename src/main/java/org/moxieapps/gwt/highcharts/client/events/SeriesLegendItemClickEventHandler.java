package org.moxieapps.gwt.highcharts.client.events;

/**
 * An interface that can be used as a callback handler when legend item belonging to the series is clicked.
 * General usage is as follows:
 * <code><pre>
 * chart.setSeriesPlotOptions(new SeriesPlotOptions()
 *    .setSeriesLegendItemClickEventHandler(new SeriesLegendItemClickEventHandler() {
 *       public boolean onClick(SeriesLegendItemClickEvent seriesLegendItemClickEvent) {
 *          Window.alert("User changed the visibility state of the series: " + clickEvent.getSeriesName());
 *          return true;
 *       }
 *    )
 * });
 * </pre></code>
 * See the documentation on the {@link SeriesLegendItemClickEvent} class for more details on the data
 * available when a legend item click event occurs.
 *
 * @author squinn@moxiegroup.com (Shawn Quinn)
 * @since 1.1.0
 */
public interface SeriesLegendItemClickEventHandler {

    /**
     * This method is fired whenever the legend item belonging to the series is clicked.  See
     * the {@link SeriesLegendItemClickEvent} class for more details on the data available when this event is fired.
     * The default action is to toggle the visibility of the series. This can be prevented by returning false.
     *
     * @param seriesLegendItemClickEvent The details of the event that occurred.
     * @return The response to send back to the event handler function.  Return false to prevent
     * the default action which is to toggle the visibility of the series.
     */
    public boolean onClick(SeriesLegendItemClickEvent seriesLegendItemClickEvent);

}
