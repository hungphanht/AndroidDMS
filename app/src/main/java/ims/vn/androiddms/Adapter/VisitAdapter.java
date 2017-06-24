package ims.vn.androiddms.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ims.vn.androiddms.R;
import ims.vn.androiddms.model.Visit;

public class VisitAdapter extends RecyclerView.Adapter<VisitAdapter.RecyclerViewHolder> {

    private ArrayList<Visit> listData = new ArrayList<>();

    public VisitAdapter(ArrayList<Visit> listData) {
        this.listData = listData;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemview = inflater.inflate(R.layout.item_recycle_visit, parent, false);
        return new RecyclerViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.txtDetailName.setText(listData.get(position).getDetailname());
        holder.txtName.setText(listData.get(position).getName());
        holder.txtAddress.setText(listData.get(position).getAddress());
        holder.txtPhone.setText(listData.get(position).getPhone());
    }
    @Override
    public int getItemCount() {
        return listData.size();
    }
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtDetailName,txtName,txtAddress,txtPhone;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtDetailName = (TextView) itemView.findViewById(R.id.txtDetailName);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
            txtAddress = (TextView) itemView.findViewById(R.id.txtaddress);
            txtPhone = (TextView) itemView.findViewById(R.id.txtphone);
        }

    }
}