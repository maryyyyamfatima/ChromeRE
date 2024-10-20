package defpackage;

import J.N;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.autofill_assistant.Starter;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vk */
/* loaded from: classes.dex */
public final class C10842vk extends BA0 {
    public final /* synthetic */ InterfaceC0570Ek a;

    public C10842vk(Starter starter) {
        this.a = starter;
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        WebContents b = tab != null ? tab.b() : null;
        Starter starter = (Starter) this.a;
        starter.a(b);
        long j = starter.l;
        if (j == 0) {
            return;
        }
        N.MT8Rc8yi(j, starter);
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        ((Starter) this.a).a(tab.b());
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        ((Starter) this.a).a(tab.b());
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        tab.b();
        Starter starter = (Starter) this.a;
        long j = starter.l;
        if (j == 0) {
            return;
        }
        N.M_ksUDgi(j, starter);
        starter.l = 0L;
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        tab.b();
        Starter starter = (Starter) this.a;
        long j = starter.l;
        if (j == 0) {
            return;
        }
        N.McQWLJNF(j, starter, z);
    }
}
