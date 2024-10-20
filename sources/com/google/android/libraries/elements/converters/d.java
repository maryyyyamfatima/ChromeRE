package com.google.android.libraries.elements.converters;

import defpackage.C5612gW;
import defpackage.EnumC11068wO2;
import defpackage.H10;
import defpackage.InterfaceC6115hx0;
import defpackage.InterfaceC6894kD2;
import defpackage.InterfaceC8520ox0;
import defpackage.SY;
import defpackage.U80;
import defpackage.WZ;
import defpackage.Y03;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class d extends Y03 {
    public static final /* synthetic */ int x = 0;

    @SY(type = 6)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List r;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C5612gW s;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    H10 t;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 u;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC6115hx0 v;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC8520ox0 w;

    public d() {
        super("CollectionSection");
    }

    @Override // defpackage.Y03
    /* renamed from: p */
    public final boolean a(Y03 y03) {
        if (this == y03) {
            return true;
        }
        if (y03 == null || d.class != y03.getClass()) {
            return false;
        }
        d dVar = (d) y03;
        List list = this.r;
        if (list != null) {
            if (dVar.r != null && list.size() == dVar.r.size()) {
                Iterator it = this.r.iterator();
                Iterator it2 = dVar.r.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    if (!((WZ) it.next()).a((WZ) it2.next())) {
                    }
                }
            }
            return false;
        }
        if (dVar.r != null) {
            return false;
        }
        C5612gW c5612gW = this.s;
        if (c5612gW == null ? dVar.s != null : !c5612gW.equals(dVar.s)) {
            return false;
        }
        H10 h10 = this.t;
        if (h10 == null ? dVar.t != null : !h10.equals(dVar.t)) {
            return false;
        }
        U80 u80 = this.u;
        if (u80 == null ? dVar.u != null : !u80.equals(dVar.u)) {
            return false;
        }
        InterfaceC6115hx0 interfaceC6115hx0 = this.v;
        if (interfaceC6115hx0 == null ? dVar.v != null : !interfaceC6115hx0.equals(dVar.v)) {
            return false;
        }
        InterfaceC8520ox0 interfaceC8520ox0 = this.w;
        InterfaceC8520ox0 interfaceC8520ox02 = dVar.w;
        return interfaceC8520ox0 == null ? interfaceC8520ox02 == null : interfaceC8520ox0.equals(interfaceC8520ox02);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    @Override // defpackage.AbstractC8888q13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.EK d(defpackage.C3390a13 r23) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.converters.d.d(a13):EK");
    }
}
