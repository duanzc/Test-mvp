package com.yj.test.main2;

import java.util.List;

public class PicBean {


    /**
     * errno : 0
     * errmsg : 正常
     * consume : 4
     * total : 16
     */

    private String errno;
    private String errmsg;
    private String consume;
    private String total;
    private List<DataBean> data;

    public String getErrno() {
        return errno;
    }

    public void setErrno(String errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getConsume() {
        return consume;
    }

    public void setConsume(String consume) {
        this.consume = consume;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 36
         * name : 4K专区
         * totalcnt : 2714
         * create_time : 2015-12-08 13:50:44
         * displaytype :
         * tempdata :
         */

        private String id;
        private String name;
        private String totalcnt;
        private String create_time;
        private String displaytype;
        private String tempdata;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTotalcnt() {
            return totalcnt;
        }

        public void setTotalcnt(String totalcnt) {
            this.totalcnt = totalcnt;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getDisplaytype() {
            return displaytype;
        }

        public void setDisplaytype(String displaytype) {
            this.displaytype = displaytype;
        }

        public String getTempdata() {
            return tempdata;
        }

        public void setTempdata(String tempdata) {
            this.tempdata = tempdata;
        }
    }
}
