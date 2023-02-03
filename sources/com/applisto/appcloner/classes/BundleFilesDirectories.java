package com.applisto.appcloner.classes;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class BundleFilesDirectories {
    private static final String TAG = BundleFilesDirectories.class.getSimpleName();
    private final List<String> mPaths;

    public BundleFilesDirectories(CloneSettings cloneSettings) {
        this.mPaths = cloneSettings.getStringList("bundleFilesDirectories", (List<String>) null);
        String str = TAG;
        Log.i(str, "BundleFilesDirectories; mBundleFilesDirectories: " + this.mPaths);
    }

    public void init(Context context) {
        FileOutputStream fos;
        try {
            if (this.mPaths != null && !this.mPaths.isEmpty()) {
                String fileListJson = Utils.toString(context.getAssets().open("bundle_file_list.json"), "UTF-8");
                String str = TAG;
                Log.i(str, "init; fileListJson: " + fileListJson);
                JSONArray jsonArray = new JSONArray(fileListJson);
                int n = 0;
                while (n < jsonArray.length()) {
                    try {
                        JSONObject jsonObject = jsonArray.getJSONObject(n);
                        String path = jsonObject.getString("path");
                        String assetName = jsonObject.getString("assetName");
                        long lastModified = jsonObject.getLong("lastModified");
                        String str2 = TAG;
                        Log.i(str2, "init; path: " + path + ", assetName: " + assetName + ", lastModified: " + lastModified);
                        File file = new File(path);
                        if (file.exists()) {
                            if (file.lastModified() / 1000 >= lastModified / 1000) {
                                String str3 = TAG;
                                Log.i(str3, "init; skipping file: " + file);
                                n++;
                            }
                        }
                        String str4 = TAG;
                        Log.i(str4, "init; saving new or modified file: " + file);
                        InputStream in = context.getAssets().open(assetName);
                        try {
                            Utils.forceMkdir(file.getParentFile());
                            fos = new FileOutputStream(file);
                            Utils.copy(in, fos);
                            fos.close();
                            in.close();
                            n++;
                        } catch (Throwable th) {
                            in.close();
                            throw th;
                        }
                    } catch (Exception e) {
                        Log.w(TAG, e);
                    }
                }
            }
        } catch (Exception e2) {
            Log.w(TAG, e2);
        }
    }
}
