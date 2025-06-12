package com.suresh1.weatherReport;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//import org.json.JSONObject;

public class WeatherFetcher {

    private static final String API_KEY = "YOUR_API_KEY"; // Replace with your OpenWeatherMap API_REST_SOAP key
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather";

    public static void main(String[] args) {
        // Replace with the desired city name
        String cityName = "London"; // Example city
        fetchWeatherData(cityName);
    }

    private static void fetchWeatherData(String city) {
        try {
            String urlString = API_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric"; // Using metric units
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Read the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parse JSON response
            //JSONObject jsonResponse = new JSONObject(response.toString());
            //displayWeatherData(jsonResponse);
            System.out.println(response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   /* private static void displayWeatherData(JSONObject weatherData) {
        // Extracting the necessary fields
        String cityName = weatherData.getString("name");
        JSONObject main = weatherData.getJSONObject("main");
        double temperature = main.getDouble("temp");
        double humidity = main.getDouble("humidity");
        String weatherDescription = weatherData.getJSONArray("weather").getJSONObject(0).getString("description");

        // Displaying the weather data
        System.out.println("Weather in " + cityName + ":");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Description: " + weatherDescription);
    }*/

    }
