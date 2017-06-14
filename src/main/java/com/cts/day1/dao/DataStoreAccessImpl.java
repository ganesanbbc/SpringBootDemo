package com.cts.day1.dao;

import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;

public class DataStoreAccessImpl implements DataStoreAccess {


    @Override
    public  void retrieveAllService(){
        Datastore datastore = DatastoreOptions.getDefaultInstance().getService();


    }

}
