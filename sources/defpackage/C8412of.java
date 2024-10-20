package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: of */
/* loaded from: classes.dex */
public final class C8412of extends AbstractC7723me4 {
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef a;

    public C8412of(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef) {
        this.a = layoutInflaterFactory2C0545Ef;
    }

    @Override // defpackage.AbstractC7723me4, defpackage.InterfaceC7379le4
    public final void c() {
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.a;
        layoutInflaterFactory2C0545Ef.u.setVisibility(0);
        if (layoutInflaterFactory2C0545Ef.u.getParent() instanceof View) {
            View view = (View) layoutInflaterFactory2C0545Ef.u.getParent();
            WeakHashMap weakHashMap = Ec4.a;
            view.requestApplyInsets();
        }
    }

    @Override // defpackage.InterfaceC7379le4
    public final void a() {
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.a;
        layoutInflaterFactory2C0545Ef.u.setAlpha(1.0f);
        layoutInflaterFactory2C0545Ef.x.d(null);
        layoutInflaterFactory2C0545Ef.x = null;
    }
}
