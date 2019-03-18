package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс ProfilesTest
 * @author Ilya Osipov (mailto:bullet3425@yandex.ru)
 * @since 15.03.2019
 * @version $Id$
 */

public class ProfilesTest {
    private Address addressOne = new Address("CityOne", "StreetOne", 1, 1);
    private Address addressTwo = new Address("CityTwo", "StreetTwo", 2, 2);
    private Address addressThree = new Address("CityThree", "StreetThree", 3, 3);
    private Address addressFour = new Address("CityThree", "StreetThree", 3, 3);
    private List<Profile> list = Arrays.asList(
            new Profile(addressOne),
            new Profile(addressTwo),
            new Profile(addressThree),
            new Profile(addressFour)
    );

    @Test
    public void whenCollectingAddressesToList() {
        Profiles profiles = new Profiles();
        List<Address> expected = Arrays.asList(
                addressOne,
                addressThree,
                addressTwo
        );
        List<Address> result = profiles.collect(list);
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectingAddressesToListGetOneAddressCity() {
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(list);
        assertThat(result.get(0).getCity(), is("CityOne"));
    }

    @Test
    public void whenCollectingAddressesToListGetOneAddressHome() {
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(list);
        assertThat(result.get(2).getHome(), is(2));
    }
}