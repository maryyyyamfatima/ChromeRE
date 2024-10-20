package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.components.browser_ui.contacts_picker.ContactsPickerToolbar;
import org.chromium.components.browser_ui.contacts_picker.TopView;
import org.chromium.content.browser.ContactsDialogHost;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.widget.OptimizedFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tu2 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC10219tu2 extends OptimizedFrameLayout implements View.OnClickListener, GK2, InterfaceC7182l33, InterfaceC3746b33, SS3, I20 {
    public P40 g;
    public final WindowAndroid h;
    public R40 i;
    public final ContactsPickerToolbar j;
    public TopView k;
    public final AbstractC6099hu2 l;
    public final C6964kR2 m;
    public final C7526m33 n;
    public final C8848pu2 o;
    public final ImageView p;
    public Set q;
    public final Button r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewOnClickListenerC10219tu2(org.chromium.ui.base.WindowAndroid r24, defpackage.C5233fP r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, java.lang.String r32, defpackage.S40 r33) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnClickListenerC10219tu2.<init>(org.chromium.ui.base.WindowAndroid, fP, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, S40):void");
    }

    @Override // defpackage.InterfaceC3746b33
    public final void i() {
        AbstractC6099hu2 abstractC6099hu2 = this.l;
        abstractC6099hu2.N("");
        abstractC6099hu2.p = false;
        abstractC6099hu2.t();
        ContactsPickerToolbar contactsPickerToolbar = this.j;
        contactsPickerToolbar.D(this);
        this.r.setVisibility(0);
        this.p.setVisibility(0);
        final HashSet hashSet = new HashSet();
        Iterator it = this.n.c.iterator();
        while (it.hasNext()) {
            hashSet.add((A40) it.next());
        }
        contactsPickerToolbar.I();
        Iterator it2 = this.q.iterator();
        while (it2.hasNext()) {
            hashSet.add((A40) it2.next());
        }
        getHandler().post(new Runnable() { // from class: ku2
            @Override // java.lang.Runnable
            public final void run() {
                C7526m33 c7526m33 = ViewOnClickListenerC10219tu2.this.n;
                c7526m33.c = hashSet;
                c7526m33.f();
            }
        });
    }

    @Override // defpackage.InterfaceC3746b33
    public final void l(String str) {
        this.l.N(str);
    }

    @Override // defpackage.GK2
    public final void a(d dVar) {
        K40 k40 = (K40) dVar;
        k40.D.a(true);
        k40.D = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        C7526m33 c7526m33 = this.n;
        if (id == R.id.done) {
            ArrayList c = c7526m33.c();
            Collections.sort(c);
            if (this.x && AbstractC6099hu2.v) {
                new J20(((Context) this.h.j.get()).getContentResolver(), this.o, c, this).c(AbstractC0185Bl.e);
                return;
            } else {
                f(c);
                return;
            }
        }
        if (id == R.id.search) {
            this.r.setVisibility(8);
            this.q = new HashSet(c7526m33.c);
            this.p.setVisibility(8);
            AbstractC6099hu2 abstractC6099hu2 = this.l;
            abstractC6099hu2.p = true;
            abstractC6099hu2.t();
            this.j.P();
            return;
        }
        c(null, 0, 0);
    }

    public static List e(List list, boolean z, boolean z2) {
        if (z) {
            return !z2 ? new ArrayList() : list;
        }
        return null;
    }

    public final void f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A40 a40 = (A40) it.next();
            arrayList.add(new Q40(e(Arrays.asList(a40.g), this.t, AbstractC6099hu2.s), e(a40.h, this.u, AbstractC6099hu2.t), e(a40.i, this.v, AbstractC6099hu2.u), e(a40.j, this.w, AbstractC6099hu2.r), e(a40.k, this.x, AbstractC6099hu2.v)));
        }
        c(arrayList, 1, 1);
    }

    public final void c(ArrayList arrayList, int i, int i2) {
        int size = arrayList != null ? arrayList.size() : 0;
        int size2 = this.l.n.size();
        int i3 = size2 > 0 ? (size * 100) / size2 : 0;
        int i4 = this.t ? 4 : 0;
        if (this.u) {
            i4 |= 2;
        }
        if (this.v) {
            i4 |= 1;
        }
        if (this.w) {
            i4 |= 8;
        }
        if (this.x) {
            i4 |= 16;
        }
        ((ContactsDialogHost) this.i).a(i, arrayList, i3, i4);
        this.g.dismiss();
        EI2.h(i2, 2, "Android.ContactsPicker.DialogAction");
        EI2.e(size2, "Android.ContactsPicker.ContactCount");
        EI2.e(size, "Android.ContactsPicker.SelectCount");
        EI2.l(i3, "Android.ContactsPicker.SelectPercentage");
        EI2.h(i4, 32, "Android.ContactsPicker.PropertiesRequested");
    }

    @Override // defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        ContactsPickerToolbar contactsPickerToolbar = this.j;
        if (contactsPickerToolbar.b0 && arrayList.size() > 0) {
            contactsPickerToolbar.I();
        }
        boolean z = arrayList.size() == this.l.q() - 1;
        TopView topView = this.k;
        if (topView != null) {
            topView.q = true;
            topView.h.setChecked(z);
            topView.q = false;
        }
    }
}
