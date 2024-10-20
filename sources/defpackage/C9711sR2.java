package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sR2 */
/* loaded from: classes.dex */
public final class C9711sR2 extends UZ {
    public C10054tR2 i;

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.UZ
    public final /* bridge */ /* synthetic */ UZ y(WZ wz) {
        B(wz);
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C10054tR2) wz;
    }

    public final void B(WZ wz) {
        List list;
        List list2;
        if (wz == null) {
            return;
        }
        list = this.i.D;
        if (list == null) {
            this.i.D = new ArrayList();
        }
        list2 = this.i.D;
        list2.add(wz);
    }

    @Override // defpackage.UZ
    public final UZ w(EnumC8151ns4 enumC8151ns4) {
        this.i.E = enumC8151ns4;
        return this;
    }

    @Override // defpackage.UZ
    public final UZ x(EnumC8151ns4 enumC8151ns4) {
        this.i.F = enumC8151ns4;
        return this;
    }

    @Override // defpackage.UZ
    public final UZ z(EnumC10552us4 enumC10552us4) {
        this.i.G = enumC10552us4;
        return this;
    }

    @Override // defpackage.UZ
    public final UZ A(Bs4 bs4) {
        this.i.H = bs4;
        return this;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        return this.i;
    }
}
