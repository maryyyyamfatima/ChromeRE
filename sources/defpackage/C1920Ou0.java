package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import org.chromium.chrome.browser.download.DownloadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ou0 */
/* loaded from: classes.dex */
public final class C1920Ou0 extends ClickableSpan {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String g;
    public final /* synthetic */ C2050Pu0 h;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C2050Pu0 c2050Pu0 = this.h;
        c2050Pu0.a.c(3, c2050Pu0.b);
        C2050Pu0.a(3, true);
        DownloadUtils.h(this.a, this.g);
    }

    public C1920Ou0(C2050Pu0 c2050Pu0, Activity activity, String str) {
        this.h = c2050Pu0;
        this.a = activity;
        this.g = str;
    }
}
