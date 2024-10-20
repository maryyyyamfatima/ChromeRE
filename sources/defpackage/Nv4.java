package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Nv4 implements InterfaceC7481lv4 {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ List e;
    public final /* synthetic */ AH0 f;

    public Nv4(AH0 ah0, List list, List list2, long j, boolean z, List list3) {
        this.f = ah0;
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = z;
        this.e = list3;
    }

    @Override // defpackage.InterfaceC7481lv4
    public final void a() {
        AH0 ah0 = this.f;
        ah0.k.addAll(this.a);
        ah0.l.addAll(this.b);
        Long valueOf = Long.valueOf(this.c);
        ah0.i(5, 0, null, valueOf, valueOf, null, null);
    }

    @Override // defpackage.InterfaceC7481lv4
    public final void b() {
        if (this.d) {
            return;
        }
        this.f.k(this.e, this.a, this.b, this.c, true);
    }

    @Override // defpackage.InterfaceC7481lv4
    public final void c(int i) {
        this.f.i(6, i, null, null, null, null, null);
    }
}
