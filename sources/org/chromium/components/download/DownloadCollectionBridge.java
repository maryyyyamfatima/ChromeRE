package org.chromium.components.download;

import J.N;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.FileUtils;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore$Downloads;
import android.text.TextUtils;
import android.util.Log;
import defpackage.AbstractC4851eH1;
import defpackage.C4906eS1;
import defpackage.C5735gr0;
import defpackage.V60;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DownloadCollectionBridge {
    public static final ArrayList a = new ArrayList(Arrays.asList("tar.gz", "tar.z", "tar.bz2", "tar.bz", "user.js"));
    public static C5735gr0 b = new C5735gr0();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class DisplayNameInfo {
        public final String a;
        public final String b;

        public DisplayNameInfo(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String getDownloadUri() {
            return this.a;
        }

        public final String getDisplayName() {
            return this.b;
        }
    }

    public static boolean copyFileToIntermediateUri(String str, String str2) {
        try {
            Context context = V60.a;
            Uri parse = Uri.parse(str2);
            Objects.requireNonNull(context);
            Objects.requireNonNull(parse);
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(parse);
            FileInputStream fileInputStream = new FileInputStream(str);
            FileUtils.copy(fileInputStream, openOutputStream);
            fileInputStream.close();
            openOutputStream.close();
            return true;
        } catch (Exception e) {
            AbstractC4851eH1.a("DownloadCollection", "Unable to copy content to pending Uri.", e);
            return false;
        }
    }

    public static void deleteIntermediateUri(String str) {
        Context context = V60.a;
        Uri parse = Uri.parse(str);
        Objects.requireNonNull(context);
        Objects.requireNonNull(parse);
        try {
            context.getContentResolver().delete(parse, null, null);
        } catch (Exception e) {
            Log.e("MediaStoreUtils", "Unable to delete pending session.", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:            if (r8 == null) goto L25;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getDisplayName(java.lang.String r8) {
        /*
            java.lang.String r0 = "_display_name"
            android.content.Context r1 = defpackage.V60.a
            android.content.ContentResolver r2 = r1.getContentResolver()
            r1 = 0
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            if (r8 == 0) goto L35
            int r2 = r8.getCount()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L52
            if (r2 != 0) goto L21
            goto L35
        L21:
            boolean r2 = r8.moveToNext()     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L52
            if (r2 == 0) goto L4e
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L52
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Exception -> L33 java.lang.Throwable -> L52
            r8.close()
            return r0
        L33:
            r0 = move-exception
            goto L3f
        L35:
            if (r8 == 0) goto L3a
            r8.close()
        L3a:
            return r1
        L3b:
            r0 = move-exception
            goto L54
        L3d:
            r0 = move-exception
            r8 = r1
        L3f:
            java.lang.String r2 = "DownloadCollection"
            java.lang.String r3 = "Unable to get display name for download."
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L52
            r5 = 0
            r4[r5] = r0     // Catch: java.lang.Throwable -> L52
            defpackage.AbstractC4851eH1.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L51
        L4e:
            r8.close()
        L51:
            return r1
        L52:
            r0 = move-exception
            r1 = r8
        L54:
            if (r1 == 0) goto L59
            r1.close()
        L59:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.download.DownloadCollectionBridge.getDisplayName(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.components.download.DownloadCollectionBridge.DisplayNameInfo[] getDisplayNamesForDownloads() {
        /*
            java.lang.String r0 = "_display_name"
            java.lang.String r1 = "_id"
            android.content.Context r2 = defpackage.V60.a
            android.content.ContentResolver r3 = r2.getContentResolver()
            r2 = 0
            r9 = 0
            android.net.Uri r10 = android.provider.MediaStore$Downloads.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            android.net.Uri r4 = defpackage.AbstractC6344ie.a(r10)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String[] r5 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r3 == 0) goto L61
            int r4 = r3.getCount()     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            if (r4 != 0) goto L26
            goto L61
        L26:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
        L2b:
            boolean r5 = r3.moveToNext()     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            if (r5 == 0) goto L53
            int r5 = r3.getColumnIndexOrThrow(r0)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            int r6 = r3.getColumnIndexOrThrow(r1)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            int r6 = r3.getInt(r6)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            long r6 = (long) r6     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r10, r6)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            org.chromium.components.download.DownloadCollectionBridge$DisplayNameInfo r7 = new org.chromium.components.download.DownloadCollectionBridge$DisplayNameInfo     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            r7.<init>(r6, r5)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            r4.add(r7)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            goto L2b
        L53:
            org.chromium.components.download.DownloadCollectionBridge$DisplayNameInfo[] r0 = new org.chromium.components.download.DownloadCollectionBridge.DisplayNameInfo[r2]     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            java.lang.Object[] r0 = r4.toArray(r0)     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            org.chromium.components.download.DownloadCollectionBridge$DisplayNameInfo[] r0 = (org.chromium.components.download.DownloadCollectionBridge.DisplayNameInfo[]) r0     // Catch: java.lang.Exception -> L5f java.lang.Throwable -> L7d
            r3.close()
            return r0
        L5f:
            r0 = move-exception
            goto L6b
        L61:
            if (r3 == 0) goto L66
            r3.close()
        L66:
            return r9
        L67:
            r0 = move-exception
            goto L7f
        L69:
            r0 = move-exception
            r3 = r9
        L6b:
            java.lang.String r1 = "DownloadCollection"
            java.lang.String r4 = "Unable to get display names for downloads."
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L7d
            r5[r2] = r0     // Catch: java.lang.Throwable -> L7d
            defpackage.AbstractC4851eH1.a(r1, r4, r5)     // Catch: java.lang.Throwable -> L7d
            if (r3 == 0) goto L7c
            r3.close()
        L7c:
            return r9
        L7d:
            r0 = move-exception
            r9 = r3
        L7f:
            if (r9 == 0) goto L84
            r9.close()
        L84:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.download.DownloadCollectionBridge.getDisplayNamesForDownloads():org.chromium.components.download.DownloadCollectionBridge$DisplayNameInfo[]");
    }

    public static int openIntermediateUri(String str) {
        try {
            ParcelFileDescriptor openFileDescriptor = V60.a.getContentResolver().openFileDescriptor(Uri.parse(str), "rw");
            ContentValues contentValues = new ContentValues();
            contentValues.put("date_expires", Long.valueOf(((N.M7rZ5uJE() * 86400000) + System.currentTimeMillis()) / 1000));
            V60.a.getContentResolver().update(Uri.parse(str), contentValues, null, null);
            return openFileDescriptor.detachFd();
        } catch (Exception e) {
            AbstractC4851eH1.a("DownloadCollection", "Cannot open intermediate Uri.", e);
            return -1;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:2|3|(3:24|25|(9:29|(1:7)|8|9|10|11|(2:16|17)|13|14))|5|(0)|8|9|10|11|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:            r3 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:            android.util.Log.e("MediaStoreUtils", "Unable to publish pending session.", r3);     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a2: MOVE (r11 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:38:0x00a2 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String publishDownload(java.lang.String r12) {
        /*
            java.lang.String r0 = "DownloadCollection"
            java.lang.String r1 = "mime_type"
            android.content.Context r2 = defpackage.V60.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            r9 = 1
            r10 = 0
            r11 = 0
            android.net.Uri r4 = android.net.Uri.parse(r12)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String[] r5 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r2
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r3 == 0) goto L36
            int r4 = r3.getCount()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> La1
            if (r4 == 0) goto L36
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> La1
            if (r4 == 0) goto L36
            int r4 = r3.getColumnIndexOrThrow(r1)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> La1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> La1
            goto L37
        L34:
            r4 = move-exception
            goto L42
        L36:
            r4 = r11
        L37:
            if (r3 == 0) goto L51
            r3.close()
            goto L51
        L3d:
            r12 = move-exception
            goto La3
        L3f:
            r3 = move-exception
            r4 = r3
            r3 = r11
        L42:
            java.lang.String r5 = "Unable to get mimeType."
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> La1
            r6[r10] = r4     // Catch: java.lang.Throwable -> La1
            defpackage.AbstractC4851eH1.a(r0, r5, r6)     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L50
            r3.close()
        L50:
            r4 = r11
        L51:
            android.content.Context r3 = defpackage.V60.a
            android.net.Uri r12 = android.net.Uri.parse(r12)
            java.util.Objects.requireNonNull(r3)
            java.util.Objects.requireNonNull(r12)
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch: java.lang.Exception -> L78
            r5.<init>()     // Catch: java.lang.Exception -> L78
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> L78
            java.lang.String r7 = "is_pending"
            r5.put(r7, r6)     // Catch: java.lang.Exception -> L78
            java.lang.String r6 = "date_expires"
            r5.putNull(r6)     // Catch: java.lang.Exception -> L78
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> L78
            r3.update(r12, r5, r11, r11)     // Catch: java.lang.Exception -> L78
            goto L80
        L78:
            r3 = move-exception
            java.lang.String r5 = "MediaStoreUtils"
            java.lang.String r6 = "Unable to publish pending session."
            android.util.Log.e(r5, r6, r3)
        L80:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L9c
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Exception -> L92
            r3.<init>()     // Catch: java.lang.Exception -> L92
            r3.put(r1, r4)     // Catch: java.lang.Exception -> L92
            r2.update(r12, r3, r11, r11)     // Catch: java.lang.Exception -> L92
            goto L9c
        L92:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r10] = r1
            java.lang.String r1 = "Unable to modify mimeType."
            defpackage.AbstractC4851eH1.a(r0, r1, r2)
        L9c:
            java.lang.String r12 = r12.toString()
            return r12
        La1:
            r12 = move-exception
            r11 = r3
        La3:
            if (r11 == 0) goto La8
            r11.close()
        La8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.download.DownloadCollectionBridge.publishDownload(java.lang.String):java.lang.String");
    }

    public static String createIntermediateUriForPublish(String str, String str2, String str3, String str4) {
        String substring;
        Uri a2 = a(str, str2, str3, str4);
        if (a2 != null) {
            return a2.toString();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HHmmss.SSS", Locale.getDefault());
        Iterator it = a.iterator();
        while (true) {
            if (it.hasNext()) {
                String str5 = (String) it.next();
                if (str.endsWith(str5)) {
                    String substring2 = str.substring(0, str.length() - str5.length());
                    if (substring2.endsWith(".")) {
                        substring = substring2.substring(0, substring2.length() - 1);
                        break;
                    }
                }
            } else {
                int lastIndexOf = str.lastIndexOf(46);
                substring = lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
            }
        }
        Uri a3 = a(substring + " - " + simpleDateFormat.format(new Date()) + str.substring(substring.length()), str2, str3, str4);
        if (a3 == null) {
            return null;
        }
        return a3.toString();
    }

    public static boolean shouldPublishDownload(String str) {
        if (Build.VERSION.SDK_INT < 29 || str == null) {
            return false;
        }
        return !b.a(str);
    }

    public static boolean fileNameExists(String str) {
        return b(str) != null;
    }

    public static boolean renameDownloadUri(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        Uri parse = Uri.parse(str);
        contentValues.put("_display_name", str2);
        return V60.a.getContentResolver().update(parse, contentValues, null, null) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:            if (r12 == null) goto L22;     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.Uri b(java.lang.String r12) {
        /*
            java.lang.String r0 = "_id"
            r1 = 0
            r2 = 1
            r3 = 0
            android.net.Uri r4 = android.provider.MediaStore$Downloads.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            android.content.Context r5 = defpackage.V60.a     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            android.net.Uri r7 = defpackage.AbstractC6344ie.a(r4)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            java.lang.String r9 = "_display_name LIKE ?1"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r10[r1] = r12     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            r11 = 0
            android.database.Cursor r12 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L43
            if (r12 != 0) goto L28
            if (r12 == 0) goto L27
            r12.close()
        L27:
            return r3
        L28:
            boolean r5 = r12.moveToNext()     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L56
            if (r5 == 0) goto L52
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L56
            int r0 = r12.getInt(r0)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L56
            long r5 = (long) r0     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L56
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r4, r5)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L56
            r12.close()
            return r0
        L3f:
            r0 = move-exception
            goto L45
        L41:
            r0 = move-exception
            goto L58
        L43:
            r0 = move-exception
            r12 = r3
        L45:
            java.lang.String r4 = "DownloadCollection"
            java.lang.String r5 = "Unable to check file name existence."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L56
            r2[r1] = r0     // Catch: java.lang.Throwable -> L56
            defpackage.AbstractC4851eH1.a(r4, r5, r2)     // Catch: java.lang.Throwable -> L56
            if (r12 == 0) goto L55
        L52:
            r12.close()
        L55:
            return r3
        L56:
            r0 = move-exception
            r3 = r12
        L58:
            if (r3 == 0) goto L5d
            r3.close()
        L5d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.components.download.DownloadCollectionBridge.b(java.lang.String):android.net.Uri");
    }

    public static Uri a(String str, String str2, String str3, String str4) {
        C4906eS1 c4906eS1 = new C4906eS1(MediaStore$Downloads.EXTERNAL_CONTENT_URI, str, b.c(str2, str3, str));
        Uri b2 = b.b(str3);
        Uri parse = TextUtils.isEmpty(str4) ? null : Uri.parse(str4);
        ContentValues contentValues = c4906eS1.b;
        if (b2 == null) {
            contentValues.remove("download_uri");
        } else {
            contentValues.put("download_uri", b2.toString());
        }
        if (parse == null) {
            contentValues.remove("referer_uri");
        } else {
            contentValues.put("referer_uri", parse.toString());
        }
        contentValues.put("date_expires", Long.valueOf(((N.M7rZ5uJE() * 86400000) + System.currentTimeMillis()) / 1000));
        try {
            return V60.a.getContentResolver().insert(c4906eS1.a, contentValues);
        } catch (Exception unused) {
            return null;
        }
    }
}
