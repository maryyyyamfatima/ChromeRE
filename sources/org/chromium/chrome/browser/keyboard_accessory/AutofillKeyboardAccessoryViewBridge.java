package org.chromium.chrome.browser.keyboard_accessory;

import J.N;
import com.android.chrome.R;
import defpackage.C10709vL1;
import defpackage.C11052wL1;
import defpackage.C1120Iq;
import defpackage.C2961Wu1;
import defpackage.C8385oa2;
import defpackage.CL1;
import defpackage.InterfaceC10535uq;
import defpackage.InterfaceC7697ma2;
import defpackage.InterfaceC9646sE2;
import defpackage.K14;
import defpackage.XD2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.keyboard_accessory.AutofillKeyboardAccessoryViewBridge;
import org.chromium.chrome.browser.keyboard_accessory.bar_component.e;
import org.chromium.components.autofill.AutofillSuggestion;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillKeyboardAccessoryViewBridge implements InterfaceC10535uq {
    public long a;
    public InterfaceC7697ma2 g;
    public C11052wL1 h;
    public final XD2 i = new XD2(2);
    public final C1120Iq j = new Callback() { // from class: Iq
        @Override // org.chromium.base.Callback
        public final void onResult(Object obj) {
            AutofillKeyboardAccessoryViewBridge.this.e((C11052wL1) obj);
        }

        @Override // org.chromium.base.Callback
        public final ZE e0(Object obj) {
            return new ZE(this, obj);
        }
    };

    @Override // defpackage.InterfaceC10535uq
    public final void c() {
    }

    public static AutofillKeyboardAccessoryViewBridge create() {
        return new AutofillKeyboardAccessoryViewBridge();
    }

    @Override // defpackage.InterfaceC10535uq
    public final void d() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.M$YFyQSp(j, this);
    }

    @Override // defpackage.InterfaceC10535uq
    public final void b(int i) {
        CL1 cl1 = this.h.a;
        if (cl1.a1()) {
            cl1.d1();
            cl1.Y0();
        }
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MjgUnUA$(j, this, i);
    }

    @Override // defpackage.InterfaceC10535uq
    public final void a(int i) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.Mg8PCuPV(j, this, i);
    }

    public final void init(long j, WindowAndroid windowAndroid) {
        K14 k14 = C10709vL1.k;
        InterfaceC7697ma2 interfaceC7697ma2 = (InterfaceC7697ma2) C10709vL1.k.e(windowAndroid.t);
        this.g = interfaceC7697ma2;
        if (interfaceC7697ma2 != null) {
            e((C11052wL1) ((C8385oa2) interfaceC7697ma2).m(this.j));
        }
        this.a = j;
    }

    public final void resetNativeViewPointer() {
        this.a = 0L;
    }

    public final void dismiss() {
        if (this.g != null) {
            this.i.c(new AutofillSuggestion[0]);
            ((C8385oa2) this.g).n(this.j);
        }
        d();
    }

    public final void show(AutofillSuggestion[] autofillSuggestionArr, boolean z) {
        this.i.c(autofillSuggestionArr);
    }

    public final void confirmDeletion(String str, String str2) {
        C11052wL1 c11052wL1 = this.h;
        c11052wL1.a.t.a(str, str2, R.string.0_resource_name_obfuscated_res_0x7f140717, new Runnable() { // from class: Hq
            @Override // java.lang.Runnable
            public final void run() {
                AutofillKeyboardAccessoryViewBridge autofillKeyboardAccessoryViewBridge = AutofillKeyboardAccessoryViewBridge.this;
                long j = autofillKeyboardAccessoryViewBridge.a;
                if (j == 0) {
                    return;
                }
                N.MRSuTxnn(j, autofillKeyboardAccessoryViewBridge);
            }
        });
    }

    public static AutofillSuggestion[] createAutofillSuggestionArray(int i) {
        return new AutofillSuggestion[i];
    }

    public final void e(C11052wL1 c11052wL1) {
        e eVar;
        if (this.h == c11052wL1) {
            return;
        }
        this.h = c11052wL1;
        if (c11052wL1 == null) {
            return;
        }
        XD2 xd2 = this.i;
        CL1 cl1 = c11052wL1.a;
        if (cl1.a1() && (eVar = cl1.m) != null) {
            final C2961Wu1 c2961Wu1 = eVar.a;
            c2961Wu1.getClass();
            xd2.b(new InterfaceC9646sE2() { // from class: Tu1
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException
                    */
                @Override // defpackage.InterfaceC9646sE2
                public final void a(int r12, java.lang.Object r13) {
                    /*
                        r11 = this;
                        org.chromium.components.autofill.AutofillSuggestion[] r13 = (org.chromium.components.autofill.AutofillSuggestion[]) r13
                        Wu1 r12 = defpackage.C2961Wu1.this
                        r0 = 2
                        java.util.ArrayList r1 = r12.c(r0)
                        java.util.ArrayList r2 = new java.util.ArrayList
                        int r3 = r13.length
                        r2.<init>(r3)
                        r3 = 0
                        r4 = r3
                    L11:
                        int r5 = r13.length
                        if (r4 >= r5) goto L4e
                        r5 = r13[r4]
                        int r6 = r5.f
                        r7 = -9
                        if (r6 == r7) goto L2d
                        r7 = -1
                        if (r6 == r7) goto L2d
                        r7 = -5
                        if (r6 == r7) goto L2d
                        r7 = -4
                        if (r6 == r7) goto L2d
                        r7 = -3
                        if (r6 == r7) goto L2d
                        switch(r6) {
                            case -15: goto L2d;
                            case -14: goto L2d;
                            case -13: goto L2d;
                            default: goto L2b;
                        }
                    L2b:
                        r6 = 1
                        goto L2e
                    L2d:
                        r6 = r3
                    L2e:
                        if (r6 != 0) goto L31
                        goto L4b
                    L31:
                        ev1 r6 = new ev1
                        Iu1 r7 = new Iu1
                        Uu1 r8 = new Uu1
                        uq r9 = r2
                        r8.<init>()
                        Vu1 r10 = new Vu1
                        r10.<init>()
                        r9 = 0
                        r7.<init>(r0, r9, r8, r10)
                        r6.<init>(r5, r7)
                        r2.add(r6)
                    L4b:
                        int r4 = r4 + 1
                        goto L11
                    L4e:
                        r1.addAll(r2)
                        nE r13 = defpackage.UN.a
                        java.lang.String r13 = "AutofillKeyboardAccessory"
                        boolean r13 = J.N.M09VlOh_(r13)
                        org.chromium.ui.modelutil.PropertyModel r12 = r12.a
                        if (r13 == 0) goto L6c
                        int r13 = r1.size()
                        PD2 r0 = defpackage.AbstractC6104hv1.g
                        java.lang.Object r0 = r12.i(r0)
                        fv1 r0 = (defpackage.C5416fv1) r0
                        r1.add(r13, r0)
                    L6c:
                        JD2 r13 = defpackage.AbstractC6104hv1.a
                        java.lang.Object r12 = r12.i(r13)
                        fD1 r12 = (defpackage.C5175fD1) r12
                        r12.A(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C2571Tu1.a(int, java.lang.Object):void");
                }
            });
        }
    }

    public static void addToAutofillSuggestionArray(AutofillSuggestion[] autofillSuggestionArr, int i, String str, String str2, String str3, int i2, int i3, boolean z, String str4, GURL gurl) {
        autofillSuggestionArr[i] = new AutofillSuggestion(str, str2, str3, i2 == 0 ? 0 : i2, false, i3, z, false, false, str4, gurl, null);
    }
}
