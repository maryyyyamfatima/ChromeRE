package defpackage;

import J.N;
import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.chrome.browser.infobar.AutofillSaveCardInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9855sr extends ClickableSpan {
    public final /* synthetic */ C9902sz1 a;
    public final /* synthetic */ AutofillSaveCardInfoBar g;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AutofillSaveCardInfoBar autofillSaveCardInfoBar = this.g;
        N.MLmVDUZa(autofillSaveCardInfoBar.u, autofillSaveCardInfoBar, this.a.c);
    }

    public C9855sr(AutofillSaveCardInfoBar autofillSaveCardInfoBar, C9902sz1 c9902sz1) {
        this.g = autofillSaveCardInfoBar;
        this.a = c9902sz1;
    }
}
