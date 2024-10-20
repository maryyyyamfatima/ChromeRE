package defpackage;

import org.chromium.chrome.browser.feed.sections.SectionHeaderView;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i13 */
/* loaded from: classes.dex */
public final class C6140i13 extends ViewTreeObserverOnGlobalLayoutListenerC8754pe4 {
    public final /* synthetic */ SectionHeaderView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6140i13(SectionHeaderView sectionHeaderView, ListMenuButton listMenuButton) {
        super(listMenuButton);
        this.o = sectionHeaderView;
    }

    @Override // defpackage.ViewTreeObserverOnGlobalLayoutListenerC8754pe4, android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        T8 t8;
        super.onPreDraw();
        SectionHeaderView sectionHeaderView = this.o;
        if (this.a.bottom >= (sectionHeaderView.i.getHeight() / 2) + sectionHeaderView.n || (t8 = this.g) == null) {
            return true;
        }
        t8.b();
        return true;
    }
}
