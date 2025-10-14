package com.juro.study.structure;

enum UnderlyingType {
    STOCK_INDEX("Index"),
    STOCK("Stock"),
    IR("InterestRate")
    ;

    private String type;

    UnderlyingType(String type){
        this.type = type;
    }

    public String type(){
        return type;
    }
}
