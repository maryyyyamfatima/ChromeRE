package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.DebuggerClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S00 extends WZ {
    public static final /* synthetic */ int P = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 D;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean E;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC9989tE2 F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC11517xi0 G;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    X82 I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC9896sy0 f11466J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC12058zG3 K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C11628y10 L;

    @SY(type = 13)
    H10 M;

    @SY(type = 13)
    InterfaceC6115hx0 N;

    @SY(type = 13)
    InterfaceC8520ox0 O;

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    public S00() {
        super("ComponentType");
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new Q00();
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        S00 s00 = (S00) super.k0();
        s00.z = new Q00();
        return s00;
    }

    @Override // defpackage.AbstractC10593v00
    public final void O(C5277fX3 c5277fX3) {
        if (c5277fX3 == null) {
            return;
        }
        this.M = (H10) c5277fX3.a(H10.class);
        this.N = (InterfaceC6115hx0) c5277fX3.a(InterfaceC6115hx0.class);
        this.O = (InterfaceC8520ox0) c5277fX3.a(InterfaceC8520ox0.class);
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        InterfaceC8520ox0 interfaceC8520ox0 = this.O;
        H10 h10 = this.M;
        InterfaceC6115hx0 interfaceC6115hx0 = this.N;
        C11628y10 c11628y10 = this.L;
        X82 x82 = this.I;
        U80 u80 = this.D;
        AbstractC9896sy0 abstractC9896sy0 = this.f11466J;
        boolean z = this.E;
        boolean z2 = this.H;
        C0070Ao c0070Ao = AbstractC11971z10.a;
        C0766Fx0 c0766Fx0 = new C0766Fx0(abstractC9896sy0, interfaceC8520ox0, u80, interfaceC6115hx0, h10);
        AbstractC11971z10.a(c0766Fx0, c7849n00, u80, c11628y10, x82, abstractC9896sy0, z, z2);
        h10.a(c0766Fx0);
        ((Q00) this.z).b = c0766Fx0;
    }

    @Override // defpackage.AbstractC10593v00
    public final void E() {
        U80 u80 = this.D;
        C11628y10 c11628y10 = this.L;
        InterfaceC9989tE2 interfaceC9989tE2 = this.F;
        InterfaceC11517xi0 interfaceC11517xi0 = this.G;
        C0070Ao c0070Ao = AbstractC11971z10.a;
        if (interfaceC11517xi0.liveUpdateEnabled()) {
            C3853bN3 c3853bN3 = (C3853bN3) C4196cN3.m.j();
            C4883eN3 c = AbstractC12203zi0.c(u80);
            if (c3853bN3.h) {
                c3853bN3.l();
                c3853bN3.h = false;
            }
            C4196cN3 c4196cN3 = (C4196cN3) c3853bN3.g;
            c4196cN3.getClass();
            c.getClass();
            c4196cN3.k = c;
            c4196cN3.j |= 1;
            String e = C5105f10.e(c11628y10.a.f(14));
            if (c3853bN3.h) {
                c3853bN3.l();
                c3853bN3.h = false;
            }
            C4196cN3 c4196cN32 = (C4196cN3) c3853bN3.g;
            c4196cN32.getClass();
            e.getClass();
            c4196cN32.j |= 2;
            c4196cN32.l = e;
            C4196cN3 c4196cN33 = (C4196cN3) c3853bN3.j();
            DebuggerClient debuggerClient = (DebuggerClient) interfaceC9989tE2.get();
            C7633mN3 c7633mN3 = (C7633mN3) C7977nN3.p.j();
            C11064wN3 d = AbstractC12203zi0.d();
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN3 = (C7977nN3) c7633mN3.g;
            c7977nN3.getClass();
            d.getClass();
            c7977nN3.m = d;
            c7977nN3.j |= 1;
            if (c7633mN3.h) {
                c7633mN3.l();
                c7633mN3.h = false;
            }
            C7977nN3 c7977nN32 = (C7977nN3) c7633mN3.g;
            c7977nN32.getClass();
            c4196cN33.getClass();
            c7977nN32.l = c4196cN33;
            c7977nN32.k = 9;
            debuggerClient.sendTimelineEvent(((C7977nN3) c7633mN3.j()).toByteArray());
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        Q00 q00 = (Q00) abstractC6726jk3;
        Q00 q002 = (Q00) abstractC6726jk32;
        q002.a = q00.a;
        q002.b = q00.b;
    }

    @Override // defpackage.AbstractC10593v00
    public final WZ z(C7849n00 c7849n00) {
        C0636Ex0 c0636Ex0;
        WZ wz;
        C0636Ex0 c0636Ex02;
        Q00 q00 = (Q00) this.z;
        C0766Fx0 c0766Fx0 = q00.b;
        int i = q00.a;
        C11628y10 c11628y10 = this.L;
        X82 x82 = this.I;
        U80 u80 = this.D;
        AbstractC9896sy0 abstractC9896sy0 = this.f11466J;
        InterfaceC12058zG3 interfaceC12058zG3 = this.K;
        boolean z = this.E;
        boolean z2 = this.H;
        C0070Ao c0070Ao = AbstractC11971z10.a;
        InterfaceC7103kq0 interfaceC7103kq0 = ((C3184Yn) u80).f;
        if (interfaceC7103kq0 instanceof H10) {
            H10 h10 = (H10) interfaceC7103kq0;
            synchronized (c0766Fx0) {
                c0766Fx0.j = h10;
            }
        }
        WZ wz2 = null;
        if (c0766Fx0.m != x82) {
            if (c11628y10 != null) {
                synchronized (c0766Fx0) {
                    if (c0766Fx0.a() || (c0636Ex02 = c0766Fx0.l) == null) {
                        wz = null;
                    } else {
                        synchronized (c0636Ex02.i) {
                            wz = c0636Ex02.j;
                        }
                    }
                }
                if (wz != null) {
                    C0636Ex0 c0636Ex03 = c0766Fx0.l;
                    C11628y10 c11628y102 = c0636Ex03 != null ? c0636Ex03.h : null;
                    if (c11628y102 != null && !c0766Fx0.a() && c11628y10.equals(c11628y102)) {
                        return wz.k0();
                    }
                }
            }
            c0766Fx0.dispose();
        }
        if (c0766Fx0.a()) {
            AbstractC11971z10.a(c0766Fx0, c7849n00, u80, c11628y10, x82, abstractC9896sy0, z, z2);
            if (interfaceC7103kq0 != null) {
                interfaceC7103kq0.a(c0766Fx0);
            }
        } else {
            synchronized (c0766Fx0) {
                if (!c0766Fx0.a()) {
                    c0766Fx0.k.d(c7849n00);
                }
            }
        }
        synchronized (c0766Fx0) {
            if (!c0766Fx0.a() && (c0636Ex0 = c0766Fx0.l) != null) {
                synchronized (c0636Ex0.i) {
                    wz2 = c0636Ex0.j;
                }
            }
        }
        if (wz2 == null) {
            interfaceC12058zG3.g(true);
            return C6533jA0.p0(c7849n00).i;
        }
        interfaceC12058zG3.g(false);
        return wz2.k0();
    }
}
