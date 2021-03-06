/* 
 * The MIT License
 *
 * Copyright 2015 InsiTech LLC.   gwtvis@insitechinc.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.itgp.gwtviz.client.charts.nv;

public class BarChartV1 extends AbstractChartXYV1 {

    protected BarChartV1() {}

    public static final native BarChartV1 create()    /*-{
               return {
                       chartType : $wnd.ITGP_CHART_TYPE_BAR,
                       reduceXTicks : true,
                       rotateLabels : 0,
                       showControls: true,
                       groupSpacing: 0.1,
                       stacked: false
               }; //  ITGP_CHART_TYPE_BAR is defined in itgp.js as a constant
       }-*/
    ;

    public final native boolean getStacked()    /*-{
          return this.stacked;
       }-*/
    ;

    public final native void setStacked(boolean value)    /*-{
          this.stacked = value;
       }-*/
    ;

}
