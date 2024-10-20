package defpackage;

import org.chromium.content_public.browser.LoadCommittedDetails;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tg1 */
/* loaded from: classes.dex */
public final class C2501Tg1 extends Fl4 {
    public final /* synthetic */ C2631Ug1 g;

    @Override // defpackage.Fl4
    public final void f(WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            C2631Ug1 c2631Ug1 = this.g;
            c2631Ug1.p = 9;
            c2631Ug1.i.destroy();
        }
    }

    @Override // defpackage.Fl4
    public final void navigationEntryCommitted(LoadCommittedDetails loadCommittedDetails) {
        C2631Ug1 c2631Ug1 = this.g;
        c2631Ug1.p = 10;
        c2631Ug1.i.destroy();
    }

    @Override // defpackage.Fl4
    public final void wasHidden() {
        C2631Ug1 c2631Ug1 = this.g;
        c2631Ug1.p = 6;
        c2631Ug1.i.destroy();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2501Tg1(C2631Ug1 c2631Ug1, WebContents webContents) {
        super(webContents);
        this.g = c2631Ug1;
    }

    @Override // defpackage.Fl4
    public final void destroy() {
        super.destroy();
        C2631Ug1 c2631Ug1 = this.g;
        if (c2631Ug1.p == 0) {
            c2631Ug1.p = 11;
        }
        PropertyModel propertyModel = c2631Ug1.h;
        c2631Ug1.g.c(c2631Ug1.p, propertyModel);
    }
}
