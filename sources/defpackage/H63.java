package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H63 implements Callback {
    public final /* synthetic */ GURL a;
    public final /* synthetic */ Tab g;
    public final /* synthetic */ WindowAndroid h;
    public final /* synthetic */ WebContents i;
    public final /* synthetic */ String j;
    public final /* synthetic */ int k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ J63 m;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public H63(J63 j63, GURL gurl, Tab tab, WindowAndroid windowAndroid, WebContents webContents, String str, int i, boolean z) {
        this.m = j63;
        this.a = gurl;
        this.g = tab;
        this.h = windowAndroid;
        this.i = webContents;
        this.j = str;
        this.k = i;
        this.l = z;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        final GURL gurl = (GURL) obj;
        GURL gurl2 = this.a;
        String encodedFragment = Uri.parse(gurl2.i()).getEncodedFragment();
        if (encodedFragment != null ? encodedFragment.contains(":~:text=") : false) {
            final GURL gurl3 = this.a;
            final WindowAndroid windowAndroid = this.h;
            final WebContents webContents = this.i;
            final String str = this.j;
            final int i = this.k;
            final boolean z = this.l;
            AbstractC8264oC1.a(new ArrayList(), this.g.b().O().c(), new Callback() { // from class: G63
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    WindowAndroid windowAndroid2 = windowAndroid;
                    WebContents webContents2 = webContents;
                    String str2 = str;
                    int i2 = i;
                    boolean z2 = z;
                    H63 h63 = H63.this;
                    h63.getClass();
                    GURL gurl4 = new GURL(AbstractC8264oC1.b(gurl.i(), (String) obj2));
                    GURL gurl5 = gurl3;
                    J63.a(gurl5, gurl4);
                    h63.m.d(windowAndroid2, webContents2, str2, gurl5, gurl4, i2, z2);
                }
            }, 0);
            return;
        }
        J63.a(gurl2, gurl);
        this.m.d(this.h, this.i, this.j, this.a, gurl, this.k, this.l);
    }
}
