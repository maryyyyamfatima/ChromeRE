package defpackage;

import J.N;
import android.app.Activity;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sP0 */
/* loaded from: classes.dex */
public final class C9699sP0 implements InterfaceC4954eb3 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Activity b;

    @Override // defpackage.InterfaceC4954eb3
    public final void b() {
        AbstractC10042tP0.b();
    }

    public C9699sP0(Activity activity, boolean z) {
        this.a = z;
        this.b = activity;
    }

    @Override // defpackage.InterfaceC4954eb3
    public final void a() {
        N.MnEYaN9w(Profile.d(), true);
        if (this.a) {
            AbstractC10042tP0.a(this.b);
        } else {
            AbstractC1658Mt3.b().m(0);
        }
        AbstractC10042tP0.b();
    }
}
