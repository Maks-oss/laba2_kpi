package kpi.laba2.singleton

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.datasource.DriverManagerDataSource
import org.springframework.stereotype.Component

@Component
object DbConnection {
    var jdbcTemplate:JdbcTemplate?=null
    fun connect(database: String) {
        jdbcTemplate= JdbcTemplate(DriverManagerDataSource().apply {
            url = "jdbc:postgresql://localhost:5432/$database"
        })
    }
}