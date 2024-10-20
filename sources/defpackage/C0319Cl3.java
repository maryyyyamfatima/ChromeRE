package defpackage;

import J.N;
import android.graphics.RectF;
import java.util.ArrayList;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319Cl3 extends AbstractC4240cW2 implements InterfaceC3897bW2 {
    public long g;
    public int h;
    public final JC i;
    public boolean j;

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

    public C0319Cl3(CC cc) {
        this.i = cc;
    }

    @Override // org.chromium.chrome.browser.layouts.scene_layer.SceneLayer
    public final void a() {
        if (this.g == 0) {
            this.g = N.MvcFT3Dn(this);
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return new C8385oa2();
    }

    @Override // defpackage.AbstractC4240cW2
    public final void b(SceneLayer sceneLayer) {
        N.MqEZWVhE(this.g, this, sceneLayer);
    }

    @Override // defpackage.InterfaceC3897bW2
    public final AbstractC4240cW2 j(RectF rectF, ResourceManager resourceManager, float f) {
        N.MsJYu3I7(this.g, this, resourceManager, this.h, ((CC) this.i).u);
        return this;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean p0() {
        return this.j;
    }
}
