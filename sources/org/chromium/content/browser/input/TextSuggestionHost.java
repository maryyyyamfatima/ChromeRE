package org.chromium.content.browser.input;

import J.N;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.AbstractC10922vx2;
import defpackage.C10015tJ3;
import defpackage.C10191tp4;
import defpackage.C11265wx2;
import defpackage.C3023Xg3;
import defpackage.InterfaceC10236tx2;
import defpackage.InterfaceC9163qp4;
import defpackage.J44;
import defpackage.K44;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TextSuggestionHost implements InterfaceC9163qp4, InterfaceC10236tx2, J44 {
    public long a;
    public final WebContentsImpl g;
    public final Context h;
    public final ViewAndroidDelegate i;
    public boolean j;
    public WindowAndroid k;
    public C3023Xg3 l;
    public C10015tJ3 m;

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
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public static TextSuggestionHost create(WebContents webContents, long j) {
        J44 j44;
        K44 x;
        WebContentsImpl webContentsImpl = (WebContentsImpl) webContents;
        if (webContentsImpl.p && (x = webContentsImpl.x()) != null) {
            J44 b = x.b(TextSuggestionHost.class);
            if (b == null) {
                b = x.d(TextSuggestionHost.class, new TextSuggestionHost(webContentsImpl));
            }
            j44 = (J44) TextSuggestionHost.class.cast(b);
        } else {
            j44 = null;
        }
        TextSuggestionHost textSuggestionHost = (TextSuggestionHost) j44;
        textSuggestionHost.a = j;
        return textSuggestionHost;
    }

    public TextSuggestionHost(WebContents webContents) {
        WebContentsImpl webContentsImpl = (WebContentsImpl) webContents;
        this.g = webContentsImpl;
        this.h = webContentsImpl.t();
        this.k = webContentsImpl.Q0();
        this.i = webContentsImpl.C();
        ((C11265wx2) webContentsImpl.v(C11265wx2.class, AbstractC10922vx2.a)).a.add(this);
        C10191tp4.e(webContentsImpl).b(this);
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void a(WindowAndroid windowAndroid) {
        this.k = windowAndroid;
        C3023Xg3 c3023Xg3 = this.l;
        if (c3023Xg3 != null) {
            c3023Xg3.i = windowAndroid;
        }
        C10015tJ3 c10015tJ3 = this.m;
        if (c10015tJ3 != null) {
            c10015tJ3.i = windowAndroid;
        }
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onAttachedToWindow() {
        this.j = true;
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onDetachedFromWindow() {
        this.j = false;
    }

    @Override // defpackage.InterfaceC1765Np0
    public final void m(int i) {
        hidePopups();
    }

    @Override // defpackage.InterfaceC10236tx2
    public final void b() {
        hidePopups();
    }

    public final void showSpellCheckSuggestionMenu(double d, double d2, String str, String[] strArr) {
        if (this.j) {
            hidePopups();
            C3023Xg3 c3023Xg3 = new C3023Xg3(this.h, this, this.k, this.i.getContainerView());
            this.l = c3023Xg3;
            c3023Xg3.w = (String[]) strArr.clone();
            c3023Xg3.p.setVisibility(0);
            c3023Xg3.e(d, d2 + this.g.m.k, str);
            return;
        }
        N.MnvYa0QF(this.a, this);
        this.l = null;
        this.m = null;
    }

    public final void showTextSuggestionMenu(double d, double d2, String str, SuggestionInfo[] suggestionInfoArr) {
        if (this.j) {
            hidePopups();
            C10015tJ3 c10015tJ3 = new C10015tJ3(this.h, this, this.k, this.i.getContainerView());
            this.m = c10015tJ3;
            c10015tJ3.w = (SuggestionInfo[]) suggestionInfoArr.clone();
            c10015tJ3.p.setVisibility(8);
            c10015tJ3.e(d, d2 + this.g.m.k, str);
            return;
        }
        N.MnvYa0QF(this.a, this);
        this.l = null;
        this.m = null;
    }

    public void hidePopups() {
        C10015tJ3 c10015tJ3 = this.m;
        if (c10015tJ3 != null && c10015tJ3.l.isShowing()) {
            this.m.l.dismiss();
            this.m = null;
        }
        C3023Xg3 c3023Xg3 = this.l;
        if (c3023Xg3 == null || !c3023Xg3.l.isShowing()) {
            return;
        }
        this.l.l.dismiss();
        this.l = null;
    }

    public final void onNativeDestroyed() {
        hidePopups();
        this.a = 0L;
    }
}
