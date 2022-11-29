package com.example.demo.data.converter;

import com.example.demo.user.User;
import org.bson.Document;
import org.bson.types.ObjectId;

public class UserConverter {

    //User object to MongoDB
    public static Document toDocument(User p){
        Document doc = new Document("name", p.getUserName())
                .append("ID",p.getUserID())
                .append("Password",p.getUserPassword())
                .append("Email",p.getUserEmail());
        if(p.getId() !=null){
            doc.append("_id",new ObjectId(p.getId()));
        }
        return doc;
    }

    //MongoDB to User
    public static User toUser(Document doc){
        User p = new User();
        p.setUserName((String)doc.get("name"));
        p.setUserID((String)doc.get("ID"));
        p.setUserEmail((String)doc.get("Email"));
        p.setUserPassword((String)doc.get("Password"));
        return p;
    }
}
