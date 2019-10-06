package com.lengedyun.unitednations.version1;

/**
 * @author zjy
 * @title: UnitedNationsCilent_V1
 * @projectName design-patterns
 * @description: TODO
 * @date 2019/10/6 14:46
 */
public class UnitedNationsCilent_V1 {

    public static void main(String[] args) {
        System.out.println("---------联合国客户端----------");
        UniteNationsSecurityCouncil unitedNationsV1 = new UniteNationsSecurityCouncil();

        USA usa = new USA(unitedNationsV1);
        China china = new China(unitedNationsV1);

        unitedNationsV1.setChina(china);
        unitedNationsV1.setUsa(usa);

        china.notifyMsg("特朗普，过来");
        usa.notifyMsg("中国，过来");
    }
}
