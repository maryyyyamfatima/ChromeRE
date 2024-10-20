package defpackage;

import android.animation.Animator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ak0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051Ak0 implements PF {
    public final /* synthetic */ Animator a;

    public C0051Ak0(Animator animator, C1983Pg3 c1983Pg3) {
        this.a = animator;
    }

    @Override // defpackage.PF
    public final void onCancel() {
        this.a.end();
    }
}
