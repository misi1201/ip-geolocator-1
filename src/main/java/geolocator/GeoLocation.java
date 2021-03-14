package geolocator;

import java.util.Objects;

public class GeoLocation {

    private final String as;
    private final String city;
    private final String country;
    private final String countryCode;
    private final String isp;
    private final double lat;
    private final double lon;
    private final String org;
    private final String query;
    private final String region;
    private final String regionName;
    private final String timezone;
    private final String zip;

    public GeoLocation(String as, String city, String country, String countryCode,
                       String isp, double lat, double lon, String org, String query,
                       String region, String regionName, String timezone, String zip) {

        this.as = as;
        this.city = city;
        this.country = country;
        this.countryCode = countryCode;
        this.isp = isp;
        this.lat = lat;
        this.lon = lon;
        this.org = org;
        this.query = query;
        this.region = region;
        this.regionName = regionName;
        this.timezone = timezone;
        this.zip = zip;

    }

    @Override
    public int hashCode() {
        return Objects.hash(as, city, country, countryCode, isp, lat, lon, org, query, region, regionName, timezone, zip);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoLocation that = (GeoLocation) o;
        return Double.compare(that.lat, lat) == 0 && Double.compare(that.lon, lon) == 0 && Objects.equals(as, that.as) && Objects.equals(city, that.city) && Objects.equals(country, that.country) && Objects.equals(countryCode, that.countryCode) && Objects.equals(isp, that.isp) && Objects.equals(org, that.org) && Objects.equals(query, that.query) && Objects.equals(region, that.region) && Objects.equals(regionName, that.regionName) && Objects.equals(timezone, that.timezone) && Objects.equals(zip, that.zip);
    }

    @Override
    public String toString() {
        return "GeoLocation{" +
                "as='" + as + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", isp='" + isp + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", org='" + org + '\'' +
                ", query='" + query + '\'' +
                ", region='" + region + '\'' +
                ", regionName='" + regionName + '\'' +
                ", timezone='" + timezone + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}