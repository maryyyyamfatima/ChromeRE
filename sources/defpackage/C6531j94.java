package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j94 */
/* loaded from: classes.dex */
public final class C6531j94 extends WZ {
    public static final /* synthetic */ int P = 0;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    float D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC3204Yr E;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C3090Xu0 F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Ia4 G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C2279Ro H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C3112Xy2 I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC2938Wp3 f11514J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C9596s52 K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    UV3 L;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C12165zb4 M;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C10409uU N;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Fa4 O;

    @Override // defpackage.AbstractC10593v00
    public final int N() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean e() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final int m() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean s() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.video_root);
        return frameLayout;
    }

    @Override // defpackage.AbstractC10593v00
    public final void y(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1) {
        EnumC8736pb4 enumC8736pb4;
        Resources f = c7849n00.f();
        int width = interfaceC3331Zq1.getWidth();
        int height = interfaceC3331Zq1.getHeight();
        int dimensionPixelSize = f.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080737);
        if (width >= dimensionPixelSize && height >= dimensionPixelSize) {
            enumC8736pb4 = EnumC8736pb4.STANDARD;
        } else {
            int dimensionPixelSize2 = f.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080736);
            if (width >= dimensionPixelSize2 && height >= dimensionPixelSize2) {
                enumC8736pb4 = EnumC8736pb4.SMALL;
            } else {
                enumC8736pb4 = EnumC8736pb4.XSMALL;
            }
        }
        ((C5845h94) this.A).a = enumC8736pb4;
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        AtomicReference atomicReference = new AtomicReference(null);
        AtomicReference atomicReference2 = new AtomicReference(null);
        AbstractC6726jk3 abstractC6726jk3 = this.z;
        ((C6189i94) abstractC6726jk3).b = atomicReference;
        ((C6189i94) abstractC6726jk3).a = atomicReference2;
    }

    public C6531j94() {
        super("Video");
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new C6189i94();
    }

    @Override // defpackage.WZ
    public final InterfaceC2671Uo1 W() {
        return new C5845h94();
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || C6531j94.class != wz.getClass()) {
            return false;
        }
        C6531j94 c6531j94 = (C6531j94) wz;
        if (Float.compare(this.D, c6531j94.D) != 0) {
            return false;
        }
        InterfaceC3204Yr interfaceC3204Yr = this.E;
        if (interfaceC3204Yr == null ? c6531j94.E != null : !interfaceC3204Yr.equals(c6531j94.E)) {
            return false;
        }
        C3090Xu0 c3090Xu0 = this.F;
        if (c3090Xu0 == null ? c6531j94.F != null : !c3090Xu0.equals(c6531j94.F)) {
            return false;
        }
        Ia4 ia4 = this.G;
        if (ia4 == null ? c6531j94.G != null : !ia4.equals(c6531j94.G)) {
            return false;
        }
        C2279Ro c2279Ro = this.H;
        if (c2279Ro == null ? c6531j94.H != null : !c2279Ro.equals(c6531j94.H)) {
            return false;
        }
        C3112Xy2 c3112Xy2 = this.I;
        if (c3112Xy2 == null ? c6531j94.I != null : !c3112Xy2.equals(c6531j94.I)) {
            return false;
        }
        InterfaceC2938Wp3 interfaceC2938Wp3 = this.f11514J;
        if (interfaceC2938Wp3 == null ? c6531j94.f11514J != null : !interfaceC2938Wp3.equals(c6531j94.f11514J)) {
            return false;
        }
        C9596s52 c9596s52 = this.K;
        if (c9596s52 == null ? c6531j94.K != null : !c9596s52.equals(c6531j94.K)) {
            return false;
        }
        UV3 uv3 = this.L;
        if (uv3 == null ? c6531j94.L != null : !uv3.equals(c6531j94.L)) {
            return false;
        }
        C12165zb4 c12165zb4 = this.M;
        if (c12165zb4 == null ? c6531j94.M != null : !c12165zb4.equals(c6531j94.M)) {
            return false;
        }
        C10409uU c10409uU = this.N;
        if (c10409uU == null ? c6531j94.N != null : !c10409uU.equals(c6531j94.N)) {
            return false;
        }
        Fa4 fa4 = this.O;
        Fa4 fa42 = c6531j94.O;
        return fa4 == null ? fa42 == null : fa4.equals(fa42);
    }

    @Override // defpackage.WZ
    public final void V(InterfaceC2671Uo1 interfaceC2671Uo1, InterfaceC2671Uo1 interfaceC2671Uo12) {
        ((C5845h94) interfaceC2671Uo1).a = ((C5845h94) interfaceC2671Uo12).a;
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        C6531j94 c6531j94 = (C6531j94) super.k0();
        c6531j94.z = new C6189i94();
        c6531j94.A = new C5845h94();
        return c6531j94;
    }

    @Override // defpackage.AbstractC10593v00
    public final void K(C7849n00 c7849n00) {
        C6886kC c6886kC = new C6886kC(this.H.a);
        WZ wz = c7849n00.f;
        String c = c7849n00.c();
        wz.getClass();
        if (wz.k == null) {
            wz.k = new ArrayList();
        }
        wz.k.add(new Nq4("prefetch", c6886kC, wz, c));
    }

    @Override // defpackage.AbstractC10593v00
    public final void G(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1, int i, int i2, C8753pe3 c8753pe3) {
        PM1.b(i, i2, this.D, c8753pe3);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0262  */
    @Override // defpackage.AbstractC10593v00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(defpackage.C7849n00 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6531j94.x(n00, java.lang.Object):void");
    }

    @Override // defpackage.AbstractC10593v00
    public final void L(Object obj) {
        C2960Wu0 c2960Wu0;
        Ks4 ks4;
        FrameLayout frameLayout = (FrameLayout) obj;
        InterfaceC3204Yr interfaceC3204Yr = this.E;
        UV3 uv3 = this.L;
        C9596s52 c9596s52 = this.K;
        C6189i94 c6189i94 = (C6189i94) this.z;
        AtomicReference atomicReference = c6189i94.b;
        AtomicReference atomicReference2 = c6189i94.a;
        c9596s52.getClass();
        ((C3678as) interfaceC3204Yr).b(frameLayout);
        uv3.a.remove(frameLayout);
        if (atomicReference2.get() != null && (ks4 = (c2960Wu0 = (C2960Wu0) ((InterfaceC2700Uu0) atomicReference2.get())).e) != null) {
            ks4.e.remove(c2960Wu0);
        }
        if (atomicReference.get() != null) {
            ((Ks4) atomicReference.get()).i();
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void h(String str) {
        str.getClass();
        if (str.equals("prefetch")) {
            C12165zb4 c12165zb4 = this.M;
            C3112Xy2 c3112Xy2 = this.I;
            if (c12165zb4.o == null) {
                C2317Rv2 c2317Rv2 = C2317Rv2.l;
            }
            c3112Xy2.getClass();
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void j(String str) {
        Objects.requireNonNull(str);
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        C6189i94 c6189i94 = (C6189i94) abstractC6726jk3;
        C6189i94 c6189i942 = (C6189i94) abstractC6726jk32;
        c6189i942.a = c6189i94.a;
        c6189i942.b = c6189i94.b;
    }
}
