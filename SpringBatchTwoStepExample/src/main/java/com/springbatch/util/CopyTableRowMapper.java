package com.springbatch.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springbatch.model.CopyTable;

public class CopyTableRowMapper implements RowMapper<CopyTable> {
	public CopyTable mapRow(ResultSet rs, int rownum) throws SQLException {
		CopyTable copyTable = new CopyTable();
		copyTable.setCopyTableID(rs.getInt("copy_tab_id"));
		copyTable.setCountryCode(rs.getString("COUNTRY_CODE"));

		return copyTable;
	}
}