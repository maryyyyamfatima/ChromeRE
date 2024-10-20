package defpackage;

import android.content.Context;
import android.view.View;
import org.chromium.chrome.browser.omnibox.status.StatusView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC3048Xl3 implements View.OnLongClickListener {
    public final /* synthetic */ StatusView a;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        StatusView statusView = this.a;
        if (statusView.q == 0) {
            return false;
        }
        Context context = statusView.getContext();
        return ZN3.e(context, view, context.getResources().getString(statusView.q));
    }

    public ViewOnLongClickListenerC3048Xl3(StatusView statusView) {
        this.a = statusView;
    }
}
