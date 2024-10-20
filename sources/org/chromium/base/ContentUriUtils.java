package org.chromium.base;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import defpackage.AbstractC4851eH1;
import defpackage.V60;
import defpackage.VM0;
import defpackage.WM0;
import java.io.File;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ContentUriUtils {
    public static WM0 a;
    public static final Object b = new Object();

    public static Uri b(File file) {
        synchronized (b) {
            if (a == null) {
                return null;
            }
            Context context = V60.a;
            return VM0.b(context, context.getPackageName() + ".FileProvider", file);
        }
    }

    public static AssetFileDescriptor a(String str) {
        ContentResolver contentResolver = V60.a.getContentResolver();
        Uri parse = Uri.parse(str);
        try {
            if (f(parse)) {
                String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    throw new SecurityException("Cannot open files with non-zero offset type.");
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    return new AssetFileDescriptor(openFileDescriptor, 0L, -1L);
                }
            }
        } catch (Exception e) {
            AbstractC4851eH1.f("ContentUriUtils", "Cannot open content uri: %s", str, e);
        }
        return null;
    }

    public static boolean f(Uri uri) {
        if (uri == null || !DocumentsContract.isDocumentUri(V60.a, uri)) {
            return false;
        }
        try {
            Cursor query = V60.a.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() >= 1) {
                        query.moveToFirst();
                        boolean d = d(query);
                        query.close();
                        return d;
                    }
                } finally {
                    try {
                        query.close();
                    } catch (Throwable unused) {
                    }
                }
            }
            if (query != null) {
            }
        } catch (NullPointerException unused2) {
        }
        return false;
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = V60.a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (f(parse)) {
            String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
            if (streamTypes == null || streamTypes.length <= 0) {
                return null;
            }
            return streamTypes[0];
        }
        return contentResolver.getType(parse);
    }

    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a2 = a(str);
        if (a2 != null) {
            return a2.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    public static boolean contentUriExists(String str) {
        AssetFileDescriptor a2 = a(str);
        boolean z = a2 != null;
        if (a2 != null) {
            try {
                a2.close();
            } catch (IOException unused) {
            }
        }
        return z;
    }

    public static String c(Context context, Uri uri) {
        String[] streamTypes;
        String extensionFromMimeType;
        if (uri == null) {
            return "";
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            Cursor query = contentResolver.query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() >= 1) {
                        query.moveToFirst();
                        int columnIndex = query.getColumnIndex("_display_name");
                        if (columnIndex == -1) {
                            return "";
                        }
                        String string = query.getString(columnIndex);
                        if (d(query) && (streamTypes = contentResolver.getStreamTypes(uri, "*/*")) != null && streamTypes.length > 0 && (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0])) != null) {
                            string = string + "." + extensionFromMimeType;
                        }
                        query.close();
                        return string;
                    }
                } finally {
                    try {
                        query.close();
                    } catch (Throwable unused) {
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (NullPointerException unused2) {
        }
        return "";
    }

    public static String maybeGetDisplayName(String str) {
        try {
            String c = c(V60.a, Uri.parse(str));
            if (TextUtils.isEmpty(c)) {
                return null;
            }
            return c;
        } catch (Exception e) {
            AbstractC4851eH1.f("ContentUriUtils", "Cannot open content uri: %s", str, e);
            return null;
        }
    }

    public static boolean d(Cursor cursor) {
        int columnIndex;
        return Build.VERSION.SDK_INT >= 24 && (columnIndex = cursor.getColumnIndex("flags")) > -1 && (cursor.getLong(columnIndex) & 512) != 0;
    }

    public static boolean e(String str) {
        Uri parse;
        return (str == null || (parse = Uri.parse(str)) == null || !"content".equals(parse.getScheme())) ? false : true;
    }

    public static boolean delete(String str) {
        return V60.a.getContentResolver().delete(Uri.parse(str), null, null) > 0;
    }

    public static String getContentUriFromFilePath(String str) {
        try {
            Uri b2 = b(new File(str));
            if (b2 != null) {
                return b2.toString();
            }
            return null;
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("ContentUriUtils", "Cannot retrieve content uri from file: %s", str, e);
            return null;
        }
    }
}
