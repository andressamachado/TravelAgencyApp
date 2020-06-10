package com.andressamachado.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.andressamachado.dao.PackageDAO;
import com.andressamachado.R;
import com.andressamachado.model.TravelPackage;
import com.andressamachado.ui.adapter.PackageListAdapter;

import java.util.List;

public class PackageListActivity extends AppCompatActivity {

    public static final String APPBAR_TITLE = "Packages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_list);

        setTitle(APPBAR_TITLE);

        ListViewConfiguration();
    }

    private void ListViewConfiguration() {
        ListView packageList = findViewById(R.id.package_list_listview);
        List<TravelPackage> packages = new PackageDAO().list();
        packageList.setAdapter(new PackageListAdapter(packages, this));
    }
}
