package com.example.sb.model.impl;

import com.example.sb.model.Entity1;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Entity1 in entity cache.
 *
 * @author akimov
 * @see Entity1
 * @generated
 */
public class Entity1CacheModel implements CacheModel<Entity1>, Externalizable {
    public long id;
    public String Field1;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(id);
        sb.append(", Field1=");
        sb.append(Field1);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Entity1 toEntityModel() {
        Entity1Impl entity1Impl = new Entity1Impl();

        entity1Impl.setId(id);

        if (Field1 == null) {
            entity1Impl.setField1(StringPool.BLANK);
        } else {
            entity1Impl.setField1(Field1);
        }

        entity1Impl.resetOriginalValues();

        return entity1Impl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        Field1 = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (Field1 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Field1);
        }
    }
}
