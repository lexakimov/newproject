package com.example.sb.model.impl;

import com.example.sb.model.Entity2;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Entity2 in entity cache.
 *
 * @author akimov
 * @see Entity2
 * @generated
 */
public class Entity2CacheModel implements CacheModel<Entity2>, Externalizable {
    public long id;
    public String Field2;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(id);
        sb.append(", Field2=");
        sb.append(Field2);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Entity2 toEntityModel() {
        Entity2Impl entity2Impl = new Entity2Impl();

        entity2Impl.setId(id);

        if (Field2 == null) {
            entity2Impl.setField2(StringPool.BLANK);
        } else {
            entity2Impl.setField2(Field2);
        }

        entity2Impl.resetOriginalValues();

        return entity2Impl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        Field2 = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);

        if (Field2 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(Field2);
        }
    }
}
