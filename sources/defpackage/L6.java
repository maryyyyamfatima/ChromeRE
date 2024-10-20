package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.adaptive.settings.AdaptiveToolbarPreferenceFragment;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class L6 implements InterfaceC9295rD, InterfaceC8953qD, V02, P83 {
    public InterfaceC9295rD g;
    public C8267oD j;
    public boolean k;
    public final I5 l;
    public final S6 m;
    public final Q83 n;
    public C6 o;
    public final J6 p;
    public final G6 q;
    public final C12157za2 a = new C12157za2();
    public final HashMap h = new HashMap();
    public final C8610pD i = new C8610pD();
    public int r = 0;

    public L6(a aVar, I53 i53, I5 i5, G6 g6, C10285u6 c10285u6, Q83 q83) {
        this.p = new Callback() { // from class: J6
            public final /* synthetic */ SettingsLauncher a;
            public final /* synthetic */ Context g;

            public /* synthetic */ J6(a aVar2, I53 i532) {
                r2 = i532;
                r1 = aVar2;
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                if (((Integer) obj).intValue() == R.id.customize_adaptive_button_menu_id) {
                    FI2.a("MobileAdaptiveMenuCustomize");
                    r2.c(r1, AdaptiveToolbarPreferenceFragment.class);
                }
            }
        };
        this.l = i5;
        i5.b(this);
        this.m = new S6(c10285u6);
        this.q = g6;
        this.n = q83;
        q83.a(this);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void destroy() {
        l(0);
        this.a.clear();
        this.n.o(this);
        this.l.c(this);
        Iterator it = this.h.entrySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC9295rD) ((Map.Entry) it.next()).getValue()).destroy();
            it.remove();
        }
    }

    public final void l(int i) {
        InterfaceC9295rD interfaceC9295rD = (InterfaceC9295rD) this.h.get(Integer.valueOf(i));
        InterfaceC9295rD interfaceC9295rD2 = this.g;
        if (interfaceC9295rD2 != null) {
            interfaceC9295rD2.d(this);
        }
        this.g = interfaceC9295rD;
        if (interfaceC9295rD != null) {
            interfaceC9295rD.j(this);
        }
    }

    @Override // defpackage.InterfaceC9295rD
    public final void j(InterfaceC8953qD interfaceC8953qD) {
        this.a.a(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final void d(InterfaceC8953qD interfaceC8953qD) {
        this.a.d(interfaceC8953qD);
    }

    @Override // defpackage.InterfaceC9295rD
    public final C8610pD h(Tab tab) {
        C6 c6;
        InterfaceC9295rD interfaceC9295rD = this.g;
        C8610pD h = interfaceC9295rD == null ? null : interfaceC9295rD.h(tab);
        if (h == null) {
            this.j = null;
            return null;
        }
        if (!this.k && h.a && h.b) {
            C8267oD c8267oD = h.c;
            if (!c8267oD.h) {
                this.k = true;
                EI2.h(c8267oD.g, 7, "Android.AdaptiveToolbarButton.SessionVariant");
            }
        }
        boolean z = h.a;
        C8610pD c8610pD = this.i;
        c8610pD.a = z;
        c8610pD.b = h.b;
        C8267oD c8267oD2 = h.c;
        if (c8267oD2 != this.j) {
            if (this.o == null) {
                if (AbstractC8293oI0.a()) {
                    G6 g6 = this.q;
                    g6.getClass();
                    if (M6.b()) {
                        c6 = new C6(g6, this.p);
                        this.o = c6;
                    }
                }
                c6 = null;
                this.o = c6;
            }
            this.j = c8267oD2;
            Drawable drawable = c8267oD2.a;
            final int i = c8267oD2.g;
            final View.OnClickListener onClickListener = c8267oD2.b;
            c8610pD.c = new C8267oD(drawable, new View.OnClickListener() { // from class: K6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EI2.h(i, 7, "Android.AdaptiveToolbarButton.Clicked");
                    onClickListener.onClick(view);
                }
            }, c8267oD2.h ? null : this.o, c8267oD2.d, c8267oD2.e, c8267oD2.f, i, c8267oD2.i);
        }
        return c8610pD;
    }

    @Override // defpackage.InterfaceC8953qD
    public final void b(boolean z) {
        k(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    @Override // defpackage.V02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            r5 = this;
            boolean r0 = defpackage.M6.b()
            if (r0 == 0) goto L5a
            I6 r0 = new I6
            r0.<init>()
            S6 r1 = r5.m
            r1.b(r0)
            U6 r0 = new U6
            r0.<init>()
            org.chromium.chrome.browser.profiles.Profile r1 = org.chromium.chrome.browser.profiles.Profile.d()
            java.lang.Object r1 = J.N.MGkN3uZ4(r1)
            org.chromium.components.segmentation_platform.SegmentationPlatformServiceImpl r1 = (org.chromium.components.segmentation_platform.SegmentationPlatformServiceImpl) r1
            Q6 r2 = new Q6
            r2.<init>(r0)
            long r3 = r1.a
            java.lang.String r0 = "adaptive_toolbar"
            J.N.Mv7niEOS(r3, r1, r0, r2)
            C6 r0 = r5.o
            if (r0 == 0) goto L30
            return
        L30:
            boolean r0 = defpackage.AbstractC8293oI0.a()
            r1 = 0
            if (r0 != 0) goto L38
            goto L43
        L38:
            G6 r0 = r5.q
            r0.getClass()
            boolean r2 = defpackage.M6.b()
            if (r2 != 0) goto L45
        L43:
            r2 = r1
            goto L4c
        L45:
            C6 r2 = new C6
            J6 r3 = r5.p
            r2.<init>(r0, r3)
        L4c:
            r5.o = r2
            if (r2 != 0) goto L51
            return
        L51:
            r5.j = r1
            pD r0 = r5.i
            boolean r0 = r0.a
            r5.k(r0)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.L6.U():void");
    }

    public final void k(boolean z) {
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8953qD) c11814ya2.next()).b(z);
            }
        }
    }

    @Override // defpackage.P83
    public final void a(String str) {
        if ("Chrome.AdaptiveToolbarCustomization.Settings".equals(str) || "Chrome.AdaptiveToolbarCustomization.Enabled".equals(str)) {
            this.m.b(new Callback() { // from class: H6
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    R6 r6 = (R6) obj;
                    L6 l6 = L6.this;
                    l6.getClass();
                    int i = r6.a ? r6.b : 0;
                    l6.r = i;
                    l6.l(i);
                    l6.k(r6.a);
                }
            });
        }
    }
}
