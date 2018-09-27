package me.tguima.appeatit.data.local.repository

import me.tguima.appeatit.data.local.dao.BaseDAO

abstract class BaseDAORepository<M>(private var baseDAO : BaseDAO<M>) {

    fun insert(item : M) = (baseDAO).insert(item)

    fun insert(items: List<M>) = (baseDAO).insert(items)

}