package test.prototype;

import com.prototype.CopyUser;

/**
 * @Description: TODO
 * @ClassName PropotypeTest
 * @Auther: administer
 * @Date: 2019/3/29 17:28
 * @Version 1.0
 */
public class PropotypeTest {
    public static void main(String[] args) {
        //原型A对象
        CopyUser copyUser = new CopyUser("张三");
        copyUser.setPersonInfo("2.16", "男", "XX大学");
        copyUser.setWorkExperience("2012.09.05", "XX科技有限公司");

        //克隆B对象
        CopyUser copyUser1 = (CopyUser) copyUser.clone();
        //输出A和B对象
        System.out.println("----------------copyUser--------------");
        copyUser.display();
        System.out.println("----------------copyUser1--------------");
        copyUser1.display();

    }
}
