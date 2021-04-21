/* *********************************************************************
 * This Original Work is copyright of 51 Degrees Mobile Experts Limited.
 * Copyright 2019 51 Degrees Mobile Experts Limited, 5 Charlotte Close,
 * Caversham, Reading, Berkshire, United Kingdom RG4 7BY.
 *
 * This Original Work is licensed under the European Union Public Licence (EUPL) 
 * v.1.2 and is subject to its terms as set out below.
 *
 * If a copy of the EUPL was not distributed with this file, You can obtain
 * one at https://opensource.org/licenses/EUPL-1.2.
 *
 * The 'Compatible Licences' set out in the Appendix to the EUPL (as may be
 * amended by the European Commission) shall be deemed incompatible for
 * the purposes of the Work and the provisions of the compatibility
 * clause in Article 5 of the EUPL shall not apply.
 * 
 * If using the Work as, or as part of, a network application, by 
 * including the attribution notice(s) required under Article 5 of the EUPL
 * in the end user terms of the application under an appropriate heading, 
 * such notice(s) shall fulfill the requirements of that article.
 * ********************************************************************* */

package fiftyone.geolocation;

public class Constants {
    public static final String TEST_LAT = "51.457714";
    public static final String TEST_LON = "-0.975973";    
    public static final String RESOURCE_KEY_ENV_VAR = "SuperResourceKey";
    // For some reason, the value of the 'county' property returned
    // by the call to the cloud is always null on the build agent,
    // despite working correctly locally.
    // After spending the best part of a day trying to resolve this,
    // we've  decided to exclude the county property from this test
    // for the moment.
    public static final String[] ExcludedProperties = { "County" };
}
