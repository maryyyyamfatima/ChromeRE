package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadCommittedDetails;
import org.chromium.content_public.browser.NavigationController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T12 extends Fl4 {
    public final /* synthetic */ int g;
    public final /* synthetic */ NavigationController h;
    public final /* synthetic */ Tab i;
    public final /* synthetic */ V12 j;

    public T12(V12 v12, int i, NavigationController navigationController, Tab tab) {
        this.j = v12;
        this.g = i;
        this.h = navigationController;
        this.i = tab;
    }

    @Override // defpackage.Fl4
    public final void navigationEntryCommitted(LoadCommittedDetails loadCommittedDetails) {
        if (this.g != this.h.k()) {
            return;
        }
        Tab tab = this.i;
        tab.getUrl();
        this.j.V0(tab);
    }
}
