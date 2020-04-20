package org.nearbyshops.enduserappnew.aSDSAdminModule.MarketsList;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;

public class MarketsDataFactory extends DataSource.Factory {


    private MutableLiveData<MarketsDataSource> sourceLiveData =
            new MutableLiveData<>();

    private MarketsDataSource latestSource;




    @NonNull
    @Override
    public DataSource create() {

        latestSource = new MarketsDataSource();
        sourceLiveData.postValue(latestSource);
        return latestSource;
    }



    public MutableLiveData<MarketsDataSource> getSourceLiveData() {
        return sourceLiveData;
    }



}