package defpackage;

import org.chromium.chrome.browser.webapps.WebappRegistry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Un4 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ Vn4 i;
    public final /* synthetic */ WebappRegistry j;

    public Un4(WebappRegistry webappRegistry, String str, Vn4 vn4) {
        this.j = webappRegistry;
        this.h = str;
        this.i = vn4;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        C12237zn4 c12237zn4 = (C12237zn4) obj;
        WebappRegistry webappRegistry = this.j;
        webappRegistry.b.put(this.h, c12237zn4);
        webappRegistry.c.edit().putStringSet("webapp_set", webappRegistry.b.keySet()).apply();
        c12237zn4.b.edit().putLong("last_used", System.currentTimeMillis()).apply();
        Vn4 vn4 = this.i;
        if (vn4 != null) {
            vn4.a(c12237zn4);
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        C12237zn4 c12237zn4 = new C12237zn4(this.h);
        c12237zn4.b.getLong("last_used", 0L);
        return c12237zn4;
    }
}
