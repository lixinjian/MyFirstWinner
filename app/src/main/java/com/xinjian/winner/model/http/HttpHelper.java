package com.xinjian.winner.model.http;


import com.xinjian.winner.model.bean.CommentBean;
import com.xinjian.winner.model.bean.DailyBeforeListBean;
import com.xinjian.winner.model.bean.DailyListBean;
import com.xinjian.winner.model.bean.DetailExtraBean;
import com.xinjian.winner.model.bean.GankItemBean;
import com.xinjian.winner.model.bean.GankSearchItemBean;
import com.xinjian.winner.model.bean.GoldListBean;
import com.xinjian.winner.model.bean.HotListBean;
import com.xinjian.winner.model.bean.NodeBean;
import com.xinjian.winner.model.bean.NodeListBean;
import com.xinjian.winner.model.bean.RepliesListBean;
import com.xinjian.winner.model.bean.SectionChildListBean;
import com.xinjian.winner.model.bean.SectionListBean;
import com.xinjian.winner.model.bean.ThemeChildListBean;
import com.xinjian.winner.model.bean.ThemeListBean;
import com.xinjian.winner.model.bean.VersionBean;
import com.xinjian.winner.model.bean.WXItemBean;
import com.xinjian.winner.model.bean.WelcomeBean;
import com.xinjian.winner.model.bean.ZhihuDetailBean;
import com.xinjian.winner.model.http.response.GankHttpResponse;
import com.xinjian.winner.model.http.response.GoldHttpResponse;
import com.xinjian.winner.model.http.response.MyHttpResponse;
import com.xinjian.winner.model.http.response.WXHttpResponse;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by Administrator on 2017/5/19 0019.
 */

public interface HttpHelper {

    Flowable<DailyListBean> fetchDailyListInfo();

    Flowable<DailyBeforeListBean> fetchDailyBeforeListInfo(String date);

    Flowable<ThemeListBean> fetchDailyThemeListInfo();

    Flowable<ThemeChildListBean> fetchThemeChildListInfo(int id);

    Flowable<SectionListBean> fetchSectionListInfo();

    Flowable<SectionChildListBean> fetchSectionChildListInfo(int id);

    Flowable<ZhihuDetailBean> fetchDetailInfo(int id);

    Flowable<DetailExtraBean> fetchDetailExtraInfo(int id);

    Flowable<WelcomeBean> fetchWelcomeInfo(String res);

    Flowable<CommentBean> fetchLongCommentInfo(int id);

    Flowable<CommentBean> fetchShortCommentInfo(int id);

    Flowable<HotListBean> fetchHotListInfo();

    Flowable<GankHttpResponse<List<GankItemBean>>> fetchTechList(String tech, int num, int page);

    Flowable<GankHttpResponse<List<GankItemBean>>> fetchGirlList(int num, int page);

    Flowable<GankHttpResponse<List<GankItemBean>>> fetchRandomGirl(int num);

    Flowable<GankHttpResponse<List<GankSearchItemBean>>> fetchGankSearchList(String query, String type, int num, int page);

    Flowable<WXHttpResponse<List<WXItemBean>>> fetchWechatListInfo(int num, int page);

    Flowable<WXHttpResponse<List<WXItemBean>>> fetchWechatSearchListInfo(int num, int page, String word);

    Flowable<MyHttpResponse<VersionBean>> fetchVersionInfo();

    Flowable<GoldHttpResponse<List<GoldListBean>>> fetchGoldList(String type, int num, int page);

    Flowable<GoldHttpResponse<List<GoldListBean>>> fetchGoldHotList(String type, String dataTime, int limit);

    Flowable<NodeBean> fetchNodeInfo(String name);

    Flowable<List<NodeListBean>> fetchTopicList(String name);

    Flowable<List<NodeListBean>> fetchTopicInfo(String id);

    Flowable<List<RepliesListBean>> fetchRepliesList(String id);
}
