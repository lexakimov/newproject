package com.example.sb.model.impl;

import com.example.sb.model.PRUser;
import com.example.sb.service.PRUserLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PRUser service. Represents a row in the &quot;SB_PRUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PRUserImpl}.
 * </p>
 *
 * @author akimov
 * @see PRUserImpl
 * @see com.example.sb.model.PRUser
 * @generated
 */
public abstract class PRUserBaseImpl extends PRUserModelImpl implements PRUser {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a p r user model instance should use the {@link PRUser} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PRUserLocalServiceUtil.addPRUser(this);
        } else {
            PRUserLocalServiceUtil.updatePRUser(this);
        }
    }
}
