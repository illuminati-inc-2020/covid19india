package com.illuminati.covid19india.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class LocalLongDeserializer extends JsonDeserializer<Long> {

	@Override
	public Long deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        String intString = parser.getText().trim();
        if (intString.matches("([0-9,\\s])+")) {
            intString = intString.replaceAll("[,\\s]", "");
            return intString.trim().isEmpty() ? 0L : Long.valueOf(intString);
        }
        return 0L;
    }

}