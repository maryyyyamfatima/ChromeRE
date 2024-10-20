package defpackage;

import org.chromium.chrome.browser.compositor.LayerTitleCache;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2846Vx1 {
    public final C7837my a;
    public final C7837my b;
    public boolean c;
    public final /* synthetic */ LayerTitleCache d;

    public C2846Vx1(LayerTitleCache layerTitleCache) {
        this.d = layerTitleCache;
        int i = LayerTitleCache.k;
        LayerTitleCache.k = i + 1;
        this.a = new C7837my(i);
        int i2 = LayerTitleCache.k;
        LayerTitleCache.k = i2 + 1;
        this.b = new C7837my(i2);
    }
}
