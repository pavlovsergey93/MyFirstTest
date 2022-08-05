package com.geekbrains.myfirsttests

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("na##me@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertFalse(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertTrue(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertTrue(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

	@Test
	fun emailValidator_InvalidEmailNoSpace_ReturnFalse(){
		assertFalse(EmailValidator.isValidEmail("dfad sfa@fsfw.fsd"))
	}

	@Test
	fun emailValidator_InvalidEmailNoSpecialСhars_ReturnsFalse(){
		assertFalse(EmailValidator.isValidEmail("!#$%^@@fsfe.vos"))
	}
}
