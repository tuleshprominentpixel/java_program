package prominentTrainee;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    static List<ProminentTrainee> prominentTraineeList = new ArrayList<>();

    public static final String FILEFORREADING = "input_employee.json";
    public static final String FILEFORWRITING = "output_employee.json";
    public static ProminentTrainee tempProminentObject = new ProminentTrainee();
    public static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        fileRead(FILEFORREADING);
        printAllList(prominentTraineeList);
        listToMap(prominentTraineeList);
        map.forEach((k, v) -> log.info("{} = {}", k, v.toString()));
        fileWrite(FILEFORWRITING);
    }

    public static void listToMap(List<ProminentTrainee>  listOfTrainee){
        for (ProminentTrainee pt : listOfTrainee) {
            if (!map.containsKey(pt.getCompanyName())) {
                map.put(pt.getCompanyName(), 1);
            } else {
                map.put(pt.getCompanyName(), map.get(pt.getCompanyName()) + 1);
            }
        }
    }

    public static void printAllList(List<ProminentTrainee> allTrainee) {
        for (ProminentTrainee Trainee : allTrainee) {
            log.info("Id : {} , Name : {} , Date : {} , Age : {} , Company name : {} ", Trainee.getTraineeId(), Trainee.getTraineeName()
                    , Trainee.getTraineeDOB(), Trainee.getTraineeAge()
                    , Trainee.getCompanyName());
        }
    }

    public static void fetchObject(Object jsonObject1) throws Exception {
        JSONObject jsonObject = (JSONObject) jsonObject1;
        String tempId = (String) jsonObject.get("id");
        String name = (String) jsonObject.get("name");
        String tempDate = (String) jsonObject.get("birth_date");
        String tempAge = (String) jsonObject.get("age");
        String companyName = (String) jsonObject.get("company_name");
        int id = Integer.parseInt(tempId);
        int age = Integer.parseInt(tempAge);
        Date date = new SimpleDateFormat("dd-MM-yy").parse(tempDate);
        tempProminentObject = new ProminentTrainee(id, name, (date), age, companyName);
    }

    public static void fileRead(String fileForRead){
        try (FileReader reader1 = new FileReader(fileForRead)) {
            JSONParser jsonParser = new JSONParser();
            Object obj1 = jsonParser.parse(reader1);
            JSONArray jsonArray1 = (JSONArray) obj1;
            for (Object jsonObject : jsonArray1) {
                fetchObject(jsonObject);
                prominentTraineeList.add(tempProminentObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fileWrite(String fileForWrite) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        String json;
        json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

        try (FileWriter fw = new FileWriter(fileForWrite)) {
            fw.write(json);
        } catch (Exception e) {
            log.info("Exception : {} ", e.toString());
        }
    }
}
