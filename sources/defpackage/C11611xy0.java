package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Optional;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xy0 */
/* loaded from: classes.dex */
public final class C11611xy0 {
    public final /* synthetic */ C11954yy0 a;

    public C11611xy0(C11954yy0 c11954yy0) {
        this.a = c11954yy0;
    }

    public final CS a(View view) {
        C11954yy0 c11954yy0 = this.a;
        View C = c11954yy0.j.C(view);
        if (C == null) {
            return new CS(Optional.empty());
        }
        c11954yy0.j.getClass();
        int J2 = RecyclerView.J(C);
        if (J2 >= 0) {
            InterfaceC11350xC1 interfaceC11350xC1 = c11954yy0.i;
            if (J2 < ((C7555m82) interfaceC11350xC1).d()) {
                return CS.a(((C7555m82) interfaceC11350xC1).c(J2));
            }
        }
        return new CS(Optional.empty());
    }
}
