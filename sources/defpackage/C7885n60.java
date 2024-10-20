package defpackage;

import org.chromium.content_public.browser.LoadCommittedDetails;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n60 */
/* loaded from: classes.dex */
public final class C7885n60 extends Fl4 {
    public final /* synthetic */ C8229o60 g;

    @Override // defpackage.Fl4
    public final void navigationEntryCommitted(LoadCommittedDetails loadCommittedDetails) {
        this.g.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7885n60(C8229o60 c8229o60, WebContents webContents) {
        super(webContents);
        this.g = c8229o60;
    }
}
