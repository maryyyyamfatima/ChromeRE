package org.chromium.content.browser;

import J.N;
import android.content.res.Configuration;
import android.view.View;
import defpackage.AbstractC10430uY0;
import defpackage.C10191tp4;
import defpackage.C11265wx2;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C6600jN2;
import defpackage.C8150ns3;
import defpackage.InterfaceC4274cc4;
import defpackage.InterfaceC9163qp4;
import defpackage.InterfaceC9744sY0;
import defpackage.J44;
import defpackage.K44;
import defpackage.Pc4;
import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class GestureListenerManagerImpl implements InterfaceC9744sY0, InterfaceC9163qp4, J44, InterfaceC4274cc4 {
    public final WebContentsImpl a;
    public final C12157za2 g;
    public final C11814ya2 h;
    public final ViewAndroidDelegate i;
    public Pc4 j;
    public long k;
    public boolean l;
    public boolean m;

    @Override // defpackage.InterfaceC9163qp4
    public final /* synthetic */ void a(WindowAndroid windowAndroid) {
    }

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

    @Override // defpackage.InterfaceC1765Np0
    public final /* synthetic */ void p(float f) {
    }

    public final void resetPopupsAndInput(boolean z) {
        ImeAdapterImpl b;
        J44 j44;
        K44 x;
        WebContentsImpl webContentsImpl = this.a;
        if (webContentsImpl != null) {
            SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(webContentsImpl);
            if (k != null) {
                k.z = true;
                k.j();
            }
            if (webContentsImpl.p && (x = webContentsImpl.x()) != null) {
                J44 b2 = x.b(C11265wx2.class);
                if (b2 == null) {
                    b2 = x.d(C11265wx2.class, new C11265wx2());
                }
                j44 = (J44) C11265wx2.class.cast(b2);
            } else {
                j44 = null;
            }
            C11265wx2 c11265wx2 = (C11265wx2) j44;
            if (c11265wx2 != null) {
                c11265wx2.a();
            }
        }
        if (isScrollInProgress()) {
            boolean z2 = this.l;
            this.l = false;
            SelectionPopupControllerImpl.k(webContentsImpl).r(isScrollInProgress());
            if (z2) {
                i();
            }
            if (this.m) {
                onFlingEnd();
                this.m = false;
            }
        }
        if (!z || (b = ImeAdapterImpl.b(webContentsImpl)) == null) {
            return;
        }
        b.j();
    }

    public static GestureListenerManagerImpl d(WebContents webContents) {
        K44 x;
        WebContentsImpl webContentsImpl = (WebContentsImpl) webContents;
        J44 j44 = null;
        if (webContentsImpl.p && (x = webContentsImpl.x()) != null) {
            J44 b = x.b(GestureListenerManagerImpl.class);
            if (b == null) {
                b = x.d(GestureListenerManagerImpl.class, new GestureListenerManagerImpl(webContentsImpl));
            }
            j44 = (J44) GestureListenerManagerImpl.class.cast(b);
        }
        return (GestureListenerManagerImpl) j44;
    }

    public GestureListenerManagerImpl(WebContentsImpl webContentsImpl) {
        this.a = webContentsImpl;
        C12157za2 c12157za2 = new C12157za2();
        this.g = c12157za2;
        this.h = c12157za2.f();
        ViewAndroidDelegate C = webContentsImpl.C();
        this.i = C;
        C.e.a(this);
        C10191tp4.e(webContentsImpl).b(this);
        this.k = N.MefCIE9S(this, webContentsImpl);
    }

    @Override // defpackage.InterfaceC9163qp4
    public final void onWindowFocusChanged(boolean z) {
        if (!z) {
            long j = this.k;
            if (j != 0) {
                N.MMR0DKoy(j, this);
            }
        }
        C11814ya2 c11814ya2 = this.h;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((AbstractC10430uY0) c11814ya2.next()).getClass();
        }
    }

    public final void b(AbstractC10430uY0 abstractC10430uY0) {
        boolean a = this.g.a(abstractC10430uY0);
        long j = this.k;
        if (j != 0 && a && (abstractC10430uY0 instanceof C8150ns3)) {
            N.M9FEGIKH(j, true);
        }
    }

    public final void f(AbstractC10430uY0 abstractC10430uY0) {
        boolean z;
        C12157za2 c12157za2 = this.g;
        boolean d = c12157za2.d(abstractC10430uY0);
        if (this.k != 0 && d && (abstractC10430uY0 instanceof C8150ns3)) {
            Iterator it = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    z = false;
                    break;
                } else if (((AbstractC10430uY0) c11814ya2.next()) instanceof C8150ns3) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return;
            }
            N.M9FEGIKH(this.k, false);
        }
    }

    public final void updateOnTouchDown() {
        C11814ya2 c11814ya2 = this.h;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((AbstractC10430uY0) c11814ya2.next()).f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x006d, code lost:            if (r5 != false) goto L290;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0071, code lost:            if (r4 == false) goto L290;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r10, int r11) {
        /*
            r9 = this;
            ya2 r0 = r9.h
            r0.b()
        L5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r0.next()
            uY0 r1 = (defpackage.AbstractC10430uY0) r1
            boolean r2 = r1 instanceof defpackage.C8150ns3
            if (r2 == 0) goto L5
            ns3 r1 = (defpackage.C8150ns3) r1
            r1.a = r10
            qs3 r2 = r1.d
            r3 = r2
            Hl1 r3 = (defpackage.C0967Hl1) r3
            JC r4 = r3.p
            CC r4 = (defpackage.CC) r4
            int r5 = r4.o
            r6 = 1
            r7 = 0
            if (r5 > 0) goto L29
            goto L75
        L29:
            int r5 = r3.v
            if (r10 <= r5) goto L2f
            r5 = r6
            goto L30
        L2f:
            r5 = r7
        L30:
            boolean r8 = r3.u
            if (r5 == r8) goto L36
            r8 = r6
            goto L37
        L36:
            r8 = r7
        L37:
            r3.v = r10
            r3.u = r5
            if (r8 == 0) goto L55
            boolean r4 = r3.f(r10)
            android.animation.ObjectAnimator r4 = r3.b(r4)
            r3.t = r4
            Gl1 r5 = new Gl1
            r5.<init>(r3)
            r4.addListener(r5)
            android.animation.Animator r3 = r3.t
            r3.start()
            goto L73
        L55:
            int r5 = r4.e()
            if (r5 <= 0) goto L5d
            r5 = r6
            goto L5e
        L5d:
            r5 = r7
        L5e:
            float r4 = r4.w
            r8 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L68
            r4 = r6
            goto L69
        L68:
            r4 = r7
        L69:
            boolean r3 = r3.u
            if (r3 != 0) goto L6f
            if (r5 != 0) goto L73
        L6f:
            if (r3 == 0) goto L75
            if (r4 != 0) goto L75
        L73:
            r3 = r7
            goto L76
        L75:
            r3 = r6
        L76:
            if (r3 != 0) goto L7c
            r1.h(r10, r11)
            goto L5
        L7c:
            int r3 = r2.i
            if (r3 == 0) goto L5
            boolean r3 = r2.a()
            if (r3 == 0) goto L5
            Hl1 r2 = (defpackage.C0967Hl1) r2
            android.animation.Animator r2 = r2.t
            if (r2 == 0) goto L8d
            goto L8e
        L8d:
            r6 = r7
        L8e:
            if (r6 == 0) goto L92
            goto L5
        L92:
            r1.i(r10, r11)
            goto L5
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content.browser.GestureListenerManagerImpl.h(int, int):void");
    }

    public final void onFlingEnd() {
        this.m = false;
        C11814ya2 c11814ya2 = this.h;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((AbstractC10430uY0) c11814ya2.next()).a(k(), j());
        }
    }

    public final void onEventAck(int i, boolean z) {
        C11814ya2 c11814ya2 = this.h;
        if (i == 16) {
            c11814ya2.b();
            while (c11814ya2.hasNext()) {
                ((AbstractC10430uY0) c11814ya2.next()).getClass();
            }
            return;
        }
        if (i == 17) {
            c11814ya2.b();
            while (c11814ya2.hasNext()) {
                ((AbstractC10430uY0) c11814ya2.next()).getClass();
            }
            return;
        }
        WebContentsImpl webContentsImpl = this.a;
        if (i == 21) {
            SelectionPopupControllerImpl k = SelectionPopupControllerImpl.k(webContentsImpl);
            if (k != null) {
                k.h();
            }
            c11814ya2.b();
            while (c11814ya2.hasNext()) {
                ((AbstractC10430uY0) c11814ya2.next()).getClass();
            }
            return;
        }
        if (i == 24) {
            if (z) {
                this.i.getContainerView().performHapticFeedback(0);
                c11814ya2.b();
                while (c11814ya2.hasNext()) {
                    ((AbstractC10430uY0) c11814ya2.next()).getClass();
                }
                return;
            }
            return;
        }
        switch (i) {
            case 12:
                i();
                return;
            case 13:
                if (z) {
                    SelectionPopupControllerImpl k2 = SelectionPopupControllerImpl.k(webContentsImpl);
                    if (k2 != null) {
                        k2.h();
                    }
                    c11814ya2.b();
                    while (c11814ya2.hasNext()) {
                        ((AbstractC10430uY0) c11814ya2.next()).e();
                    }
                    return;
                }
                return;
            case 14:
                i();
                return;
            default:
                return;
        }
    }

    public final void onFlingStart(boolean z) {
        this.m = true;
        C11814ya2 c11814ya2 = this.h;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((AbstractC10430uY0) c11814ya2.next()).b(k(), j());
        }
    }

    public final void onNativeDestroyed() {
        C11814ya2 c11814ya2 = this.h;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((AbstractC10430uY0) c11814ya2.next()).getClass();
        }
        this.g.clear();
        this.i.e.d(this);
        this.k = 0L;
    }

    public final void didOverscroll(float f, float f2) {
        C11814ya2 c11814ya2 = this.h;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((AbstractC10430uY0) c11814ya2.next()).getClass();
        }
    }

    @Override // defpackage.InterfaceC9744sY0
    public boolean isScrollInProgress() {
        return this.l;
    }

    public final void i() {
        this.l = false;
        SelectionPopupControllerImpl.k(this.a).r(isScrollInProgress());
        C11814ya2 c11814ya2 = this.h;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((AbstractC10430uY0) c11814ya2.next()).c(k(), j());
        }
    }

    public final void onScrollBegin(boolean z) {
        this.l = true;
        SelectionPopupControllerImpl.k(this.a).r(isScrollInProgress());
        C11814ya2 c11814ya2 = this.h;
        c11814ya2.b();
        while (c11814ya2.hasNext()) {
            ((AbstractC10430uY0) c11814ya2.next()).d(k(), j(), z);
        }
    }

    public final boolean filterTapOrPressEvent(int i, int i2, int i3) {
        return i == 5 && this.i.getContainerView().performLongClick();
    }

    public final void e(float f, float f2, float f3) {
        TraceEvent.b("GestureListenerManagerImpl:onRootScrollOffsetChanged", null);
        WebContentsImpl webContentsImpl = this.a;
        C6600jN2 c6600jN2 = webContentsImpl.m;
        this.j.onScrollChanged((int) c6600jN2.a(f2), (int) c6600jN2.a(f3), (int) c6600jN2.a(c6600jN2.a), (int) c6600jN2.a(c6600jN2.b));
        C6600jN2 c6600jN22 = webContentsImpl.m;
        c6600jN22.g = f;
        c6600jN22.a = f2;
        c6600jN22.b = f3;
        h(k(), j());
        TraceEvent.c("GestureListenerManagerImpl:onRootScrollOffsetChanged");
    }

    public final void updateScrollInfo(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z) {
        TraceEvent.b("GestureListenerManagerImpl:updateScrollInfo", null);
        C6600jN2 c6600jN2 = this.a.m;
        float f11 = c6600jN2.j;
        View containerView = this.i.getContainerView();
        float f12 = f11 * f3;
        float max = Math.max(f6, containerView.getWidth() / f12);
        float max2 = Math.max(f7, containerView.getHeight() / f12);
        boolean z2 = (f4 == c6600jN2.h && f5 == c6600jN2.i) ? false : true;
        boolean z3 = (!((f3 > c6600jN2.g ? 1 : (f3 == c6600jN2.g ? 0 : -1)) != 0) && f == c6600jN2.a && f2 == c6600jN2.b) ? false : true;
        if (z3) {
            e(f3, f, f2);
        }
        c6600jN2.h = f4;
        c6600jN2.i = f5;
        c6600jN2.k = f10;
        c6600jN2.c = max;
        c6600jN2.d = max2;
        c6600jN2.e = f8;
        c6600jN2.f = f9;
        if (!z3 && z) {
            h(k(), j());
        }
        if (z2) {
            C11814ya2 c11814ya2 = this.h;
            c11814ya2.b();
            while (c11814ya2.hasNext()) {
                ((AbstractC10430uY0) c11814ya2.next()).getClass();
            }
        }
        TraceEvent.c("GestureListenerManagerImpl:updateScrollInfo");
    }

    public final int j() {
        return this.a.m.b();
    }

    public final int k() {
        return this.a.m.c();
    }

    public final void onRootScrollOffsetChanged(float f, float f2) {
        e(this.a.m.g, f, f2);
    }
}
