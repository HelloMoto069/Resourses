package com.applisto.appcloner.classes;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BundleObb {
    private static final String TAG = BundleObb.class.getSimpleName();
    private boolean mBundleObb;

    public BundleObb(CloneSettings cloneSettings) {
        this.mBundleObb = cloneSettings.getBoolean("bundleObb", false).booleanValue();
        String str = TAG;
        Log.i(str, "BundleObb; mBundleObb: " + this.mBundleObb);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x00b3=Splitter:B:32:0x00b3, B:52:0x00f4=Splitter:B:52:0x00f4, B:46:0x00ed=Splitter:B:46:0x00ed} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(android.content.Context r14) {
        /*
            r13 = this;
            boolean r0 = r13.mBundleObb
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = r14.getPackageName()     // Catch:{ Exception -> 0x0119 }
            java.io.File r0 = getPackageObbDirectory(r0)     // Catch:{ Exception -> 0x0119 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0119 }
            int r2 = getApplicationVersionCode(r14)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r2 = java.lang.Integer.toString(r2)     // Catch:{ Exception -> 0x0119 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0119 }
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0119 }
            if (r2 == 0) goto L_0x002f
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0119 }
            if (r2 != 0) goto L_0x0026
            goto L_0x002f
        L_0x0026:
            java.lang.String r2 = TAG     // Catch:{ Exception -> 0x0119 }
            java.lang.String r3 = "init; not unbundling OBB files"
            android.util.Log.i(r2, r3)     // Catch:{ Exception -> 0x0119 }
            goto L_0x00e6
        L_0x002f:
            java.lang.String r2 = TAG     // Catch:{ Exception -> 0x0119 }
            java.lang.String r3 = "init; unbundling OBB files"
            android.util.Log.i(r2, r3)     // Catch:{ Exception -> 0x0119 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0119 }
            deleteDirectory(r0)     // Catch:{ all -> 0x00f5 }
            com.applisto.appcloner.classes.Utils.forceMkdir(r0)     // Catch:{ all -> 0x00f5 }
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00f5 }
            android.content.res.AssetManager r5 = r14.getAssets()     // Catch:{ all -> 0x00f5 }
            java.lang.String r6 = "obb.zip"
            java.io.InputStream r5 = r5.open(r6)     // Catch:{ all -> 0x00f5 }
            r4.<init>(r5)     // Catch:{ all -> 0x00f5 }
        L_0x004f:
            java.util.zip.ZipEntry r5 = r4.getNextEntry()     // Catch:{ all -> 0x00ee }
            r6 = r5
            if (r5 == 0) goto L_0x00ad
            java.lang.String r5 = r6.getName()     // Catch:{ all -> 0x00ee }
            java.lang.String r7 = TAG     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r8.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r9 = "init; name: "
            r8.append(r9)     // Catch:{ all -> 0x00ee }
            r8.append(r5)     // Catch:{ all -> 0x00ee }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.i(r7, r8)     // Catch:{ all -> 0x00ee }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x00ee }
            r7.<init>(r0, r5)     // Catch:{ all -> 0x00ee }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ee }
            r8.<init>(r7)     // Catch:{ all -> 0x00ee }
            com.applisto.appcloner.classes.Utils.copy(r4, r8)     // Catch:{ all -> 0x00a6 }
            r8.close()     // Catch:{ Exception -> 0x0081 }
            goto L_0x0083
        L_0x0081:
            r9 = move-exception
        L_0x0083:
            java.lang.String r9 = TAG     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r10.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r11 = "init; file: "
            r10.append(r11)     // Catch:{ all -> 0x00ee }
            r10.append(r7)     // Catch:{ all -> 0x00ee }
            java.lang.String r11 = ", file.length(): "
            r10.append(r11)     // Catch:{ all -> 0x00ee }
            long r11 = r7.length()     // Catch:{ all -> 0x00ee }
            r10.append(r11)     // Catch:{ all -> 0x00ee }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00ee }
            android.util.Log.i(r9, r10)     // Catch:{ all -> 0x00ee }
            goto L_0x004f
        L_0x00a6:
            r9 = move-exception
            r8.close()     // Catch:{ Exception -> 0x00ab }
            goto L_0x00ac
        L_0x00ab:
            r10 = move-exception
        L_0x00ac:
            throw r9     // Catch:{ all -> 0x00ee }
        L_0x00ad:
            r4.close()     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b3
        L_0x00b1:
            r5 = move-exception
        L_0x00b3:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f5 }
            r5.<init>(r1)     // Catch:{ all -> 0x00f5 }
            r6 = 0
            r5.write(r6)     // Catch:{ all -> 0x00e7 }
            r5.close()     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00c2
        L_0x00c0:
            r6 = move-exception
        L_0x00c2:
            java.lang.String r4 = TAG     // Catch:{ Exception -> 0x0119 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0119 }
            r5.<init>()     // Catch:{ Exception -> 0x0119 }
            java.lang.String r6 = "init; took: "
            r5.append(r6)     // Catch:{ Exception -> 0x0119 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0119 }
            r8 = 0
            long r8 = r6 - r2
            r5.append(r8)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r6 = " millis"
            r5.append(r6)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0119 }
            android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0119 }
        L_0x00e6:
            goto L_0x011f
        L_0x00e7:
            r6 = move-exception
            r5.close()     // Catch:{ Exception -> 0x00ec }
            goto L_0x00ed
        L_0x00ec:
            r7 = move-exception
        L_0x00ed:
            throw r6     // Catch:{ all -> 0x00f5 }
        L_0x00ee:
            r5 = move-exception
            r4.close()     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00f4
        L_0x00f3:
            r6 = move-exception
        L_0x00f4:
            throw r5     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r4 = move-exception
            java.lang.String r5 = TAG     // Catch:{ Exception -> 0x0119 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0119 }
            r6.<init>()     // Catch:{ Exception -> 0x0119 }
            java.lang.String r7 = "init; took: "
            r6.append(r7)     // Catch:{ Exception -> 0x0119 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0119 }
            r9 = 0
            long r9 = r7 - r2
            r6.append(r9)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r7 = " millis"
            r6.append(r7)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0119 }
            android.util.Log.i(r5, r6)     // Catch:{ Exception -> 0x0119 }
            throw r4     // Catch:{ Exception -> 0x0119 }
        L_0x0119:
            r0 = move-exception
            java.lang.String r1 = TAG
            android.util.Log.w(r1, r0)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applisto.appcloner.classes.BundleObb.init(android.content.Context):void");
    }

    public static int getApplicationVersionCode(Context context, String packageName) {
        try {
            return context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int getApplicationVersionCode(Context context) {
        return getApplicationVersionCode(context, context.getPackageName());
    }

    private static File getObbDirectory() {
        return new File(Environment.getExternalStorageDirectory(), "/Android/obb/");
    }

    private static File getPackageObbDirectory(String packageName) {
        return new File(getObbDirectory(), packageName);
    }

    public static void cleanDirectory(File directory) throws IOException {
        if (!directory.exists()) {
            throw new IllegalArgumentException(directory + " does not exist");
        } else if (!directory.isDirectory()) {
            throw new IllegalArgumentException(directory + " is not a directory");
        } else {
            File[] files = directory.listFiles();
            if (files == null) {
                throw new IOException("Failed to list contents of " + directory);
            }
            IOException exception = null;
            for (File file : files) {
                try {
                    forceDelete(file);
                } catch (IOException ioe) {
                    exception = ioe;
                }
            }
            if (exception != null) {
                throw exception;
            }
        }
    }

    public static void forceDelete(File file) throws IOException {
        if (file.isDirectory()) {
            deleteDirectory(file);
            return;
        }
        boolean filePresent = file.exists();
        if (file.delete()) {
            return;
        }
        if (!filePresent) {
            throw new FileNotFoundException("File does not exist: " + file);
        }
        throw new IOException("Unable to delete file: " + file);
    }

    public static void deleteDirectory(File directory) throws IOException {
        if (directory.exists()) {
            if (!isSymlink(directory)) {
                cleanDirectory(directory);
            }
            if (!directory.delete()) {
                throw new IOException("Unable to delete directory " + directory + ".");
            }
        }
    }

    public static boolean isSymlink(File file) throws IOException {
        File fileInCanonicalDir;
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (file.getParent() == null) {
            fileInCanonicalDir = file;
        } else {
            fileInCanonicalDir = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        if (fileInCanonicalDir.getCanonicalFile().equals(fileInCanonicalDir.getAbsoluteFile())) {
            return false;
        }
        return true;
    }
}
