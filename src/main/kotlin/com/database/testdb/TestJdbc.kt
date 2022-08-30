package com.database.testdb

import java.sql.DriverManager

fun main() {
    val jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC"
    val user = "springstudent"
    val pass = "springstudent"

    println("Connecting to database: $jdbcUrl")
    DriverManager.getConnection(jdbcUrl, user, pass)

    println("Connection successful")
}