package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.ViewGroup;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F12 {
    public final float a;
    public final ViewGroup b;
    public final Handler c = new Handler();
    public GestureDetector d;
    public final D12 e;
    public final C7932nE3 f;
    public Tab g;
    public int h;
    public final PropertyModel i;
    public float j;

    public F12(PropertyModel propertyModel, ViewGroupOnHierarchyChangeListenerC6528j91 viewGroupOnHierarchyChangeListenerC6528j91, C7932nE3 c7932nE3) {
        this.i = propertyModel;
        this.b = viewGroupOnHierarchyChangeListenerC6528j91;
        Context context = viewGroupOnHierarchyChangeListenerC6528j91.getContext();
        this.f = c7932nE3;
        this.h = 0;
        this.a = viewGroupOnHierarchyChangeListenerC6528j91.getResources().getDisplayMetrics().density * 24.0f;
        this.d = new GestureDetector(context, new E12(this));
        D12 d12 = new D12(this);
        this.e = d12;
        viewGroupOnHierarchyChangeListenerC6528j91.addOnAttachStateChangeListener(d12);
    }

    public final boolean a() {
        Tab tab = this.g;
        if (tab != null && !tab.isDestroyed()) {
            return true;
        }
        InterfaceC0408Dd2 interfaceC0408Dd2 = this.f.a.V;
        return interfaceC0408Dd2.get() != null && ((C10154tj3) ((InterfaceC7408lj3) interfaceC0408Dd2.get())).c.w == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(float r9, float r10, boolean r11) {
        /*
            r8 = this;
            boolean r0 = r8.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            LD2 r0 = defpackage.AbstractC10087tY0.b
            org.chromium.ui.modelutil.PropertyModel r2 = r8.i
            r2.k(r0, r11)
            r0 = 1
            if (r11 == 0) goto L1f
            org.chromium.chrome.browser.tab.Tab r3 = r8.g
            if (r3 == 0) goto L1d
            boolean r3 = r3.j()
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r3 = r1
            goto L20
        L1f:
            r3 = r0
        L20:
            ND2 r4 = defpackage.AbstractC10087tY0.a
            r5 = 2
            if (r3 == 0) goto L9a
            int r9 = r8.h
            if (r9 == r0) goto L2d
            r9 = 5
            r2.m(r4, r9)
        L2d:
            ND2 r9 = defpackage.AbstractC10087tY0.f
            if (r11 == 0) goto L33
            goto L91
        L33:
            org.chromium.chrome.browser.tab.Tab r10 = r8.g
            nE3 r11 = r8.f
            uE3 r11 = r11.a
            Dd2 r6 = r11.V
            java.lang.Object r7 = r6.get()
            if (r7 == 0) goto L51
            java.lang.Object r6 = r6.get()
            lj3 r6 = (defpackage.InterfaceC7408lj3) r6
            tj3 r6 = (defpackage.C10154tj3) r6
            Fj3 r6 = r6.c
            int r6 = r6.w
            if (r6 != r0) goto L51
            r6 = r0
            goto L52
        L51:
            r6 = r1
        L52:
            if (r6 == 0) goto L55
            goto L87
        L55:
            boolean r6 = r10.h()
            if (r6 != 0) goto L89
            Pj3 r6 = defpackage.C1998Pj3.a(r10)
            if (r6 != 0) goto L63
            r6 = r1
            goto L65
        L63:
            boolean r6 = r6.g
        L65:
            if (r6 != 0) goto L89
            int r6 = r10.getLaunchType()
            r7 = 12
            if (r6 != r7) goto L70
            goto L89
        L70:
            boolean r6 = defpackage.C1663Mu3.g(r10)
            if (r6 == 0) goto L77
            goto L87
        L77:
            BV0 r11 = r11.b1
            java.lang.Object r10 = r11.apply(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L87
            r10 = r0
            goto L8a
        L87:
            r10 = r5
            goto L8a
        L89:
            r10 = r1
        L8a:
            if (r10 != r0) goto L8e
            r1 = r0
            goto L91
        L8e:
            if (r10 != r5) goto L91
            r1 = r5
        L91:
            r2.m(r9, r1)
            r2.m(r4, r0)
            r8.h = r5
            goto Lb4
        L9a:
            int r11 = r8.h
            if (r11 == r0) goto La2
            r11 = 6
            r2.m(r4, r11)
        La2:
            PD2 r11 = defpackage.AbstractC10087tY0.g
            android.gesture.GesturePoint r0 = new android.gesture.GesturePoint
            r6 = 0
            r0.<init>(r9, r10, r6)
            r2.o(r11, r0)
            r2.m(r4, r5)
            r9 = 3
            r8.h = r9
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F12.c(float, float, boolean):boolean");
    }

    public final void b(boolean z) {
        LD2 ld2 = AbstractC10087tY0.c;
        PropertyModel propertyModel = this.i;
        propertyModel.k(ld2, z);
        int i = this.h;
        ND2 nd2 = AbstractC10087tY0.a;
        if (i == 2) {
            propertyModel.m(nd2, 3);
        } else if (i == 3) {
            propertyModel.m(nd2, 4);
        }
        this.j = 0.0f;
    }
}
