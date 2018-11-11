package com.example.sb.model.impl;

import com.example.sb.model.PRRegistration;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PRRegistration in entity cache.
 *
 * @author akimov
 * @see PRRegistration
 * @generated
 */
public class PRRegistrationCacheModel implements CacheModel<PRRegistration>,
    Externalizable {
    public long registrationId;
    public long prUserId;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{registrationId=");
        sb.append(registrationId);
        sb.append(", prUserId=");
        sb.append(prUserId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PRRegistration toEntityModel() {
        PRRegistrationImpl prRegistrationImpl = new PRRegistrationImpl();

        prRegistrationImpl.setRegistrationId(registrationId);
        prRegistrationImpl.setPrUserId(prUserId);
        prRegistrationImpl.setGroupId(groupId);

        prRegistrationImpl.resetOriginalValues();

        return prRegistrationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        registrationId = objectInput.readLong();
        prUserId = objectInput.readLong();
        groupId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(registrationId);
        objectOutput.writeLong(prUserId);
        objectOutput.writeLong(groupId);
    }
}
