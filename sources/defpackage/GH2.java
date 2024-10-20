package defpackage;

import android.view.View;
import org.chromium.chrome.browser.infobar.ReaderModeInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GH2 implements View.OnClickListener {
    public final /* synthetic */ ReaderModeInfoBar a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ReaderModeInfoBar readerModeInfoBar = this.a;
        if (readerModeInfoBar.u() == null || readerModeInfoBar.p) {
            return;
        }
        readerModeInfoBar.u().V0();
    }

    public GH2(ReaderModeInfoBar readerModeInfoBar) {
        this.a = readerModeInfoBar;
    }
}
