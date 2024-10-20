package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC8305oK2;
import defpackage.C0513Dy2;
import defpackage.C0643Ey2;
import defpackage.C1812Ny2;
import defpackage.Ec4;
import defpackage.JG2;
import defpackage.RunnableC0383Cy2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class e extends AbstractC8305oK2 {
    public final d i;
    public ArrayList j;
    public ArrayList k;
    public final ArrayList l;
    public final RunnableC0383Cy2 n = new RunnableC0383Cy2(this);
    public final Handler m = new Handler(Looper.getMainLooper());

    @Override // defpackage.AbstractC8305oK2
    public final void C(androidx.recyclerview.widget.d dVar, int i) {
        ColorStateList colorStateList;
        C1812Ny2 c1812Ny2 = (C1812Ny2) dVar;
        Preference O = O(i);
        View view = c1812Ny2.a;
        Drawable background = view.getBackground();
        Drawable drawable = c1812Ny2.z;
        if (background != drawable) {
            WeakHashMap weakHashMap = Ec4.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) c1812Ny2.v(R.id.title);
        if (textView != null && (colorStateList = c1812Ny2.A) != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        O.v(c1812Ny2);
    }

    public e(PreferenceScreen preferenceScreen) {
        this.i = preferenceScreen;
        preferenceScreen.M = this;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        K(preferenceScreen.c0);
        Q();
    }

    public final void Q() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).M = null;
        }
        ArrayList arrayList = new ArrayList(this.j.size());
        this.j = arrayList;
        d dVar = this.i;
        N(dVar, arrayList);
        this.k = M(dVar);
        t();
        Iterator it2 = this.j.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).getClass();
        }
    }

    public static boolean P(d dVar) {
        return dVar.Z != Integer.MAX_VALUE;
    }

    public final ArrayList M(d dVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int Z = dVar.Z();
        int i = 0;
        for (int i2 = 0; i2 < Z; i2++) {
            Preference Y = dVar.Y(i2);
            if (Y.C) {
                if (!P(dVar) || i < dVar.Z) {
                    arrayList.add(Y);
                } else {
                    arrayList2.add(Y);
                }
                if (Y instanceof d) {
                    d dVar2 = (d) Y;
                    if (!(!(dVar2 instanceof PreferenceScreen))) {
                        continue;
                    } else {
                        if (P(dVar) && P(dVar2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        Iterator it = M(dVar2).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (!P(dVar) || i < dVar.Z) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (P(dVar) && i > dVar.Z) {
            a aVar = new a(dVar.a, arrayList2, dVar.h);
            aVar.k = new C0513Dy2(this, dVar);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final Preference O(int i) {
        if (i < 0 || i >= q()) {
            return null;
        }
        return (Preference) this.k.get(i);
    }

    @Override // defpackage.AbstractC8305oK2
    public final int q() {
        return this.k.size();
    }

    @Override // defpackage.AbstractC8305oK2
    public final int s(int i) {
        C0643Ey2 c0643Ey2 = new C0643Ey2(O(i));
        ArrayList arrayList = this.l;
        int indexOf = arrayList.indexOf(c0643Ey2);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(c0643Ey2);
        return size;
    }

    @Override // defpackage.AbstractC8305oK2
    public final androidx.recyclerview.widget.d E(int i, RecyclerView recyclerView) {
        C0643Ey2 c0643Ey2 = (C0643Ey2) this.l.get(i);
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        TypedArray obtainStyledAttributes = recyclerView.getContext().obtainStyledAttributes((AttributeSet) null, JG2.r);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = AbstractC2884Wf.a(recyclerView.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(c0643Ey2.a, (ViewGroup) recyclerView, false);
        if (inflate.getBackground() == null) {
            WeakHashMap weakHashMap = Ec4.a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup != null) {
            int i2 = c0643Ey2.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup);
            } else {
                viewGroup.setVisibility(8);
            }
        }
        return new C1812Ny2(inflate);
    }

    public final void N(d dVar, ArrayList arrayList) {
        synchronized (dVar) {
            Collections.sort(dVar.V);
        }
        int Z = dVar.Z();
        for (int i = 0; i < Z; i++) {
            Preference Y = dVar.Y(i);
            arrayList.add(Y);
            C0643Ey2 c0643Ey2 = new C0643Ey2(Y);
            if (!this.l.contains(c0643Ey2)) {
                this.l.add(c0643Ey2);
            }
            if (Y instanceof d) {
                d dVar2 = (d) Y;
                if (!(dVar2 instanceof PreferenceScreen)) {
                    N(dVar2, arrayList);
                }
            }
            Y.M = this;
        }
    }

    @Override // defpackage.AbstractC8305oK2
    public final long r(int i) {
        if (this.g) {
            return O(i).m();
        }
        return -1L;
    }
}
