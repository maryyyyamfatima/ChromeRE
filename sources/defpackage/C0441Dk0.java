package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441Dk0 implements PF {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ C1091Ik0 c;

    public C0441Dk0(View view, ViewGroup viewGroup, C1091Ik0 c1091Ik0, C1983Pg3 c1983Pg3) {
        this.a = view;
        this.b = viewGroup;
        this.c = c1091Ik0;
    }

    @Override // defpackage.PF
    public final void onCancel() {
        View view = this.a;
        view.clearAnimation();
        this.b.endViewTransition(view);
        this.c.a();
    }
}
