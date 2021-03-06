package com.lwr.software.reporter.renderer.html.google;

import com.lwr.software.reporter.DashboardConstants;
import com.lwr.software.reporter.renderer.html.google.options.HTMLOptionFactory;
import com.lwr.software.reporter.reportmgmt.Element;

public class HTMLLineChartRenderer extends HTMLAbstractRenderer {

	public HTMLLineChartRenderer(Element element) {
		super(element);
	}

	@Override
	public String render() {
		StringBuffer html = new StringBuffer();
		html.append("<script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
		html.append("<script type=\"text/javascript\">\n");
		html.append("	google.load(\"visualization\", \"1\", {packages:[\"corechart\"]});\n");
		html.append("	google.setOnLoadCallback(drawChart);\n");
		html.append("	function drawChart() {\n");
		html.append("	var data = new google.visualization.DataTable();\n");
		html.append(getProcessedHeaderString());
		html.append("data.addRows([\n");
		html.append(getProcessedDataSetString());
		html.append("	]);\n");
		html.append("	var chart = new google.visualization.LineChart(document.getElementById('pos_" + element.getPosition() + "'));\n");
		html.append(HTMLOptionFactory.getOption(DashboardConstants.CHART_OPTIONS).getOption(element.getTitle()));
		html.append("	var view = new google.visualization.DataView(data);\n");
		html.append("	chart.draw(view, options);\n");
		html.append("}\n");
		html.append("</script>\n");
		return html.toString();
	}

}
