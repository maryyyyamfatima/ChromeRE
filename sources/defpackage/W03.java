package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import org.chromium.chrome.browser.searchwidget.SearchWidgetProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W03 implements InterfaceC11646y40 {
    public final Context a;
    public final AppWidgetManager b;

    @Override // defpackage.InterfaceC11646y40
    public final void accept(Object obj) {
        SearchWidgetProvider.c(null, (C9751sZ2) obj);
    }

    public W03() {
        Context context = V60.a;
        this.a = context;
        this.b = AppWidgetManager.getInstance(context);
    }
}
