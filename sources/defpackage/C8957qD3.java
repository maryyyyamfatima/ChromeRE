package defpackage;

import J.N;
import android.os.Build;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.dragdrop.DropDataContentProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qD3 */
/* loaded from: classes.dex */
public final class C8957qD3 extends ViewAndroidDelegate {
    public final TabImpl h;
    public int i;
    public InterfaceC7697ma2 j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [org.chromium.base.Callback, mD3] */
    public C8957qD3(Tab tab, Q50 q50) {
        super(q50);
        TabImpl tabImpl = (TabImpl) tab;
        this.h = tabImpl;
        q50.i.a(this.a);
        if (N.Mudil8Bg("TouchDragAndContextMenu")) {
            int M0MXVnOj = N.M0MXVnOj("TouchDragAndContextMenu", "ClearCacheDelayedMs", 60000);
            synchronized (DropDataContentProvider.h) {
                DropDataContentProvider.i = M0MXVnOj;
            }
            boolean MIXz$64w = N.MIXz$64w("TouchDragAndContextMenu", "DropInChrome", false);
            if (Build.VERSION.SDK_INT >= 24) {
                this.a.n = new C8614pD3(tabImpl, MIXz$64w);
            }
        }
        ?? r5 = new Callback() { // from class: mD3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C8957qD3.this.b();
            }
        };
        C0565Ej c0565Ej = tab.m().n;
        this.j = c0565Ej;
        c0565Ej.m(r5);
        tabImpl.v(new C7927nD3(this, r5));
    }

    @Override // org.chromium.ui.base.ViewAndroidDelegate
    public final void onTopControlsChanged(int i, int i2, int i3) {
        C3223Yu3 V0 = C3223Yu3.V0(this.h);
        if (V0.l && i == V0.g && V0.i == i2 && V0.j == i3) {
            return;
        }
        V0.g = i;
        V0.i = i2;
        V0.j = i3;
        V0.W0();
    }

    @Override // org.chromium.ui.base.ViewAndroidDelegate
    public final void onBottomControlsChanged(int i, int i2) {
        C3223Yu3 V0 = C3223Yu3.V0(this.h);
        if (V0.l && V0.h == i && V0.k == i2) {
            return;
        }
        V0.h = i;
        V0.k = i2;
        V0.W0();
    }

    @Override // org.chromium.ui.base.ViewAndroidDelegate
    public final InterfaceViewOnDragListenerC0226Bt0 a() {
        return this.a;
    }

    public final void b() {
        InterfaceC7697ma2 interfaceC7697ma2;
        TabImpl tabImpl = this.h;
        int intValue = (tabImpl.isHidden() || (interfaceC7697ma2 = this.j) == null) ? 0 : ((Integer) ((C8385oa2) interfaceC7697ma2).g).intValue();
        if (intValue == this.i) {
            return;
        }
        this.i = intValue;
        RenderWidgetHostViewImpl W0 = tabImpl.l.W0();
        if (W0 == null) {
            return;
        }
        long j = W0.a;
        if (j == 0) {
            throw new IllegalStateException("Native RenderWidgetHostViewAndroid already destroyed", W0.b);
        }
        N.Myd8R_Wn(j, W0);
    }

    @Override // org.chromium.ui.base.ViewAndroidDelegate
    public final int getViewportInsetBottom() {
        return this.i;
    }

    @Override // org.chromium.ui.base.ViewAndroidDelegate
    public final void onBackgroundColorChanged(int i) {
        TabImpl tabImpl = this.h;
        Iterator it = tabImpl.p.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((BA0) c11814ya2.next()).h0(tabImpl);
            }
        }
    }
}
