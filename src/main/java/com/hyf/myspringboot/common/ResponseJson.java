package com.hyf.myspringboot.common;

/**
 * @author howinfun
 * @version 1.0
 * @desc
 * @date 2018/11/26
 * @company XMJBQ
 */
public class ResponseJson {

    private Integer code = 200; // 请求结果 200:成功,400:失败,500:服务器错误
    private Boolean success = true; // 操作结果  true:成功,false:失败
    private Object data; // 存放操作成功后的数据
    private String msg; // 提示信息

    public ResponseJson() {
    }

    public ResponseJson(Integer code, Boolean success, Object data, String msg) {
        this.code = code;
        this.success = success;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseJson{" +
                "code=" + code +
                ", success=" + success +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
