package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Base64;
import java.util.HashMap;
import org.chromium.chrome.browser.ShortcutHelper;
import org.chromium.chrome.browser.webapps.WebappRegistry;
import org.chromium.components.webapps.WebappsUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y93 */
/* loaded from: classes.dex */
public final class C11679y93 extends AbstractC0185Bl {
    public final /* synthetic */ Bitmap h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ int t;
    public final /* synthetic */ String u;

    public C11679y93(String str, String str2, String str3, String str4, String str5, String str6, String str7, Bitmap bitmap, boolean z, int i, int i2, int i3, long j, long j2) {
        this.h = bitmap;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = i;
        this.o = i2;
        this.p = j;
        this.q = j2;
        this.r = str6;
        this.s = z;
        this.t = i3;
        this.u = str7;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        final Intent intent = (Intent) obj;
        ShortcutHelper.b.getClass();
        String str = this.u;
        final String str2 = this.i;
        WebappsUtils.a(str2, str, this.h, this.s, intent);
        WebappRegistry webappRegistry = Wn4.a;
        Vn4 vn4 = new Vn4() { // from class: x93
            @Override // defpackage.Vn4
            public final void a(C12237zn4 c12237zn4) {
                Mn4 a = Nn4.a(intent);
                if (a != null) {
                    c12237zn4.c(a);
                }
                HashMap hashMap = ShortcutHelper.a;
                String str3 = str2;
                Bitmap bitmap = (Bitmap) hashMap.remove(str3);
                if (bitmap != null) {
                    ShortcutHelper.storeWebappSplashImage(str3, bitmap);
                }
            }
        };
        webappRegistry.getClass();
        new Un4(webappRegistry, str2, vn4).c(AbstractC0185Bl.e);
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        Intent a = ShortcutHelper.a(this.i, this.j, this.k, this.l, this.m, AbstractC9552ry.a(this.h), 3, this.n, this.o, this.p, this.q, this.r.isEmpty(), this.s);
        a.putExtra("org.chromium.chrome.browser.webapp_mac", Base64.encodeToString(AbstractC10865vn4.b(this.j), 0));
        a.putExtra("org.chromium.chrome.browser.webapp_source", this.t);
        return a;
    }
}
