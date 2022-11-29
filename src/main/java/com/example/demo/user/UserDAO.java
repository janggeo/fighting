package com.example.demo.user;

import com.example.demo.data.converter.UserConverter;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private MongoCollection<Document> coll;

    public UserDAO(MongoClient mongo){
        this.coll = mongo.getDatabase("User").getCollection("src/vegan/user");
    }
    public User create(User p){
        Document doc = UserConverter.toDocument(p);
        this.coll.insertOne(doc);
        ObjectId id = (ObjectId) doc.get("_id");
        p.setId(id.toString());
        return p;
    }
    public void update(User p){
        this.coll.updateOne(Filters.eq("_id",new ObjectId(p.getId())),new Document("$set",UserConverter.toDocument(p)));
    }
    public void delete(String id){
        this.coll.deleteOne(Filters.eq("_id",new ObjectId(id)));
    }
    public boolean exists(String id){
        FindIterable<Document> doc = this.coll.find(Filters.eq("_id",id)).limit(1);
        return doc !=null;
    }
    public List<User> getList(){
        List<User> list = new ArrayList<User>();
        MongoCursor<Document> cursor = coll.find().iterator();
        try{
            while(cursor.hasNext()) {
                Document doc = cursor.next();
                User p = UserConverter.toUser(doc);
                list.add(p);
            }
        }finally{
            cursor.close();
        }
        return list;
    }

    public User getUser(String id){
        Document doc = this.coll.find(Filters.eq("_id",new ObjectId(id))).first();
        return UserConverter.toUser(doc);
    }
}
