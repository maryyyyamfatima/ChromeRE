package defpackage;

import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorView;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0695Fj {
    public final ChromeActivity a;
    public final CompositorViewHolder b;
    public final CompositorView c;

    public C0695Fj(WebContents webContents) {
        ChromeActivity f1 = ChromeActivity.f1(webContents);
        this.a = f1;
        CompositorViewHolder compositorViewHolder = (CompositorViewHolder) f1.r0.g;
        this.b = compositorViewHolder;
        this.c = compositorViewHolder.l;
    }
}
