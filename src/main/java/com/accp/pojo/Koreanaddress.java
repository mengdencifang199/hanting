package com.accp.pojo;

public class Koreanaddress {
    private Integer kadsid;

    private String kadsname;

    private String name;

    private Integer pid;

    private Byte level;

    public Integer getKadsid() {
        return kadsid;
    }

    public void setKadsid(Integer kadsid) {
        this.kadsid = kadsid;
    }

    public String getKadsname() {
        return kadsname;
    }

    public void setKadsname(String kadsname) {
        this.kadsname = kadsname == null ? null : kadsname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }
}