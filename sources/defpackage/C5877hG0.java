package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import org.chromium.chrome.browser.instantapps.AuthenticatedProxyActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5877hG0 implements InterfaceC5189fG0 {
    public final Tab a;
    public boolean b;

    @Override // defpackage.InterfaceC5189fG0
    public boolean a(GURL gurl) {
        return false;
    }

    @Override // defpackage.InterfaceC5189fG0
    public boolean b(Intent intent, C11026wG0 c11026wG0) {
        return false;
    }

    @Override // defpackage.InterfaceC5189fG0
    public boolean c(Intent intent) {
        return false;
    }

    @Override // defpackage.InterfaceC5189fG0
    public boolean d(C11026wG0 c11026wG0) {
        return false;
    }

    public C5877hG0(Tab tab) {
        this.a = tab;
        C0649Ez3.u(tab.m());
        tab.v(new C5533gG0(this));
    }

    public static boolean j(Intent intent, boolean z) {
        Context context = V60.a;
        if (AbstractC2281Ro1.e(context, intent)) {
            return true;
        }
        ResolveInfo c = AbstractC3017Xf2.c(intent, z ? 65536 : 0);
        return c != null && c.activityInfo.packageName.equals(context.getPackageName());
    }

    public final Context g() {
        Tab tab = this.a;
        if (tab.m() == null) {
            return null;
        }
        return (Context) tab.m().j.get();
    }

    public final Context f() {
        Activity a = V60.a(g());
        return a == null ? V60.a : a;
    }

    public final WindowAndroid h() {
        Tab tab = this.a;
        if (tab == null) {
            return null;
        }
        return tab.m();
    }

    public final void e(Intent intent) {
        Intent intent2 = new Intent("android.intent.action.MAIN");
        intent2.setClass(f(), AuthenticatedProxyActivity.class);
        intent.setFlags(268435456);
        intent2.putExtra("org.chromium.chrome.browser.instantapps.AUTH_INTENT", intent);
        f().startActivity(intent2);
    }

    public final boolean i() {
        return (this.a == null || this.b) ? false : true;
    }
}
