package com.example.demo.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "UNIT")
class Unit(

        @Id
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "UNIT_SEQ"
        )
        @SequenceGenerator(
                name = "UNIT_SEQ",
                sequenceName = "UNIT_SEQ",
                allocationSize = 1
        )
        @Column(name = "ID", nullable = false)
        val id: Long = 0,

        @Column(columnDefinition = "TEXT", name = "NAME")
        val name: String? = null



)

