package com.prototype;

/**
 * @Description: TODO
 * @ClassName CopeUser
 * @Auther: administer
 * @Date: 2019/3/29 17:19
 * @Version 1.0
 */
public class CopyUser implements Cloneable{

    private String name;
    private String birthday;
    private String sex;
    private String school;
    private String timeArea;
    private String company;

    /**
     * 构造函数：初始化简历赋值姓名
     */
    public CopyUser(String name){
        this.name = name;
    }

    /**
     * @desc 设定个人基本信息
     * @param birthday 生日
     * @param sex 性别
     * @param school 毕业学校
     * @return void
     */
    public void setPersonInfo(String birthday,String sex,String school){
        this.birthday = birthday;
        this.sex = sex;
        this.school = school;
    }

    /**
     * @desc 设定工作经历
     * @param timeArea 工作年限
     * @param company 所在公司
     * @return void
     */
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * 克隆该实例
     */
    public Object clone(){
        CopyUser copyUser = null;
        try {
            copyUser = (CopyUser) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copyUser;
    }

    @Override
    public String toString() {
        return "CopyUser{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", school='" + school + '\'' +
                ", timeArea='" + timeArea + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }
}
