package com.androidgig.logindemo.Model;

import android.databinding.ObservableField;

import com.androidgig.logindemo.TextWatcherAdapter;


public class User
{
    public final ObservableField<String> userName =
            new ObservableField<>();
    public final ObservableField<String> password =
            new ObservableField<>();

    public TextWatcherAdapter userNameWatcher = new TextWatcherAdapter(userName);
    public TextWatcherAdapter passwordWatcher = new TextWatcherAdapter(password);

}
