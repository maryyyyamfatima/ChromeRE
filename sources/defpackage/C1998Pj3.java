package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pj3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1998Pj3 implements J44 {
    public boolean a;
    public boolean g;
    public String h;
    public boolean i;

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    public static void b(Tab tab) {
        if (tab == null || tab.getLaunchType() != 12) {
            return;
        }
        C1998Pj3 a = a(tab);
        if (a == null) {
            a = new C1998Pj3();
        }
        a.a = true;
        tab.F().d(C1998Pj3.class, a);
    }

    public static void c(Tab tab) {
        if (tab == null || !StartSurfaceConfiguration.a()) {
            return;
        }
        C1998Pj3 a = a(tab);
        if (a == null) {
            a = new C1998Pj3();
        }
        if (a.g) {
            return;
        }
        a.g = true;
        tab.F().d(C1998Pj3.class, a);
    }

    public static C1998Pj3 a(Tab tab) {
        return (C1998Pj3) tab.F().b(C1998Pj3.class);
    }
}
