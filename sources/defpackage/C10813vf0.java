package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.app.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vf0 */
/* loaded from: classes.dex */
public final class C10813vf0 implements InterfaceC9989tE2 {
    public final C12185zf0 a;
    public final C11156wf0 b;
    public final int c;

    public C10813vf0(C12185zf0 c12185zf0, C11156wf0 c11156wf0, int i) {
        this.a = c12185zf0;
        this.b = c11156wf0;
        this.c = i;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        int i;
        int i2;
        In4 F;
        C12185zf0 c12185zf0 = this.a;
        C11156wf0 c11156wf0 = this.b;
        int i3 = this.c;
        switch (i3) {
            case 0:
                I5 i5 = c11156wf0.a.g;
                AbstractC6122hy2.a(i5);
                C2468Sz3 c2468Sz3 = (C2468Sz3) c11156wf0.e.get();
                C4620dd0 c4620dd0 = (C4620dd0) c11156wf0.d.get();
                PC pc = c11156wf0.b.a;
                AbstractC6122hy2.a(pc);
                return new C9766sc0(i5, c2468Sz3, c4620dd0, pc, c11156wf0.c());
            case 1:
                I5 i52 = c11156wf0.a.g;
                AbstractC6122hy2.a(i52);
                return new C2468Sz3(i52, (C4620dd0) c11156wf0.d.get());
            case 2:
                return new C4620dd0();
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                CustomTabsConnection customTabsConnection = (CustomTabsConnection) c12185zf0.d.get();
                PC pc2 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc2);
                I5 i53 = c11156wf0.a.g;
                AbstractC6122hy2.a(i53);
                return new C1441Lc0(customTabsConnection, pc2, i53, (C4620dd0) c11156wf0.d.get());
            case 4:
                I5 i54 = c11156wf0.a.g;
                AbstractC6122hy2.a(i54);
                PC pc3 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc3);
                C6592jM c6592jM = c11156wf0.a;
                a aVar = c6592jM.a;
                AbstractC6122hy2.a(aVar);
                InterfaceC0079Ap3 interfaceC0079Ap3 = c6592jM.w;
                AbstractC6122hy2.a(interfaceC0079Ap3);
                return new C1570Mc0(i54, pc3, aVar, interfaceC0079Ap3);
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                C3130Yc0 c3130Yc0 = (C3130Yc0) c11156wf0.y.get();
                C4620dd0 c4620dd02 = (C4620dd0) c11156wf0.d.get();
                PC pc4 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc4);
                InterfaceC3241Yy1 a = C2680Uq0.a(c11156wf0.t);
                C6637jV c6637jV = (C6637jV) c11156wf0.z.get();
                c12185zf0.a.getClass();
                C7629mN a2 = C7629mN.a();
                AbstractC6122hy2.a(a2);
                C6592jM c6592jM2 = c11156wf0.a;
                a aVar2 = c6592jM2.a;
                AbstractC6122hy2.a(aVar2);
                I5 i55 = c6592jM2.g;
                AbstractC6122hy2.a(i55);
                return new C2090Qc0(c3130Yc0, c4620dd02, pc4, a, c6637jV, a2, aVar2, i55, C2680Uq0.a(c11156wf0.m), (C9123qj0) c11156wf0.A.get());
            case 6:
                a aVar3 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar3);
                InterfaceC3241Yy1 a3 = C2680Uq0.a(c11156wf0.o);
                CustomTabsConnection customTabsConnection2 = (CustomTabsConnection) c12185zf0.d.get();
                PC pc5 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc5);
                C6592jM c6592jM3 = c11156wf0.a;
                C6166i6 c6166i6 = c6592jM3.i;
                AbstractC6122hy2.a(c6166i6);
                C2468Sz3 c2468Sz32 = (C2468Sz3) c11156wf0.e.get();
                InterfaceC3241Yy1 a4 = C2680Uq0.a(c11156wf0.p);
                I5 i56 = c6592jM3.g;
                AbstractC6122hy2.a(i56);
                c12185zf0.a.getClass();
                Pj4 a5 = Pj4.a();
                AbstractC6122hy2.a(a5);
                C5313fe0 c5313fe0 = (C5313fe0) c11156wf0.q.get();
                C3933bd0 c3933bd0 = (C3933bd0) c11156wf0.s.get();
                InterfaceC3241Yy1 a6 = C2680Uq0.a(c11156wf0.t);
                Al4 al4 = (Al4) c11156wf0.u.get();
                C2095Qd0 c2095Qd0 = (C2095Qd0) c11156wf0.v.get();
                C4620dd0 c4620dd03 = (C4620dd0) c11156wf0.d.get();
                C11063wN2 c11063wN2 = new C11063wN2();
                InterfaceC3241Yy1 a7 = C2680Uq0.a(c11156wf0.x);
                InterfaceC3241Yy1 a8 = C2680Uq0.a(c12185zf0.r);
                InterfaceC0079Ap3 interfaceC0079Ap32 = c6592jM3.w;
                AbstractC6122hy2.a(interfaceC0079Ap32);
                C10285u6 c10285u6 = (C10285u6) c11156wf0.k.get();
                InterfaceC8533oz3 interfaceC8533oz3 = c6592jM3.z;
                AbstractC6122hy2.a(interfaceC8533oz3);
                return new C3130Yc0(aVar3, a3, customTabsConnection2, pc5, c6166i6, c2468Sz32, a4, i56, a5, c5313fe0, c3933bd0, a6, al4, c2095Qd0, c4620dd03, c11063wN2, a7, a8, interfaceC0079Ap32, c10285u6, interfaceC8533oz3);
            case 7:
                a aVar4 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar4);
                PC pc6 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc6);
                C8744pd0 c8744pd0 = (C8744pd0) c11156wf0.j.get();
                c12185zf0.b.getClass();
                C4502dG0 c4502dG0 = C4502dG0.b;
                AbstractC6122hy2.a(c4502dG0);
                c12185zf0.b.getClass();
                C7851n02 c7851n02 = C7851n02.i;
                AbstractC6122hy2.a(c7851n02);
                B84 c = c11156wf0.c();
                InterfaceC3241Yy1 a9 = C2680Uq0.a(c11156wf0.l);
                C6592jM c6592jM4 = c11156wf0.a;
                InterfaceC7968nM interfaceC7968nM = c6592jM4.u;
                AbstractC6122hy2.a(interfaceC7968nM);
                JC jc = c6592jM4.v;
                AbstractC6122hy2.a(jc);
                ZU0 zu0 = (ZU0) c11156wf0.m.get();
                InterfaceC10912vv3 interfaceC10912vv3 = c6592jM4.l;
                AbstractC6122hy2.a(interfaceC10912vv3);
                InterfaceC0079Ap3 interfaceC0079Ap33 = c6592jM4.c;
                AbstractC6122hy2.a(interfaceC0079Ap33);
                InterfaceC0079Ap3 interfaceC0079Ap34 = c6592jM4.k;
                AbstractC6122hy2.a(interfaceC0079Ap34);
                InterfaceC0079Ap3 interfaceC0079Ap35 = c6592jM4.t;
                AbstractC6122hy2.a(interfaceC0079Ap35);
                InterfaceC3241Yy1 a10 = C2680Uq0.a(c11156wf0.n);
                InterfaceC0079Ap3 interfaceC0079Ap36 = c6592jM4.y;
                AbstractC6122hy2.a(interfaceC0079Ap36);
                int i4 = c6592jM4.A;
                boolean O = pc6.O();
                boolean G = pc6.G();
                String str = (pc6.K() && (F = pc6.F()) != null) ? F.c : null;
                if (pc6.B() instanceof C5626gY3) {
                    i = 4;
                } else {
                    In4 F2 = pc6.F();
                    if (F2 != null) {
                        i2 = F2.g;
                    } else if (pc6.J()) {
                        i2 = 3;
                    } else {
                        i = 1;
                    }
                    i = i2;
                }
                return new C0146Bd0(aVar4, O, G, str, i, pc6.N(), c8744pd0, c4502dG0, c7851n02, c, a9, interfaceC7968nM, jc, zu0, interfaceC10912vv3, interfaceC0079Ap33, interfaceC0079Ap34, interfaceC0079Ap35, a10, interfaceC0079Ap36, i4);
            case 8:
                InterfaceC3241Yy1 a11 = C2680Uq0.a(c11156wf0.i);
                AbstractC6122hy2.a(c11156wf0.a.i);
                return new C8744pd0(a11);
            case 9:
                JC jc2 = c11156wf0.a.d;
                AbstractC6122hy2.a(jc2);
                return jc2;
            case 10:
                a aVar5 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar5);
                C10285u6 c10285u62 = (C10285u6) c11156wf0.k.get();
                C6592jM c6592jM5 = c11156wf0.a;
                View decorView = c6592jM5.a.getWindow().getDecorView();
                AbstractC6122hy2.a(decorView);
                C6166i6 c6166i62 = c6592jM5.i;
                AbstractC6122hy2.a(c6166i62);
                InterfaceC0079Ap3 interfaceC0079Ap37 = c6592jM5.m;
                AbstractC6122hy2.a(interfaceC0079Ap37);
                QB qb = (QB) c6592jM5.b.get();
                AbstractC6122hy2.a(qb);
                return new GC0(aVar5, c10285u62, decorView, c6166i62, interfaceC0079Ap37, qb, true ^ ((Boolean) c6592jM5.n.get()).booleanValue());
            case 11:
                C10285u6 c10285u63 = c11156wf0.a.j;
                AbstractC6122hy2.a(c10285u63);
                return c10285u63;
            case 12:
                ZU0 zu02 = c11156wf0.a.f;
                AbstractC6122hy2.a(zu02);
                return zu02;
            case 13:
                ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = (ViewOnClickListenerC1069If3) c11156wf0.a.h.get();
                AbstractC6122hy2.a(viewOnClickListenerC1069If3);
                return viewOnClickListenerC1069If3;
            case 14:
                CompositorViewHolder compositorViewHolder = (CompositorViewHolder) c11156wf0.a.k.get();
                AbstractC6122hy2.a(compositorViewHolder);
                return compositorViewHolder;
            case 15:
                a aVar6 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar6);
                InterfaceC0079Ap3 interfaceC0079Ap38 = c11156wf0.a.w;
                AbstractC6122hy2.a(interfaceC0079Ap38);
                return new C5313fe0(aVar6, interfaceC0079Ap38);
            case 16:
                a aVar7 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar7);
                C5313fe0 c5313fe02 = (C5313fe0) c11156wf0.q.get();
                C9360rQ c9360rQ = (C9360rQ) c11156wf0.r.get();
                InterfaceC3241Yy1 a12 = C2680Uq0.a(c11156wf0.k);
                InterfaceC3241Yy1 a13 = C2680Uq0.a(c11156wf0.o);
                PC pc7 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc7);
                InterfaceC3241Yy1 a14 = C2680Uq0.a(c12185zf0.r);
                C6592jM c6592jM6 = c11156wf0.a;
                InterfaceC10912vv3 interfaceC10912vv32 = c6592jM6.l;
                AbstractC6122hy2.a(interfaceC10912vv32);
                InterfaceC0079Ap3 interfaceC0079Ap39 = c6592jM6.c;
                AbstractC6122hy2.a(interfaceC0079Ap39);
                InterfaceC0079Ap3 interfaceC0079Ap310 = c6592jM6.k;
                AbstractC6122hy2.a(interfaceC0079Ap310);
                return new C3933bd0(aVar7, c5313fe02, c9360rQ, a12, a13, pc7, a14, interfaceC10912vv32, interfaceC0079Ap39, interfaceC0079Ap310);
            case 17:
                a aVar8 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar8);
                return new C9360rQ(aVar8);
            case 18:
                Context a15 = AbstractC9683sM.a(c12185zf0.a);
                PC pc8 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc8);
                return new C2875Wd0(a15, pc8, (CustomTabsConnection) c12185zf0.d.get());
            case 19:
                return new Al4();
            case 20:
                PC pc9 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc9);
                return new C2095Qd0(pc9, (CustomTabsConnection) c12185zf0.d.get());
            case 21:
                a aVar9 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar9);
                C1659Mu c1659Mu = c11156wf0.b;
                PC pc10 = c1659Mu.a;
                AbstractC6122hy2.a(pc10);
                C2090Qc0 c2090Qc0 = (C2090Qc0) c11156wf0.w.get();
                C6592jM c6592jM7 = c11156wf0.a;
                I5 i57 = c6592jM7.g;
                AbstractC6122hy2.a(i57);
                c1659Mu.getClass();
                C11187wk1 a16 = C11187wk1.a();
                AbstractC6122hy2.a(a16);
                C10285u6 c10285u64 = c6592jM7.j;
                AbstractC6122hy2.a(c10285u64);
                return new C1056Id0(aVar9, pc10, c2090Qc0, i57, a16, new C5688gj1(c10285u64));
            case 22:
                C3130Yc0 c3130Yc02 = (C3130Yc0) c11156wf0.y.get();
                C4620dd0 c4620dd04 = (C4620dd0) c11156wf0.d.get();
                PC pc11 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc11);
                return new C6637jV(c3130Yc02, c4620dd04, pc11);
            case 23:
                C9123qj0 c9123qj0 = c11156wf0.b.f;
                AbstractC6122hy2.a(c9123qj0);
                return c9123qj0;
            case 24:
                a aVar10 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar10);
                C6592jM c6592jM8 = c11156wf0.a;
                C10285u6 c10285u65 = c6592jM8.j;
                AbstractC6122hy2.a(c10285u65);
                C1659Mu c1659Mu2 = c11156wf0.b;
                PC pc12 = c1659Mu2.a;
                AbstractC6122hy2.a(pc12);
                FC fc = c6592jM8.e;
                AbstractC6122hy2.a(fc);
                InterfaceC7697ma2 interfaceC7697ma2 = c6592jM8.x;
                AbstractC6122hy2.a(interfaceC7697ma2);
                C2485Td0 c2485Td0 = c1659Mu2.c;
                AbstractC6122hy2.a(c2485Td0);
                c12185zf0.a.getClass();
                C0624Eu3 a17 = C0624Eu3.a();
                AbstractC6122hy2.a(a17);
                return new C8057nd0(aVar10, c10285u65, pc12, fc, interfaceC7697ma2, c2485Td0, a17, (C4620dd0) c11156wf0.d.get(), (C10458ud0) c11156wf0.B.get());
            case 25:
                I5 i58 = c11156wf0.a.g;
                AbstractC6122hy2.a(i58);
                C6592jM c6592jM9 = c11156wf0.a;
                a aVar11 = c6592jM9.a;
                AbstractC6122hy2.a(aVar11);
                InterfaceC3241Yy1 a18 = C2680Uq0.a(c11156wf0.p);
                InterfaceC7697ma2 interfaceC7697ma22 = c6592jM9.q;
                AbstractC6122hy2.a(interfaceC7697ma22);
                F20 f20 = c6592jM9.s;
                AbstractC6122hy2.a(f20);
                QS3 qs3 = c11156wf0.b.e;
                AbstractC6122hy2.a(qs3);
                return new C10458ud0(i58, aVar11, a18, interfaceC7697ma22, f20, qs3);
            case 26:
                a aVar12 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar12);
                return new C0536Ed0(aVar12, (C2468Sz3) c11156wf0.e.get());
            case 27:
                C4620dd0 c4620dd05 = (C4620dd0) c11156wf0.d.get();
                C1659Mu c1659Mu3 = c11156wf0.b;
                PC pc13 = c1659Mu3.a;
                AbstractC6122hy2.a(pc13);
                InterfaceC3241Yy1 a19 = C2680Uq0.a(c11156wf0.E);
                InterfaceC3241Yy1 a20 = C2680Uq0.a(c11156wf0.H);
                int i6 = c1659Mu3.b;
                InterfaceC1835Od0 interfaceC1835Od0 = (i6 == 2 || i6 == 4) ? (InterfaceC1835Od0) a20.get() : (InterfaceC1835Od0) a19.get();
                AbstractC6122hy2.a(interfaceC1835Od0);
                C12274zu c12274zu = c1659Mu3.d;
                AbstractC6122hy2.a(c12274zu);
                a aVar13 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar13);
                return new C1705Nd0(c4620dd05, pc13, interfaceC1835Od0, c12274zu, aVar13);
            case 28:
                return new C11180wj0((C4620dd0) c11156wf0.d.get(), (C2090Qc0) c11156wf0.w.get(), (C2095Qd0) c11156wf0.v.get(), C2680Uq0.a(c11156wf0.t));
            case 29:
                return new ZY3((C11180wj0) c11156wf0.E.get(), (C3913bZ3) c11156wf0.G.get());
            case 30:
                return new C3913bZ3((C4620dd0) c11156wf0.d.get(), (C2090Qc0) c11156wf0.w.get(), (C8790pk4) c11156wf0.F.get(), c11156wf0.c(), (C10776vY3) c12185zf0.f.get());
            case 31:
                c11156wf0.b.getClass();
                return new C8790pk4();
            case 32:
                PC pc14 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc14);
                C4620dd0 c4620dd06 = (C4620dd0) c11156wf0.d.get();
                InterfaceC3241Yy1 a21 = C2680Uq0.a(c11156wf0.L);
                InterfaceC3241Yy1 a22 = C2680Uq0.a(c11156wf0.C);
                C1705Nd0 c1705Nd0 = (C1705Nd0) c11156wf0.I.get();
                CustomTabsConnection customTabsConnection3 = (CustomTabsConnection) c12185zf0.d.get();
                C6592jM c6592jM10 = c11156wf0.a;
                a aVar14 = c6592jM10.a;
                AbstractC6122hy2.a(aVar14);
                I5 i59 = c6592jM10.g;
                AbstractC6122hy2.a(i59);
                return new C3265Zd0(pc14, c4620dd06, a21, a22, c1705Nd0, customTabsConnection3, aVar14, i59, (H43) c12185zf0.q.get());
            case 33:
                PC pc15 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc15);
                C4620dd0 c4620dd07 = (C4620dd0) c11156wf0.d.get();
                CustomTabsConnection customTabsConnection4 = (CustomTabsConnection) c12185zf0.d.get();
                a aVar15 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar15);
                Context a23 = AbstractC9683sM.a(c12185zf0.a);
                return new C0801Ge0(pc15, c4620dd07, customTabsConnection4, aVar15, a23, C2680Uq0.a(c11156wf0.i), (C2090Qc0) c11156wf0.w.get(), (C6981kV) c11156wf0.f11548J.get(), (C8744pd0) c11156wf0.j.get(), (C10458ud0) c11156wf0.B.get(), (C0281Ce0) c11156wf0.K.get());
            case 34:
                PC pc16 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc16);
                return new C6981kV(pc16);
            case 35:
                PC pc17 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc17);
                a aVar16 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar16);
                C4620dd0 c4620dd08 = (C4620dd0) c11156wf0.d.get();
                C2468Sz3 c2468Sz33 = (C2468Sz3) c11156wf0.e.get();
                QS3 qs32 = c11156wf0.b.e;
                AbstractC6122hy2.a(qs32);
                return new C0281Ce0(pc17, aVar16, c4620dd08, c2468Sz33, qs32);
            case 36:
                PC pc18 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc18);
                C2913Wk3 c2913Wk3 = c11156wf0.a.o;
                AbstractC6122hy2.a(c2913Wk3);
                return new C3595ae0(pc18, c2913Wk3);
            case 37:
                a aVar17 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar17);
                C4620dd0 c4620dd09 = (C4620dd0) c11156wf0.d.get();
                C2468Sz3 c2468Sz34 = (C2468Sz3) c11156wf0.e.get();
                C1659Mu c1659Mu4 = c11156wf0.b;
                PC pc19 = c1659Mu4.a;
                AbstractC6122hy2.a(pc19);
                I5 i510 = c11156wf0.a.g;
                AbstractC6122hy2.a(i510);
                QS3 qs33 = c1659Mu4.e;
                AbstractC6122hy2.a(qs33);
                return new C6687je0(aVar17, c4620dd09, c2468Sz34, pc19, i510, qs33);
            case 38:
                a aVar18 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar18);
                PC pc20 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc20);
                return new XY3(aVar18, pc20, (CustomTabsConnection) c12185zf0.d.get());
            case 39:
                PC pc21 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc21);
                return new C3985bl4(pc21);
            case 40:
                PC pc22 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc22);
                return new C7202l7(pc22);
            case 41:
                I5 i511 = c11156wf0.a.g;
                AbstractC6122hy2.a(i511);
                PC pc23 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc23);
                C1582Me2 c1582Me2 = (C1582Me2) c11156wf0.S.get();
                C4620dd0 c4620dd010 = (C4620dd0) c11156wf0.d.get();
                FU fu = (FU) c11156wf0.T.get();
                c12185zf0.b.getClass();
                C4502dG0 c4502dG02 = C4502dG0.b;
                AbstractC6122hy2.a(c4502dG02);
                return new C4943eZ3(i511, pc23, c1582Me2, c4620dd010, fu, c4502dG02);
            case 42:
                return AbstractC1919Ou.a(c11156wf0.b);
            case 43:
                I5 i512 = c11156wf0.a.g;
                AbstractC6122hy2.a(i512);
                PC pc24 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc24);
                CustomTabsConnection customTabsConnection5 = (CustomTabsConnection) c12185zf0.d.get();
                InterfaceC0079Ap3 interfaceC0079Ap311 = c11156wf0.a.w;
                AbstractC6122hy2.a(interfaceC0079Ap311);
                return new FU(i512, pc24, customTabsConnection5, interfaceC0079Ap311);
            case 44:
                return new CA0();
            case 45:
                C6592jM c6592jM11 = c11156wf0.a;
                a aVar19 = c6592jM11.a;
                AbstractC6122hy2.a(aVar19);
                PC pc25 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc25);
                C6166i6 c6166i63 = c6592jM11.i;
                AbstractC6122hy2.a(c6166i63);
                C9766sc0 c9766sc0 = (C9766sc0) c11156wf0.f.get();
                C11156wf0.a(c11156wf0);
                Dn4 dn4 = (Dn4) c11156wf0.b0.get();
                Object obj = c11156wf0.c0.get();
                I5 i513 = c6592jM11.g;
                AbstractC6122hy2.a(i513);
                return AbstractC10522un4.a(aVar19, pc25, c6166i63, c9766sc0, dn4, obj, i513);
            case 46:
                C9766sc0 c9766sc02 = (C9766sc0) c11156wf0.f.get();
                B84 c2 = c11156wf0.c();
                C2090Qc0 c2090Qc02 = (C2090Qc0) c11156wf0.w.get();
                PC pc26 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc26);
                C0281Ce0 c0281Ce0 = (C0281Ce0) c11156wf0.K.get();
                C3595ae0 c3595ae0 = (C3595ae0) c11156wf0.N.get();
                I5 i514 = c11156wf0.a.g;
                AbstractC6122hy2.a(i514);
                return new C8587p83(c9766sc02, c2, c2090Qc02, pc26, c0281Ce0, c3595ae0, i514, (HX3) c11156wf0.W.get(), C2680Uq0.a(c11156wf0.X), (C3135Yd0) c11156wf0.Y.get());
            case 47:
                C2468Sz3 c2468Sz35 = (C2468Sz3) c11156wf0.e.get();
                C4620dd0 c4620dd011 = (C4620dd0) c11156wf0.d.get();
                C0801Ge0 c0801Ge0 = (C0801Ge0) c11156wf0.L.get();
                C6981kV c6981kV = (C6981kV) c11156wf0.f11548J.get();
                PC pc27 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc27);
                return new HX3(c2468Sz35, c4620dd011, c0801Ge0, c6981kV, pc27);
            case 48:
                I5 i515 = c11156wf0.a.g;
                AbstractC6122hy2.a(i515);
                C6592jM c6592jM12 = c11156wf0.a;
                a aVar20 = c6592jM12.a;
                AbstractC6122hy2.a(aVar20);
                C10285u6 c10285u66 = c6592jM12.j;
                AbstractC6122hy2.a(c10285u66);
                return new C10832vi1(i515, aVar20, c10285u66);
            case 49:
                C10285u6 c10285u67 = (C10285u6) c11156wf0.k.get();
                PC pc28 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc28);
                return new C3135Yd0(c10285u67, pc28);
            case 50:
                a aVar21 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar21);
                I5 i516 = c11156wf0.a.g;
                AbstractC6122hy2.a(i516);
                return new C5334fh3(aVar21, i516, (C2468Sz3) c11156wf0.e.get(), (C3135Yd0) c11156wf0.Y.get(), (XY3) c11156wf0.P.get(), (C4620dd0) c11156wf0.d.get(), C2680Uq0.a(c11156wf0.p));
            case 51:
                a aVar22 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar22);
                PC pc29 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc29);
                return new Dn4(aVar22, pc29);
            case 52:
                C4620dd0 c4620dd012 = (C4620dd0) c11156wf0.d.get();
                PC pc30 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc30);
                I5 i517 = c11156wf0.a.g;
                AbstractC6122hy2.a(i517);
                return new C9151qn4(c4620dd012, pc30, i517);
            case 53:
                Dn4 dn42 = (Dn4) c11156wf0.b0.get();
                I5 i518 = c11156wf0.a.g;
                AbstractC6122hy2.a(i518);
                PC pc31 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc31);
                InterfaceC3241Yy1 a24 = C2680Uq0.a(c11156wf0.j0);
                C12185zf0 c12185zf02 = c11156wf0.c;
                AbstractC9683sM.a(c12185zf02.a);
                return new Sj4(dn42, i518, pc31, a24, new C11891yn1((C2037Pr2) c12185zf02.n.get(), C2680Uq0.a(c11156wf0.k0)));
            case 54:
                PC pc32 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc32);
                Dn4 dn43 = (Dn4) c11156wf0.b0.get();
                C6314iY3 c6314iY3 = (C6314iY3) c11156wf0.e0.get();
                I5 i519 = c11156wf0.a.g;
                AbstractC6122hy2.a(i519);
                return new Hn4(pc32, dn43, c6314iY3, i519, (C9766sc0) c11156wf0.f.get());
            case 55:
                return new C6314iY3();
            case 56:
                Resources resources = c11156wf0.a.a.getResources();
                AbstractC6122hy2.a(resources);
                InterfaceC3241Yy1 a25 = C2680Uq0.a(c11156wf0.n);
                C6314iY3 c6314iY32 = (C6314iY3) c11156wf0.e0.get();
                I5 i520 = c11156wf0.a.g;
                AbstractC6122hy2.a(i520);
                return new C1760No0(resources, a25, c6314iY32, i520);
            case 57:
                a aVar23 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar23);
                PC pc33 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc33);
                C5334fh3 c5334fh3 = (C5334fh3) c11156wf0.a0.get();
                C6592jM c6592jM13 = c11156wf0.a;
                I5 i521 = c6592jM13.g;
                AbstractC6122hy2.a(i521);
                Dn4 dn44 = (Dn4) c11156wf0.b0.get();
                InterfaceC3241Yy1 a26 = C2680Uq0.a(c11156wf0.h0);
                InterfaceC0079Ap3 interfaceC0079Ap312 = c6592jM13.w;
                AbstractC6122hy2.a(interfaceC0079Ap312);
                return new Uj4(aVar23, pc33, c5334fh3, i521, dn44, a26, interfaceC0079Ap312);
            case 58:
                return AbstractC6936kM.a(c11156wf0.a);
            case 59:
                C6166i6 c6166i64 = c11156wf0.a.i;
                AbstractC6122hy2.a(c6166i64);
                I5 i522 = c11156wf0.a.g;
                AbstractC6122hy2.a(i522);
                return new Wk4(c6166i64, i522);
            case 60:
                return new C9490rn1(AbstractC9683sM.a(c12185zf0.a), AbstractC1789Nu.a(c11156wf0.b));
            case 61:
                C8587p83 c8587p83 = (C8587p83) c11156wf0.Z.get();
                C11156wf0.b(c11156wf0);
                C9766sc0 c9766sc03 = (C9766sc0) c11156wf0.f.get();
                InterfaceC3241Yy1 a27 = C2680Uq0.a(c11156wf0.r0);
                PC pc34 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc34);
                C10776vY3 c10776vY3 = (C10776vY3) c12185zf0.f.get();
                I5 i523 = c11156wf0.a.g;
                AbstractC6122hy2.a(i523);
                C12185zf0 c12185zf03 = c11156wf0.c;
                AbstractC9683sM.a(c12185zf03.a);
                C11891yn1 c11891yn1 = new C11891yn1((C2037Pr2) c12185zf03.n.get(), C2680Uq0.a(c11156wf0.k0));
                FU fu2 = (FU) c11156wf0.T.get();
                CustomTabsConnection customTabsConnection6 = (CustomTabsConnection) c12185zf0.d.get();
                return new C4595dY3(c8587p83, c9766sc03, a27, pc34, c10776vY3, i523, c11891yn1, fu2, customTabsConnection6);
            case 62:
                return new QC((Q83) c12185zf0.e.get());
            case 63:
                InterfaceC3241Yy1 a28 = C2680Uq0.a(c11156wf0.g0);
                InterfaceC3241Yy1 a29 = C2680Uq0.a(c11156wf0.n0);
                InterfaceC3241Yy1 a30 = C2680Uq0.a(c11156wf0.o0);
                PC pc35 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc35);
                C6592jM c6592jM14 = c11156wf0.a;
                InterfaceC7205l72 interfaceC7205l72 = (InterfaceC7205l72) c6592jM14.p.get();
                AbstractC6122hy2.a(interfaceC7205l72);
                I5 i524 = c6592jM14.g;
                AbstractC6122hy2.a(i524);
                return new C2280Ro0(a28, a29, a30, pc35, interfaceC7205l72, i524);
            case 64:
                Resources resources2 = c11156wf0.a.a.getResources();
                AbstractC6122hy2.a(resources2);
                InterfaceC3241Yy1 a31 = C2680Uq0.a(c11156wf0.n);
                C6314iY3 c6314iY33 = (C6314iY3) c11156wf0.e0.get();
                I5 i525 = c11156wf0.a.g;
                AbstractC6122hy2.a(i525);
                return new C2150Qo0(resources2, a31, c6314iY33, i525);
            case 65:
                Context a32 = AbstractC9683sM.a(c12185zf0.a);
                Resources resources3 = c11156wf0.a.a.getResources();
                AbstractC6122hy2.a(resources3);
                C6592jM c6592jM15 = c11156wf0.a;
                InterfaceC7205l72 interfaceC7205l722 = (InterfaceC7205l72) c6592jM15.p.get();
                AbstractC6122hy2.a(interfaceC7205l722);
                C6314iY3 c6314iY34 = (C6314iY3) c11156wf0.e0.get();
                I5 i526 = c6592jM15.g;
                AbstractC6122hy2.a(i526);
                return AbstractC2020Po0.a(a32, resources3, interfaceC7205l722, c6314iY34, i526);
            case 66:
                I5 i527 = c11156wf0.a.g;
                AbstractC6122hy2.a(i527);
                C9766sc0 c9766sc04 = (C9766sc0) c11156wf0.f.get();
                C10776vY3 c10776vY32 = (C10776vY3) c12185zf0.f.get();
                C6166i6 c6166i65 = c11156wf0.a.i;
                AbstractC6122hy2.a(c6166i65);
                return new C7000kY3(i527, c9766sc04, c10776vY32, c6166i65);
            case 67:
                C5334fh3 c5334fh32 = (C5334fh3) c11156wf0.a0.get();
                a aVar24 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar24);
                C6022hh3 c6022hh3 = (C6022hh3) c12185zf0.o.get();
                PC pc36 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc36);
                return new C4256cZ3(c5334fh32, aVar24, c6022hh3, pc36);
            case 68:
                a aVar25 = c11156wf0.a.a;
                AbstractC6122hy2.a(aVar25);
                AbstractC7280lM.a(c11156wf0.a);
                C2468Sz3 c2468Sz36 = (C2468Sz3) c11156wf0.e.get();
                PC pc37 = c11156wf0.b.a;
                AbstractC6122hy2.a(pc37);
                return new C6909kG2(aVar25, c2468Sz36, pc37, (CustomTabsConnection) c12185zf0.d.get(), c11156wf0.c(), (FU) c11156wf0.T.get(), (C10776vY3) c12185zf0.f.get());
            default:
                throw new AssertionError(i3);
        }
    }
}
