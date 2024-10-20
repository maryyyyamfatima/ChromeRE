package defpackage;

import android.app.Activity;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zd0 */
/* loaded from: classes.dex */
public final class C3265Zd0 implements InterfaceC6377ij3 {
    public final PC a;
    public final C4620dd0 g;
    public final InterfaceC3241Yy1 h;
    public final InterfaceC3241Yy1 i;
    public final C1705Nd0 j;
    public final CustomTabsConnection k;
    public final H43 l;
    public final Activity m;

    public C3265Zd0(PC pc, C4620dd0 c4620dd0, InterfaceC3241Yy1 interfaceC3241Yy1, InterfaceC3241Yy1 interfaceC3241Yy12, C1705Nd0 c1705Nd0, CustomTabsConnection customTabsConnection, Activity activity, I5 i5, H43 h43) {
        this.a = pc;
        this.g = c4620dd0;
        this.h = interfaceC3241Yy1;
        this.i = interfaceC3241Yy12;
        this.j = c1705Nd0;
        this.k = customTabsConnection;
        this.m = activity;
        this.l = h43;
        i5.b(this);
        h43.b(this);
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        H43 h43 = this.l;
        if (h43.c == this) {
            h43.c = null;
        }
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
        this.l.b(this);
    }
}
