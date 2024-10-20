package org.chromium.ui.dragdrop;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import defpackage.ContentProviderPipeDataWriterC4378cu0;
import defpackage.EI2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DropDataContentProvider extends ContentProvider {
    public static final String[] g = {"_display_name", "_size"};
    public static final Object h = new Object();
    public static int i = 60000;
    public static byte[] j;
    public static String k;
    public static String l;
    public static Uri m;
    public static Handler n;
    public static long o;
    public static long p;
    public static Uri q;
    public static long r;
    public static long s;
    public static boolean t;
    public ContentProviderPipeDataWriterC4378cu0 a;

    public static void a() {
        synchronized (h) {
            b();
            long j2 = o;
            if (j2 > 0) {
                long j3 = p;
                if (j3 > 0) {
                    EI2.k(Math.max(0L, j3 - j2), "Android.DragDrop.Image.OpenFileTime.LastAttempt");
                }
            }
        }
    }

    public static void b() {
        j = null;
        k = null;
        l = null;
        Uri uri = m;
        if (uri != null) {
            q = uri;
            r = SystemClock.elapsedRealtime();
            t = false;
        }
        m = null;
        Handler handler = n;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            n = null;
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.a = new ContentProviderPipeDataWriterC4378cu0();
        return true;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        synchronized (h) {
            if (uri != null) {
                if (uri.equals(m)) {
                    return l;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String[] getStreamTypes(android.net.Uri r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.Object r0 = org.chromium.ui.dragdrop.DropDataContentProvider.h
            monitor-enter(r0)
            r1 = 0
            if (r9 == 0) goto L5a
            android.net.Uri r2 = org.chromium.ui.dragdrop.DropDataContentProvider.m     // Catch: java.lang.Throwable -> L5c
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto Lf
            goto L5a
        Lf:
            java.lang.String r9 = org.chromium.ui.dragdrop.DropDataContentProvider.l     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            r0 = 1
            r2 = 0
            if (r9 == 0) goto L52
            if (r10 != 0) goto L19
            goto L52
        L19:
            r3 = 47
            int r4 = r9.indexOf(r3)
            java.lang.String r5 = r9.substring(r2, r4)
            int r4 = r4 + r0
            java.lang.String r4 = r9.substring(r4)
            int r3 = r10.indexOf(r3)
            java.lang.String r6 = r10.substring(r2, r3)
            int r3 = r3 + r0
            java.lang.String r10 = r10.substring(r3)
            java.lang.String r3 = "*"
            boolean r7 = r6.equals(r3)
            if (r7 != 0) goto L44
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L44
            goto L52
        L44:
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L50
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L52
        L50:
            r10 = r0
            goto L53
        L52:
            r10 = r2
        L53:
            if (r10 == 0) goto L59
            java.lang.String[] r1 = new java.lang.String[r0]
            r1[r2] = r9
        L59:
            return r1
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            return r1
        L5c:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.ui.dragdrop.DropDataContentProvider.getStreamTypes(android.net.Uri, java.lang.String):java.lang.String[]");
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (h) {
            if (!uri.equals(m)) {
                if (uri.equals(q)) {
                    long j2 = elapsedRealtime - r;
                    EI2.k(j2, "Android.DragDrop.Image.OpenFileTime.AllExpired");
                    if (!t) {
                        EI2.k(j2, "Android.DragDrop.Image.OpenFileTime.FirstExpired");
                        t = true;
                    }
                }
                return null;
            }
            long j3 = 0;
            if (p == 0) {
                long j4 = o;
                if (j4 != 0) {
                    j3 = elapsedRealtime - j4;
                }
                EI2.k(j3, "Android.DragDrop.Image.OpenFileTime.FirstAttempt");
            }
            p = elapsedRealtime;
            return openPipeHelper(uri, getType(uri), null, j, this.a);
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        synchronized (h) {
            char c = 0;
            if (uri != null) {
                if (uri.equals(m)) {
                    byte[] bArr = j;
                    String str3 = k;
                    if (strArr == null) {
                        strArr = g;
                    }
                    int i2 = 0;
                    boolean z = false;
                    boolean z2 = false;
                    for (String str4 : strArr) {
                        if ("_display_name".equals(str4)) {
                            i2++;
                            z = true;
                        } else if ("_size".equals(str4)) {
                            i2++;
                            z2 = true;
                        }
                    }
                    String[] strArr3 = new String[i2];
                    Object[] objArr = new Object[i2];
                    if (z) {
                        strArr3[0] = "_display_name";
                        objArr[0] = str3;
                        c = 1;
                    }
                    if (z2) {
                        strArr3[c] = "_size";
                        objArr[c] = Integer.valueOf(bArr.length);
                    }
                    MatrixCursor matrixCursor = new MatrixCursor(strArr3, 1);
                    matrixCursor.addRow(objArr);
                    return matrixCursor;
                }
            }
            return new MatrixCursor(g, 0);
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }
}
