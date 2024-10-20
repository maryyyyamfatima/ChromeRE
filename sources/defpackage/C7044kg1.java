package defpackage;

import android.content.Context;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.ClearCorpusCall$Response;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Response;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kg1 */
/* loaded from: classes.dex */
public final class C7044kg1 extends AbstractC8763pg1 {
    public final /* synthetic */ C9106qg1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7044kg1(C9106qg1 c9106qg1, T11 t11) {
        super(c9106qg1, t11);
        this.j = c9106qg1;
    }

    @Override // defpackage.B30
    public final void c(ZN zn) {
        T11 t11 = (T11) zn;
        Context context = t11.a;
        String packageName = context.getPackageName();
        GetCorpusStatusCall$Request getCorpusStatusCall$Request = new GetCorpusStatusCall$Request();
        getCorpusStatusCall$Request.a = packageName;
        getCorpusStatusCall$Request.g = "history";
        AbstractC10600v11 abstractC10600v11 = t11.b;
        GetCorpusStatusCall$Response getCorpusStatusCall$Response = (GetCorpusStatusCall$Response) abstractC10600v11.f(new IY0(getCorpusStatusCall$Request, abstractC10600v11)).b();
        boolean z = false;
        if (getCorpusStatusCall$Response.a.r1()) {
            CorpusStatus corpusStatus = getCorpusStatusCall$Response.g;
            if (corpusStatus != null && corpusStatus.a) {
                z = true;
            }
            if (z) {
                String packageName2 = context.getPackageName();
                ClearCorpusCall$Request clearCorpusCall$Request = new ClearCorpusCall$Request();
                clearCorpusCall$Request.a = packageName2;
                clearCorpusCall$Request.g = "history";
                ClearCorpusCall$Response clearCorpusCall$Response = (ClearCorpusCall$Response) abstractC10600v11.f(new C4566dT(clearCorpusCall$Request, abstractC10600v11)).b();
                T11.c(clearCorpusCall$Response.a, "clearLegacyCorpus");
                z = clearCorpusCall$Response.a.r1();
            } else {
                z = true;
            }
        }
        if (z) {
            this.j.a.edit().putBoolean("com.google.android.apps.chrome.icing.IcingController.LEGACY_CORPUS_DATA_CLEARED_PREFS_NAME", true).apply();
        }
    }
}
