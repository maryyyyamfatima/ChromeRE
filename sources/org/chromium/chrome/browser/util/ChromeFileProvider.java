package org.chromium.chrome.browser.util;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.VM0;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChromeFileProvider extends VM0 {
    public static final Object j = new Object();

    @Override // defpackage.VM0, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        Uri d = d(uri);
        if (d != null) {
            return super.openFile(d, str);
        }
        return null;
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String[] strArr3;
        Uri d = d(uri);
        if (d == null) {
            return null;
        }
        Cursor query = super.query(d, strArr, str, strArr2, str2);
        MatrixCursor matrixCursor = (MatrixCursor) query;
        String[] columnNames = matrixCursor.getColumnNames();
        int length = columnNames.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if ("_data".equals(columnNames[i])) {
                    strArr3 = columnNames;
                    break;
                }
                i++;
            } else {
                strArr3 = (String[]) Arrays.copyOf(columnNames, columnNames.length + 1);
                strArr3[columnNames.length] = "_data";
                break;
            }
        }
        if (columnNames == strArr3) {
            return query;
        }
        MatrixCursor matrixCursor2 = new MatrixCursor(strArr3, matrixCursor.getCount());
        query.moveToPosition(-1);
        while (query.moveToNext()) {
            MatrixCursor.RowBuilder newRow = matrixCursor2.newRow();
            for (int i2 = 0; i2 < columnNames.length; i2++) {
                int type = matrixCursor.getType(i2);
                if (type == 1) {
                    newRow.add(Integer.valueOf(matrixCursor.getInt(i2)));
                } else if (type == 2) {
                    newRow.add(Float.valueOf(matrixCursor.getFloat(i2)));
                } else if (type == 3) {
                    newRow.add(matrixCursor.getString(i2));
                } else if (type == 4) {
                    newRow.add(matrixCursor.getBlob(i2));
                } else {
                    newRow.add(null);
                }
            }
        }
        query.close();
        return matrixCursor2;
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final String getType(Uri uri) {
        Uri d = d(uri);
        if (d != null) {
            return super.getType(d);
        }
        return null;
    }

    @Override // defpackage.VM0, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (uri != null && uri.getPath().contains("BlockedFile_")) {
            synchronized (j) {
            }
            return 0;
        }
        return super.delete(uri, str, strArr);
    }

    public static Uri d(Uri uri) {
        if (uri == null || !uri.getPath().contains("BlockedFile_")) {
            return uri;
        }
        synchronized (j) {
        }
        return null;
    }
}
