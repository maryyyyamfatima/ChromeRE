package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.infobar.DuplicateDownloadInfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Su0 */
/* loaded from: classes.dex */
public final class C2440Su0 extends ClickableSpan {
    public final /* synthetic */ Context a;
    public final /* synthetic */ DuplicateDownloadInfoBar g;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        DownloadUtils.h(this.a, this.g.u);
        EI2.h(3, 5, "Download.DuplicateInfobarEvent.OfflinePage");
    }

    public C2440Su0(DuplicateDownloadInfoBar duplicateDownloadInfoBar, Context context) {
        this.g = duplicateDownloadInfoBar;
        this.a = context;
    }
}
