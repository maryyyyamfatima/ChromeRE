package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import org.chromium.chrome.browser.feed.sections.SectionHeaderView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n13, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC7858n13 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final View a;
    public final C3734b13 g;

    public ViewTreeObserverOnGlobalLayoutListenerC7858n13(SectionHeaderView sectionHeaderView, View view) {
        this.a = view;
        this.g = new C3734b13(sectionHeaderView.getContext());
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        if (view.getParent() != null) {
            C3734b13 c3734b13 = this.g;
            c3734b13.getClass();
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            c3734b13.setBounds(rect);
            view.getOverlay().add(c3734b13);
            c3734b13.invalidateSelf();
        }
    }
}
