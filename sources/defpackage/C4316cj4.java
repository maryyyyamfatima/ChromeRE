package defpackage;

import org.chromium.chrome.browser.vr.VrShell;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cj4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4316cj4 implements InterfaceC2352Sc2 {
    public final /* synthetic */ VrShell a;

    @Override // defpackage.InterfaceC2352Sc2
    public final void a() {
    }

    public C4316cj4(VrShell vrShell) {
        this.a = vrShell;
    }

    @Override // defpackage.InterfaceC2352Sc2
    public final void b() {
        C3973bj4 c3973bj4 = new C3973bj4(this);
        this.a.s.b(new String[]{"android.permission.RECORD_AUDIO"}, c3973bj4);
    }
}
