package com.example.sb.service.persistence;

import com.example.sb.NoSuchPRRegistrationException;
import com.example.sb.model.PRRegistration;
import com.example.sb.model.impl.PRRegistrationImpl;
import com.example.sb.model.impl.PRRegistrationModelImpl;
import com.example.sb.service.persistence.PRRegistrationPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the p r registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author akimov
 * @see PRRegistrationPersistence
 * @see PRRegistrationUtil
 * @generated
 */
public class PRRegistrationPersistenceImpl extends BasePersistenceImpl<PRRegistration>
    implements PRRegistrationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PRRegistrationUtil} to access the p r registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PRRegistrationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
            PRRegistrationModelImpl.FINDER_CACHE_ENABLED,
            PRRegistrationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
            PRRegistrationModelImpl.FINDER_CACHE_ENABLED,
            PRRegistrationImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
            PRRegistrationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PRREGISTRATION = "SELECT prRegistration FROM PRRegistration prRegistration";
    private static final String _SQL_COUNT_PRREGISTRATION = "SELECT COUNT(prRegistration) FROM PRRegistration prRegistration";
    private static final String _ORDER_BY_ENTITY_ALIAS = "prRegistration.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PRRegistration exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PRRegistrationPersistenceImpl.class);
    private static PRRegistration _nullPRRegistration = new PRRegistrationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PRRegistration> toCacheModel() {
                return _nullPRRegistrationCacheModel;
            }
        };

    private static CacheModel<PRRegistration> _nullPRRegistrationCacheModel = new CacheModel<PRRegistration>() {
            @Override
            public PRRegistration toEntityModel() {
                return _nullPRRegistration;
            }
        };

    public PRRegistrationPersistenceImpl() {
        setModelClass(PRRegistration.class);
    }

    /**
     * Caches the p r registration in the entity cache if it is enabled.
     *
     * @param prRegistration the p r registration
     */
    @Override
    public void cacheResult(PRRegistration prRegistration) {
        EntityCacheUtil.putResult(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
            PRRegistrationImpl.class, prRegistration.getPrimaryKey(),
            prRegistration);

        prRegistration.resetOriginalValues();
    }

    /**
     * Caches the p r registrations in the entity cache if it is enabled.
     *
     * @param prRegistrations the p r registrations
     */
    @Override
    public void cacheResult(List<PRRegistration> prRegistrations) {
        for (PRRegistration prRegistration : prRegistrations) {
            if (EntityCacheUtil.getResult(
                        PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
                        PRRegistrationImpl.class, prRegistration.getPrimaryKey()) == null) {
                cacheResult(prRegistration);
            } else {
                prRegistration.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all p r registrations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PRRegistrationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PRRegistrationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the p r registration.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PRRegistration prRegistration) {
        EntityCacheUtil.removeResult(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
            PRRegistrationImpl.class, prRegistration.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PRRegistration> prRegistrations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PRRegistration prRegistration : prRegistrations) {
            EntityCacheUtil.removeResult(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
                PRRegistrationImpl.class, prRegistration.getPrimaryKey());
        }
    }

    /**
     * Creates a new p r registration with the primary key. Does not add the p r registration to the database.
     *
     * @param registrationId the primary key for the new p r registration
     * @return the new p r registration
     */
    @Override
    public PRRegistration create(long registrationId) {
        PRRegistration prRegistration = new PRRegistrationImpl();

        prRegistration.setNew(true);
        prRegistration.setPrimaryKey(registrationId);

        return prRegistration;
    }

    /**
     * Removes the p r registration with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param registrationId the primary key of the p r registration
     * @return the p r registration that was removed
     * @throws com.example.sb.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PRRegistration remove(long registrationId)
        throws NoSuchPRRegistrationException, SystemException {
        return remove((Serializable) registrationId);
    }

    /**
     * Removes the p r registration with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the p r registration
     * @return the p r registration that was removed
     * @throws com.example.sb.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PRRegistration remove(Serializable primaryKey)
        throws NoSuchPRRegistrationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PRRegistration prRegistration = (PRRegistration) session.get(PRRegistrationImpl.class,
                    primaryKey);

            if (prRegistration == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPRRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(prRegistration);
        } catch (NoSuchPRRegistrationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PRRegistration removeImpl(PRRegistration prRegistration)
        throws SystemException {
        prRegistration = toUnwrappedModel(prRegistration);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(prRegistration)) {
                prRegistration = (PRRegistration) session.get(PRRegistrationImpl.class,
                        prRegistration.getPrimaryKeyObj());
            }

            if (prRegistration != null) {
                session.delete(prRegistration);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (prRegistration != null) {
            clearCache(prRegistration);
        }

        return prRegistration;
    }

    @Override
    public PRRegistration updateImpl(
        com.example.sb.model.PRRegistration prRegistration)
        throws SystemException {
        prRegistration = toUnwrappedModel(prRegistration);

        boolean isNew = prRegistration.isNew();

        Session session = null;

        try {
            session = openSession();

            if (prRegistration.isNew()) {
                session.save(prRegistration);

                prRegistration.setNew(false);
            } else {
                session.merge(prRegistration);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
            PRRegistrationImpl.class, prRegistration.getPrimaryKey(),
            prRegistration);

        return prRegistration;
    }

    protected PRRegistration toUnwrappedModel(PRRegistration prRegistration) {
        if (prRegistration instanceof PRRegistrationImpl) {
            return prRegistration;
        }

        PRRegistrationImpl prRegistrationImpl = new PRRegistrationImpl();

        prRegistrationImpl.setNew(prRegistration.isNew());
        prRegistrationImpl.setPrimaryKey(prRegistration.getPrimaryKey());

        prRegistrationImpl.setRegistrationId(prRegistration.getRegistrationId());
        prRegistrationImpl.setPrUserId(prRegistration.getPrUserId());
        prRegistrationImpl.setGroupId(prRegistration.getGroupId());

        return prRegistrationImpl;
    }

    /**
     * Returns the p r registration with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the p r registration
     * @return the p r registration
     * @throws com.example.sb.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PRRegistration findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPRRegistrationException, SystemException {
        PRRegistration prRegistration = fetchByPrimaryKey(primaryKey);

        if (prRegistration == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPRRegistrationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return prRegistration;
    }

    /**
     * Returns the p r registration with the primary key or throws a {@link com.example.sb.NoSuchPRRegistrationException} if it could not be found.
     *
     * @param registrationId the primary key of the p r registration
     * @return the p r registration
     * @throws com.example.sb.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PRRegistration findByPrimaryKey(long registrationId)
        throws NoSuchPRRegistrationException, SystemException {
        return findByPrimaryKey((Serializable) registrationId);
    }

    /**
     * Returns the p r registration with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the p r registration
     * @return the p r registration, or <code>null</code> if a p r registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PRRegistration fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        PRRegistration prRegistration = (PRRegistration) EntityCacheUtil.getResult(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
                PRRegistrationImpl.class, primaryKey);

        if (prRegistration == _nullPRRegistration) {
            return null;
        }

        if (prRegistration == null) {
            Session session = null;

            try {
                session = openSession();

                prRegistration = (PRRegistration) session.get(PRRegistrationImpl.class,
                        primaryKey);

                if (prRegistration != null) {
                    cacheResult(prRegistration);
                } else {
                    EntityCacheUtil.putResult(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
                        PRRegistrationImpl.class, primaryKey,
                        _nullPRRegistration);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PRRegistrationModelImpl.ENTITY_CACHE_ENABLED,
                    PRRegistrationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return prRegistration;
    }

    /**
     * Returns the p r registration with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param registrationId the primary key of the p r registration
     * @return the p r registration, or <code>null</code> if a p r registration with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PRRegistration fetchByPrimaryKey(long registrationId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) registrationId);
    }

    /**
     * Returns all the p r registrations.
     *
     * @return the p r registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PRRegistration> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the p r registrations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of p r registrations
     * @param end the upper bound of the range of p r registrations (not inclusive)
     * @return the range of p r registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PRRegistration> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the p r registrations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.sb.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of p r registrations
     * @param end the upper bound of the range of p r registrations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of p r registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<PRRegistration> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<PRRegistration> list = (List<PRRegistration>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PRREGISTRATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PRREGISTRATION;

                if (pagination) {
                    sql = sql.concat(PRRegistrationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<PRRegistration>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<PRRegistration>(list);
                } else {
                    list = (List<PRRegistration>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the p r registrations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (PRRegistration prRegistration : findAll()) {
            remove(prRegistration);
        }
    }

    /**
     * Returns the number of p r registrations.
     *
     * @return the number of p r registrations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PRREGISTRATION);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the p r registration persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.example.sb.model.PRRegistration")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PRRegistration>> listenersList = new ArrayList<ModelListener<PRRegistration>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PRRegistration>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PRRegistrationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
