package org.chromium.chrome.browser.download;

import J.N;
import android.app.DownloadManager;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC6091ht0;
import defpackage.C4366cs0;
import defpackage.C5397fs0;
import defpackage.C7432ln3;
import defpackage.QF3;
import defpackage.V60;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.download.DownloadManagerBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadManagerBridge {
    public static final Object a = new Object();

    public static void removeCompletedDownload(final String str, final boolean z) {
        PostTask.c(QF3.h, new Runnable() { // from class: bs0
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                String str2 = str;
                boolean z2 = z;
                synchronized (DownloadManagerBridge.a) {
                    SharedPreferences sharedPreferences = V60.a.getSharedPreferences("download_id_mappings", 0);
                    j = sharedPreferences.getLong(str2, -1L);
                    if (j != -1) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.remove(str2);
                        edit.apply();
                    }
                }
                if (j == -1 || z2) {
                    return;
                }
                ((DownloadManager) V60.a.getSystemService("download")).remove(j);
            }
        });
    }

    public static C5397fs0 b(long j) {
        Cursor query;
        C5397fs0 c5397fs0 = new C5397fs0();
        DownloadManager downloadManager = (DownloadManager) V60.a.getSystemService("download");
        try {
            query = downloadManager.query(new DownloadManager.Query().setFilterById(j));
        } catch (Exception e) {
            c5397fs0.a = 3;
            AbstractC4851eH1.a("DownloadDelegate", "unable to query android DownloadManager", e);
        }
        if (query == null) {
            c5397fs0.a = 3;
            return c5397fs0;
        }
        c5397fs0.a = 0;
        if (query.moveToNext()) {
            int i = query.getInt(query.getColumnIndexOrThrow("status"));
            c5397fs0.a = i != 8 ? i != 16 ? 0 : 2 : 1;
            c5397fs0.b = query.getString(query.getColumnIndexOrThrow("title"));
            c5397fs0.g = query.getInt(query.getColumnIndexOrThrow("reason"));
            query.getLong(query.getColumnIndexOrThrow("last_modified_timestamp"));
            c5397fs0.e = query.getLong(query.getColumnIndexOrThrow("bytes_so_far"));
            c5397fs0.f = query.getLong(query.getColumnIndexOrThrow("total_size"));
            String string = query.getString(query.getColumnIndexOrThrow("local_uri"));
            if (!TextUtils.isEmpty(string)) {
                c5397fs0.h = Uri.parse(string).getPath();
            }
        } else {
            c5397fs0.a = 3;
        }
        query.close();
        try {
            c5397fs0.d = downloadManager.getUriForDownloadedFile(j);
        } catch (SecurityException unused) {
            AbstractC4851eH1.a("DownloadDelegate", "unable to get content URI from DownloadManager", new Object[0]);
        }
        c5397fs0.c = downloadManager.getMimeTypeForDownloadedFile(j);
        return c5397fs0;
    }

    public static long a(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7) {
        C7432ln3 c = C7432ln3.c();
        try {
            long j2 = V60.a.getSharedPreferences("download_id_mappings", 0).getLong(str7, -1L);
            c.close();
            if (j2 != -1) {
                return j2;
            }
            long a2 = AbstractC6091ht0.a(str, str2, str3, str4, j, str5, str6);
            if (a2 != -1) {
                synchronized (a) {
                    SharedPreferences.Editor edit = V60.a.getSharedPreferences("download_id_mappings", 0).edit();
                    edit.putLong(str7, a2);
                    edit.apply();
                }
            }
            return a2;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static void addCompletedDownload(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, long j2) {
        try {
            new C4366cs0(str4, str, str2, MimeUtils.remapGenericMimeType(str3, str5, str), j, str5, str6, str7, j2).c(AbstractC0185Bl.e);
        } catch (RejectedExecutionException unused) {
            AbstractC4851eH1.a("DownloadDelegate", "Thread limit reached, reschedule notification update later.", new Object[0]);
            N.Mct0JWyi(j2, -1L);
        }
    }
}
