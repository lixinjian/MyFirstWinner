package com.xinjian.winner.app;

import android.os.Environment;

import java.io.File;

/**
 * Created by Administrator on 2017/5/19 0019.
 * 存放常量
 */

public class Constants {

    //================= TYPE ====================

    public static final int TYPE_ZHIHU = 101;

    public static final int TYPE_ANDROID = 102;

    public static final int TYPE_IOS = 103;

    public static final int TYPE_WEB = 104;

    public static final int TYPE_GIRL = 105;

    public static final int TYPE_WECHAT = 106;

    public static final int TYPE_GANK = 107;

    public static final int TYPE_GOLD = 108;

    public static final int TYPE_VTEX = 109;

    public static final int TYPE_SETTING = 110;

    public static final int TYPE_LIKE = 111;

    public static final int TYPE_ABOUT = 112;


    //    public static final String KEY_API = "f95283476506aa756559dd28a56f0c0b"; //需要APIKEY请去 http://apistore.baidu.com/ 申请,复用会减少访问可用次数
//    public static final String KEY_API = "123456";//"52b7ec3471ac3bec6846577e79f20e4c"; //需要APIKEY请去 http://www.tianapi.com/#wxnew 申请,复用会减少访问可用次数

//    public static final String KEY_ALIPAY = "123456";//"aex07566wvayrgxicnaraae";

//    public static final String LEANCLOUD_ID = "123456";//"mhke0kuv33myn4t4ghuid4oq2hjj12li374hvcif202y5bm6";

//    public static final String LEANCLOUD_SIGN = "123456";//"badc5461a25a46291054b902887a68eb,1480438132702";

    public static final String BUGLY_ID = "4e7061077d";//"257700f3f8";



    //================= PATH ====================
    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "codeest" + File.separator + "GeekNews";

    public static final String KEY_API = "";//"52b7ec3471ac3bec6846577e79f20e4c"; //需要APIKEY请去 http://www.tianapi.com/#wxnew 申请,复用会减少访问可用次数

    public static final String LEANCLOUD_ID = "mhke0kuv33myn4t4ghuid4oq2hjj12li374hvcif202y5bm6";

    public static final String LEANCLOUD_SIGN = "badc5461a25a46291054b902887a68eb,1480438132702";

    //================= PREFERENCE ====================

    public static final String SP_NIGHT_MODE = "night_mode";

    public static final String SP_NO_IMAGE = "no_image";

    public static final String SP_AUTO_CACHE = "auto_cache";

    public static final String SP_CURRENT_ITEM = "current_item";

    public static final String SP_LIKE_POINT = "like_point";

    public static final String SP_VERSION_POINT = "version_point";

    public static final String SP_MANAGER_POINT = "manager_point";
}
