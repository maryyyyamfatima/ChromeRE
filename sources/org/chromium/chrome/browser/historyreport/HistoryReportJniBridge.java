package org.chromium.chrome.browser.historyreport;

import J.N;
import android.os.Build;
import com.google.firebase.appindexing.internal.MutateRequest;
import defpackage.AbstractC4851eH1;
import defpackage.C8666pO0;
import defpackage.C9106qg1;
import defpackage.C9791sg1;
import defpackage.InterfaceC5102f03;
import defpackage.InterfaceC5446g03;
import defpackage.RunnableC9448rg1;
import defpackage.V60;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HistoryReportJniBridge implements InterfaceC5446g03 {
    public long a;
    public InterfaceC5102f03 b;
    public final AtomicBoolean c = new AtomicBoolean();

    public final boolean a() {
        return (this.a == 0 || this.b == null || !this.c.get()) ? false : true;
    }

    public final DeltaFileEntry[] b(int i, long j) {
        Object obj = ThreadUtils.a;
        if (a()) {
            return (DeltaFileEntry[]) N.MRHqDjPT(this.a, this, j, i);
        }
        AbstractC4851eH1.f("historyreport", "query when JNI bridge not initialized", new Object[0]);
        return new DeltaFileEntry[0];
    }

    public static DeltaFileEntry[] createDeltaFileEntriesArray(int i) {
        return new DeltaFileEntry[i];
    }

    public static void setDeltaFileEntry(DeltaFileEntry[] deltaFileEntryArr, int i, long j, String str, String str2, String str3, int i2, String str4, String str5) {
        deltaFileEntryArr[i] = new DeltaFileEntry(j, str, str2, str3, i2, str4, str5);
    }

    public static UsageReport[] createUsageReportsArray(int i) {
        return new UsageReport[i];
    }

    public static void setUsageReport(UsageReport[] usageReportArr, int i, String str, String str2, long j, boolean z) {
        usageReportArr[i] = new UsageReport(j, str, str2, z);
    }

    public final void onDataChanged() {
        C9106qg1 c9106qg1 = (C9106qg1) this.b;
        C9791sg1 c9791sg1 = c9106qg1.d;
        c9791sg1.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT > 27) {
            if (c9791sg1.b.compareAndSet(false, true)) {
                c9791sg1.c.schedule(new RunnableC9448rg1(c9791sg1, z), c9791sg1.d, TimeUnit.MILLISECONDS);
            }
        } else if (c9106qg1.e.compareAndSet(false, true)) {
            c9106qg1.g.schedule(c9106qg1.j, c9106qg1.h, TimeUnit.MILLISECONDS);
        }
    }

    public final void onDataCleared() {
        C9106qg1 c9106qg1 = (C9106qg1) this.b;
        c9106qg1.d.getClass();
        if (!(Build.VERSION.SDK_INT > 27)) {
            c9106qg1.a.edit().putBoolean("com.google.android.apps.chrome.icing.IcingController.DATA_CLEARED", true).apply();
            c9106qg1.g.execute(c9106qg1.k);
        } else {
            C8666pO0.a(V60.a).b(new MutateRequest(4, null, null, null, null, null, null));
            V60.a.getSharedPreferences("icing_firebase_pref", 0).edit().putLong("LastSeqno", 0L).apply();
        }
    }

    public final void startReportingTask() {
        C9106qg1 c9106qg1 = (C9106qg1) this.b;
        c9106qg1.d.getClass();
        if (!(Build.VERSION.SDK_INT > 27) && c9106qg1.i.get() && c9106qg1.m.compareAndSet(false, true)) {
            c9106qg1.g.schedule(c9106qg1.l, C9106qg1.o, TimeUnit.MILLISECONDS);
        }
    }

    public final void stopReportingTask() {
        ((C9106qg1) this.b).m.set(false);
    }
}
