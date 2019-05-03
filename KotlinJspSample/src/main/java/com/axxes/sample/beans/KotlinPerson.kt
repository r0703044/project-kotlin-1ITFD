package com.axxes.sample.beans

/**
 *
 * @author pluts
 */
data class KotlinPerson(var firstName: String, var lastName: String) {
    override fun toString() = "$lastName $firstName"
}