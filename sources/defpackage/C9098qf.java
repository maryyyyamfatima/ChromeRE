package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qf */
/* loaded from: classes.dex */
public final class C9098qf extends AbstractC7723me4 {
    public final /* synthetic */ C9440rf a;

    public C9098qf(C9440rf c9440rf) {
        this.a = c9440rf;
    }

    @Override // defpackage.InterfaceC7379le4
    public final void a() {
        C9440rf c9440rf = this.a;
        c9440rf.b.u.setVisibility(8);
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = c9440rf.b;
        PopupWindow popupWindow = layoutInflaterFactory2C0545Ef.v;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (layoutInflaterFactory2C0545Ef.u.getParent() instanceof View) {
            View view = (View) layoutInflaterFactory2C0545Ef.u.getParent();
            WeakHashMap weakHashMap = Ec4.a;
            view.requestApplyInsets();
        }
        layoutInflaterFactory2C0545Ef.u.e();
        layoutInflaterFactory2C0545Ef.x.d(null);
        layoutInflaterFactory2C0545Ef.x = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0545Ef.A;
        WeakHashMap weakHashMap2 = Ec4.a;
        viewGroup.requestApplyInsets();
    }
}
