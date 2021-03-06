package com.example.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.example.sb.service.http.Entity1ServiceSoap}.
 *
 * @author akimov
 * @see com.example.sb.service.http.Entity1ServiceSoap
 * @generated
 */
public class Entity1Soap implements Serializable {
    private long _id;
    private String _Status;
    private String _RequestId;
    private String _Field1;

    public Entity1Soap() {
    }

    public static Entity1Soap toSoapModel(Entity1 model) {
        Entity1Soap soapModel = new Entity1Soap();

        soapModel.setId(model.getId());
        soapModel.setStatus(model.getStatus());
        soapModel.setRequestId(model.getRequestId());
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

    public String getStatus() {
        return _Status;
    }

    public void setStatus(String Status) {
        _Status = Status;
    }

    public String getRequestId() {
        return _RequestId;
    }

    public void setRequestId(String RequestId) {
        _RequestId = RequestId;
    }

    public String getField1() {
        return _Field1;
    }

    public void setField1(String Field1) {
        _Field1 = Field1;
    }
}
