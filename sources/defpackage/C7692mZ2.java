package defpackage;

import android.graphics.Rect;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mZ2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7692mZ2 extends AbstractC10328uD3 {
    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int a() {
        return 1;
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean addNewContents(WebContents webContents, WebContents webContents2, int i, Rect rect, boolean z) {
        return false;
    }

    @Override // defpackage.AbstractC10328uD3
    public final void setOverlayMode(boolean z) {
    }

    @Override // defpackage.AbstractC10328uD3
    public final boolean shouldResumeRequestsForCreatedWindow() {
        return false;
    }
}
