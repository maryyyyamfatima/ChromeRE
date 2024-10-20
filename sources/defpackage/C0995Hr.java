package defpackage;

import android.app.Activity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hr */
/* loaded from: classes.dex */
public final class C0995Hr implements InterfaceC0186Bl0 {
    public Activity a;
    public final C0865Gr g;

    public C0995Hr(Activity activity, I5 i5, C6166i6 c6166i6) {
        this.a = activity;
        this.g = new C0865Gr(this, c6166i6, i5);
        i5.b(this);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.g.destroy();
        this.a = null;
    }
}
