package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.share.long_screenshots.bitmap_generation.LongScreenshotsTabService;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iC0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6201iC0 {
    public final ArrayList a;
    public final ArrayList b;
    public C8867py c;
    public final C12157za2 d;
    public int e;
    public final C8370oX2 f;

    public C6201iC0(Context context, Tab tab, boolean z) {
        C8370oX2 c8370oX2 = new C8370oX2(context, tab);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = new C12157za2();
        this.f = c8370oX2;
        C8867py c8867py = new C8867py(tab, c8370oX2, new C5513gC0(this));
        this.c = c8867py;
        if (c8867py.b == null) {
            c8867py.b = (LongScreenshotsTabService) N.Mhh7FcTw();
        }
        LongScreenshotsTabService longScreenshotsTabService = c8867py.b;
        longScreenshotsTabService.a = c8867py;
        Rect rect = c8370oX2.b;
        if (longScreenshotsTabService.b == 0) {
            longScreenshotsTabService.processCaptureTabStatus(9);
        } else if (tab.b() == null) {
            longScreenshotsTabService.processCaptureTabStatus(5);
        } else {
            N.M61U97rf(longScreenshotsTabService.b, tab.getId(), tab.getUrl(), tab.b(), rect.left, rect.top, rect.width(), rect.height(), z);
        }
        c8867py.g = 0.0f;
        d(5);
    }

    public final void c(QI1 qi1, boolean z) {
        int i = this.e;
        if (i == 4) {
            qi1.a();
        } else if (i == 5) {
            this.b.add(qi1);
        } else {
            qi1.b(i);
        }
        if (z) {
            return;
        }
        this.a.add(qi1);
    }

    public final void d(int i) {
        this.e = i;
        ArrayList arrayList = this.b;
        if (i == 4) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((QI1) it.next()).a();
            }
            arrayList.clear();
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((QI1) it2.next()).b(i);
            }
        }
        Iterator it3 = this.d.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it3;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC5857hC0) c11814ya2.next()).a(this.e);
            }
        }
    }

    public final void a(InterfaceC5857hC0 interfaceC5857hC0) {
        this.d.a(interfaceC5857hC0);
        interfaceC5857hC0.a(this.e);
        if (this.e == 4) {
            KI1 ki1 = this.c.a;
            interfaceC5857hC0.b(ki1 == null ? null : ki1.c, ki1 != null ? ki1.d : null);
        }
    }

    public final void b() {
        C8867py c8867py = this.c;
        if (c8867py != null) {
            KI1 ki1 = c8867py.a;
            if (ki1 != null) {
                PlayerCompositorDelegateImpl playerCompositorDelegateImpl = ki1.a;
                if (playerCompositorDelegateImpl != null) {
                    long j = playerCompositorDelegateImpl.b;
                    if (j != 0) {
                        N.MIRVkfIx(j);
                        playerCompositorDelegateImpl.b = 0L;
                    }
                    ki1.a = null;
                }
                c8867py.a = null;
            }
            LongScreenshotsTabService longScreenshotsTabService = c8867py.b;
            if (longScreenshotsTabService != null) {
                long j2 = longScreenshotsTabService.b;
                if (j2 != 0) {
                    N.MDdcn7jl(j2);
                }
            }
            this.c = null;
        }
    }
}
