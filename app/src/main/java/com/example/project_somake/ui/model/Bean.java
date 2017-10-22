package com.example.project_somake.ui.model;

import java.util.List;

public class Bean {


    /**
     * isSuccessful : true
     * statusCode : 200
     *  description :
     * userId :
     * data : {"nowcount":37,"futurecount":20,"categorys":[{"name":"热销","categoryid":"391,7119","type":4},{"name":"女装","categoryid":"10000702","type":1},{"name":"男装","categoryid":"10000667","type":1},{"name":"箱包","categoryid":"10000500","type":1},{"name":"鞋靴","categoryid":"10000844","type":1},{"name":"名品","categoryid":"10001884","type":1},{"name":"家居","categoryid":"10000305","type":1},{"name":"内衣","categoryid":"10000646","type":1},{"name":"婴童","categoryid":"10000818","type":1}],"bookingcount":0,"page_count":0,"current_page":0,"record_count":37,"isbooking":false,"activityinfo":[{"starttime":"星期四(2017年10月19日)","activitylist":[{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26974,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-658.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520040016508074.jpg","leftsecond":"418405","name":"GLM 轻暖时光 森马旗下男装潮牌","discount":"1.4-5.4折","title":"GLM 轻暖时光 森马旗下男装潮牌","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-658.jpg","brandname":"GENIO LaMODE     "},{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26975,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-124.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520040668652256.jpg","leftsecond":"418405","name":"李宁&锐步 个性释放，自由不羁","discount":"2.5-7.0折","title":"李宁&锐步 个性释放，自由不羁","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-124.jpg","brandname":"锐步"},{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26976,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-122.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520787725312266.jpg","leftsecond":"418405","name":"匡威&彪马 极简经典 摩登时尚","discount":"3.5-7.9折","title":"匡威&彪马 极简经典 摩登时尚","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-122.jpg","brandname":"匡威"},{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26977,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-2949.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520041886687308.jpg","leftsecond":"418405","name":"JESSIE&JANE 不一样的你","discount":"2.0-6.7折","title":"JESSIE&JANE 不一样的你","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-2949.jpg","brandname":"JESSIE & JANE"}]}]}
     */

    private String isSuccessful;
    private String statusCode;
    private String description;
    private String userId;
    private DataBean data;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getIsSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(String isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public static class DataBean {
        /**
         * nowcount : 37
         * futurecount : 20
         * categorys : [{"name":"热销","categoryid":"391,7119","type":4},{"name":"女装","categoryid":"10000702","type":1},{"name":"男装","categoryid":"10000667","type":1},{"name":"箱包","categoryid":"10000500","type":1},{"name":"鞋靴","categoryid":"10000844","type":1},{"name":"名品","categoryid":"10001884","type":1},{"name":"家居","categoryid":"10000305","type":1},{"name":"内衣","categoryid":"10000646","type":1},{"name":"婴童","categoryid":"10000818","type":1}]
         * bookingcount : 0
         * page_count : 0
         * current_page : 0
         * record_count : 37
         * isbooking : false
         * activityinfo : [{"starttime":"星期四(2017年10月19日)","activitylist":[{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26974,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-658.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520040016508074.jpg","leftsecond":"418405","name":"GLM 轻暖时光 森马旗下男装潮牌","discount":"1.4-5.4折","title":"GLM 轻暖时光 森马旗下男装潮牌","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-658.jpg","brandname":"GENIO LaMODE     "},{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26975,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-124.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520040668652256.jpg","leftsecond":"418405","name":"李宁&锐步 个性释放，自由不羁","discount":"2.5-7.0折","title":"李宁&锐步 个性释放，自由不羁","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-124.jpg","brandname":"锐步"},{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26976,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-122.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520787725312266.jpg","leftsecond":"418405","name":"匡威&彪马 极简经典 摩登时尚","discount":"3.5-7.9折","title":"匡威&彪马 极简经典 摩登时尚","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-122.jpg","brandname":"匡威"},{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26977,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-2949.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520041886687308.jpg","leftsecond":"418405","name":"JESSIE&JANE 不一样的你","discount":"2.0-6.7折","title":"JESSIE&JANE 不一样的你","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-2949.jpg","brandname":"JESSIE & JANE"}]}]
         */

        private int nowcount;
        private int futurecount;
        private int bookingcount;
        private int page_count;
        private int current_page;
        private int record_count;
        private boolean isbooking;
        private List<CategorysBean> categorys;
        private List<ActivityinfoBean> activityinfo;

        public static DataBean objectFromData(String str) {

            return new com.google.gson.Gson().fromJson(str, DataBean.class);
        }

        public static DataBean objectFromData(String str, String key) {

            try {
                org.json.JSONObject jsonObject = new org.json.JSONObject(str);

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), DataBean.class);
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<DataBean> arrayDataBeanFromData(String str) {

            java.lang.reflect.Type listType = new com.google.gson.reflect.TypeToken<java.util.ArrayList<DataBean>>() {
            }.getType();

            return new com.google.gson.Gson().fromJson(str, listType);
        }

        public int getNowcount() {
            return nowcount;
        }

        public void setNowcount(int nowcount) {
            this.nowcount = nowcount;
        }

        public int getFuturecount() {
            return futurecount;
        }

        public void setFuturecount(int futurecount) {
            this.futurecount = futurecount;
        }

        public int getBookingcount() {
            return bookingcount;
        }

        public void setBookingcount(int bookingcount) {
            this.bookingcount = bookingcount;
        }

        public int getPage_count() {
            return page_count;
        }

        public void setPage_count(int page_count) {
            this.page_count = page_count;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getRecord_count() {
            return record_count;
        }

        public void setRecord_count(int record_count) {
            this.record_count = record_count;
        }

        public boolean isIsbooking() {
            return isbooking;
        }

        public void setIsbooking(boolean isbooking) {
            this.isbooking = isbooking;
        }

        public List<CategorysBean> getCategorys() {
            return categorys;
        }

        public void setCategorys(List<CategorysBean> categorys) {
            this.categorys = categorys;
        }

        public List<ActivityinfoBean> getActivityinfo() {
            return activityinfo;
        }

        public void setActivityinfo(List<ActivityinfoBean> activityinfo) {
            this.activityinfo = activityinfo;
        }

        public static class CategorysBean {
            /**
             * name : 热销
             * categoryid : 391,7119
             * type : 4
             */

            private String name;
            private String categoryid;
            private int type;
            public static CategorysBean objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, CategorysBean.class);
            }

            public static CategorysBean objectFromData(String str, String key) {

                try {
                    org.json.JSONObject jsonObject = new org.json.JSONObject(str);

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), CategorysBean.class);
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static  List<CategorysBean> arrayCategorysBeanFromData(String str) {

                java.lang.reflect.Type listType = new com.google.gson.reflect.TypeToken<java.util.ArrayList<CategorysBean>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(str, listType);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCategoryid() {
                return categoryid;
            }

            public void setCategoryid(String categoryid) {
                this.categoryid = categoryid;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }

        public static class ActivityinfoBean {
            /**
             * starttime : 星期四(2017年10月19日)
             * activitylist : [{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26974,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-658.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520040016508074.jpg","leftsecond":"418405","name":"GLM 轻暖时光 森马旗下男装潮牌","discount":"1.4-5.4折","title":"GLM 轻暖时光 森马旗下男装潮牌","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-658.jpg","brandname":"GENIO LaMODE     "},{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26975,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-124.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520040668652256.jpg","leftsecond":"418405","name":"李宁&锐步 个性释放，自由不羁","discount":"2.5-7.0折","title":"李宁&锐步 个性释放，自由不羁","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-124.jpg","brandname":"锐步"},{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26976,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-122.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520787725312266.jpg","leftsecond":"418405","name":"匡威&彪马 极简经典 摩登时尚","discount":"3.5-7.9折","title":"匡威&彪马 极简经典 摩登时尚","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-122.jpg","brandname":"匡威"},{"starttime":"2017-10-19T10:00:00","endtime":"2017-10-24T08:00:00","appimglabel":1,"salelabelname":null,"id":26977,"islabel":0,"logoimage":"https://p10.ytrss.com/brand/brandlist/brand-2949.jpg","imgurl":"https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520041886687308.jpg","leftsecond":"418405","name":"JESSIE&JANE 不一样的你","discount":"2.0-6.7折","title":"JESSIE&JANE 不一样的你","tagurl":"https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png","logo":"https://p10.ytrss.com/brand/brandstore/brand-2949.jpg","brandname":"JESSIE & JANE"}]
             */

            private String starttime;
            private List<ActivitylistBean> activitylist;

            public static ActivityinfoBean objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, ActivityinfoBean.class);
            }

            public static ActivityinfoBean objectFromData(String str, String key) {

                try {
                    org.json.JSONObject jsonObject = new org.json.JSONObject(str);

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), ActivityinfoBean.class);
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ActivityinfoBean> arrayActivityinfoBeanFromData(String str) {

                java.lang.reflect.Type listType = new com.google.gson.reflect.TypeToken<java.util.ArrayList<ActivityinfoBean>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(str, listType);
            }
            public String getStarttime() {
                return starttime;
            }

            public void setStarttime(String starttime) {
                this.starttime = starttime;
            }

            public List<ActivitylistBean> getActivitylist() {
                return activitylist;
            }

            public void setActivitylist(List<ActivitylistBean> activitylist) {
                this.activitylist = activitylist;
            }

            public static class ActivitylistBean {
                /**
                 * starttime : 2017-10-19T10:00:00
                 * endtime : 2017-10-24T08:00:00
                 * appimglabel : 1
                 * salelabelname : null
                 * id : 26974
                 * islabel : 0
                 * logoimage : https://p10.ytrss.com/brand/brandlist/brand-658.jpg
                 * imgurl : https://r.ytrss.com/rs/img/product/bargainproduct/bargain_AppTheme131520040016508074.jpg
                 * leftsecond : 418405
                 * name : GLM 轻暖时光 森马旗下男装潮牌
                 * discount : 1.4-5.4折
                 * title : GLM 轻暖时光 森马旗下男装潮牌
                 * tagurl : https://p10.ytrss.com/category/shouyebiaoqiao_640_1.png
                 * logo : https://p10.ytrss.com/brand/brandstore/brand-658.jpg
                 * brandname : GENIO LaMODE
                 */

                private String starttime;
                private String endtime;
                private int appimglabel;
                private Object salelabelname;
                private int id;
                private int islabel;
                private String logoimage;
                private String imgurl;
                private String leftsecond;
                private String name;
                private String discount;
                private String title;
                private String tagurl;
                private String logo;
                private String brandname;

                public static ActivitylistBean objectFromData(String str) {

                    return new com.google.gson.Gson().fromJson(str, ActivitylistBean.class);
                }

                public static ActivitylistBean objectFromData(String str, String key) {

                    try {
                        org.json.JSONObject jsonObject = new org.json.JSONObject(str);

                        return new com.google.gson.Gson().fromJson(jsonObject.getString(str), ActivitylistBean.class);
                    } catch (org.json.JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<ActivitylistBean> arrayActivitylistBeanFromData(String str) {

                    java.lang.reflect.Type listType = new com.google.gson.reflect.TypeToken<java.util.ArrayList<ActivitylistBean>>() {
                    }.getType();

                    return new com.google.gson.Gson().fromJson(str, listType);
                }

                public String getStarttime() {
                    return starttime;
                }

                public void setStarttime(String starttime) {
                    this.starttime = starttime;
                }

                public String getEndtime() {
                    return endtime;
                }

                public void setEndtime(String endtime) {
                    this.endtime = endtime;
                }

                public int getAppimglabel() {
                    return appimglabel;
                }

                public void setAppimglabel(int appimglabel) {
                    this.appimglabel = appimglabel;
                }

                public Object getSalelabelname() {
                    return salelabelname;
                }

                public void setSalelabelname(Object salelabelname) {
                    this.salelabelname = salelabelname;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getIslabel() {
                    return islabel;
                }

                public void setIslabel(int islabel) {
                    this.islabel = islabel;
                }

                public String getLogoimage() {
                    return logoimage;
                }

                public void setLogoimage(String logoimage) {
                    this.logoimage = logoimage;
                }

                public String getImgurl() {
                    return imgurl;
                }

                public void setImgurl(String imgurl) {
                    this.imgurl = imgurl;
                }

                public String getLeftsecond() {
                    return leftsecond;
                }

                public void setLeftsecond(String leftsecond) {
                    this.leftsecond = leftsecond;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDiscount() {
                    return discount;
                }

                public void setDiscount(String discount) {
                    this.discount = discount;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getTagurl() {
                    return tagurl;
                }

                public void setTagurl(String tagurl) {
                    this.tagurl = tagurl;
                }

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public String getBrandname() {
                    return brandname;
                }

                public void setBrandname(String brandname) {
                    this.brandname = brandname;
                }
            }
        }
    }
}