package com.Addressbook_Workshop.AddressBook_Workshop;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Unit test for AddressBook.
 */
public class AddressBookTest {
	AddressBookMain addressBook;

	@Before
	public void init() {
		addressBook = AddressBookMain.getAddressBook();
		addressBook.addContactDetails(AddressBookMain.getContactDetails());
	}

	@Test
	public void writeToFileTest() {
		assertTrue(FileOperations.createDirectory("F:", "F:/demo"));
		assertTrue(FileOperations.createFile("F:/demo", "F:/demo/demo.txt"));
		assertTrue(addressBook.writeToFile("F:/demo/demo.txt"));
	}

	@Test
	public void readFromFileTest() {
		assertTrue(FileOperations.createDirectory("F:", "F:/demo"));
		assertTrue(FileOperations.createFile("F:/demo", "F:/demo/demo.txt"));
		assertTrue(addressBook.writeToFile("F:/demo/demo.txt"));
		assertNotNull(addressBook.readFromFile("F:/demo/demo.txt"));
	}


}
