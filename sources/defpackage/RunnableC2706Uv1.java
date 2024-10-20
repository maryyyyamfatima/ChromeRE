package defpackage;

import android.view.ActionMode;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2706Uv1 implements Runnable {
    public final /* synthetic */ ActionMode a;
    public final /* synthetic */ C2836Vv1 g;

    public RunnableC2706Uv1(C2836Vv1 c2836Vv1, ActionMode actionMode) {
        this.g = c2836Vv1;
        this.a = actionMode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.a.onDestroyActionMode(this.a);
    }
}
