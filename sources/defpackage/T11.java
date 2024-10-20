package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T11 extends AbstractC3510aO {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T11(android.content.Context r3) {
        /*
            r2 = this;
            s11 r0 = new s11
            android.content.Context r1 = r3.getApplicationContext()
            r0.<init>(r1)
            ad r1 = defpackage.AbstractC4758e03.a
            r0.a(r1)
            N11 r0 = r0.b()
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T11.<init>(android.content.Context):void");
    }

    public final boolean b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String packageName = this.a.getPackageName();
        ClearCorpusCall$Request clearCorpusCall$Request = new ClearCorpusCall$Request();
        clearCorpusCall$Request.a = packageName;
        clearCorpusCall$Request.g = "omnibox";
        AbstractC10600v11 abstractC10600v11 = this.b;
        ClearCorpusCall$Response clearCorpusCall$Response = (ClearCorpusCall$Response) abstractC10600v11.f(new C4566dT(clearCorpusCall$Request, abstractC10600v11)).b();
        EI2.j(SystemClock.elapsedRealtime() - elapsedRealtime, "Search.HistoryReport.ClearData.Time");
        c(clearCorpusCall$Response.a, "clearData");
        return clearCorpusCall$Response.a.r1();
    }

    public static void c(Status status, String str) {
        if (status == null || !status.r1()) {
            AbstractC4851eH1.a("cr_Icing", "%s failed. %s", str, status);
        }
    }
}
