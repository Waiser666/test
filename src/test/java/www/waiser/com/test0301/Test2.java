package www.waiser.com.test0301;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * <p>
 *
 * </p>
 *
 * @Author mengwei
 * @Date 2021/1/7
 */
public class Test2 {

    public static void main(String[] args) {
//        String aa = "[123,123,123]";
////        aa.replace("[","");
//        aa = aa.substring(1,aa.length()-1);
////        aa.replace("]","");
//        String[] newActOrgIdArray = aa.split(",");
//        System.out.println(Arrays.toString(newActOrgIdArray));
        String oldAuthOrgName = "[1,2,3,4]";
        String newAuthOrgName = "[2,3,6]";


        String oldActivityOrdName = oldAuthOrgName.substring(1, oldAuthOrgName.length() - 1);
        String newActivityOrdName = newAuthOrgName.substring(1, newAuthOrgName.length() - 1);
        String[] oldActOrgIdArray = oldActivityOrdName.split(",");
        String[] newActOrgIdArray = newActivityOrdName.split(",");
        List<String> strings = Arrays.asList(oldActOrgIdArray);


        List<String> deleteOrg = new ArrayList<>();
        for (int i = 0; i < oldActOrgIdArray.length; i++) {
            boolean isEq=false;
            for (int j = 0; j < newActOrgIdArray.length; j++) {
                if (oldActOrgIdArray[i].equals(newActOrgIdArray[j])) {
                    isEq = true;
                       break;
                }
            }
            if (!isEq) {
                deleteOrg.add(oldActOrgIdArray[i]);
            }
        }





        System.out.println(deleteOrg);







    }
}
//
//    //取要变更的新的关联校区id，判断被取消的校区是否有学生已报名
//    //去掉“[]” 并转化为数组 方便判断差值
//    String oldActivityOrdName = oldActivity.getAuthOrgName().substring(1,oldActivity.getAuthOrgName().length()-1);
//    String newActivityOrdName = newActivity.getAuthOrgName().substring(1,newActivity.getAuthOrgName().length()-1);
//    String[] oldActOrgNameArray = oldActivityOrdName.split(",");
//    String[] newActOrgNameArray = newActivityOrdName.split(",");
//
//    List<String> deleteOrg = new ArrayList<>();
//        for (int i = 0; i < oldActOrgNameArray.length; i++) {
//        boolean isEq=false;
//        for (int j = 0; j < newActOrgNameArray.length; j++) {
//        if (oldActOrgNameArray[i].equals(newActOrgNameArray[j])) {
//        isEq = true;
//        break;
//        }
//        }
//        if (!isEq) {
//        deleteOrg.add(oldActOrgNameArray[i]);
//        }
//        }
//        log.debug("被删除的校区名数组："+deleteOrg);
//判断被删的校区是否有学生报名







