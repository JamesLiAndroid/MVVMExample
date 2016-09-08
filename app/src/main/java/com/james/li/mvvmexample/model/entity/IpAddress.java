package com.james.li.mvvmexample.model.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jyj-lsy on 9/8/16 in zsl-tech.
 */
public class IpAddress {

    @SerializedName("ret")
    @Expose
    private Integer ret;
    @SerializedName("start")
    @Expose
    private Integer start;
    @SerializedName("end")
    @Expose
    private Integer end;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("isp")
    @Expose
    private String isp;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("desc")
    @Expose
    private String desc;

    public IpAddress(Integer ret, Integer start, Integer end, String country, String province,
                     String city, String district, String isp, String type, String desc) {
        this.ret = ret;
        this.start = start;
        this.end = end;
        this.country = country;
        this.province = province;
        this.city = city;
        this.district = district;
        this.isp = isp;
        this.type = type;
        this.desc = desc;
    }

    /**
     *
     * @return
     * The ret
     */
    public Integer getRet() {
        return ret;
    }

    /**
     *
     * @param ret
     * The ret
     */
    public void setRet(Integer ret) {
        this.ret = ret;
    }

    /**
     *
     * @return
     * The start
     */
    public Integer getStart() {
        return start;
    }

    /**
     *
     * @param start
     * The start
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     *
     * @return
     * The end
     */
    public Integer getEnd() {
        return end;
    }

    /**
     *
     * @param end
     * The end
     */
    public void setEnd(Integer end) {
        this.end = end;
    }

    /**
     *
     * @return
     * The country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     * The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     * The province
     */
    public String getProvince() {
        return province;
    }

    /**
     *
     * @param province
     * The province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The district
     */
    public String getDistrict() {
        return district;
    }

    /**
     *
     * @param district
     * The district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     *
     * @return
     * The isp
     */
    public String getIsp() {
        return isp;
    }

    /**
     *
     * @param isp
     * The isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @param desc
     * The desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "IP地址归属地信息：{" +
                "ret=" + ret +
                ", start=" + start +
                ", end=" + end +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", isp='" + isp + '\'' +
                ", type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


