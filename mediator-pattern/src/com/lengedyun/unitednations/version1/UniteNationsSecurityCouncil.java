package com.lengedyun.unitednations.version1;

/**
 * @author zjy
 * @title: UniteNationsSecurityCouncil
 * @projectName design-patterns
 * @description: 联合国安理会
 * @date 2019/10/6 14:35
 */
public class UniteNationsSecurityCouncil extends UnitedNations_V1{

    private China china;

    private USA usa;

    public void setChina(China china) {
        this.china = china;
    }

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    @Override
    public void declare(String msg, Country_V1 countryV1) {
        if(countryV1 instanceof USA){
            china.notifyMsg(msg);
        }else if(countryV1 instanceof China){
            usa.notifyMsg(msg);
        }
    }
}
