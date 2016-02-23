/* DO NOT EDIT */
/* This file was generated from team_groups.babel */

package com.dropbox.core.v2.team;

import com.dropbox.core.json.JsonReadException;
import com.dropbox.core.json.JsonReader;
import com.dropbox.core.json.JsonWriter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

public enum GroupsGetInfoError {
    // union GroupsGetInfoError
    /**
     * The group is not on your team.
     */
    GROUP_NOT_ON_TEAM,
    OTHER; // *catch_all

    private static final java.util.HashMap<String, GroupsGetInfoError> VALUES_;
    static {
        VALUES_ = new java.util.HashMap<String, GroupsGetInfoError>();
        VALUES_.put("group_not_on_team", GROUP_NOT_ON_TEAM);
        VALUES_.put("other", OTHER);
    }

    public String toJson(Boolean longForm) {
        return _JSON_WRITER.writeToString(this, longForm);
    }

    public static GroupsGetInfoError fromJson(String s) throws JsonReadException {
        return _JSON_READER.readFully(s);
    }

    public static final JsonWriter<GroupsGetInfoError> _JSON_WRITER = new JsonWriter<GroupsGetInfoError>() {
        public void write(GroupsGetInfoError x, JsonGenerator g) throws IOException {
            switch (x) {
                case GROUP_NOT_ON_TEAM:
                    g.writeStartObject();
                    g.writeFieldName(".tag");
                    g.writeString("group_not_on_team");
                    g.writeEndObject();
                    break;
                case OTHER:
                    g.writeStartObject();
                    g.writeFieldName(".tag");
                    g.writeString("other");
                    g.writeEndObject();
                    break;
            }
        }
    };

    public static final JsonReader<GroupsGetInfoError> _JSON_READER = new JsonReader<GroupsGetInfoError>() {
        public final GroupsGetInfoError read(JsonParser parser) throws IOException, JsonReadException {
            return JsonReader.readEnum(parser, VALUES_, OTHER);
        }
    };
}