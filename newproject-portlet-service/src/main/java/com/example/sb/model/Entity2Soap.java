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
public class Entity2Soap implements Serializable {
    private long _id;
    private String _Field2;

    public Entity2Soap() {
    }

    public static Entity2Soap toSoapModel(Entity2 model) {
        Entity2Soap soapModel = new Entity2Soap();

        soapModel.setId(model.getId());
        soapModel.setField2(model.getField2());

        return soapModel;
    }

    public static Entity2Soap[] toSoapModels(Entity2[] models) {
        Entity2Soap[] soapModels = new Entity2Soap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Entity2Soap[][] toSoapModels(Entity2[][] models) {
        Entity2Soap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Entity2Soap[models.length][models[0].length];
        } else {
            soapModels = new Entity2Soap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Entity2Soap[] toSoapModels(List<Entity2> models) {
        List<Entity2Soap> soapModels = new ArrayList<Entity2Soap>(models.size());

        for (Entity2 model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Entity2Soap[soapModels.size()]);
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

    public String getField2() {
        return _Field2;
    }

    public void setField2(String Field2) {
        _Field2 = Field2;
    }
}
