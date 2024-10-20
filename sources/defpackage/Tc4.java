package defpackage;

import java.util.Iterator;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Tc4 implements Qc4, InterfaceC4009bp4, J44 {
    public final WebContentsImpl a;
    public Boolean g;
    public boolean h;
    public Boolean i;
    public boolean j;

    @Override // defpackage.InterfaceC4009bp4
    public final void d() {
    }

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    public static Tc4 c(WebContents webContents) {
        return (Tc4) ((WebContentsImpl) webContents).v(Tc4.class, Sc4.a);
    }

    public Tc4(WebContentsImpl webContentsImpl) {
        this.a = webContentsImpl;
    }

    public final void f(boolean z) {
        Iterator it = C10191tp4.e(this.a).a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC9163qp4) c11814ya2.next()).onWindowFocusChanged(z);
            }
        }
    }

    public final void e() {
        Boolean bool = this.g;
        if (bool == null) {
            return;
        }
        boolean z = bool.booleanValue() && !this.h;
        Boolean bool2 = this.i;
        if (bool2 != null && bool2.booleanValue() == z) {
            return;
        }
        this.i = Boolean.valueOf(z);
        WebContentsImpl webContentsImpl = this.a;
        if (webContentsImpl == null) {
            return;
        }
        C10191tp4 e = C10191tp4.e(webContentsImpl);
        boolean booleanValue = this.i.booleanValue();
        boolean z2 = this.j;
        Iterator it = e.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((InterfaceC9163qp4) c11814ya2.next()).g(booleanValue, z2);
            } else {
                webContentsImpl.k0(this.i.booleanValue());
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC4009bp4
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        e();
    }

    @Override // defpackage.InterfaceC4009bp4
    public final void a() {
        if (this.h) {
            this.h = false;
            e();
        }
    }
}
