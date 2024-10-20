package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dX */
/* loaded from: classes.dex */
public final class C4586dX extends UZ {
    public C4929eX i;

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.UZ
    public final /* bridge */ /* synthetic */ UZ y(WZ wz) {
        C(wz);
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C4929eX) wz;
    }

    public final void C(WZ wz) {
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

    public final C4586dX B(TZ tz) {
        if (tz == null) {
            return this;
        }
        C(tz.d());
        return this;
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
