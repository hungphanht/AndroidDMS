package ims.vn.androiddms.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import ims.vn.androiddms.R;

import static android.app.Activity.RESULT_OK;

/**
 * Created by Deleting on 6/24/2017.
 */

public class CameraFragment extends Fragment {

    private static final int ACTIVITY_START_CAMERA_APP = 0;
    private LinearLayout btnTakePhoto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_checkin_camera, container, false);
        btnTakePhoto = (LinearLayout) rootView.findViewById(R.id.btntakePhoto);
        takePhoto();
        return rootView;
    }
    public void onViewCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public void takePhoto() {
        btnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callCameraApp = new Intent();
                callCameraApp.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(callCameraApp, ACTIVITY_START_CAMERA_APP);
            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == ACTIVITY_START_CAMERA_APP && resultCode == RESULT_OK){
            Toast.makeText(getContext(),"Picture taken successfully",Toast.LENGTH_SHORT).show();
        }
    }

}