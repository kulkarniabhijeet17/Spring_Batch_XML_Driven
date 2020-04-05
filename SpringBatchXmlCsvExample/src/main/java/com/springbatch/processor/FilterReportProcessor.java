package com.springbatch.processor;

import org.springframework.batch.item.ItemProcessor;
import com.springbatch.model.Report;

//run before writing
public class FilterReportProcessor implements ItemProcessor<Report, Report> {
	public Report process(Report item) throws Exception {
		// filter object which age = 30
		if (item.getAge() == 30) {
			return null; // null = ignore this object
		}

		return item;
	}
}