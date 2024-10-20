package org.chromium.chrome.browser.download;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import defpackage.AbstractC4809e90;
import defpackage.C8141nr0;
import defpackage.C9171qr0;
import defpackage.C9513rr0;
import defpackage.V60;
import defpackage.VM0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadFileProvider extends VM0 {
    public static final String[] j = {"_display_name", "_size"};

    public static Uri d(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(V60.a.getPackageName() + ".DownloadFileProvider").path(str).appendQueryParameter("file", str2).build();
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        String e = e(uri, new C8141nr0());
        if (e == null) {
            throw new FileNotFoundException();
        }
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(AbstractC4809e90.a("Invalid mode: ", str));
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(new File(e), i);
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        if (strArr == null) {
            strArr = j;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        String e = e(uri, new C8141nr0());
        if (TextUtils.isEmpty(e)) {
            return new MatrixCursor(strArr3, 1);
        }
        File file = new File(e);
        if (!file.exists() || !file.isFile()) {
            return new MatrixCursor(strArr3, 1);
        }
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = file.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(file.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final String getType(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("file");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.parse(queryParameter).toString()));
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external deletes");
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public static String e(Uri uri, C8141nr0 c8141nr0) {
        if (uri == null) {
            return null;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if (path.charAt(0) == File.separatorChar && path.length() > 1) {
            path = path.substring(1);
        }
        String queryParameter = uri.getQueryParameter("file");
        StringBuilder sb = new StringBuilder("..");
        String str = File.separator;
        sb.append(str);
        if (queryParameter.contains(sb.toString())) {
            return null;
        }
        if (path.equals("download")) {
            return C9513rr0.b() + str + queryParameter;
        }
        C9171qr0 a = C8141nr0.a();
        if (path.equals("external_volume")) {
            List list = a.a;
            if (!list.isEmpty()) {
                return ((File) list.get(0)).getAbsolutePath() + str + queryParameter;
            }
        }
        if (path.equals("download_external")) {
            List list2 = a.b;
            if (!list2.isEmpty()) {
                return ((File) list2.get(0)).getAbsolutePath() + str + queryParameter;
            }
        }
        return null;
    }
}
