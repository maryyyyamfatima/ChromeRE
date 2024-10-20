package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ge0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801Ge0 {
    public final PC a;
    public final C4620dd0 b;
    public final CustomTabsConnection c;
    public final Activity d;
    public final Context e;
    public final InterfaceC3241Yy1 f;
    public final C2090Qc0 g;
    public final C6981kV h;
    public final C8744pd0 i;
    public final C0281Ce0 j;
    public C9707sQ3 k;
    public int l = -1;
    public boolean m;

    public C0801Ge0(PC pc, C4620dd0 c4620dd0, CustomTabsConnection customTabsConnection, Activity activity, Context context, InterfaceC3241Yy1 interfaceC3241Yy1, C2090Qc0 c2090Qc0, C6981kV c6981kV, C8744pd0 c8744pd0, C10458ud0 c10458ud0, C0281Ce0 c0281Ce0) {
        this.a = pc;
        this.b = c4620dd0;
        this.c = customTabsConnection;
        this.d = activity;
        this.e = context;
        this.f = interfaceC3241Yy1;
        this.g = c2090Qc0;
        this.h = c6981kV;
        this.i = c8744pd0;
        this.j = c0281Ce0;
        Callback callback = new Callback() { // from class: Ee0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [Fe0] */
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9897sy1 c9897sy1 = (C9897sy1) obj;
                final C0801Ge0 c0801Ge0 = C0801Ge0.this;
                c0801Ge0.k.g(c9897sy1, null, null, null, new View.OnClickListener() { // from class: Fe0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WebContents b;
                        boolean z;
                        WebContents b2;
                        C0801Ge0 c0801Ge02 = C0801Ge0.this;
                        c0801Ge02.getClass();
                        FI2.a("CustomTabs.CloseButtonClicked");
                        if (c0801Ge02.a.N()) {
                            FI2.a("CustomTabs.CloseButtonClicked.DownloadsUI");
                        }
                        C2090Qc0 c2090Qc02 = c0801Ge02.g;
                        c2090Qc02.r = true;
                        C6637jV c6637jV = c2090Qc02.j;
                        C4620dd0 c4620dd02 = c6637jV.c;
                        Tab tab = c4620dd02.b;
                        boolean z2 = (tab == null || C1695Nb0.m(tab).q == -1) ? false : true;
                        C3130Yc0 c3130Yc0 = c6637jV.b;
                        if (z2 && c6637jV.d) {
                            c3130Yc0.a();
                        } else {
                            int i = 0;
                            while (true) {
                                if (c4620dd02.b == null) {
                                    break;
                                }
                                C4620dd0 c4620dd03 = c6637jV.c;
                                Tab tab2 = c4620dd03.b;
                                NavigationController navigationController = null;
                                if (((tab2 == null || (b = tab2.b()) == null) ? null : b.i()) != null) {
                                    Tab tab3 = c4620dd03.b;
                                    if (tab3 != null && (b2 = tab3.b()) != null) {
                                        navigationController = b2.i();
                                    }
                                    if (c6637jV.a != null && navigationController != null) {
                                        G12 q = navigationController.q();
                                        for (int i2 = q.b - 1; i2 >= 0; i2--) {
                                            String i3 = q.a(i2).b.i();
                                            C7900n83 c7900n83 = c6637jV.a;
                                            if (c7900n83 != null && c7900n83.a.d(i3)) {
                                                navigationController.z(i2);
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                    z = false;
                                    if (z) {
                                        if (z2) {
                                            EI2.b("CustomTabs.CloseButton.ChildTab.ScopeAlgorithm.ClosesOneTab", false);
                                        }
                                    }
                                }
                                c3130Yc0.a();
                                i++;
                                Tab tab4 = c4620dd02.b;
                                if (tab4 != null) {
                                    String i4 = tab4.getUrl().i();
                                    C7900n83 c7900n832 = c6637jV.a;
                                    if (c7900n832 != null && c7900n832.a.d(i4)) {
                                        if (z2) {
                                            EI2.b("CustomTabs.CloseButton.ChildTab.ScopeAlgorithm.ClosesOneTab", i == 1);
                                        }
                                    }
                                }
                            }
                        }
                        c2090Qc02.r = false;
                    }
                }, null);
                c0801Ge0.m = true;
            }
        };
        if (c10458ud0.m) {
            callback.onResult(((CompositorViewHolder) c10458ud0.i.get()).k);
        } else {
            c10458ud0.a.add(callback);
        }
    }
}
