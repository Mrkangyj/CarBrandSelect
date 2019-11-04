package com.kangyj.carnameselect.model;

import java.util.List;

/**
 * author Mr.kang
 * e-mail:kangyoujie@aliyun.com
 * github:https://github.com/Mrkangyj
 * date 2019-10-09
 * desc
 */
public class CarSries {


    /**
     * status : 1
     * info : [{"id":"5240","group_id":"9","brand_id":"33","full_name":"奥迪Q2L新能源","name":"奥迪Q2L新能源","firstletter":"A","seriesstate":"10","seriesorder":"97"},{"id":"4871","group_id":"9","brand_id":"33","full_name":"奥迪Q2L","name":"奥迪Q2L","firstletter":"A","seriesstate":"10","seriesorder":"87"},{"id":"4851","group_id":"9","brand_id":"33","full_name":"奥迪Q5L","name":"奥迪Q5L","firstletter":"A","seriesstate":"10","seriesorder":"87"},{"id":"4526","group_id":"9","brand_id":"33","full_name":"奥迪A6L新能源","name":"奥迪A6L新能源","firstletter":"A","seriesstate":"20","seriesorder":"84"},{"id":"4460","group_id":"79","brand_id":"33","full_name":"奥迪Q7新能源","name":"奥迪Q7新能源","firstletter":"A","seriesstate":"20","seriesorder":"114"},{"id":"4325","group_id":"79","brand_id":"33","full_name":"奥迪A3新能源(进口)","name":"奥迪A3新能源(进口)","firstletter":"A","seriesstate":"20","seriesorder":"100"},{"id":"4288","group_id":"79","brand_id":"33","full_name":"奥迪Q8","name":"奥迪Q8","firstletter":"A","seriesstate":"10","seriesorder":"119"},{"id":"3894","group_id":"79","brand_id":"33","full_name":"奥迪e-tron","name":"奥迪e-tron","firstletter":"A","seriesstate":"10","seriesorder":"117"},{"id":"3170","group_id":"9","brand_id":"33","full_name":"奥迪A3","name":"奥迪A3","firstletter":"A","seriesstate":"20","seriesorder":"81"},{"id":"2994","group_id":"346","brand_id":"33","full_name":"奥迪RS 7","name":"奥迪RS 7","firstletter":"A","seriesstate":"20","seriesorder":"92"},{"id":"2951","group_id":"9","brand_id":"33","full_name":"奥迪Q3","name":"奥迪Q3","firstletter":"A","seriesstate":"20","seriesorder":"85"},{"id":"2841","group_id":"79","brand_id":"33","full_name":"奥迪SQ5","name":"奥迪SQ5","firstletter":"A","seriesstate":"20","seriesorder":"112"},{"id":"2741","group_id":"346","brand_id":"33","full_name":"奥迪TT RS","name":"奥迪TT RS","firstletter":"A","seriesstate":"20","seriesorder":"94"},{"id":"2740","group_id":"79","brand_id":"33","full_name":"奥迪TTS","name":"奥迪TTS","firstletter":"A","seriesstate":"20","seriesorder":"116"},{"id":"2739","group_id":"79","brand_id":"33","full_name":"奥迪S8","name":"奥迪S8","firstletter":"A","seriesstate":"20","seriesorder":"110"},{"id":"2738","group_id":"79","brand_id":"33","full_name":"奥迪S7","name":"奥迪S7","firstletter":"A","seriesstate":"20","seriesorder":"108"},{"id":"2737","group_id":"346","brand_id":"33","full_name":"奥迪RS 6","name":"奥迪RS 6","firstletter":"A","seriesstate":"20","seriesorder":"91"},{"id":"2736","group_id":"79","brand_id":"33","full_name":"奥迪S6","name":"奥迪S6","firstletter":"A","seriesstate":"20","seriesorder":"106"},{"id":"2735","group_id":"346","brand_id":"33","full_name":"奥迪RS 5","name":"奥迪RS 5","firstletter":"A","seriesstate":"0","seriesorder":"96"},{"id":"2734","group_id":"79","brand_id":"33","full_name":"奥迪S5","name":"奥迪S5","firstletter":"A","seriesstate":"20","seriesorder":"104"},{"id":"2733","group_id":"346","brand_id":"33","full_name":"奥迪RS 4","name":"奥迪RS 4","firstletter":"A","seriesstate":"10","seriesorder":"90"},{"id":"2732","group_id":"79","brand_id":"33","full_name":"奥迪S4","name":"奥迪S4","firstletter":"A","seriesstate":"20","seriesorder":"110"},{"id":"2731","group_id":"346","brand_id":"33","full_name":"奥迪RS 3","name":"奥迪RS 3","firstletter":"A","seriesstate":"20","seriesorder":"90"},{"id":"2730","group_id":"79","brand_id":"33","full_name":"奥迪S3","name":"奥迪S3","firstletter":"A","seriesstate":"20","seriesorder":"101"},{"id":"2264","group_id":"79","brand_id":"33","full_name":"奥迪Q3(进口)","name":"奥迪Q3(进口)","firstletter":"A","seriesstate":"0","seriesorder":"128"},{"id":"812","group_id":"9","brand_id":"33","full_name":"奥迪Q5","name":"奥迪Q5","firstletter":"A","seriesstate":"20","seriesorder":"86"},{"id":"740","group_id":"79","brand_id":"33","full_name":"奥迪A7","name":"奥迪A7","firstletter":"A","seriesstate":"20","seriesorder":"107"},{"id":"692","group_id":"9","brand_id":"33","full_name":"奥迪A4L","name":"奥迪A4L","firstletter":"A","seriesstate":"20","seriesorder":"82"},{"id":"650","group_id":"79","brand_id":"33","full_name":"奥迪A1","name":"奥迪A1","firstletter":"A","seriesstate":"20","seriesorder":"98"},{"id":"593","group_id":"79","brand_id":"33","full_name":"奥迪Q5(进口)","name":"奥迪Q5(进口)","firstletter":"A","seriesstate":"20","seriesorder":"111"},{"id":"538","group_id":"79","brand_id":"33","full_name":"奥迪A5","name":"奥迪A5","firstletter":"A","seriesstate":"20","seriesorder":"103"},{"id":"511","group_id":"346","brand_id":"33","full_name":"奥迪R8","name":"奥迪R8","firstletter":"A","seriesstate":"20","seriesorder":"93"},{"id":"509","group_id":"9","brand_id":"33","full_name":"奥迪A6","name":"奥迪A6","firstletter":"A","seriesstate":"40","seriesorder":"89"},{"id":"472","group_id":"79","brand_id":"33","full_name":"奥迪A6(进口)","name":"奥迪A6(进口)","firstletter":"A","seriesstate":"20","seriesorder":"105"},{"id":"471","group_id":"79","brand_id":"33","full_name":"奥迪A4(进口)","name":"奥迪A4(进口)","firstletter":"A","seriesstate":"20","seriesorder":"102"},{"id":"412","group_id":"79","brand_id":"33","full_name":"奥迪Q7","name":"奥迪Q7","firstletter":"A","seriesstate":"20","seriesorder":"113"},{"id":"370","group_id":"79","brand_id":"33","full_name":"奥迪A3(进口)","name":"奥迪A3(进口)","firstletter":"A","seriesstate":"20","seriesorder":"99"},{"id":"148","group_id":"79","brand_id":"33","full_name":"奥迪TT","name":"奥迪TT","firstletter":"A","seriesstate":"20","seriesorder":"115"},{"id":"146","group_id":"79","brand_id":"33","full_name":"奥迪A8","name":"奥迪A8","firstletter":"A","seriesstate":"20","seriesorder":"109"},{"id":"19","group_id":"9","brand_id":"33","full_name":"奥迪A4","name":"奥迪A4","firstletter":"A","seriesstate":"40","seriesorder":"88"},{"id":"18","group_id":"9","brand_id":"33","full_name":"奥迪A6L","name":"奥迪A6L","firstletter":"A","seriesstate":"20","seriesorder":"83"}]
     * total : 41
     */

    private int status;
    private String total;
    private List<InfoBean> info;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * id : 5240
         * group_id : 9
         * brand_id : 33
         * full_name : 奥迪Q2L新能源
         * name : 奥迪Q2L新能源
         * firstletter : A
         * seriesstate : 10
         * seriesorder : 97
         */

        private String id;
        private String group_id;
        private String brand_id;
        private String full_name;
        private String name;
        private String firstletter;
        private String seriesstate;
        private String seriesorder;

        public InfoBean(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public String getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(String brand_id) {
            this.brand_id = brand_id;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstletter() {
            return firstletter;
        }

        public void setFirstletter(String firstletter) {
            this.firstletter = firstletter;
        }

        public String getSeriesstate() {
            return seriesstate;
        }

        public void setSeriesstate(String seriesstate) {
            this.seriesstate = seriesstate;
        }

        public String getSeriesorder() {
            return seriesorder;
        }

        public void setSeriesorder(String seriesorder) {
            this.seriesorder = seriesorder;
        }
    }
}
