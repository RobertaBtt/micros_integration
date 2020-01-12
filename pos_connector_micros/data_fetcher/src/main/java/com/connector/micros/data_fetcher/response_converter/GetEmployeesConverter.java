package com.connector.micros.data_fetcher.response_converter;

import com.pos.connector.dto.AgentEmployee;
import com.connector.micros.dto.MicrosAgentEmployee;
import com.connector.micros.porting.element.ArrayOfDbEmployee;
import com.connector.micros.porting.element.DbEmployee;
import com.connector.micros.porting.response.MicrosGetConfigurationInfoResponse;

import java.util.ArrayList;
import java.util.List;

public class GetEmployeesConverter {

    /***
     *
     * @param response MicrosGetConfigurationInfoResponse
     * @return The string that represents the configuration of Agent specific of Micros
     */
    public static List<AgentEmployee> convertResponse(MicrosGetConfigurationInfoResponse response) {

        ArrayOfDbEmployee arrayOfDbEmployee = null;
        List<DbEmployee> dbEmployeeList;
        AgentEmployee employeeToRetrieve;
        List<AgentEmployee> employees = new ArrayList<AgentEmployee>();

        if (response.getConfigInfoResponse().getOperationalResult().getSuccess()) {

            String employeesXml = response.getConfigInfoResponse().getEmployees();

            if (!employeesXml.isEmpty()) {

                try {
                    arrayOfDbEmployee = ArrayOfDbEmployee.Factory.parse(employeesXml);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (arrayOfDbEmployee != null) {

                    dbEmployeeList = arrayOfDbEmployee.getDbEmployee();
                    if (dbEmployeeList.size() > 0) {
                        for (DbEmployee employee : dbEmployeeList) {

                            employeeToRetrieve = MicrosAgentEmployee.builder()

                                    .objectNumber(employee.getObjectNumber())
                                    .employeeID(employee.getEmployeeID())
                                    .idNumber(employee.getIdNumber())
                                    .firstName(employee.getFirstName())
                                    .lastName(employee.getLastName())
                                    .checkName(employee.getCheckName())

                                    .build();
                            employees.add(employeeToRetrieve);
                        }
                    }

                }

            }

        } else {
            //throw new Exception of type GetOpenChecks or generic Get data with
            //message = response.getOpenChecks().getOperationalResult().getErrorMessage()
            //and errorCode = response.getOpenChecks().getOperationalResult().getErrorCode().getValue()
        }

        return employees;

    }
}
