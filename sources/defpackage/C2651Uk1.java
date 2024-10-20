package defpackage;

import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2651Uk1 extends Od4 {
    public final WeakReference a;
    public final WeakReference b;

    public C2651Uk1(ComponentTree componentTree, ViewPager viewPager) {
        this.a = new WeakReference(componentTree);
        this.b = new WeakReference(viewPager);
    }

    @Override // defpackage.Od4, defpackage.Ld4
    public final void a(float f, int i, int i2) {
        ComponentTree componentTree = (ComponentTree) this.a.get();
        if (componentTree != null) {
            componentTree.j();
        }
    }
}
