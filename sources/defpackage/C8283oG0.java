package defpackage;

import android.content.Intent;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oG0 */
/* loaded from: classes2.dex */
public final class C8283oG0 implements InterfaceC4352cp4 {
    public final /* synthetic */ GURL a;
    public final /* synthetic */ GURL g;
    public final /* synthetic */ Origin h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ GURL j;
    public final /* synthetic */ Intent k;
    public final /* synthetic */ C12055zG0 l;

    public C8283oG0(C12055zG0 c12055zG0, GURL gurl, GURL gurl2, Origin origin, boolean z, GURL gurl3, Intent intent) {
        this.l = c12055zG0;
        this.a = gurl;
        this.g = gurl2;
        this.h = origin;
        this.i = z;
        this.j = gurl3;
        this.k = intent;
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        if (intent == null) {
            return;
        }
        boolean equals = intent.getAction().equals("android.intent.action.CREATE_SHORTCUT");
        C12055zG0 c12055zG0 = this.l;
        if (equals) {
            GURL gurl = this.a;
            boolean e = T34.e(gurl);
            boolean z = this.i;
            Origin origin = this.h;
            GURL gurl2 = this.g;
            if (e) {
                c12055zG0.a(gurl, gurl2, origin, z);
                return;
            }
            GURL gurl3 = this.j;
            if (gurl3.k()) {
                return;
            }
            c12055zG0.a(gurl3, gurl2, origin, z);
            return;
        }
        Intent intent2 = this.k;
        intent2.setSelector(null);
        intent2.setPackage(intent.getComponent().getPackageName());
        c12055zG0.y(intent2, false);
    }
}
