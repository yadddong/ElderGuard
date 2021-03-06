package com.syd.elderguard.utils;

import com.syd.elderguard.entity.EgAcquaintance;
import com.syd.elderguard.entity.EgRelationship;
import com.syd.elderguard.entity.EgStranger;
import com.syd.elderguard.entity.EgUser;
import com.syd.elderguard.entity.EgVisit;
import com.xuexiang.xaop.annotation.MemoryCache;
import com.xuexiang.xhttp2.XHttp;
import com.xuexiang.xui.widget.banner.widget.banner.BannerItem;

import java.util.ArrayList;
import java.util.List;


public class DataProvider {


    public static String[] titles = new String[]{
            "如今老龄化不断加剧",
            "养老问题必须重视",
            "老人的安全伙伴",
    };

    public static String[] urls = new String[]{//640*360 360/640=0.5625
            "http://striveyadong.com/wp-content/uploads/2021/05/3.png",
            "http://striveyadong.com/wp-content/uploads/2021/05/2.png",
            "http://striveyadong.com/wp-content/uploads/2021/05/1.png"

    };

    @MemoryCache
    public static List<BannerItem> getBannerList() {
        List<BannerItem> list = new ArrayList<>();
        for (int i = 0; i < urls.length; i++) {
            BannerItem item = new BannerItem();
            item.imgUrl = urls[i];
            item.title = titles[i];

            list.add(item);
        }
        return list;
    }


    /**
     * 用于占位的空信息
     *
     * @return
     */
    @MemoryCache
    public static List<EgVisit> getEmptyVisitInfo() {
        List<EgVisit> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new EgVisit());
        }
        return list;
    }

    /**
     * 用于占位的空信息
     *
     * @return
     */
    @MemoryCache
    public static List<EgStranger> getEmptyStrVisitInfo() {
        List<EgStranger> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new EgStranger());
        }
        return list;
    }

    /**
     * 用于占位的空信息
     *
     * @return
     */
    @MemoryCache
    public static List<EgAcquaintance> getEmptyAcqVisitInfo() {
        List<EgAcquaintance> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new EgAcquaintance());
        }
        return list;
    }

    /**
     * 用于占位的空信息
     *
     * @return
     */
    @MemoryCache
    public static List<EgRelationship> getEmptyRelaInfo() {
        List<EgRelationship> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new EgRelationship());
        }
        return list;
    }

    public static String getBaseImgUrl() {
        String baseUrl = XHttp.getBaseUrl().trim();
        if (baseUrl.endsWith("/")) {
            return baseUrl + "file/downloadFile/";
        } else {
            return baseUrl + "/file/downloadFile/";
        }

    }

    public static String getVisitImgUrl(EgVisit egVisit) {
        return getBaseImgUrl() + egVisit.getImage();
    }

    public static String getStrVisitImgUrl(EgStranger egStranger) {
        return getBaseImgUrl() + egStranger.getImage();
    }

    public static String getAcqVisitImgUrl(EgAcquaintance egAcquaintance) {
        return getBaseImgUrl() + egAcquaintance.getImage();
    }


    public static String getUserImgUrl(EgUser egUser) {
        return getBaseImgUrl() + egUser.getImage();
    }

    public static String getStrImgUrl(EgStranger egStranger) {
        return getBaseImgUrl() + egStranger.getImage();
    }
    public static String getViImgUrl(EgVisit egVisit) {
        return getBaseImgUrl() + egVisit.getImage();
    }
    public static String getVisitImgUrlWithoutBaseUrl(EgVisit egVisit) {
        return "/file/downloadFile/" + egVisit.getImage();
    }

}
