package org.moxieapps.gwt.highcharts.client.events;

/**
 * An interface that can be used as a callback handler when mouse over events are fired on the individual
 * points in a series.  General usage is as follows:
 * <code><pre>
 * chart.setSeriesPlotOptions(new SeriesPlotOptions()
 *    .setPointMouseOverEventHandler(new PointMouseOverEventHandler() {
 *       public boolean onMouseOver(PointMouseOverEvent event) {
 *          Window.alert("User moused over point: " + event.getXAsLong() + ", " + event.getYAsLong());
 *          return true;
 *       }
 *    )
 * });
 * </pre></code>
 * See the documentation on the {@link PointMouseOverEvent} class for more details on the data
 * available when a point mouse over event occurs.
 *
 * @author squinn@moxiegroup.com (Shawn Quinn)
 * @since 1.1.0
 */
public interface PointMouseOverEventHandler {

    /**
     * This method is fired whenever a mouse over event occurs on an individual point.  See
     * the {@link PointMouseOverEvent} class for more details on the data available when this event is fired.
     * <p/>
     *
     * @param pointMouseOverEvent The details of the event that occurred.
     * @return The response to send back to the event handler function.
     */
    public boolean onMouseOver(PointMouseOverEvent pointMouseOverEvent);

}
