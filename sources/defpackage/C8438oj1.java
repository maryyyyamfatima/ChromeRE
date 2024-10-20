package defpackage;

import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oj1 */
/* loaded from: classes.dex */
public final class C8438oj1 implements InterfaceC3036Xj1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C8781pj1 c;

    public C8438oj1(C8781pj1 c8781pj1, boolean z, boolean z2) {
        this.c = c8781pj1;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.InterfaceC3036Xj1
    public final void a() {
        R44.a(Profile.d()).e("incognito.incognito_reauthentication", this.b);
    }

    @Override // defpackage.InterfaceC3036Xj1
    public final void b() {
        C8781pj1 c8781pj1 = this.c;
        c8781pj1.b = true;
        c8781pj1.a.W(this.a);
        c8781pj1.b = false;
    }

    @Override // defpackage.InterfaceC3036Xj1
    public final void c() {
        C8781pj1 c8781pj1 = this.c;
        c8781pj1.b = true;
        c8781pj1.a.W(this.a);
        c8781pj1.b = false;
    }
}
