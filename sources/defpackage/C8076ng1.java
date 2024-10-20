package defpackage;

import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ng1 */
/* loaded from: classes.dex */
public final class C8076ng1 extends AbstractC8420og1 {
    public C8076ng1(C9106qg1 c9106qg1, U11 u11) {
        super(c9106qg1, u11);
    }

    @Override // defpackage.B30
    public final void c(ZN zn) {
        DocumentId documentId;
        V11 v11 = (V11) ((U11) zn);
        if (v11.d == null || (documentId = v11.e) == null) {
            return;
        }
        UsageInfo[] usageInfoArr = {new UsageInfo(documentId, System.currentTimeMillis(), 3, v11.d)};
        AbstractC10600v11 abstractC10600v11 = v11.b;
        abstractC10600v11.f(new W34(abstractC10600v11, usageInfoArr));
        v11.e = null;
        v11.d = null;
    }
}
