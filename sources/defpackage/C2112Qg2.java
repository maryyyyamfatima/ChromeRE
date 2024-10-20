package defpackage;

import org.chromium.components.page_info.PageInfoController;
import org.chromium.content_public.browser.LoadCommittedDetails;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qg2 */
/* loaded from: classes2.dex */
public final class C2112Qg2 extends Fl4 {
    public final /* synthetic */ PageInfoController g;

    @Override // defpackage.Fl4
    public final void navigationEntryCommitted(LoadCommittedDetails loadCommittedDetails) {
        this.g.m.b(true);
    }

    @Override // defpackage.Fl4
    public final void wasHidden() {
        this.g.m.b(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2112Qg2(PageInfoController pageInfoController, WebContents webContents) {
        super(webContents);
        this.g = pageInfoController;
    }

    @Override // defpackage.Fl4
    public final void destroy() {
        super.destroy();
        PageInfoController.b(this.g);
    }

    @Override // defpackage.Fl4
    public final void f(WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            PageInfoController.b(this.g);
        }
    }
}
