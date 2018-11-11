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
public class PRRegistrationSoap implements Serializable {
    private long _registrationId;
    private long _prUserId;
    private long _groupId;

    public PRRegistrationSoap() {
    }

    public static PRRegistrationSoap toSoapModel(PRRegistration model) {
        PRRegistrationSoap soapModel = new PRRegistrationSoap();

        soapModel.setRegistrationId(model.getRegistrationId());
        soapModel.setPrUserId(model.getPrUserId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static PRRegistrationSoap[] toSoapModels(PRRegistration[] models) {
        PRRegistrationSoap[] soapModels = new PRRegistrationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PRRegistrationSoap[][] toSoapModels(PRRegistration[][] models) {
        PRRegistrationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PRRegistrationSoap[models.length][models[0].length];
        } else {
            soapModels = new PRRegistrationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PRRegistrationSoap[] toSoapModels(List<PRRegistration> models) {
        List<PRRegistrationSoap> soapModels = new ArrayList<PRRegistrationSoap>(models.size());

        for (PRRegistration model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PRRegistrationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _registrationId;
    }

    public void setPrimaryKey(long pk) {
        setRegistrationId(pk);
    }

    public long getRegistrationId() {
        return _registrationId;
    }

    public void setRegistrationId(long registrationId) {
        _registrationId = registrationId;
    }

    public long getPrUserId() {
        return _prUserId;
    }

    public void setPrUserId(long prUserId) {
        _prUserId = prUserId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }
}
