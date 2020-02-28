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

public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructor for City Objects
     * @param city
     * This is a string representation of a city name
     * @param province
     * This is a string representation of a province name
     */

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns string of city name
     * @return
     * Return string city
     */

    String getCityName(){
        return this.city;
    }

    /**
     * Returns string of province name
     * @return
     * Return string province
     */

    String getProvinceName(){
        return this.province;
    }

    /**
     * Compare function to compare two city objects
     * @param city
     * This is a city object
     * @return
     * Returns an int representation following the compare function
     */

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}
