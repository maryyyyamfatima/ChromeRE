package defpackage;

import J.N;
import android.graphics.RectF;
import java.util.ArrayList;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.components.browser_ui.widget.ViewResourceFrameLayout;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RY2 extends AbstractC4240cW2 implements InterfaceC3897bW2 {
    public long g;
    public final int h;
    public final int i;
    public int j;
    public boolean k = true;
    public final ViewResourceFrameLayout l;

    @Override // defpackage.InterfaceC3897bW2
    public final void F(ArrayList arrayList) {
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean K() {
        return false;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final void c0(float f, float f2, float f3, int i) {
    }

    @Override // defpackage.InterfaceC7458ls
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC3897bW2
    public final AbstractC5518gD0 l() {
        return null;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean onBackPressed() {
        return false;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean p(long j) {
        return false;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean s() {
        return false;
    }

    public RY2(ViewResourceFrameLayout viewResourceFrameLayout, int i) {
        this.l = viewResourceFrameLayout;
        this.h = viewResourceFrameLayout.getId();
        this.i = i;
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return new C8385oa2();
    }

    @Override // org.chromium.chrome.browser.layouts.scene_layer.SceneLayer
    public final void a() {
        if (this.g == 0) {
            this.g = N.MSESypSx(this);
        }
    }

    @Override // defpackage.AbstractC4240cW2
    public final void b(SceneLayer sceneLayer) {
        N.MwebgKpL(this.g, this, sceneLayer);
    }

    @Override // defpackage.InterfaceC3897bW2
    public final AbstractC4240cW2 j(RectF rectF, ResourceManager resourceManager, float f) {
        N.MpLDHW_D(this.g, this, resourceManager, this.h, this.i, 0, rectF.height() + this.j, this.l.getVisibility() != 0);
        return this;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean p0() {
        return this.k && this.j < this.l.getHeight() - this.i;
    }
}
