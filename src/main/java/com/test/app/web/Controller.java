package com.test.app.web;

import com.test.app.pojo.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private BaseStationInfoItem baseStationInfoItem;

    @RequestMapping("/BaseStation/init")
    public List<BaseStationItem> initBaseStation() {
        System.out.println("/BaseStation/init");
        List<BaseStationItem> baseStationItems = new ArrayList<>();
        BaseStationItem baseStationItem1=new BaseStationItem("CentralPark-Ring1-gNodeB1",
                "部署状态   Online", "运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem1);
        BaseStationItem baseStationItem2=new BaseStationItem("CentralPark-Ring1-gNodeB2",
                "部署状态   Online", "运行状态   Failure",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem2);
        BaseStationItem baseStationItem3=new BaseStationItem("CentralPark-Ring1-gNodeB3",
                "部署状态   Planning", "运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem3);
        BaseStationItem baseStationItem4=new BaseStationItem("CentralPark-Ring1-gNodeB4",
                "部署状态   Planning", "运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem4);
        BaseStationItem baseStationItem5=new BaseStationItem("CentralPark-Ring1-gNodeB5",
                "部署状态   Online", "运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem5);
        BaseStationItem baseStationItem6=new BaseStationItem("CentralPark-Ring1-gNodeB6",
                "部署状态   Planning", "运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem6);
        return baseStationItems;
    }

    @RequestMapping("/BaseStation/getData")
    public BaseStationInfoItem returnDataBaseStation(@RequestParam("address") String address) {
        System.out.println("/BaseStation/getData");
        baseStationInfoItem.setAddress(address);
        baseStationInfoItem.setCity("南京EMBB");
        baseStationInfoItem.setCommunity("雨花台区");
        baseStationInfoItem.setDeploymentStatus("Failure");
        baseStationInfoItem.setOperatingStatus("Normal");
        baseStationInfoItem.setRemarks("xxxxxxxxxxxxxxxx");
        baseStationInfoItem.setTime("2020-04-12 20:55:21");
        baseStationInfoItem.setUNIInterface("ETH 2/3/4");
        baseStationInfoItem.setVpnName("eMBB");
        baseStationInfoItem.setType("gNodeB");
        return baseStationInfoItem;
    }

    @Autowired
    EquipmentInfoItem equipmentInfoItem;
    @RequestMapping("/Equipment/init")
    public List<EquipmentItem> initEquipment() {
        System.out.println("/Equipment/init");
        List<EquipmentItem> equipmentItems = new ArrayList<>();
        EquipmentItem equipmentItem1=new EquipmentItem("ConcertHall-Ring1-CSG1",
                "上线状态   Failure","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem1);
        EquipmentItem equipmentItem2=new EquipmentItem("ConcertHall-Ring1-CSG2",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem2);
        EquipmentItem equipmentItem3=new EquipmentItem("ConcertHall-Ring1-CSG3",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem3);
        EquipmentItem equipmentItem4=new EquipmentItem("ConcertHall-Ring1-CSG4",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem4);
        EquipmentItem equipmentItem5=new EquipmentItem("ConcertHall-Ring1-CSG5",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem5);
        EquipmentItem equipmentItem6=new EquipmentItem("ConcertHall-Ring1-CSG6",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem6);
        return equipmentItems;
    }

    @RequestMapping("/Equipment/getData")
    public EquipmentInfoItem returnDataEquipment(@RequestParam("address") String address) {
        System.out.println("/Equipment/getData");
        System.out.println("/Equipment/getData");
        equipmentInfoItem.setAddress(address);
        equipmentInfoItem.setCity("北京EMBB");
        equipmentInfoItem.setCommunity("雨花台区");
        equipmentInfoItem.setDeploymentStatus("Failure");   //这行
        equipmentInfoItem.setOperatingStatus("Normal");     //还有这行，跟EquipmentInfoItem中的信息重复
        equipmentInfoItem.setRemarks("xxxxxxxxxxxxxxxx");
        equipmentInfoItem.setTime("2020-04-12 20:55:21");
        equipmentInfoItem.setUNIInterface("ETH 2/3/4");
        equipmentInfoItem.setVpnName("eMBB");
        equipmentInfoItem.setType("gNodeB");
        return equipmentInfoItem;
    }

    @RequestMapping("/Area/init")
    public List<AreaActivityItem> initArea() {
        System.out.println("/Area/init");
        List<AreaActivityItem> areaActivityItemList = new ArrayList<>();
        AreaActivityItem areaActivityItem1=new AreaActivityItem("南京EMBB",
                "2018-11-13 12:02:00", "admin", "南京EMBB");
        areaActivityItemList.add(areaActivityItem1);
        AreaActivityItem areaActivityItem2=new AreaActivityItem("无锡EMBB",
                "2018-11-13 12:02:00", "admin", "无锡EMBB");
        areaActivityItemList.add(areaActivityItem2);
        AreaActivityItem areaActivityItem3=new AreaActivityItem("扬州EMBB",
                "2018-11-13 12:02:00", "admin", "扬州EMBB");
        areaActivityItemList.add(areaActivityItem3);
        AreaActivityItem areaActivityItem4=new AreaActivityItem("上海EMBB",
                "2018-11-13 12:02:00", "admin", "上海EMBB");
        areaActivityItemList.add(areaActivityItem4);
        AreaActivityItem areaActivityItem5=new AreaActivityItem("北京EMBB",
                "2018-11-13 12:02:00", "admin", "北京EMBB");
        areaActivityItemList.add(areaActivityItem5);
        return areaActivityItemList;
    }

    @RequestMapping("/Overview/init")
    public GraphicInfoItem initOverview() {
        System.out.println("/Overview/init");
        GraphicInfoItem graphicInfoItem=new GraphicInfoItem(400, 400, 180, 4,
                50, 85, 72, 65, 42, 15);
        return graphicInfoItem;
    }

    @RequestMapping("/update")
    public Update update() {
        System.out.println("/update");
        Update update=new Update();
        update.setStatus(true);
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        update.setList(list);
        return update;
    }
}
