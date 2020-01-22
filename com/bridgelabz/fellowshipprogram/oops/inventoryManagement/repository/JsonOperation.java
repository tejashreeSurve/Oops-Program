package com.bridgelabz.fellowshipprogram.oops.inventoryManagement.repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonOperation {
	static ObjectMapper mapper = new ObjectMapper();

	// write into json file
	public void toWriteIntoFile(String filepath, Object object) {
		try {
			mapper.writeValue(new File(filepath), object);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// read from json file
	public static Object toReadFromFile(String filepath, Object object)
			throws JsonParseException, JsonMappingException, IOException {
		return mapper.readValue(new File(filepath), object.getClass());
	}
}
