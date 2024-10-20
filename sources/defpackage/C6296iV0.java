package defpackage;

import android.app.Activity;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iV0 */
/* loaded from: classes.dex */
public final class C6296iV0 extends Fl4 {
    public final Activity g;
    public final WebContents h;
    public final /* synthetic */ C6638jV0 i;

    public C6296iV0(C6638jV0 c6638jV0, Activity activity, WebContents webContents) {
        this.i = c6638jV0;
        this.g = activity;
        this.h = webContents;
        webContents.h0(this);
    }

    @Override // defpackage.Fl4
    public final void mediaStartedPlaying() {
        C4920eV0 c4920eV0 = C6638jV0.i;
        this.i.h();
    }

    @Override // defpackage.Fl4
    public final void mediaStoppedPlaying() {
        C4920eV0 c4920eV0 = C6638jV0.i;
        this.i.h();
    }

    @Override // defpackage.Fl4
    public final void hasEffectivelyFullscreenVideoChange(boolean z) {
        C6638jV0 c6638jV0 = this.i;
        if (z) {
            C4920eV0 c4920eV0 = C6638jV0.i;
            c6638jV0.h();
        } else {
            C6638jV0.a(c6638jV0, this.g, 7);
        }
    }
}
