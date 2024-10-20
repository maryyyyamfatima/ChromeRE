package defpackage;

import android.content.Context;
import org.chromium.base.SysUtils;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Il0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096Il0 {
    public static C1096Il0 g;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public static C1096Il0 c() {
        if (g == null) {
            g = new C1096Il0();
        }
        return g;
    }

    public C1096Il0() {
        if (SysUtils.isLowEndDevice()) {
            this.a = true;
            this.b = true;
            this.c = false;
            this.d = false;
            this.e = false;
        } else {
            this.a = true;
            this.b = false;
            this.c = true;
            this.d = true;
            this.e = true;
        }
        if (DeviceFormFactor.isTablet()) {
            this.b = false;
        }
        boolean g2 = this.b | AX.e().g("enable-accessibility-tab-switcher");
        this.b = g2;
        this.f = !r0.g("disable-fullscreen");
        if (g2) {
            this.c = false;
        }
    }

    public static boolean b() {
        if (!c().c) {
            return false;
        }
        if (C10021tL.f().c()) {
            return !O83.a.e("accessibility_tab_switcher", true);
        }
        return true;
    }

    public static boolean a(Context context) {
        if (((DeviceFormFactor.a(context) ^ true) || UN.A.a()) && UN.R.a() && UN.Q.a()) {
            return false;
        }
        if (c().b) {
            return true;
        }
        if (C10021tL.f().c()) {
            return O83.a.e("accessibility_tab_switcher", true);
        }
        return false;
    }
}
