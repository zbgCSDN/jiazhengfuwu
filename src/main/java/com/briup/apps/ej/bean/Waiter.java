package com.briup.apps.ej.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotBlank;

@ApiModel("服务员模型")
public class Waiter {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_waiter.id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_waiter.telephone
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    @ApiParam(value = "手机号")
    @NotBlank(message = "手机号不能为空")
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_waiter.password
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */

    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_waiter.realname
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    @ApiParam(value = "真实姓名")
    @NotBlank(message = "真实姓名不能为空")
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_waiter.idcard
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    @ApiParam(value = "卡号")
    @NotBlank(message = "卡号不能为空")
    private String idcard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_waiter.status
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    @ApiParam(value = "状态")
    @NotBlank(message = "状态不能为空")
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_waiter.photo
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */

    private String photo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_waiter.id
     *
     * @return the value of ej_waiter.id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_waiter.id
     *
     * @param id the value for ej_waiter.id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_waiter.telephone
     *
     * @return the value of ej_waiter.telephone
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_waiter.telephone
     *
     * @param telephone the value for ej_waiter.telephone
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_waiter.password
     *
     * @return the value of ej_waiter.password
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_waiter.password
     *
     * @param password the value for ej_waiter.password
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_waiter.realname
     *
     * @return the value of ej_waiter.realname
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_waiter.realname
     *
     * @param realname the value for ej_waiter.realname
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_waiter.idcard
     *
     * @return the value of ej_waiter.idcard
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_waiter.idcard
     *
     * @param idcard the value for ej_waiter.idcard
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_waiter.status
     *
     * @return the value of ej_waiter.status
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_waiter.status
     *
     * @param status the value for ej_waiter.status
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_waiter.photo
     *
     * @return the value of ej_waiter.photo
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_waiter.photo
     *
     * @param photo the value for ej_waiter.photo
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}