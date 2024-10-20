package defpackage;

import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2087Qb2 implements InterfaceC1308Kb2 {
    public final WebContents a;

    public C2087Qb2(WebContents webContents) {
        this.a = webContents;
    }

    @Override // defpackage.InterfaceC1308Kb2
    public final void d(LoadUrlParams loadUrlParams) {
        this.a.i().d(loadUrlParams);
    }
}
