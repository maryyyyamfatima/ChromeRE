package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TG extends AbstractC9720sT1 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public InterfaceC11778yT1 C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;
    public final Context g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final Handler l;
    public View t;
    public View u;
    public int v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final OG o = new OG(this);
    public final PG p = new PG(this);
    public final RG q = new RG(this);
    public int r = 0;
    public int s = 0;
    public boolean A = false;

    @Override // defpackage.InterfaceC12121zT1
    public final boolean f() {
        return false;
    }

    public TG(Context context, View view, int i, int i2, boolean z) {
        this.g = context;
        this.t = view;
        this.i = i;
        this.j = i2;
        this.k = z;
        WeakHashMap weakHashMap = Ec4.a;
        this.v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f27350_resource_name_obfuscated_res_0x7f080017));
        this.l = new Handler();
    }

    @Override // defpackage.AbstractC9720sT1
    public final void o(boolean z) {
        this.A = z;
    }

    @Override // defpackage.Q93
    public final void b() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.m;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((BS1) it.next());
        }
        arrayList.clear();
        View view = this.t;
        this.u = view;
        if (view != null) {
            boolean z = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.o);
            }
            this.u.addOnAttachStateChangeListener(this.p);
        }
    }

    @Override // defpackage.Q93
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        SG[] sgArr = (SG[]) arrayList.toArray(new SG[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            SG sg = sgArr[size];
            if (sg.a.a()) {
                sg.a.dismiss();
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.AbstractC9720sT1
    public final void l(BS1 bs1) {
        bs1.b(this, this.g);
        if (a()) {
            v(bs1);
        } else {
            this.m.add(bs1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(defpackage.BS1 r19) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TG.v(BS1):void");
    }

    @Override // defpackage.Q93
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((SG) arrayList.get(0)).a.a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        SG sg;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                sg = null;
                break;
            }
            sg = (SG) arrayList.get(i);
            if (!sg.a.a()) {
                break;
            } else {
                i++;
            }
        }
        if (sg != null) {
            sg.b.c(false);
        }
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void j() {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((SG) it.next()).a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C11773yS1) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void h(InterfaceC11778yT1 interfaceC11778yT1) {
        this.C = interfaceC11778yT1;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final boolean e(SubMenuC0074Ao3 subMenuC0074Ao3) {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            SG sg = (SG) it.next();
            if (subMenuC0074Ao3 == sg.b) {
                sg.a.h.requestFocus();
                return true;
            }
        }
        if (!subMenuC0074Ao3.hasVisibleItems()) {
            return false;
        }
        l(subMenuC0074Ao3);
        InterfaceC11778yT1 interfaceC11778yT1 = this.C;
        if (interfaceC11778yT1 != null) {
            interfaceC11778yT1.d(subMenuC0074Ao3);
        }
        return true;
    }

    @Override // defpackage.InterfaceC12121zT1
    public final void c(BS1 bs1, boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (bs1 == ((SG) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((SG) arrayList.get(i2)).b.c(false);
        }
        SG sg = (SG) arrayList.remove(i);
        sg.b.r(this);
        boolean z2 = this.F;
        C11435xT1 c11435xT1 = sg.a;
        if (z2) {
            c11435xT1.E.setExitTransition(null);
            c11435xT1.E.setAnimationStyle(0);
        }
        c11435xT1.dismiss();
        int size2 = arrayList.size();
        if (size2 <= 0) {
            View view = this.t;
            WeakHashMap weakHashMap = Ec4.a;
            this.v = view.getLayoutDirection() == 1 ? 0 : 1;
        } else {
            this.v = ((SG) arrayList.get(size2 - 1)).c;
        }
        if (size2 != 0) {
            if (z) {
                ((SG) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC11778yT1 interfaceC11778yT1 = this.C;
        if (interfaceC11778yT1 != null) {
            interfaceC11778yT1.c(bs1, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.o);
            }
            this.D = null;
        }
        this.u.removeOnAttachStateChangeListener(this.p);
        this.E.onDismiss();
    }

    @Override // defpackage.AbstractC9720sT1
    public final void p(int i) {
        if (this.r != i) {
            this.r = i;
            View view = this.t;
            WeakHashMap weakHashMap = Ec4.a;
            this.s = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.AbstractC9720sT1
    public final void n(View view) {
        if (this.t != view) {
            this.t = view;
            int i = this.r;
            WeakHashMap weakHashMap = Ec4.a;
            this.s = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.AbstractC9720sT1
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // defpackage.Q93
    public final C5753gu0 d() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((SG) arrayList.get(arrayList.size() - 1)).a.h;
    }

    @Override // defpackage.AbstractC9720sT1
    public final void q(int i) {
        this.w = true;
        this.y = i;
    }

    @Override // defpackage.AbstractC9720sT1
    public final void t(int i) {
        this.x = true;
        this.z = i;
    }

    @Override // defpackage.AbstractC9720sT1
    public final void s(boolean z) {
        this.B = z;
    }
}
