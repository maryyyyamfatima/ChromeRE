package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gp3 */
/* loaded from: classes.dex */
public final class C0859Gp3 implements InterfaceC5816h5 {
    public final ActionMode.Callback a;
    public final Context b;
    public final ArrayList c = new ArrayList();
    public final C1439Lb3 d = new C1439Lb3();

    public C0859Gp3(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.InterfaceC5816h5
    public final boolean c(AbstractC6160i5 abstractC6160i5, BS1 bs1) {
        C0989Hp3 e = e(abstractC6160i5);
        C1439Lb3 c1439Lb3 = this.d;
        Menu menu = (Menu) c1439Lb3.get(bs1);
        if (menu == null) {
            menu = new DT1(this.b, bs1);
            c1439Lb3.put(bs1, menu);
        }
        return this.a.onCreateActionMode(e, menu);
    }

    @Override // defpackage.InterfaceC5816h5
    public final boolean d(AbstractC6160i5 abstractC6160i5, BS1 bs1) {
        C0989Hp3 e = e(abstractC6160i5);
        C1439Lb3 c1439Lb3 = this.d;
        Menu menu = (Menu) c1439Lb3.get(bs1);
        if (menu == null) {
            menu = new DT1(this.b, bs1);
            c1439Lb3.put(bs1, menu);
        }
        return this.a.onPrepareActionMode(e, menu);
    }

    @Override // defpackage.InterfaceC5816h5
    public final boolean a(AbstractC6160i5 abstractC6160i5, MenuItem menuItem) {
        return this.a.onActionItemClicked(e(abstractC6160i5), new MenuItemC8692pT1(this.b, (InterfaceMenuItemC2028Pp3) menuItem));
    }

    @Override // defpackage.InterfaceC5816h5
    public final void b(AbstractC6160i5 abstractC6160i5) {
        this.a.onDestroyActionMode(e(abstractC6160i5));
    }

    public final C0989Hp3 e(AbstractC6160i5 abstractC6160i5) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0989Hp3 c0989Hp3 = (C0989Hp3) arrayList.get(i);
            if (c0989Hp3 != null && c0989Hp3.b == abstractC6160i5) {
                return c0989Hp3;
            }
        }
        C0989Hp3 c0989Hp32 = new C0989Hp3(this.b, abstractC6160i5);
        arrayList.add(c0989Hp32);
        return c0989Hp32;
    }
}
