package defpackage;

import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yx2 */
/* loaded from: classes.dex */
public final class C11951yx2 extends Fl4 {
    public boolean g;
    public final /* synthetic */ WebContents h;
    public final /* synthetic */ C0118Ax2 i;

    @Override // defpackage.Fl4
    public final void e(C8880q01 c8880q01, boolean z, int i) {
        if (z) {
            C0118Ax2 c0118Ax2 = this.i;
            if (c0118Ax2.d != null) {
                return;
            }
            c0118Ax2.d(this.h);
        }
    }

    @Override // defpackage.Fl4
    public final void renderProcessGone() {
        this.i.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11951yx2(C0118Ax2 c0118Ax2, WebContents webContents, WebContents webContents2) {
        super(webContents);
        this.i = c0118Ax2;
        this.h = webContents2;
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        if (this.g && navigationHandle.g && navigationHandle.a && !navigationHandle.c) {
            C0118Ax2 c0118Ax2 = this.i;
            if (c0118Ax2.d != null) {
                this.h.P(this);
                c0118Ax2.b();
                return;
            }
        }
        this.g = true;
    }
}
