package ims.vn.androiddms.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;

import ims.vn.androiddms.Adapter.ProductAdapter;
import ims.vn.androiddms.R;
import ims.vn.androiddms.model.Product;

public class ProductActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    FloatingActionButton btnUpdate;
    private ArrayList<Product> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        recyclerView = (RecyclerView) findViewById(R.id.rcAddProduct);
        adapter = new ProductAdapter(createData());

        LinearLayoutManager layoutManager = new LinearLayoutManager(ProductActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        floatActionButton();
    }

    public void floatActionButton(){
        btnUpdate = (FloatingActionButton) findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
    public ArrayList<Product> createData(){
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        data.add(new Product("chuoi","300000","300000","3","0"));
        return data;
    }
}
