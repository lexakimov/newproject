package com.example.sb.model.impl;

import com.example.sb.model.EntityA;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EntityA in entity cache.
 *
 * @author akimov
 * @see EntityA
 * @generated
 */
public class EntityACacheModel implements CacheModel<EntityA>, Externalizable {
    public long id;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(3);

        sb.append("{id=");
        sb.append(id);

        return sb.toString();
    }

    @Override
    public EntityA toEntityModel() {
        EntityAImpl entityAImpl = new EntityAImpl();

        entityAImpl.setId(id);

        entityAImpl.resetOriginalValues();

        return entityAImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
    }
}
