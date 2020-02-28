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

package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *  This is a class that keeps track of a list of city objects
 */

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *  This is a candidate city to add
     */

    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     *  This returns a sorted list of cities
     * @return
     *  Return a sorted list
     */

    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     *  This returns a boolean corresponding to whether the given city exists in the list already
     * @param city
     *  This is the city to check for in the list
     * @return
     *  Return a boolean
     */

    public boolean hasCity(City city) {
        if (cities.contains(city)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     *  This checks if a city exists and if so deletes it
     * @param city
     *  This is the city to be deleted
     */
    public void deleteCity(City city) {
        if (this.hasCity(city)) {
            cities.remove(city);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    /**
     *  This returns the number of cities in the list
     * @return
     *  Return size of the list
     */
    public int countCities() {
        return cities.size();
    }

}
