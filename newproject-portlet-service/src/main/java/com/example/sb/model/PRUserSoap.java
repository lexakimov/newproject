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
public class PRUserSoap implements Serializable {
    private long _prUserId;
    private String _firstName;
    private String _lastName;

    public PRUserSoap() {
    }

    public static PRUserSoap toSoapModel(PRUser model) {
        PRUserSoap soapModel = new PRUserSoap();

        soapModel.setPrUserId(model.getPrUserId());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setLastName(model.getLastName());

        return soapModel;
    }

    public static PRUserSoap[] toSoapModels(PRUser[] models) {
        PRUserSoap[] soapModels = new PRUserSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PRUserSoap[][] toSoapModels(PRUser[][] models) {
        PRUserSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PRUserSoap[models.length][models[0].length];
        } else {
            soapModels = new PRUserSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PRUserSoap[] toSoapModels(List<PRUser> models) {
        List<PRUserSoap> soapModels = new ArrayList<PRUserSoap>(models.size());

        for (PRUser model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PRUserSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _prUserId;
    }

    public void setPrimaryKey(long pk) {
        setPrUserId(pk);
    }

    public long getPrUserId() {
        return _prUserId;
    }

    public void setPrUserId(long prUserId) {
        _prUserId = prUserId;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }
}
