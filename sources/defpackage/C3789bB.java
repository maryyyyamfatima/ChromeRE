package defpackage;

import android.appwidget.AppWidgetManager;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3789bB extends AbstractC1684Mz {
    public final /* synthetic */ C4476dB a;

    @Override // defpackage.AbstractC1684Mz
    public final void d() {
    }

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
        AppWidgetManager.getInstance(V60.a).notifyAppWidgetViewDataChanged(this.a.g, R.id.bookmarks_list);
    }

    public C3789bB(C4476dB c4476dB) {
        this.a = c4476dB;
    }
}
