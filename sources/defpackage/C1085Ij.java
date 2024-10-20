package defpackage;

import android.app.Activity;
import android.view.SurfaceView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1085Ij extends SurfaceView {
    public final /* synthetic */ C1215Jj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1085Ij(C1215Jj c1215Jj, Activity activity) {
        super(activity);
        this.a = c1215Jj;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        C1215Jj c1215Jj = this.a;
        if (c1215Jj.f.k) {
            return;
        }
        c1215Jj.e = true;
        super.onWindowVisibilityChanged(i);
        c1215Jj.e = false;
        if (SurfaceHolderCallback2C1475Lj.q && c1215Jj.d) {
            c1215Jj.a();
            c1215Jj.d = false;
        }
    }
}
