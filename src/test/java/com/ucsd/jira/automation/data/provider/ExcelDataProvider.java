package com.ucsd.jira.automation.data.provider;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

    @DataProvider(name = "exampleExcelData")
    public static Object[][] exampleExcelData() {
        return ExcelUtils.getTableArray("developer_info.xlsx", "info", 3);
    }

}
