package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.system.Os;
import android.text.TextUtils;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC4199cO1;
import defpackage.AbstractC4851eH1;
import defpackage.C7432ln3;
import defpackage.V60;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.PathUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PathUtils {
    public static final AtomicBoolean a = new AtomicBoolean();
    public static FutureTask b;
    public static String c;
    public static String d;

    public static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = V60.a.getApplicationInfo();
        int i = applicationInfo.flags;
        return ((i & 128) != 0 || (i & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    public static String b(int i) {
        if (!b.isDone()) {
            C7432ln3 e = C7432ln3.e();
            try {
                b.run();
                e.close();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        try {
            return ((String[]) b.get())[i];
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void a(int i, String str) {
        try {
            Os.chmod(str, i);
        } catch (Exception unused) {
            AbstractC4851eH1.a("PathUtils", AbstractC4199cO1.a("Failed to set permissions for path \"", str, "\""), new Object[0]);
        }
    }

    public static void c() {
        if (a.getAndSet(true)) {
            return;
        }
        c = "chrome";
        d = null;
        b = new FutureTask(new Callable() { // from class: Xn2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] strArr = new String[3];
                Context context = V60.a;
                String path = context.getDir(PathUtils.c, 0).getPath();
                strArr[0] = path;
                PathUtils.a(448, path);
                strArr[1] = context.getDir("textures", 0).getPath();
                if (context.getCacheDir() != null) {
                    if (PathUtils.d == null) {
                        strArr[2] = context.getCacheDir().getPath();
                    } else {
                        File file = new File(context.getCacheDir(), PathUtils.d);
                        file.mkdir();
                        String path2 = file.getPath();
                        strArr[2] = path2;
                        PathUtils.a(1472, path2);
                    }
                }
                return strArr;
            }
        });
        AbstractC0185Bl.e.execute(b);
    }

    public static String getDataDirectory() {
        return b(0);
    }

    public static String getCacheDirectory() {
        return b(2);
    }

    public static String getThumbnailCacheDirectory() {
        return b(1);
    }

    public static String getDownloadsDirectory() {
        C7432ln3 c2 = C7432ln3.c();
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
                String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
                c2.close();
                return str;
            }
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            c2.close();
            return path;
        } catch (Throwable th) {
            try {
                c2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        C7432ln3 e = C7432ln3.e();
        try {
            File[] externalFilesDirs = V60.a.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            e.close();
            return d(arrayList);
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static String[] getExternalDownloadVolumesNames() {
        Set<String> externalVolumeNames;
        StorageVolume storageVolume;
        File directory;
        ArrayList arrayList = new ArrayList();
        externalVolumeNames = MediaStore.getExternalVolumeNames(V60.a);
        for (String str : externalVolumeNames) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                storageVolume = ((StorageManager) V60.a.getSystemService(StorageManager.class)).getStorageVolume(MediaStore.Files.getContentUri(str));
                directory = storageVolume.getDirectory();
                File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                if (!file.isDirectory()) {
                    AbstractC4851eH1.f("PathUtils", "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory()));
                }
                arrayList.add(file);
            }
        }
        return d(arrayList);
    }

    public static String[] d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
