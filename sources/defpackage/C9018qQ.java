package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import java.util.WeakHashMap;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.modaldialog.ModalDialogView;
import org.chromium.components.webxr.ArCoreJavaUtils;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qQ */
/* loaded from: classes.dex */
public final class C9018qQ extends AbstractC6470iz3 implements GC {
    public int A;
    public boolean B;
    public int C;
    public final Activity n;
    public final InterfaceC0079Ap3 o;
    public final InterfaceC0079Ap3 p;
    public final InterfaceC0079Ap3 q;
    public final ZU0 r;
    public final JC s;
    public final C8675pQ t;
    public final InterfaceC10590uz3 u;
    public Tab v;
    public ViewGroup w;
    public boolean x;
    public boolean y;
    public View z;

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        if (this.g != null && this.y && HC.a(this.s)) {
            this.y = false;
            g();
        }
    }

    public C9018qQ(Activity activity, InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC0079Ap3 interfaceC0079Ap32, InterfaceC0079Ap3 interfaceC0079Ap33, ZU0 zu0, JC jc, InterfaceC10590uz3 interfaceC10590uz3) {
        super(activity);
        this.n = activity;
        this.o = interfaceC0079Ap3;
        this.p = interfaceC0079Ap32;
        this.r = zu0;
        this.s = jc;
        ((CC) jc).d(this);
        this.t = new C8675pQ();
        this.C = -1;
        this.q = interfaceC0079Ap33;
        this.u = interfaceC10590uz3;
    }

    @Override // defpackage.AbstractC6470iz3
    public final void j(boolean z) {
        if (z) {
            ModalDialogView modalDialogView = this.j;
            PropertyModel propertyModel = this.g;
            String str = (String) propertyModel.i(AbstractC4249cY1.b);
            if (str == null) {
                str = (String) propertyModel.i(AbstractC4249cY1.c);
            }
            modalDialogView.announceForAccessibility(str);
            this.j.setImportantForAccessibility(1);
            this.j.requestFocus();
            if (this.m) {
                this.j.sendAccessibilityEvent(8);
            }
        } else {
            this.j.clearFocus();
            this.j.setImportantForAccessibility(4);
        }
        if (z == this.x) {
            return;
        }
        this.x = z;
        if (z) {
            this.i.bringToFront();
        } else {
            AbstractC8540p04.i(this.i);
            AbstractC8540p04.f(this.w, this.i, this.z, false);
        }
    }

    @Override // defpackage.AbstractC6470iz3
    public final void i(boolean z) {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.p;
        if (interfaceC0079Ap3.i()) {
            ImageButton e = ((C9707sQ3) interfaceC0079Ap3.get()).e();
            if (z) {
                this.v = ((AbstractC11276wz3) this.u).h();
                InterfaceC0079Ap3 interfaceC0079Ap32 = this.q;
                if (interfaceC0079Ap32.i()) {
                    ((ContextualSearchManager) interfaceC0079Ap32.get()).i(0);
                }
                WebContents b = this.v.b();
                if (b != null) {
                    h(b, true);
                }
                l(true);
                ((C9707sQ3) interfaceC0079Ap3.get()).k(12, false);
                e.setEnabled(false);
                return;
            }
            WebContents b2 = this.v.b();
            if (b2 != null) {
                h(b2, false);
            }
            l(false);
            e.setEnabled(true);
            this.v = null;
        }
    }

    @Override // defpackage.YX1
    public final void f() {
        this.y = false;
        C1948Oz3 c1948Oz3 = (C1948Oz3) this.o.get();
        c1948Oz3.a.c(this.C);
        this.C = -1;
        i(false);
        ModalDialogView modalDialogView = this.j;
        WeakHashMap weakHashMap = Ec4.a;
        if (!modalDialogView.isAttachedToWindow()) {
            this.i.animate().cancel();
        } else {
            ModalDialogView modalDialogView2 = this.j;
            modalDialogView2.clearFocus();
            this.i.animate().cancel();
            this.i.animate().setDuration(200L).alpha(0.0f).setInterpolator(InterpolatorC0485Dt.d).setListener(new C5440fz3(this, modalDialogView2)).start();
        }
        UD2 ud2 = this.k;
        if (ud2 != null) {
            ud2.b();
            this.k = null;
        }
        this.j = null;
    }

    @Override // defpackage.GC
    public final void k(int i) {
        this.A = i;
        this.B = true;
    }

    @Override // defpackage.GC
    public final void r() {
        this.B = true;
    }

    public final void l(boolean z) {
        C2313Ru3.a(this.v).c(Boolean.valueOf(z), "isTabModalDialogShowing");
        Tab tab = this.v;
        C8675pQ c8675pQ = this.t;
        c8675pQ.getClass();
        if (tab != null) {
            C2313Ru3 a = C2313Ru3.a(tab);
            Object obj = Boolean.FALSE;
            if (a.a.containsKey("isTabModalDialogShowing")) {
                obj = a.b("isTabModalDialogShowing");
            }
            c8675pQ.p(Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 3));
        }
        boolean z2 = false;
        if (AbstractC0825Gj.a() != null) {
            if (ArCoreJavaUtils.c != null) {
                z2 = true;
            }
        }
        if (!z2) {
            ((XU0) this.r).j(this.v);
        }
        JC jc = this.s;
        if (z && (this.v.b().O().i() || z2)) {
            ((CC) jc).p(true);
        } else if (!z && z2) {
            ((CC) jc).h();
        } else {
            C3093Xu3.c(1, this.v, !((CC) jc).C);
        }
    }
}
