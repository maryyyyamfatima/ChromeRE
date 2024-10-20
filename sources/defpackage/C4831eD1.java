package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4831eD1 implements InterfaceC12121zT1, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater g;
    public BS1 h;
    public ExpandedMenuView i;
    public InterfaceC11778yT1 j;
    public C4488dD1 k;

    @Override // defpackage.InterfaceC12121zT1
    public final boolean f() {
        return false;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean g(C6287iT1 c6287iT1) {
        return false;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean i(C6287iT1 c6287iT1) {
        return false;
    }

    public C4831eD1(Context context) {
        this.a = context;
        this.g = LayoutInflater.from(context);
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void k(Context context, BS1 bs1) {
        if (this.a != null) {
            this.a = context;
            if (this.g == null) {
                this.g = LayoutInflater.from(context);
            }
        }
        this.h = bs1;
        C4488dD1 c4488dD1 = this.k;
        if (c4488dD1 != null) {
            c4488dD1.notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void j() {
        C4488dD1 c4488dD1 = this.k;
        if (c4488dD1 != null) {
            c4488dD1.notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void h(InterfaceC11778yT1 interfaceC11778yT1) {
        this.j = interfaceC11778yT1;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean e(SubMenuC0074Ao3 subMenuC0074Ao3) {
        if (!subMenuC0074Ao3.hasVisibleItems()) {
            return false;
        }
        WS1 ws1 = new WS1(subMenuC0074Ao3);
        Context context = subMenuC0074Ao3.a;
        C5490g8 c5490g8 = new C5490g8(context);
        C4115c8 c4115c8 = c5490g8.a;
        C4831eD1 c4831eD1 = new C4831eD1(c4115c8.a);
        ws1.h = c4831eD1;
        c4831eD1.j = ws1;
        subMenuC0074Ao3.b(c4831eD1, context);
        C4831eD1 c4831eD12 = ws1.h;
        if (c4831eD12.k == null) {
            c4831eD12.k = new C4488dD1(c4831eD12);
        }
        c4115c8.o = c4831eD12.k;
        c4115c8.p = ws1;
        View view = subMenuC0074Ao3.o;
        if (view != null) {
            c4115c8.e = view;
        } else {
            c4115c8.c = subMenuC0074Ao3.n;
            c4115c8.d = subMenuC0074Ao3.m;
        }
        c4115c8.m = ws1;
        DialogC5834h8 a = c5490g8.a();
        ws1.g = a;
        a.setOnDismissListener(ws1);
        WindowManager.LayoutParams attributes = ws1.g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        ws1.g.show();
        InterfaceC11778yT1 interfaceC11778yT1 = this.j;
        if (interfaceC11778yT1 == null) {
            return true;
        }
        interfaceC11778yT1.d(subMenuC0074Ao3);
        return true;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void c(BS1 bs1, boolean z) {
        InterfaceC11778yT1 interfaceC11778yT1 = this.j;
        if (interfaceC11778yT1 != null) {
            interfaceC11778yT1.c(bs1, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.h.q(this.k.getItem(i), this, 0);
    }
}
