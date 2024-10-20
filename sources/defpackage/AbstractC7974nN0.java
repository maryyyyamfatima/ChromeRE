package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Locale;
import org.chromium.base.ContentUriUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7974nN0 {
    public static final C7630mN0 a = new BV0() { // from class: mN0
        @Override // defpackage.BV0
        public final Object apply(Object obj) {
            return Boolean.TRUE;
        }
    };

    public static void d(File file, BV0 bv0) {
        File[] listFiles;
        if (!file.exists()) {
            file.delete();
            return;
        }
        if (((Boolean) bv0.apply(file.getPath())).booleanValue()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    d(file2, bv0);
                }
            }
            if (file.delete()) {
                return;
            }
            AbstractC4851eH1.a("FileUtils", "Failed to delete: %s", file);
        }
    }

    public static Uri b(File file) {
        Uri uri;
        try {
            uri = ContentUriUtils.b(file);
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("FileUtils", "Could not create content uri: " + e, new Object[0]);
            uri = null;
        }
        return uri == null ? Uri.fromFile(file) : uri;
    }

    public static String a(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        int lastIndexOf2 = str.lastIndexOf(46);
        return lastIndexOf >= lastIndexOf2 ? "" : str.substring(lastIndexOf2 + 1).toLowerCase(Locale.US);
    }

    public static Bitmap c(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            try {
                if (openFileDescriptor == null) {
                    AbstractC4851eH1.f("FileUtils", "Null ParcelFileDescriptor from uri " + uri, new Object[0]);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                if (fileDescriptor == null) {
                    AbstractC4851eH1.f("FileUtils", "Null FileDescriptor from uri " + uri, new Object[0]);
                    openFileDescriptor.close();
                    return null;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                if (decodeFileDescriptor != null) {
                    openFileDescriptor.close();
                    return decodeFileDescriptor;
                }
                AbstractC4851eH1.f("FileUtils", "Failed to decode image from uri " + uri, new Object[0]);
                openFileDescriptor.close();
                return null;
            } catch (Throwable th) {
                if (openFileDescriptor != null) {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            AbstractC4851eH1.f("FileUtils", "IO exception when reading uri " + uri, new Object[0]);
            return null;
        }
    }
}
