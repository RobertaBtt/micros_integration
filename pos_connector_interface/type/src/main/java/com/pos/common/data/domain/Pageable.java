package com.pos.common.data.domain;

public class Pageable {

    private int page;
    private int pageSize;

    public static final Pageable of(int page, int pageSize) {
        return new Pageable(page, pageSize);
    }

    private Pageable(int page, int pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public int page() {
        return page;
    }

    public int pageSize() {
        return pageSize;
    }
}
