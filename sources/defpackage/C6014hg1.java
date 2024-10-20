package defpackage;

import J.N;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Response;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.historyreport.HistoryReportJniBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hg1 */
/* loaded from: classes.dex */
public final class C6014hg1 extends AbstractC8763pg1 {
    public final /* synthetic */ C9106qg1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6014hg1(C9106qg1 c9106qg1, T11 t11) {
        super(c9106qg1, t11);
        this.j = c9106qg1;
    }

    @Override // defpackage.B30
    public final void c(ZN zn) {
        long Mao2fV_W;
        T11 t11 = (T11) zn;
        C9106qg1 c9106qg1 = this.j;
        if (c9106qg1.a.getBoolean("com.google.android.apps.chrome.icing.IcingController.DATA_CLEARED", false)) {
            if (!t11.b()) {
                return;
            } else {
                c9106qg1.a.edit().putBoolean("com.google.android.apps.chrome.icing.IcingController.DATA_CLEARED", false).apply();
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        t11.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        Context context = t11.a;
        String packageName = context.getPackageName();
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = new GetCorpusStatusCall$Request();
        getCorpusStatusCall$Request.a = packageName;
        getCorpusStatusCall$Request.g = "omnibox";
        AbstractC10600v11 abstractC10600v11 = t11.b;
        GetCorpusStatusCall$Response getCorpusStatusCall$Response = (GetCorpusStatusCall$Response) abstractC10600v11.f(new IY0(getCorpusStatusCall$Request, abstractC10600v11)).b();
        EI2.j(SystemClock.elapsedRealtime() - elapsedRealtime2, "Search.HistoryReport.GetLastCommittedSeqno.Time");
        T11.c(getCorpusStatusCall$Response.a, "getLastCommittedSeqno");
        long j = getCorpusStatusCall$Response.a.r1() ? getCorpusStatusCall$Response.g.h : 0L;
        HistoryReportJniBridge historyReportJniBridge = (HistoryReportJniBridge) c9106qg1.f;
        historyReportJniBridge.getClass();
        Object obj = ThreadUtils.a;
        if (!historyReportJniBridge.a()) {
            AbstractC4851eH1.f("historyreport", "trimDeltaFile when JNI bridge not initialized", new Object[0]);
            Mao2fV_W = -1;
        } else {
            Mao2fV_W = N.Mao2fV_W(historyReportJniBridge.a, historyReportJniBridge, j);
        }
        if (Mao2fV_W != -1) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            String packageName2 = context.getPackageName();
            RequestIndexingCall$Request requestIndexingCall$Request = new RequestIndexingCall$Request();
            requestIndexingCall$Request.a = packageName2;
            requestIndexingCall$Request.g = "omnibox";
            requestIndexingCall$Request.h = Mao2fV_W;
            RequestIndexingCall$Response requestIndexingCall$Response = (RequestIndexingCall$Response) abstractC10600v11.f(new YN2(requestIndexingCall$Request, abstractC10600v11)).b();
            EI2.j(SystemClock.elapsedRealtime() - elapsedRealtime3, "Search.HistoryReport.RequestIndexing.Time");
            T11.c(requestIndexingCall$Response.a, "requestIndexing");
        }
        EI2.j(SystemClock.elapsedRealtime() - elapsedRealtime, "Search.HistoryReport.RequestIndexingTask.Time");
    }

    @Override // defpackage.B30
    public final void a() {
        this.j.e.set(false);
    }
}
