// Copyright [2020] [Robert Stuart]

//        Licensed under the Apache License, Version 2.0 (the "License");
//        you may not use this file except in compliance with the License.
//        You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//        Unless required by applicable law or agreed to in writing, software
//        distributed under the License is distributed on an "AS IS" BASIS,
//        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//        See the License for the specific language governing permissions and
//        limitations under the License.

/**
 * Basic Structure and code from Lab 6 Demo.
 */


package com.example.simpleparadox.test;
import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CityList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CityListTest {


    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);

        assertEquals(2, cityList.getCities().size());

        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();

        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, ()-> {
            cityList.add(city);
        });
    }
    @Test
    void testGetCities() {
        CityList cityList = mockCityList();

        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        City city = new City("Charlottetown", "PEI");
        cityList.add(city);

        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));

    }

    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        City city1 = new City("Yellowknife", "NT");
        City city2 = new City("Whitehorse", "YK");
        cityList.add(city1);

        assertTrue(cityList.hasCity(city1));
        assertFalse(cityList.hasCity(city2));
    }

    @Test
    void testDeleteCity() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "NT");

        cityList.add(city);
        assertTrue(cityList.hasCity(city));

        cityList.deleteCity(city);
        assertFalse(cityList.hasCity(mockCity()));

    }

    @Test
    void testDeleteCityException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "NT" );
        assertThrows(IllegalArgumentException.class, ()-> {
            cityList.deleteCity(city);
        });
    }

    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        int initSize = cityList.getCities().size();
        assertEquals(initSize, cityList.countCities());

        City city1 = new City("Yellowknife", "NT");
        City city2 = new City("Whitehorse", "YK");

        cityList.add(city1);
        cityList.add(city2);
        initSize+=2;

        assertEquals(initSize, cityList.countCities());
    }

}
