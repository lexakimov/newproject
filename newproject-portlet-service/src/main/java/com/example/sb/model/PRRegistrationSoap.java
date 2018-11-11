package com.example.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
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
    private Date _datePurchased;
    private String _howHear;
    private String _wherePurchased;
    private String _serialNumber;
    private long _productId;
    private long _companyId;
    private long _groupId;

    public PRRegistrationSoap() {
    }

    public static PRRegistrationSoap toSoapModel(PRRegistration model) {
        PRRegistrationSoap soapModel = new PRRegistrationSoap();

        soapModel.setRegistrationId(model.getRegistrationId());
        soapModel.setPrUserId(model.getPrUserId());
        soapModel.setDatePurchased(model.getDatePurchased());
        soapModel.setHowHear(model.getHowHear());
        soapModel.setWherePurchased(model.getWherePurchased());
        soapModel.setSerialNumber(model.getSerialNumber());
        soapModel.setProductId(model.getProductId());
        soapModel.setCompanyId(model.getCompanyId());
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

    public Date getDatePurchased() {
        return _datePurchased;
    }

    public void setDatePurchased(Date datePurchased) {
        _datePurchased = datePurchased;
    }

    public String getHowHear() {
        return _howHear;
    }

    public void setHowHear(String howHear) {
        _howHear = howHear;
    }

    public String getWherePurchased() {
        return _wherePurchased;
    }

    public void setWherePurchased(String wherePurchased) {
        _wherePurchased = wherePurchased;
    }

    public String getSerialNumber() {
        return _serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        _serialNumber = serialNumber;
    }

    public long getProductId() {
        return _productId;
    }

    public void setProductId(long productId) {
        _productId = productId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }
}
