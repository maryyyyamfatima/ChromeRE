package defpackage;

import android.app.Activity;
import android.view.View;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.suggestions.tile.SuggestionsTileView;
import org.chromium.components.browser_ui.widget.tile.TileView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sF0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC9649sF0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ TileView a;
    public final /* synthetic */ Profile g;
    public final /* synthetic */ Activity h;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC10335uF0.a(this.a, this.g, this.h);
    }

    public ViewOnAttachStateChangeListenerC9649sF0(SuggestionsTileView suggestionsTileView, Profile profile, Activity activity) {
        this.a = suggestionsTileView;
        this.g = profile;
        this.h = activity;
    }
}
