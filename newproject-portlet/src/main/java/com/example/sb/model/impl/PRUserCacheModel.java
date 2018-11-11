package com.example.sb.model.impl;

import com.example.sb.model.PRUser;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PRUser in entity cache.
 *
 * @author akimov
 * @see PRUser
 * @generated
 */
public class PRUserCacheModel implements CacheModel<PRUser>, Externalizable {
    public long prUserId;
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{prUserId=");
        sb.append(prUserId);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PRUser toEntityModel() {
        PRUserImpl prUserImpl = new PRUserImpl();

        prUserImpl.setPrUserId(prUserId);

        if (firstName == null) {
            prUserImpl.setFirstName(StringPool.BLANK);
        } else {
            prUserImpl.setFirstName(firstName);
        }

        if (lastName == null) {
            prUserImpl.setLastName(StringPool.BLANK);
        } else {
            prUserImpl.setLastName(lastName);
        }

        prUserImpl.resetOriginalValues();

        return prUserImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        prUserId = objectInput.readLong();
        firstName = objectInput.readUTF();
        lastName = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(prUserId);

        if (firstName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstName);
        }

        if (lastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastName);
        }
    }
}
