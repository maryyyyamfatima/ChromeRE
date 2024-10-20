package defpackage;

import J.N;
import android.util.SparseArray;
import android.view.View;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge;
import org.chromium.chrome.browser.keyboard_accessory.bar_component.e;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CL1 extends BA0 implements InterfaceC0882Gu1, View.OnLayoutChangeListener, InterfaceC7458ls {
    public final SparseArray a = new SparseArray();
    public final PropertyModel g;
    public WindowAndroid h;
    public InterfaceC0079Ap3 i;
    public final C8385oa2 j;
    public final KL1 k;
    public final HashSet l;
    public e m;
    public X1 n;
    public ChromeActivity o;
    public BL1 p;
    public C0231Bu0 q;
    public QB r;
    public InterfaceC8309oL1 s;
    public DialogInterfaceOnClickListenerC11983z30 t;
    public C9861ss u;
    public final C8385oa2 v;
    public final C11738yL1 w;
    public final C12081zL1 x;
    public final AL1 y;

    public CL1() {
        LD2 ld2 = EL1.a;
        ND2 nd2 = EL1.c;
        LD2 ld22 = EL1.b;
        LD2 ld23 = EL1.d;
        HashMap e = PropertyModel.e(new FD2[]{ld2, nd2, ld22, ld23});
        AD2 ad2 = new AD2();
        ad2.a = false;
        e.put(ld2, ad2);
        DD2 dd2 = new DD2();
        dd2.a = 4;
        e.put(nd2, dd2);
        AD2 ad22 = new AD2();
        ad22.a = true;
        e.put(ld22, ad22);
        AD2 ad23 = new AD2();
        ad23.a = false;
        e.put(ld23, ad23);
        this.g = new PropertyModel(e);
        C8385oa2 c8385oa2 = new C8385oa2();
        this.j = c8385oa2;
        this.k = new KL1();
        this.l = new HashSet();
        this.v = new C8385oa2();
        this.w = new C11738yL1(this);
        this.x = new C12081zL1(this);
        this.y = new AL1(this);
        c8385oa2.p(0);
    }

    public final boolean a1() {
        return this.h != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // android.view.View.OnLayoutChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayoutChange(android.view.View r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CL1.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        if (f1()) {
            d1();
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.v;
    }

    public final void d1() {
        if (a1()) {
            DialogC5834h8 dialogC5834h8 = this.t.g;
            if (dialogC5834h8 != null) {
                dialogC5834h8.dismiss();
            }
            this.m.a();
            this.g.m(EL1.c, 4);
        }
    }

    public final boolean X0() {
        WebContents p1;
        ChromeActivity chromeActivity = this.o;
        if (chromeActivity == null || (p1 = chromeActivity.p1()) == null) {
            return false;
        }
        return (((float) ((Integer) this.j.g).intValue()) / this.h.i.d) + ((float) p1.getHeight()) >= 128.0f && p1.getWidth() >= 180;
    }

    public final void g1(int i) {
        if (!((i & 8) != 0)) {
            if (i == 1) {
                Y0();
            }
        } else {
            Q50 W0 = W0();
            if (W0 != null) {
                ((C4884eO) this.s).i(W0);
            }
        }
    }

    public final void Y0() {
        View rootView;
        Q50 W0 = W0();
        if (W0 == null || (rootView = W0.getRootView()) == null) {
            return;
        }
        X1 x1 = this.n;
        C1751Nm1 c1751Nm1 = (C1751Nm1) this.i.get();
        x1.a.a.m(AbstractC3736b2.d, Math.max(c1751Nm1 != null ? c1751Nm1.a.bottom : ((C4884eO) this.s).b(rootView), this.o.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a2) * 3));
        ((C4884eO) this.s).getClass();
        C11939yv1.c(rootView);
    }

    public final void c1() {
        boolean Z0 = Z0(3);
        ND2 nd2 = EL1.c;
        PropertyModel propertyModel = this.g;
        if (Z0 || Z0(1)) {
            propertyModel.m(nd2, 11);
        } else if (Z0(11)) {
            propertyModel.m(nd2, 13);
        }
    }

    public final void V0(int i) {
        if (i == 1) {
            return;
        }
        int i2 = 0;
        int dimensionPixelSize = (i & 1) != 0 ? this.o.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a2) : 0;
        if ((i & 2) != 0) {
            X1 x1 = this.n;
            ND2 nd2 = AbstractC3736b2.d;
            dimensionPixelSize += x1.a.a.h(nd2);
            i2 = 0 + this.n.a.a.h(nd2);
        }
        this.m.a.a.m(AbstractC6104hv1.d, i2);
        this.j.p(Integer.valueOf(dimensionPixelSize));
    }

    public final Q50 W0() {
        Tab tab;
        ChromeActivity chromeActivity = this.o;
        if (chromeActivity == null || (tab = (Tab) chromeActivity.A0.g) == null) {
            return null;
        }
        return tab.y();
    }

    public final boolean b1(View view) {
        return view != null && ((C4884eO) this.s).e(view);
    }

    public final void e1() {
        SparseArray sparseArray;
        C10023tL1 c10023tL1;
        if (a1()) {
            JL1 a = this.k.a(this.o.p1());
            C12044zE c12044zE = a.e;
            if (c12044zE != null) {
                c12044zE.c(c12044zE.i);
            }
            int[] iArr = JL1.h;
            int i = 0;
            while (true) {
                sparseArray = a.c;
                if (i >= 3) {
                    break;
                }
                int i2 = iArr[i];
                if (sparseArray.get(i2, null) != null) {
                    XD2 xd2 = a.a(i2).a;
                    if (xd2 instanceof C12044zE) {
                        C12044zE c12044zE2 = (C12044zE) xd2;
                        c12044zE2.c(c12044zE2.i);
                    }
                }
                i++;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                if (((C1661Mu1) sparseArray.get(i4, null)) != null) {
                    arrayList.add((C1661Mu1) sparseArray.get(i4));
                }
            }
            C1661Mu1[] c1661Mu1Arr = (C1661Mu1[]) arrayList.toArray(new C1661Mu1[0]);
            X1 x1 = this.n;
            JD2 jd2 = AbstractC3736b2.a;
            PropertyModel propertyModel = x1.a.a;
            C5175fD1 c5175fD1 = (C5175fD1) propertyModel.i(jd2);
            c5175fD1.getClass();
            c5175fD1.A(Arrays.asList(c1661Mu1Arr));
            propertyModel.m(AbstractC3736b2.b, ((C5175fD1) propertyModel.i(jd2)).size() - 1);
            C5175fD1 c5175fD12 = (C5175fD1) this.m.b.b.a.i(AbstractC8166nv1.a);
            c5175fD12.getClass();
            c5175fD12.A(Arrays.asList(c1661Mu1Arr));
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr[i5];
                if (sparseArray.get(i6, null) != null && (c10023tL1 = a.d) != null) {
                    ManualFillingComponentBridge manualFillingComponentBridge = c10023tL1.a;
                    long j = manualFillingComponentBridge.e;
                    if (j != 0) {
                        N.M9$J39PI(j, manualFillingComponentBridge, i6);
                    }
                }
            }
        }
    }

    public final boolean f1() {
        return a1() && (Z0(1) || Z0(3) || Z0(11));
    }

    public final boolean Z0(int i) {
        return this.g.h(EL1.c) == i;
    }
}
