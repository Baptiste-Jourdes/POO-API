package Jourdes.TP3.controller;

import Jourdes.TP3.model.AddressRepository;
import com.fasterxml.jackson.annotation.JsonValue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Controller
public class MeteoController {
    @Autowired
    AddressRepository addressRepository;
    RestTemplate restTemplate = new RestTemplate();
    @PostMapping("/meteo")
    public String meteo(@RequestParam(name="address", required=false, defaultValue="World") String
                                   address, Model model) throws JSONException {

        String response = restTemplate.getForObject(
                "http://api-adresse.data.gouv.fr/search/?q="+address, String.class);

        JSONObject obj = new JSONObject(response);
        JSONObject geometry =  obj.getJSONArray("features").getJSONObject(0).getJSONObject("geometry");
        JSONArray coordinates = geometry.getJSONArray ("coordinates");
        model.addAttribute("x", coordinates.getDouble(0));
        model.addAttribute("y", coordinates.getDouble(1));

        //aaccecae1d55d61f98bcca809ad6124ddb59fb177e98ec6c910cb209b8c22775
        //https://api.meteo-concept.com/api/forecast/daily?token=aaccecae1d55d61f98bcca809ad6124ddb59fb177e98ec6c910cb209b8c22775&latlng=47.996,0.199

        String responseMeteo = restTemplate.getForObject(
                "https://api.meteo-concept.com/api/forecast/daily?token=aaccecae1d55d61f98bcca809ad6124ddb59fb177e98ec6c910cb209b8c22775&latlng="+coordinates.getDouble(1)+","+coordinates.getDouble(0), String.class);

        JSONObject objMeteo = new JSONObject(responseMeteo);
        JSONObject forecast =  objMeteo.getJSONArray("forecast").getJSONObject(0);

        model.addAttribute("response", responseMeteo);
        model.addAttribute("tmin", forecast.getString("tmin"));
        model.addAttribute("tmax", forecast.getString("tmax"));

        return "meteo";
    }


}
