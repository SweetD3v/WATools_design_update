package com.gbversion.tool.statussaver.collage_maker.crop.callback;

import android.graphics.Bitmap;


public interface CropCallback extends Callback {
  void onSuccess(Bitmap cropped);
}
