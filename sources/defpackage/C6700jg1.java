package defpackage;

import J.N;
import android.os.SystemClock;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.historyreport.HistoryReportJniBridge;
import org.chromium.chrome.browser.historyreport.UsageReport;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jg1 */
/* loaded from: classes.dex */
public final class C6700jg1 extends AbstractC8420og1 {
    public final /* synthetic */ C9106qg1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6700jg1(C9106qg1 c9106qg1, V11 v11) {
        super(c9106qg1, v11);
        this.j = c9106qg1;
    }

    @Override // defpackage.B30
    public final void c(ZN zn) {
        UsageReport[] usageReportArr;
        U11 u11 = (U11) zn;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C9106qg1 c9106qg1 = this.j;
        HistoryReportJniBridge historyReportJniBridge = (HistoryReportJniBridge) c9106qg1.f;
        historyReportJniBridge.getClass();
        Object obj = ThreadUtils.a;
        if (historyReportJniBridge.a()) {
            usageReportArr = (UsageReport[]) N.MLhU72Je(historyReportJniBridge.a, historyReportJniBridge, 100);
        } else {
            AbstractC4851eH1.f("historyreport", "getUsageReportsBatch when JNI bridge not initialized", new Object[0]);
            usageReportArr = new UsageReport[0];
        }
        int length = usageReportArr.length;
        AtomicBoolean atomicBoolean = c9106qg1.m;
        if (length > 0 && atomicBoolean.get()) {
            V11 v11 = (V11) u11;
            v11.getClass();
            UsageInfo[] usageInfoArr = new UsageInfo[usageReportArr.length];
            for (int i = 0; i < usageReportArr.length; i++) {
                usageInfoArr[i] = new UsageInfo(new DocumentId(v11.a.getPackageName(), "omnibox", usageReportArr[i].b), usageReportArr[i].c, usageReportArr[i].d ? 1 : 0, null, null, false, -1, 0, null);
            }
            AbstractC10600v11 abstractC10600v11 = v11.b;
            Status status = (Status) abstractC10600v11.f(new W34(abstractC10600v11, usageInfoArr)).c(V11.f, TimeUnit.MILLISECONDS);
            T11.c(status, "reportPageVisit");
            if (status != null && status.r1()) {
                HistoryReportJniBridge historyReportJniBridge2 = (HistoryReportJniBridge) c9106qg1.f;
                historyReportJniBridge2.getClass();
                Object obj2 = ThreadUtils.a;
                if (!historyReportJniBridge2.a()) {
                    AbstractC4851eH1.f("historyreport", "removeUsageReports when JNI bridge not initialized", new Object[0]);
                } else {
                    String[] strArr = new String[usageReportArr.length];
                    for (int i2 = 0; i2 < usageReportArr.length; i2++) {
                        strArr[i2] = usageReportArr[i2].a;
                    }
                    N.MilENC5v(historyReportJniBridge2.a, historyReportJniBridge2, strArr);
                }
            }
            d(this, C9106qg1.o);
        } else {
            atomicBoolean.set(false);
        }
        EI2.j(SystemClock.elapsedRealtime() - elapsedRealtime, "Search.HistoryReport.ReportUsageTask.Time");
    }
}
