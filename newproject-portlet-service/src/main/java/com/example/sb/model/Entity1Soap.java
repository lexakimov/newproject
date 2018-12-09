package com.example.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author akimov
 * @generated
 */
public class Entity1Soap implements Serializable {
    private long _id;
    private String _Field1;

    public Entity1Soap() {
    }

    public static Entity1Soap toSoapModel(Entity1 model) {
        Entity1Soap soapModel = new Entity1Soap();

        soapModel.setId(model.getId());
        soapModel.setField1(model.getField1());

        return soapModel;
    }

    public static Entity1Soap[] toSoapModels(Entity1[] models) {
        Entity1Soap[] soapModels = new Entity1Soap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Entity1Soap[][] toSoapModels(Entity1[][] models) {
        Entity1Soap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Entity1Soap[models.length][models[0].length];
        } else {
            soapModels = new Entity1Soap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Entity1Soap[] toSoapModels(List<Entity1> models) {
        List<Entity1Soap> soapModels = new ArrayList<Entity1Soap>(models.size());

        for (Entity1 model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Entity1Soap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getField1() {
        return _Field1;
    }

    public void setField1(String Field1) {
        _Field1 = Field1;
    }
}
