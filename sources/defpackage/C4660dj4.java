package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.chromium.chrome.browser.vr.VrShell;
import org.chromium.chrome.browser.vr.VrShellDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dj4 */
/* loaded from: classes4.dex */
public final class C4660dj4 implements InterfaceC2352Sc2 {
    public final /* synthetic */ VrShell a;

    @Override // defpackage.InterfaceC2352Sc2
    public final void a() {
    }

    @Override // defpackage.InterfaceC2352Sc2
    public final void b() {
        VrShellDelegate vrShellDelegate = this.a.h;
        vrShellDelegate.getClass();
        vrShellDelegate.g = AbstractC4983eg2.c(V60.a, "com.google.android.vr.inputmethod");
        vrShellDelegate.a.startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.vr.inputmethod")), 7214);
    }

    public C4660dj4(VrShell vrShell) {
        this.a = vrShell;
    }
}
