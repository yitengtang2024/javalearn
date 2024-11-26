package com.yiteng.test2;
/*
*verbal version street fighter
* practice for javabean class
* private, default setting
* need create a Role class with name, HP amount,gender,appearance, method need action that attack
 */

import java.util.Random;

public class Role {
    //private attribute
    //use this two arr to set the random appearance
    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};
    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };
    private String name;
    private int hp;
    private String gender;
    // set appearance
    private String face;

    //set the defaulat with and without attribute
    public Role(){};
    public Role(String name, int hp, String gender){
        this.name = name;
        this.hp =hp;
        this.gender = gender;
        //set random face
        setFace(gender);
    };


    //set and get method for each attribute
    public String getName(){
        return name;
    }
    public int getHP(){
        return hp;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHP(int hp){
        this.hp = hp;
    }
    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}
    public String getFace(){return face;}
    public void setFace(String gender){
        Random random = new Random();
        int index = random.nextInt(boyfaces.length);
        if(gender.equals("male")){
            this.face = boyfaces[index];
        }else if(gender.equals("female")){
            this.face = girlfaces[index];
        }else{
            this.face = "面目狰狞";
        }
    }

    //actions or method
    //who attach first
    //random int for each attach damage
    //deterimen the remain hp if less than 0 go back to 0
    public void attach(Role role){
        Random r = new Random();
        int attach = r.nextInt(20);
        int remainHp = role.getHP();
        remainHp = remainHp - attach;
        remainHp = remainHp<0? 0: remainHp;
        role.setHP(remainHp);
        int randomAttachIndex = r.nextInt(attacks_desc.length);
        String attachDesc = attacks_desc[randomAttachIndex];
        int randomInjuryIndex = r.nextInt(1,injureds_desc.length);
        String injuryDesc = "";
        if (attach == 0){
            injuryDesc = injureds_desc[0];
        }else{
            injuryDesc = injureds_desc[randomInjuryIndex];
        }

        System.out.printf(attachDesc,this.getName(),role.getName());
        System.out.println();
        System.out.printf(injuryDesc,role.getName());
        System.out.println();
        System.out.printf("%s made %s damage on %s", this.getName(),attach, role.getName());
        System.out.println();
        System.out.printf("%s has %s HP left.", role.getName(), remainHp);
        System.out.println();
    }
    public void showRoleInfo(Role role){
        System.out.println("The name is "+role.getName());
        System.out.println("The hp is "+role.getHP());
        System.out.println("The gender is "+role.getGender());
        System.out.println("The face is "+role.getFace());
    }
}
