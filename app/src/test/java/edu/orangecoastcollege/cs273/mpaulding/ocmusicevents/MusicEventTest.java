package edu.orangecoastcollege.cs273.mpaulding.ocmusicevents;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by jkloppenburg1 on 11/22/2016.
 */
public class MusicEventTest {

    private MusicEvent mMusicEvent;

    @Before
    public void setUp() throws Exception {
        mMusicEvent = new MusicEvent();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getTitle() throws Exception {
        //assertEquals("You done goofed.", "", mMusicEvent.getTitle());
        //assertNull("Expected the title to be NULL", mMusicEvent.getTitle());
        mMusicEvent.setTitle("Test Title");
        assertEquals("Test Title", mMusicEvent.getTitle());
    }

    @Test
    public void getDate() throws Exception {
        mMusicEvent.setDate("Test Date");
        assertEquals("Test Date", mMusicEvent.getDate());
    }


    @Test
    public void getDay() throws Exception {
        mMusicEvent.setDay("Test Day");
        assertEquals("Test Day", mMusicEvent.getDay());
    }


    @Test
    public void getTime() throws Exception {
        mMusicEvent.setTime("Test Time");
        assertEquals("Test Time", mMusicEvent.getTime());
    }


    @Test
    public void getLocation() throws Exception {
        mMusicEvent.setLocation("Test Location");
        assertEquals("Test Location", mMusicEvent.getLocation());
    }


    @Test
    public void getAddress1() throws Exception {
        mMusicEvent.setAddress1("Test Address");
        assertEquals("Test Address", mMusicEvent.getAddress1());
    }


    @Test
    public void getAddress2() throws Exception {
        mMusicEvent.setAddress2("Test Address 2");
        assertEquals("Test Address 2", mMusicEvent.getAddress2());
    }



    @Test
    public void getImageName() throws Exception {
        mMusicEvent.setImageName("Test Image Name");
        assertEquals("Test Image Name", mMusicEvent.getImageName());
    }
}