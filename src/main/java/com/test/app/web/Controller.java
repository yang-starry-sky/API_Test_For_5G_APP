package com.test.app.web;

import com.test.app.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private BaseStationInfoItem baseStationInfoItem;
    @Autowired
    private BaseStationItem baseStationItem;

    @RequestMapping("/BaseStation/init")
    public List<BaseStationItem> initBaseStation() {
        System.out.println("hello");
        List<BaseStationItem> baseStationItems = new ArrayList<>();
        baseStationItem.setAll("CentralPark-Ring1-gNodeB1",
                "上线状态   Failure", "运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem);
        baseStationItem.setAll("CentralPark-Ring1-gNodeB2",
                "上线状态   Online", "运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem);
        baseStationItem.setAll("CentralPark-Ring1-gNodeB3",
                "上线状态   Planning", "运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem);
        baseStationItem.setAll("CentralPark-Ring1-gNodeB4",
                "上线状态   Planning", "运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem);
        baseStationItem.setAll("CentralPark-Ring1-gNodeB5",
                "上线状态   Planning", "运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem);
        baseStationItem.setAll("CentralPark-Ring1-gNodeB6",
                "上线状态   Planning", "运行状态   Unknown",
                "上线时间   2020-04-12 20:55:21");
        baseStationItems.add(baseStationItem);
        return baseStationItems;
    }

    @RequestMapping("/BaseStation/getData")
    public BaseStationInfoItem returnDataBaseStation(@RequestParam("address") String address) {
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
    @Autowired
    EquipmentItem equipmentItem;
    @RequestMapping("/Equipment/init")
    public List<EquipmentItem> initEquipment() {
        System.out.println("hello");
        List<EquipmentItem> equipmentItems = new ArrayList<>();
        equipmentItem.setAll("ConcertHall-Ring1-CSG1",
                "上线状态   Failure","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem);
        equipmentItem.setAll("ConcertHall-Ring1-CSG2",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem);
        equipmentItem.setAll("ConcertHall-Ring1-CSG3",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem);
        equipmentItem.setAll("ConcertHall-Ring1-CSG4",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem);
        equipmentItem.setAll("ConcertHall-Ring1-CSG5",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem);
        equipmentItem.setAll("ConcertHall-Ring1-CSG6",
                "上线状态   Online","运行状态   Normal",
                "上线时间   2020-04-12 20:55:21");
        equipmentItems.add(equipmentItem);
        return equipmentItems;
    }

    @RequestMapping("/Equipment/getData")
    public EquipmentInfoItem returnDataEquipment(@RequestParam("address") String address) {
        equipmentInfoItem.setAddress(address);
        equipmentInfoItem.setCity("南京EMBB");
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
        System.out.println("hello");
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
}
