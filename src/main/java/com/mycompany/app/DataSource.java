package com.mycompany.app;
import jdk.dynalink.beans.StaticClass;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DataSource {
    public static final String TABLE_FOODSTORE = "FoodStore";
    public static final String COLUMN_FOODSTORE_ID = "_id";
    public static final String COLUMN_FOODSTORE_NAME = "name";
    public static final String COLUMN_FOODSTORE_PHONE = "phone";
    public static final String COLUMN_FOODSTORE_EMAIl = "email";
    public static final String COLUMN_FOODSTORE_LOCATION = "location";
    public static final int INDEX_FOODSTORE_ID = 0;
    public static final int INDEX_FOODSTORE_NAME = 1;
    public static final int INDEX_FOODSTORE_PHONE = 2;
    public static final int INDEX_FOODSTORE_EMAIl = 3;
    public static final int INDEX_FOODSTORE_LOCATION = 4;

    public static final String TABLE_PRODUCTION = "Production";
    public static final String COLUMN_PRODUCTION_ID = "_id";
    public static final String COLUMN_PRODUCTION_NAME = "name";
    public static final String COLUMN_PRODUCTION_PRICE = "price";
    public static final String COLUMN_PRODUCTION_MENUID = "MenuId";
    public static final int INDEX_PRODUCTION_ID = 0;
    public static final int INDEX_PRODUCTION_NAME = 1;
    public static final int  INDEX_PRODUCTION_PRICE = 2;
    public static final int  INDEX_PRODUCTION_MENUID = 3;








}
