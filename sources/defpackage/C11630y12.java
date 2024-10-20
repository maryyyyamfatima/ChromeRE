package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y12 */
/* loaded from: classes.dex */
public final class C11630y12 extends AbstractC8305oK2 implements InterfaceC6322ia1, InterfaceC11693yC1 {
    public final Context i;
    public InterfaceC11350xC1 j;
    public RecyclerView k;

    @Override // defpackage.InterfaceC6322ia1
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC6322ia1
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.InterfaceC6322ia1
    public final void l(byte[] bArr) {
    }

    @Override // defpackage.InterfaceC6322ia1
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.AbstractC8305oK2
    public final void C(d dVar, int i) {
        if (((C7555m82) this.j).f(i)) {
            this.j.getClass();
        }
    }

    @Override // defpackage.InterfaceC6322ia1
    public final RecyclerView i(C7555m82 c7555m82, ViewGroup viewGroup) {
        return (RecyclerView) M(c7555m82);
    }

    public C11630y12(Context context) {
        this.i = context;
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return ((C7555m82) this.j).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ug, android.widget.TextView, android.view.View] */
    @Override // defpackage.AbstractC8305oK2
    public final d E(int i, RecyclerView recyclerView) {
        FrameLayout frameLayout;
        if (i >= 0) {
            frameLayout = ((C7555m82) this.j).e(i, recyclerView);
        } else {
            Context context = this.i;
            ?? c10475ug = new C10475ug(context, null);
            c10475ug.setText("Unable to render external view");
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.bottomMargin = Ge4.b(context, 25.0f);
            marginLayoutParams.topMargin = Ge4.b(context, 25.0f);
            c10475ug.setLayoutParams(marginLayoutParams);
            frameLayout = c10475ug;
        }
        return new C11287x12(frameLayout);
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        if (!((C7555m82) this.j).f(i)) {
            return -1;
        }
        C7555m82 c7555m82 = (C7555m82) this.j;
        C7211l82 c7211l82 = (C7211l82) c7555m82.a.get(i);
        if (c7211l82.d == 0) {
            int i2 = c7555m82.d + 1;
            c7555m82.d = i2;
            c7211l82.d = i2;
        }
        return c7211l82.d;
    }

    public final View M(InterfaceC11350xC1 interfaceC11350xC1) {
        this.j = interfaceC11350xC1;
        RecyclerView recyclerView = new RecyclerView(this.i, null);
        this.k = recyclerView;
        recyclerView.n0(this);
        this.k.q0(new LinearLayoutManager());
        ((C7555m82) this.j).b.add(this);
        y(0, ((C7555m82) this.j).d());
        return this.k;
    }

    @Override // defpackage.InterfaceC6322ia1
    public final void c() {
        ((C7555m82) this.j).b.remove(this);
        z(0, ((C7555m82) this.j).d());
        this.k.n0(null);
        this.k.q0(null);
        this.j = null;
    }

    @Override // defpackage.InterfaceC11693yC1
    public final void a(int i, int i2) {
        y(i, i2);
    }

    @Override // defpackage.InterfaceC11693yC1
    public final void n(int i, int i2) {
        z(i, i2);
    }

    @Override // defpackage.InterfaceC11693yC1
    public final void e(int i, int i2) {
        w(i, i2);
    }
}
