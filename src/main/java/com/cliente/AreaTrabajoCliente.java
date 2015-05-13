package com.cliente;

import areaTrabajo.wsdl.AreaTrabajoRequest;
import areaTrabajo.wsdl.AreaTrabajoResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Created by Angel Luis on 13/05/2015.
 */

public class AreaTrabajoCliente extends WebServiceGatewaySupport {

    public AreaTrabajoResponse getAreaTrabajo(int id) {
        AreaTrabajoRequest request = new AreaTrabajoRequest();
        request.setId(id);

        System.out.println();
        System.out.println("Requesting forecast for " + id);

        AreaTrabajoResponse response = (AreaTrabajoResponse) getWebServiceTemplate().marshalSendAndReceive(
                request,
                new SoapActionCallback(
                        "http://localhost:8080/ws/AreaTrabajo"));

        return response;
    }

    /*public void printResponse(GetCityForecastByZIPResponse response) {
        ForecastReturn forecastReturn = response.getGetCityForecastByZIPResult();

        if (forecastReturn.isSuccess()) {
            System.out.println();
            System.out.println("Forecast for " + forecastReturn.getCity() + ", "
                    + forecastReturn.getState());

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            for (Forecast forecast : forecastReturn.getForecastResult().getForecast()) {
                System.out.print(format.format(forecast.getDate().toGregorianCalendar().getTime()));
                System.out.print(" ");
                System.out.print(forecast.getDesciption());
                System.out.print(" ");
                Temp temperature = forecast.getTemperatures();
                System.out.print(temperature.getMorningLow() + "\u00b0-"
                        + temperature.getDaytimeHigh() + "\u00b0 ");
                System.out.println();
            }
        } else {
            System.out.println("No forecast received");
        }
    }*/

}
