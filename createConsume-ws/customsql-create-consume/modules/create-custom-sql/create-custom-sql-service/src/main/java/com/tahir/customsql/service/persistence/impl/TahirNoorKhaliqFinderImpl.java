package com.tahir.customsql.service.persistence.impl;

/*import com.liferay.portal.kernel.dao.orm.QueryUtil;*/

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.PortalCustomSQLUtil;

import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.tahir.customsql.model.TahirNoorKhaliq;
import com.tahir.customsql.model.impl.TahirNoorKhaliqImpl;
import com.tahir.customsql.service.persistence.TahirNoorKhaliqFinder;

import java.util.List;

/**
 * Created by tana0616 on 2/24/2017.
 */
public class TahirNoorKhaliqFinderImpl extends TahirNoorKhaliqFinderBaseImpl implements TahirNoorKhaliqFinder {
    public List<TahirNoorKhaliq> getTahirNoorKhaliq() {
        System.out.println(">>>>>>>>>111<<<<<<<<<<<<<");
        Session session = null;
        try {
            session = getCurrentSession();
           // String sql = PortalCustomSQLUtil.get("sql1");
            /*String sql = CustomSQLUtil.get(TahirNoorKhaliq.class,"sql1");*/
            String sql = CustomSQLUtil.get(getClass(),"sql1");
            System.out.println(">>>>>>SQL 11>>>"+sql);
            SQLQuery queryObject = session.createSQLQuery(sql);
            queryObject.setCacheable(false);
            queryObject.addEntity("TahirNoorKhaliq", TahirNoorKhaliqImpl.class);
            return (List<TahirNoorKhaliq>)queryObject.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
