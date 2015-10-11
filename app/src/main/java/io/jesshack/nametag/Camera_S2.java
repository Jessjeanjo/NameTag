package io.jesshack.nametag;

/**
 * Created by Jess on 10/10/15.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.provider.MediaStore;
import android.widget.Toast;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import android.os.Environment;
import java.util.Date;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import android.content.Context;
//import android.graphics.Bitmap.CompressFormat;


public class Camera_S2 extends Activity {
    static final int REQUEST_IMAGE_CAPTURE = 1;
    private ImageView mImageView;
    private String mImageFileLocation = "";

    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
    private static final int CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE = 200;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera_s2);


        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }


    }

//    //Capturing the image result
//    @Override
//    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
//        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
//            // Toast.makeText(this, "Picture taken successfully", Toast.LENGTH_SHORT).show();
//            // Bundle extras = data.getExtras();
//            // Bitmap photoCapturedBitmap = (Bitmap) extras.get("data");
//            // mPhotoCapturedImageView.setImageBitmap(photoCapturedBitmap);
//            // Bitmap photoCapturedBitmap = BitmapFactory.decodeFile(mImageFileLocation);
//            // mPhotoCapturedImageView.setImageBitmap(photoCapturedBitmap);
//            setReducedImageSize();
//
//        }
//    }
//
//    File createImageFile() throws IOException {
//
//        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//        String imageFileName = "IMAGE_" + timeStamp + "_";
//        File storageDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
//
//        File image = File.createTempFile(imageFileName,".jpg", storageDirectory);
//        mImageFileLocation = image.getAbsolutePath();
//
//        return image;
//
//    }
//
//    void setReducedImageSize() {
//        int targetImageViewWidth = mImageView.getWidth();
//        int targetImageViewHeight = mImageView.getHeight();
//
//        BitmapFactory.Options bmOptions = new BitmapFactory.Options();
//        bmOptions.inJustDecodeBounds = true;
//        BitmapFactory.decodeFile(mImageFileLocation, bmOptions);
//        int cameraImageWidth = bmOptions.outWidth;
//        int cameraImageHeight = bmOptions.outHeight;
//
//        int scaleFactor = Math.min(cameraImageWidth/targetImageViewWidth, cameraImageHeight/targetImageViewHeight);
//        bmOptions.inSampleSize = scaleFactor;
//        bmOptions.inJustDecodeBounds = false;
//
//        Bitmap photoReducedSizeBitmp = BitmapFactory.decodeFile(mImageFileLocation, bmOptions);
//        mImageView.setImageBitmap(photoReducedSizeBitmp);
//
//
//    }
}

