package org.chromium.chrome.browser.image_editor;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.android.chrome.R;
import defpackage.AbstractC7504m0;
import defpackage.BK3;
import defpackage.BS2;
import defpackage.C11512xh1;
import defpackage.C11653y51;
import defpackage.C3443aA2;
import defpackage.C51;
import defpackage.C6969kS2;
import defpackage.C7039kf2;
import defpackage.C7269lJ3;
import defpackage.C7313lS2;
import defpackage.C7383lf2;
import defpackage.C7613mJ3;
import defpackage.C7957nJ3;
import defpackage.CS2;
import defpackage.InterfaceC1377Kp1;
import defpackage.LH3;
import defpackage.LS2;
import defpackage.QX0;
import defpackage.RunnableC5665gf2;
import defpackage.VS2;
import defpackage.XI3;
import defpackage.YI3;
import org.chromium.base.BundleUtils;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.OverlayFragment;
import org.chromium.chrome.browser.image_editor.text.TextEditorHandleView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class OverlayFragment extends c {
    public static final /* synthetic */ int o0 = 0;
    public BK3 b0;
    public VS2 c0;
    public LH3 d0;
    public C11653y51 e0;
    public C51 f0;
    public LS2 g0;
    public boolean h0;
    public boolean i0;
    public Callback j0;
    public Runnable k0;
    public float l0;
    public final C7039kf2 m0 = new C7039kf2(this);
    public final C7383lf2 n0 = new C7383lf2(this);

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        if (BundleUtils.d(activity, "image_editor")) {
            layoutInflater = layoutInflater.cloneInContext(new C11512xh1(BundleUtils.a(activity, "image_editor").getClassLoader(), activity));
        }
        View inflate = layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02b9, (ViewGroup) null);
        this.e0 = new C11653y51(K(), inflate, new Runnable() { // from class: df2
            @Override // java.lang.Runnable
            public final void run() {
                final OverlayFragment overlayFragment = OverlayFragment.this;
                final int width = overlayFragment.e0.b.getWidth();
                overlayFragment.e0.a();
                overlayFragment.j0.onResult(Boolean.FALSE);
                final LH3 lh3 = overlayFragment.d0;
                LD2 ld2 = RH3.a;
                QH3 qh3 = lh3.a;
                qh3.g.k(ld2, true);
                EditText editText = qh3.i;
                if (editText != null) {
                    editText.requestFocus();
                    ((InputMethodManager) qh3.a.getSystemService("input_method")).showSoftInput(editText, 1);
                }
                lh3.b.post(new Runnable() { // from class: JH3
                    @Override // java.lang.Runnable
                    public final void run() {
                        LH3 lh32 = LH3.this;
                        int i = lh32.e.g;
                        lh32.f.a.b.m(SW.c, i);
                    }
                });
                final TextView textView = overlayFragment.d0.d;
                textView.post(new Runnable() { // from class: if2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = OverlayFragment.o0;
                        OverlayFragment overlayFragment2 = OverlayFragment.this;
                        overlayFragment2.getClass();
                        overlayFragment2.l0 = width / textView.getWidth();
                    }
                });
            }
        }, new Runnable() { // from class: ef2
            @Override // java.lang.Runnable
            public final void run() {
                OverlayFragment overlayFragment = OverlayFragment.this;
                if (overlayFragment.d0.a()) {
                    return;
                }
                if (overlayFragment.g0.k.isEmpty()) {
                    overlayFragment.L0();
                    return;
                }
                overlayFragment.P0();
                KS2 ks2 = (KS2) LS2.o.j();
                if (ks2.h) {
                    ks2.l();
                    ks2.h = false;
                }
                LS2 ls2 = (LS2) ks2.g;
                ls2.getClass();
                ls2.j |= 1;
                ls2.k = "";
                String str = overlayFragment.g0.l;
                if (ks2.h) {
                    ks2.l();
                    ks2.h = false;
                }
                LS2 ls22 = (LS2) ks2.g;
                ls22.getClass();
                str.getClass();
                ls22.j |= 2;
                ls22.l = str;
                C7269lJ3 c7269lJ3 = overlayFragment.g0.m;
                if (c7269lJ3 == null) {
                    c7269lJ3 = C7269lJ3.q;
                }
                if (ks2.h) {
                    ks2.l();
                    ks2.h = false;
                }
                LS2 ls23 = (LS2) ks2.g;
                ls23.getClass();
                ls23.m = c7269lJ3;
                ls23.j |= 4;
                C3443aA2 c3443aA2 = overlayFragment.g0.n;
                if (c3443aA2 == null) {
                    c3443aA2 = C3443aA2.o;
                }
                if (ks2.h) {
                    ks2.l();
                    ks2.h = false;
                }
                LS2 ls24 = (LS2) ks2.g;
                ls24.getClass();
                ls24.n = c3443aA2;
                ls24.j |= 8;
                overlayFragment.g0 = (LS2) ks2.j();
            }
        }, new Runnable() { // from class: ff2
            @Override // java.lang.Runnable
            public final void run() {
                OverlayFragment overlayFragment = OverlayFragment.this;
                if (!overlayFragment.g0.k.isEmpty()) {
                    overlayFragment.b0.j();
                    overlayFragment.O0();
                }
                overlayFragment.b0.l(true);
                overlayFragment.e0.a();
                overlayFragment.b0.t();
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.c
    public final void j0() {
        VS2 vs2 = this.c0;
        if (vs2 != null) {
            vs2.s.a.remove(this.m0);
            this.c0.n.b.remove(this.n0);
        }
        this.f11484J = true;
    }

    public final void N0(boolean z) {
        this.h0 = false;
        if (!z) {
            if (this.e0.b.m) {
                M0();
                return;
            }
            return;
        }
        this.b0.l(true);
        C11653y51 c11653y51 = this.e0;
        if (c11653y51.b.m) {
            c11653y51.a();
            this.b0.j();
            this.b0.t();
        }
    }

    public final void M0() {
        if (this.e0.b.m) {
            if (!this.g0.k.isEmpty()) {
                if (this.d0.a()) {
                    O0();
                } else {
                    P0();
                }
            } else if (!this.d0.a()) {
                L0();
            }
            this.b0.l(true);
            this.e0.a();
        }
    }

    public final void L0() {
        this.i0 = true;
        BK3 bk3 = this.b0;
        C51 c51 = this.f0;
        TextEditorHandleView textEditorHandleView = this.e0.b;
        c51.getClass();
        XI3 xi3 = (XI3) YI3.o.j();
        C7269lJ3 b = C51.b(textEditorHandleView);
        if (xi3.h) {
            xi3.l();
            xi3.h = false;
        }
        YI3 yi3 = (YI3) xi3.g;
        yi3.getClass();
        b.getClass();
        yi3.m = b;
        yi3.j = 1 | yi3.j;
        C3443aA2 a = c51.a(textEditorHandleView);
        if (xi3.h) {
            xi3.l();
            xi3.h = false;
        }
        YI3 yi32 = (YI3) xi3.g;
        yi32.getClass();
        a.getClass();
        yi32.l = a;
        yi32.k = 4;
        YI3 yi33 = (YI3) xi3.j();
        bk3.getClass();
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        yi33.getClass();
        c7313lS2.k = yi33;
        c7313lS2.j = 32;
        bk3.o((C7313lS2) c6969kS2.j());
        this.b0.m(new RunnableC5665gf2(this));
    }

    public final void P0() {
        this.i0 = true;
        BK3 bk3 = this.b0;
        C51 c51 = this.f0;
        String str = this.g0.k;
        TextEditorHandleView textEditorHandleView = this.e0.b;
        c51.getClass();
        C7613mJ3 c7613mJ3 = (C7613mJ3) C7957nJ3.o.j();
        if (c7613mJ3.h) {
            c7613mJ3.l();
            c7613mJ3.h = false;
        }
        C7957nJ3 c7957nJ3 = (C7957nJ3) c7613mJ3.g;
        c7957nJ3.getClass();
        str.getClass();
        c7957nJ3.j = 1 | c7957nJ3.j;
        c7957nJ3.m = str;
        C7269lJ3 b = C51.b(textEditorHandleView);
        if (c7613mJ3.h) {
            c7613mJ3.l();
            c7613mJ3.h = false;
        }
        C7957nJ3 c7957nJ32 = (C7957nJ3) c7613mJ3.g;
        c7957nJ32.getClass();
        b.getClass();
        c7957nJ32.n = b;
        c7957nJ32.j |= 2;
        C3443aA2 a = c51.a(textEditorHandleView);
        if (c7613mJ3.h) {
            c7613mJ3.l();
            c7613mJ3.h = false;
        }
        C7957nJ3 c7957nJ33 = (C7957nJ3) c7613mJ3.g;
        c7957nJ33.getClass();
        a.getClass();
        c7957nJ33.l = a;
        c7957nJ33.k = 5;
        C7957nJ3 c7957nJ34 = (C7957nJ3) c7613mJ3.j();
        bk3.getClass();
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        c7313lS2.getClass();
        c7957nJ34.getClass();
        c7313lS2.k = c7957nJ34;
        c7313lS2.j = 34;
        bk3.o((C7313lS2) c6969kS2.j());
        this.b0.m(new RunnableC5665gf2(this));
    }

    public final void O0() {
        this.i0 = true;
        BK3 bk3 = this.b0;
        String str = this.g0.k;
        bk3.getClass();
        C6969kS2 c6969kS2 = (C6969kS2) C7313lS2.l.j();
        BS2 bs2 = (BS2) CS2.k.j();
        if (bs2.h) {
            bs2.l();
            bs2.h = false;
        }
        CS2 cs2 = (CS2) bs2.g;
        cs2.getClass();
        str.getClass();
        InterfaceC1377Kp1 interfaceC1377Kp1 = cs2.j;
        if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
            cs2.j = QX0.r(interfaceC1377Kp1);
        }
        cs2.j.add(str);
        if (c6969kS2.h) {
            c6969kS2.l();
            c6969kS2.h = false;
        }
        C7313lS2 c7313lS2 = (C7313lS2) c6969kS2.g;
        CS2 cs22 = (CS2) bs2.j();
        c7313lS2.getClass();
        cs22.getClass();
        c7313lS2.k = cs22;
        c7313lS2.j = 33;
        bk3.o((C7313lS2) c6969kS2.j());
        this.b0.m(new RunnableC5665gf2(this));
    }
}
