package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Am3 */
/* loaded from: classes.dex */
public final class C0064Am3 implements DV0 {
    public final AbstractC0952Hi1 a;
    public final C9570s10 b;

    @Override // defpackage.DV0
    public final Object apply(Object obj) {
        C8885q10 c8885q10 = (C8885q10) C9570s10.k.k(this.b);
        C14 it = ((AbstractC0952Hi1) obj).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) this.a.get(entry.getKey());
            C9913t10 c9913t10 = (C9913t10) C10256u10.l.j();
            ZD d = AbstractC4147cE.d((byte[]) entry.getValue());
            if (c9913t10.h) {
                c9913t10.l();
                c9913t10.h = false;
            }
            C10256u10 c10256u10 = (C10256u10) c9913t10.g;
            c10256u10.getClass();
            c10256u10.j = 5;
            c10256u10.k = d;
            c8885q10.o(str, (C10256u10) c9913t10.j());
        }
        return (C9570s10) c8885q10.j();
    }

    public C0064Am3(TL2 tl2, C9570s10 c9570s10) {
        this.a = tl2;
        this.b = c9570s10;
    }
}
