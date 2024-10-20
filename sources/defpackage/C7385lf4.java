package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lf4 */
/* loaded from: classes.dex */
public final class C7385lf4 extends AbstractC3898bW3 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View g;
    public final /* synthetic */ View h;
    public final /* synthetic */ C11031wH0 i;

    @Override // defpackage.AbstractC3898bW3, defpackage.KV3
    public final void b() {
        this.a.getOverlay().remove(this.g);
    }

    public C7385lf4(C11031wH0 c11031wH0, ViewGroup viewGroup, View view, View view2) {
        this.i = c11031wH0;
        this.a = viewGroup;
        this.g = view;
        this.h = view2;
    }

    @Override // defpackage.AbstractC3898bW3, defpackage.KV3
    public final void e() {
        View view = this.g;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.i.d();
        }
    }

    @Override // defpackage.KV3
    public final void c(QV3 qv3) {
        this.h.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.g);
        qv3.w(this);
    }
}
