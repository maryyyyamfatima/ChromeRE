package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7661mT1 extends FrameLayout implements OV {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public C7661mT1(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.OV
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }

    @Override // defpackage.OV
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }
}
