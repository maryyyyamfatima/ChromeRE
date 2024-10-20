package defpackage;

import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EP {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final GURL d;
    public final GURL e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final RenderFrameHost i;
    public final int j;

    public EP(boolean z, boolean z2, boolean z3, GURL gurl, GURL gurl2, boolean z4, boolean z5, boolean z6, RenderFrameHost renderFrameHost, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = gurl == null ? GURL.emptyGURL() : gurl;
        this.e = gurl2 == null ? GURL.emptyGURL() : gurl2;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = renderFrameHost;
        this.j = i;
    }
}
