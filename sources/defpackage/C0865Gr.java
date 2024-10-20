package defpackage;

import android.view.autofill.AutofillManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gr */
/* loaded from: classes.dex */
public final class C0865Gr extends AbstractC5822h6 {
    public final /* synthetic */ I5 i;
    public final /* synthetic */ C0995Hr j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0865Gr(C0995Hr c0995Hr, C6166i6 c6166i6, I5 i5) {
        super(c6166i6);
        this.j = c0995Hr;
        this.i = i5;
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        AutofillManager autofillManager;
        boolean z2 = this.i.l == 5;
        if (z || z2 || (autofillManager = (AutofillManager) this.j.a.getSystemService(AutofillManager.class)) == null) {
            return;
        }
        autofillManager.cancel();
    }

    @Override // defpackage.BA0
    public final void v0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        AutofillManager autofillManager;
        if (navigationHandle.b || (autofillManager = (AutofillManager) this.j.a.getSystemService(AutofillManager.class)) == null) {
            return;
        }
        autofillManager.cancel();
    }
}
