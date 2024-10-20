package defpackage;

import android.content.ContentResolver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7725mf0 implements InterfaceC7381lf0 {
    public static ContentResolver a;

    @Override // defpackage.InterfaceC7381lf0
    public final String a() {
        if (a == null) {
            a = V60.a.getContentResolver();
        }
        return AbstractC7192l51.f(a, "sole:chrome_homepage_url", null);
    }

    @Override // defpackage.InterfaceC7381lf0
    public final boolean b() {
        if (a == null) {
            a = V60.a.getContentResolver();
        }
        return AbstractC7192l51.d(a, "sole:chrome_bookmark_immutable", false);
    }
}
