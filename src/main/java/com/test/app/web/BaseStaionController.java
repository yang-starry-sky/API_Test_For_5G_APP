package com.test.app.web;

import com.test.app.pojo.BaseStaion.BaseStationInfoItem;
import com.test.app.pojo.BaseStaion.BaseStationItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BaseStaionController {
    @Autowired
    private BaseStationInfoItem baseStationInfoItem;
    @Autowired
    private BaseStationItem baseStationItem;

    @RequestMapping("/BaseStation/init")
    public List<BaseStationItem> init() {
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
    public BaseStationInfoItem returnData(@RequestParam("address") String address) {
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
}
