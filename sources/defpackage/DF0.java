package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DF0 {
    public final Activity a;
    public final InterfaceC0079Ap3 b;
    public final ViewOnClickListenerC1069If3 c;
    public final InterfaceC0079Ap3 d;
    public final WindowAndroid e;
    public final QB f;
    public final FY2 g;
    public final InterfaceC0079Ap3 h;
    public final long i;
    public final ZK0 j;
    public final C4270cc0 k;
    public final ViewGroup l;

    public DF0(Activity activity, ViewGroup viewGroup, PropertyModel propertyModel, QB qb, InterfaceC0079Ap3 interfaceC0079Ap3, C9811sj3 c9811sj3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, InterfaceC0079Ap3 interfaceC0079Ap32, WindowAndroid windowAndroid, InterfaceC10590uz3 interfaceC10590uz3, InterfaceC0079Ap3 interfaceC0079Ap33, long j, ZK0 zk0, C4270cc0 c4270cc0) {
        this.a = activity;
        this.l = viewGroup;
        this.b = interfaceC0079Ap3;
        this.c = viewOnClickListenerC1069If3;
        this.d = interfaceC0079Ap32;
        this.e = windowAndroid;
        this.f = qb;
        this.g = c9811sj3;
        this.h = interfaceC0079Ap33;
        this.i = j;
        this.j = zk0;
        this.k = c4270cc0;
        UD2.a(propertyModel, viewGroup, new TD2() { // from class: CF0
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                BF0 bf0;
                RecyclerView recyclerView;
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                ViewGroup viewGroup2 = (ViewGroup) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld2 = AbstractC0829Gj3.c;
                LD2 ld22 = AbstractC0829Gj3.e;
                if (fd2 == ld2) {
                    GF0.a(viewGroup2, propertyModel2, propertyModel2.j(ld2) && propertyModel2.j(ld22));
                    return;
                }
                if (fd2 == ld22) {
                    GF0.a(viewGroup2, propertyModel2, propertyModel2.j(ld2) && propertyModel2.j(ld22));
                    return;
                }
                ND2 nd2 = AbstractC0829Gj3.g;
                PD2 pd2 = AbstractC0829Gj3.f;
                if (fd2 != nd2) {
                    if (fd2 != AbstractC0829Gj3.h || (bf0 = (BF0) propertyModel2.i(pd2)) == null || (recyclerView = bf0.b.A) == null) {
                        return;
                    }
                    recyclerView.m0(0);
                    return;
                }
                if (propertyModel2.i(pd2) != null && propertyModel2.j(AbstractC0829Gj3.b)) {
                    C11046wK0 c11046wK0 = ((BF0) propertyModel2.i(pd2)).b.o;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c11046wK0.getLayoutParams();
                    if (layoutParams == null) {
                        return;
                    }
                    layoutParams.topMargin = propertyModel2.h(nd2);
                    c11046wK0.setLayoutParams(layoutParams);
                }
            }
        });
    }
}
