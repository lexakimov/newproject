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
public class EntityASoap implements Serializable {
    private long _id;

    public EntityASoap() {
    }

    public static EntityASoap toSoapModel(EntityA model) {
        EntityASoap soapModel = new EntityASoap();

        soapModel.setId(model.getId());

        return soapModel;
    }

    public static EntityASoap[] toSoapModels(EntityA[] models) {
        EntityASoap[] soapModels = new EntityASoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EntityASoap[][] toSoapModels(EntityA[][] models) {
        EntityASoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EntityASoap[models.length][models[0].length];
        } else {
            soapModels = new EntityASoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EntityASoap[] toSoapModels(List<EntityA> models) {
        List<EntityASoap> soapModels = new ArrayList<EntityASoap>(models.size());

        for (EntityA model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EntityASoap[soapModels.size()]);
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
}
