package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.chrome.browser.profiles.OTRProfileID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1530Lu0 extends ClickableSpan {
    public final Runnable a;
    public final OTRProfileID g;
    public final String h;
    public final int i;

    public C1530Lu0(String str, Runnable runnable, OTRProfileID oTRProfileID, int i) {
        this.a = runnable;
        this.g = oTRProfileID;
        this.h = str;
        this.i = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        new C1401Ku0(this).c(AbstractC0185Bl.e);
    }
}
