package com.xinjian.winner.model.http;

import com.xinjian.winner.model.bean.CommentBean;

import io.reactivex.Flowable;

/**
 * Created by Administrator on 2017/5/19 0019.
 */

public class RetrofitHelper implements HttpHelper {


    @Override
    public Flowable<CommentBean> fetchDailyListInfo() {
        return null;
    }
}
