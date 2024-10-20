package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ji3 */
/* loaded from: classes.dex */
public final class C6714ji3 extends SV3 {
    public final C10670vD2 d;
    public final C6028hi3 e;

    public C6714ji3(C10670vD2 c10670vD2) {
        C6028hi3 c6028hi3 = C6028hi3.c;
        this.d = c10670vD2;
        this.e = c6028hi3;
    }

    @Override // defpackage.AbstractC6096hu
    public final void a(ArrayList arrayList) {
        arrayList.add(this.d);
    }

    @Override // defpackage.SV3
    public final void f(GO2 go2) {
        C6371ii3 c6371ii3 = new C6371ii3(this.e);
        C10670vD2 c10670vD2 = this.d;
        C6304iW3 c6304iW3 = (C6304iW3) go2;
        C9245r40 c9245r40 = new C9245r40(c6304iW3.a(c10670vD2.a));
        C9245r40 c9245r402 = new C9245r40(c10670vD2.b);
        C11647y41 c11647y41 = this.c;
        c11647y41.a(c9245r40, c6371ii3, "initial");
        c11647y41.a(c9245r402, c6371ii3, "end");
        C11356xD2 c11356xD2 = c10670vD2.a;
        c11647y41.a(c6371ii3, ((C5272fW3) ((C4241cW3) c6304iW3.a.b.a(c11356xD2.a)).a.get(c11356xD2.b)).a, "default_input");
    }
}
