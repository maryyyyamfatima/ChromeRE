package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1469Lh3 extends RemoteViewsService {
    public final String a = "jB";
    public C6537jB g;

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context b = AbstractApplicationC9799sh3.b(context);
        C6537jB c6537jB = (C6537jB) BundleUtils.e(b, this.a);
        this.g = c6537jB;
        c6537jB.a = this;
        super.attachBaseContext(b);
    }

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        C6537jB c6537jB = this.g;
        c6537jB.getClass();
        int p = AbstractC2281Ro1.p(-1, intent, "appWidgetId");
        if (p < 0) {
            AbstractC4851eH1.f("BookmarkWidget", "Missing EXTRA_APPWIDGET_ID!", new Object[0]);
            return null;
        }
        return new C4476dB(c6537jB.a, p);
    }
}
