package org.chromium.content.browser.input;

import J.N;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import defpackage.AbstractC10922vx2;
import defpackage.C10191tp4;
import defpackage.C11265wx2;
import defpackage.G23;
import defpackage.InterfaceC10236tx2;
import defpackage.InterfaceC9163qp4;
import defpackage.J44;
import defpackage.K44;
import defpackage.M23;
import defpackage.Q23;
import defpackage.R23;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content.browser.input.SelectPopup;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SelectPopup implements InterfaceC10236tx2, InterfaceC9163qp4, J44 {
    public final WebContentsImpl a;
    public final View g;
    public G23 h;
    public long i;
    public long j;

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void g(boolean z, boolean z2) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void l(float f) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void m(int i) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onAttachedToWindow() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onDetachedFromWindow() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public static SelectPopup create(WebContents webContents, long j) {
        J44 j44;
        K44 x;
        WebContentsImpl webContentsImpl = (WebContentsImpl) webContents;
        if (webContentsImpl.p && (x = webContentsImpl.x()) != null) {
            J44 b = x.b(SelectPopup.class);
            if (b == null) {
                b = x.d(SelectPopup.class, new SelectPopup(webContentsImpl));
            }
            j44 = (J44) SelectPopup.class.cast(b);
        } else {
            j44 = null;
        }
        SelectPopup selectPopup = (SelectPopup) j44;
        selectPopup.i = j;
        return selectPopup;
    }

    public SelectPopup(WebContents webContents) {
        WebContentsImpl webContentsImpl = (WebContentsImpl) webContents;
        this.a = webContentsImpl;
        ViewAndroidDelegate C = webContentsImpl.C();
        this.g = C.getContainerView();
        C.d.a(this);
        ((C11265wx2) webContentsImpl.v(C11265wx2.class, AbstractC10922vx2.a)).a.add(this);
        C10191tp4.e(webContentsImpl).b(this);
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void a(WindowAndroid windowAndroid) {
        this.h = null;
    }

    @Override // defpackage.InterfaceC10236tx2
    public final void b() {
        G23 g23 = this.h;
        if (g23 != null) {
            g23.a(true);
        }
    }

    public final void show(View view, long j, String[] strArr, int[] iArr, boolean z, int[] iArr2, boolean z2) {
        K44 x;
        View view2 = this.g;
        J44 j44 = null;
        if (view2.getParent() == null || view2.getVisibility() != 0) {
            this.j = j;
            d(null);
            return;
        }
        WebContentsImpl webContentsImpl = this.a;
        if (webContentsImpl != null) {
            SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(webContentsImpl);
            if (k != null) {
                k.z = true;
                k.j();
            }
            if (webContentsImpl.p && (x = webContentsImpl.x()) != null) {
                J44 b = x.b(C11265wx2.class);
                if (b == null) {
                    b = x.d(C11265wx2.class, new C11265wx2());
                }
                j44 = (J44) C11265wx2.class.cast(b);
            }
            C11265wx2 c11265wx2 = (C11265wx2) j44;
            if (c11265wx2 != null) {
                c11265wx2.a();
            }
        }
        Context t = webContentsImpl.t();
        if (t == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            arrayList.add(new R23(strArr[i], iArr[i]));
        }
        WebContentsAccessibilityImpl k2 = WebContentsAccessibilityImpl.k(webContentsImpl);
        if (DeviceFormFactor.isTablet() && !z && !k2.G) {
            this.h = new Q23(t, new Callback() { // from class: F23
                public /* synthetic */ F23() {
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    SelectPopup.this.d((int[]) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            }, view, arrayList, iArr2, z2, this.a);
        } else {
            this.h = new M23(t, new Callback() { // from class: F23
                public /* synthetic */ F23() {
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    SelectPopup.this.d((int[]) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            }, arrayList, z, iArr2);
        }
        this.j = j;
        this.h.b();
    }

    public void hideWithoutCancel() {
        G23 g23 = this.h;
        if (g23 == null) {
            return;
        }
        g23.a(false);
        this.h = null;
        this.j = 0L;
    }

    public final void onNativeDestroyed() {
        this.i = 0L;
    }

    public final void d(int[] iArr) {
        long j = this.i;
        if (j != 0) {
            N.ME0LgXse(j, this, this.j, iArr);
        }
        this.j = 0L;
        this.h = null;
    }
}
