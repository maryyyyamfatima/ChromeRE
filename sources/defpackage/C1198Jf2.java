package defpackage;

import J.N;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jf2 */
/* loaded from: classes.dex */
public final class C1198Jf2 extends B12 implements InterfaceC3897bW2 {
    public final C1328Kf2 g;
    public final Runnable h;
    public boolean i;
    public float j;

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
        return true;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean s() {
        return false;
    }

    public C1198Jf2(C10285u6 c10285u6, ViewGroup viewGroup, RunnableC4152cF runnableC4152cF) {
        super(viewGroup);
        this.g = new C1328Kf2(c10285u6, viewGroup);
        this.h = runnableC4152cF;
    }

    @Override // defpackage.B12
    public final void b(float f, float f2) {
        C1328Kf2 c1328Kf2 = this.g;
        c1328Kf2.i = 0.0f;
        long j = c1328Kf2.h;
        View view = c1328Kf2.g;
        N.M2aBK_gn(j, c1328Kf2, f, f2, view.getWidth(), view.getHeight());
        this.i = true;
        this.j = 0.0f;
    }

    @Override // defpackage.B12
    public final void d() {
        this.i = false;
        this.j = 0.0f;
        C1328Kf2 c1328Kf2 = this.g;
        N.Mmy$6vNW(c1328Kf2.h, c1328Kf2);
    }

    @Override // defpackage.B12
    public final void a(float f) {
        this.j = f;
        if (this.i) {
            this.h.run();
        }
    }

    @Override // defpackage.B12
    public final void c() {
        C1328Kf2 c1328Kf2 = this.g;
        N.MHbgPcOD(c1328Kf2.h, c1328Kf2, null, 0.0f, 0.0f);
        c1328Kf2.i = 0.0f;
        this.j = 0.0f;
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return new C8385oa2();
    }

    @Override // defpackage.InterfaceC3897bW2
    public final AbstractC4240cW2 j(RectF rectF, ResourceManager resourceManager, float f) {
        float f2 = this.j;
        C1328Kf2 c1328Kf2 = this.g;
        float f3 = -(f2 - c1328Kf2.i);
        c1328Kf2.i = f2;
        if (!(f3 == 0.0f ? true : N.MHbgPcOD(c1328Kf2.h, c1328Kf2, resourceManager, f2, f3))) {
            this.i = false;
            this.j = 0.0f;
        }
        return c1328Kf2;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean p0() {
        return this.i;
    }
}
