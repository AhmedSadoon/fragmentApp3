package com.example.fragmentapp3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragA extends Fragment implements AdapterView.OnItemClickListener {
    ListView listView;
    connection conn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a_layout,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        conn= (connection) getActivity();
        listView=getActivity().findViewById(R.id.lv1);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.titles,android.R.layout.simple_expandable_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener( this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        conn.con(position);


    }
}
